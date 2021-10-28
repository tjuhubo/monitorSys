package com.example.monitorserver.service;

import com.example.monitorserver.dto.OnlineDTO;

import java.util.List;

public interface OnlineService {
    List<OnlineDTO> selAllOn();
    List<OnlineDTO> selByName(OnlineDTO onlineDTO);
    Boolean delClient(OnlineDTO onlineDTO);
}
