package com.whiteboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;

@Entity
public class WhiteboardData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type; // e.g., "line", "rectangle", "text"

    @Column(nullable = false)
    private String content; // Serialized data for the shape or text

    @Column(nullable = false)
    private String color; // Color of the shape or text

    @Column(nullable = false)
    private int startX; // Starting X coordinate

    @Column(nullable = false)
    private int startY; // Starting Y coordinate

    @Column(nullable = false)
    private int endX; // Ending X coordinate (if applicable)

    @Column(nullable = false)
    private int endY; // Ending Y coordinate (if applicable)

    @ManyToOne // Assuming you want to associate the whiteboard data with a user
    private User user; // User who created this data

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
