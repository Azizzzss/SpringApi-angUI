package com.example.Apiformation.auth;


import com.example.Apiformation.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthenticatinController {

    @Autowired
    private AuthenticationService service ;

    @PostMapping("register")
    public ResponseEntity<?> rregister(@RequestBody RegisterRequest request){

        return ResponseEntity.ok(service.register(request));

    }

    @PostMapping("authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));

    }

    @PostMapping("authenticateR")
    public ResponseEntity<AuthenticationResponse> authenticateR(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticateR(request));

    }

}
