package com.example.serverinfo.mapper;

import com.example.serverinfo.dto.EquipmentForWebDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EquipmentLogMapper {
    List<EquipmentForWebDTO> selLog(EquipmentLogDTO equipmentLogDTO);
    //定时任务插入log用于画表
    Boolean insertLog(EquipmentLogDTO equipmentLogDTO);
}
