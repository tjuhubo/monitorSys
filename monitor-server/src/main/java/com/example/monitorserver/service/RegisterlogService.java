package com.example.monitorserver.service;


import com.example.monitorserver.dto.RegisterlogDTO;

import java.util.List;

public interface RegisterlogService{
    List<RegisterlogDTO> selAll();
    boolean insertIntoLog(RegisterlogDTO registerlogDTO);
}
