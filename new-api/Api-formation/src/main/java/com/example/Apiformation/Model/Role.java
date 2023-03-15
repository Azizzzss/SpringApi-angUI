package com.example.Apiformation.Model;

import com.example.Apiformation.auth.Permissions;
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

import static com.example.Apiformation.auth.Permissions.*;

public enum Role {

    USER(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(USER_READ,USER_WRITE,VIDEO_READ,VIDEO_WRITE));

    private final Set<Permissions> permission ;

    Role(Set<Permissions> permission) {
        this.permission = permission;
    }

    public Set<Permissions> getPermission() {
        return permission;
    }
}
