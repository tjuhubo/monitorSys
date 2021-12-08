package com.example.serverinfo.mapper;

import com.example.serverinfo.dto.EquipmentDTO;
import com.example.serverinfo.dto.EquipmentInfoDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface EquipmentInfoMapper {
    List<EquipmentInfoDTO> selAll();
    //equipment的下线操作用
    Boolean offUpdate(EquipmentDTO equipmentDTO);
    //equipment的上线操作用
    Boolean onUpdate(EquipmentInfoDTO equipmentInfoDTO);
    boolean insertIntoLog(EquipmentInfoDTO equipmentInfoDTO);
    //定时任务用
    List<EquipmentLogDTO> selForLog(EquipmentDTO equipmentDTO);
}
