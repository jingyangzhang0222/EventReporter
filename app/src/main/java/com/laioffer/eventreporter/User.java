package com.laioffer.eventreporter;

public class User {
    private String username;
    private String password;
    private long time;

    public User(final String username, final String password,final long time) {
        this.username = username;
        this.password = password;
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
