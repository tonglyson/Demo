package com.example.demo.dto.response;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class User {
    private String authSetting;
    private String externalAuthUserId;
    private String id;
    private Timestamp lastLogin;
    private String name;
    private String siteRole;

    public String getAuthSetting() {
        return authSetting;
    }

    public void setAuthSetting(String authSetting) {
        this.authSetting = authSetting;
    }

    public String getExternalAuthUserId() {
        return externalAuthUserId;
    }

    public void setExternalAuthUserId(String externalAuthUserId) {
        this.externalAuthUserId = externalAuthUserId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteRole() {
        return siteRole;
    }

    public void setSiteRole(String siteRole) {
        this.siteRole = siteRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "authSetting='" + authSetting + '\'' +
                ", externalAuthUserId='" + externalAuthUserId + '\'' +
                ", id='" + id + '\'' +
                ", lastLogin=" + lastLogin +
                ", name='" + name + '\'' +
                ", siteRole='" + siteRole + '\'' +
                '}';
    }
}
