package com.example.serverinfo.service;

import com.example.serverinfo.dto.EquipmentForWebDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;

import java.util.List;

public interface EquipmentLogService {
    List<EquipmentForWebDTO> selLog(EquipmentLogDTO equipmentLogDTO);
    //定时任务插入，用于生成日志
    Boolean insertLog(EquipmentLogDTO equipmentLogDTO);
}
