package com.example.serverinfo.service;

import com.example.serverinfo.dto.EquipmentDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EquipmentService {
    //获取所有设备
    List<EquipmentDTO> selAllOn();
    //根据姓名查询设备
    List<EquipmentDTO> selByName(EquipmentDTO equipmentDTO);
    //更新设备状态为在线
    Boolean updateToOn(EquipmentDTO equipmentDTO);
    //更新设备状态为下线
    Boolean updateToOff(EquipmentDTO equipmentDTO);

    Boolean delClient(EquipmentDTO equipmentDTO);
}
