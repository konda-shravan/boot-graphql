package com.example.graphqlapi.service;

import com.example.graphqlapi.model.ScheduleRoom;
import com.example.graphqlapi.repository.ScheduleRoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ScheduleRoomService {

	
	@Autowired
    private  ScheduleRoomRepository repository;

//    public ScheduleRoomService(ScheduleRoomRepository repository) {
//        this.repository = repository;
//    }

    public List<ScheduleRoom> getAvailableScheduleRooms(String description) {
        return repository.findByDescriptionOrderByDescriptionAsc(description);
    }
}