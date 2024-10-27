package com.whiteboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class WhiteboardSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sessionName;

    @ManyToOne
    private User user; // User who created the session

    @OneToMany(mappedBy = "session")
    private List<WhiteboardData> whiteboardData;

    // Getters and Setters
}
