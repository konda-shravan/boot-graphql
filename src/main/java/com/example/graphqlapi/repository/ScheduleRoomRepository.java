package com.example.graphqlapi.repository;

import com.example.graphqlapi.model.ScheduleRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ScheduleRoomRepository extends JpaRepository<ScheduleRoom, UUID> {
    List<ScheduleRoom> findByDescriptionOrderByDescriptionAsc(String  description);
}