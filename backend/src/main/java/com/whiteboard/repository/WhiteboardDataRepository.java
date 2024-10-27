package com.whiteboard.repository;

import com.whiteboard.model.WhiteboardData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WhiteboardDataRepository extends JpaRepository<WhiteboardData, Long> {}
