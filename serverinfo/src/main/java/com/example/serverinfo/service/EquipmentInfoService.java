package com.example.serverinfo.service;


import com.example.serverinfo.dto.EquipmentDTO;
import com.example.serverinfo.dto.EquipmentInfoDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EquipmentInfoService {
    List<EquipmentInfoDTO> selAll();
    boolean insertIntoLog(EquipmentInfoDTO equipmentInfoDTO);
    //为定时任务查询
    List<EquipmentLogDTO> selForLog(EquipmentDTO equipmentDTO);
}
