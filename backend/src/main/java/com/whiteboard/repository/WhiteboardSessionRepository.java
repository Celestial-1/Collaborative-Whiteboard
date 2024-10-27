package com.whiteboard.repository;

import com.whiteboard.model.WhiteboardSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhiteboardSessionRepository extends JpaRepository<WhiteboardSession, Long> {}
