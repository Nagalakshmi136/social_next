package com.social_next.social_next.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"user\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String avatar;

    private Integer mutualCount;

    private String role;
    private String status;
    private String lastMessage;

    private LocalDateTime lastActivity;

    // Default constructor
    public User() {
        
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getMutualCount() {
        return mutualCount;
    }

    public void setMutualCount(int mutualCount) {
        this.mutualCount = mutualCount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public LocalDateTime getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(LocalDateTime lastActivity) {
        this.lastActivity = lastActivity;
    }

    // @Override
    // public String toString() {
    //     return "User{" +
    //             "id='" + id + '\'' +
    //             ", name='" + name + '\'' +
    //             ", avatar='" + avatar + '\'' +
    //             ", mutualCount=" + mutualCount +
    //             ", role='" + role + '\'' +
    //             ", status='" + status + '\'' +
    //             ", lastMessage='" + lastMessage + '\'' +
    //             ", lastActivity=" + lastActivity +
    //             '}';
    // }
}
