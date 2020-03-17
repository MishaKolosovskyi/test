package com.task.model;

public class User {

    private Long id;
    private String profileName;
    private String role;

    public User(Long id, String profileName, String role) {
        this.id = id;
        this.profileName = profileName;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", profileName='" + profileName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
