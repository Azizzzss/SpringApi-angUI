package com.example.Apiformation.service;


import io.nats.client.*;
import io.nats.client.api.StorageType;
import io.nats.client.api.StreamConfiguration;
import io.nats.client.api.StreamInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class NatsService {


    private Connection nc;
    private JetStream js;


    public void connectToNats() throws IOException, InterruptedException {
        this.nc = Nats.connect("nats://localhost:4222");
        this.js = nc.jetStream();

    }

    public void Stream() throws IOException, InterruptedException, JetStreamApiException {
        StreamConfiguration streamConfig = StreamConfiguration.builder()
                .name("Videos")
                .subjects("video-freq")
                .storageType(StorageType.Memory)
                .build();

        JetStreamManagement jsm = nc .jetStreamManagement();

        StreamInfo streamInfo = jsm.addStream(streamConfig);

    }

    public void publishVideo(String subject, byte[] payload) throws JetStreamApiException, IOException {

        if (js == null) {
            throw new IllegalStateException("NATS connection not established");
        }
 ////////////////////////////// work here
        js.publish(subject, payload);
    }




}
