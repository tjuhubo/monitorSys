package com.example.serverinfo.mapper;

import com.example.serverinfo.dto.EquipmentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EquipmentMapper {
    List<EquipmentDTO> selAllOn();
    List<EquipmentDTO> selByName(EquipmentDTO equipmentDTO);
    Boolean updateToOn(EquipmentDTO equipmentDTO);
    Boolean updateToOff(EquipmentDTO equipmentDTO);
    Boolean delClient(EquipmentDTO equipmentDTO);
}
