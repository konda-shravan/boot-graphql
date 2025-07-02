package com.example.graphqlapi.controller;


import com.example.graphqlapi.model.ScheduleRoom;
import com.example.graphqlapi.service.ScheduleRoomService;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;


import java.util.List;
import java.util.UUID;


@Controller
public class ScheduleRoomController {

    private final ScheduleRoomService service;

    public ScheduleRoomController(ScheduleRoomService service) {
        this.service = service;
    }

    @QueryMapping
    public List<ScheduleRoom> availableScheduleRooms(@Argument String description) {
        return service.getAvailableScheduleRooms(description);
    }
}