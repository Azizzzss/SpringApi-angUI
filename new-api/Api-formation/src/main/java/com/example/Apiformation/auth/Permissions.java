package com.example.Apiformation.auth;

public enum Permissions {

    USER_READ("user:read"),
    USER_WRITE("user:write"),
    VIDEO_READ("video:read"),
    VIDEO_WRITE("video:write"),
    ;

    private final String permission ;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
