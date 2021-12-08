package com.example.serverinfo.service.serviceImp;

import com.example.serverinfo.dto.EquipmentForWebDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;
import com.example.serverinfo.mapper.EquipmentLogMapper;
import com.example.serverinfo.service.EquipmentLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentLogServiceImp implements EquipmentLogService {

    @Autowired
    EquipmentLogMapper equipmentLogMapper;
    @Override
    public List<EquipmentForWebDTO> selLog(EquipmentLogDTO equipmentLogDTO) {
        List<EquipmentForWebDTO> list = equipmentLogMapper.selLog(equipmentLogDTO);
        for(EquipmentForWebDTO equipmentForWebDTO:list){
            equipmentForWebDTO.setTime(equipmentForWebDTO.getTime().substring(11,16));
        }
        return list;
    }

    @Override
    public Boolean insertLog(EquipmentLogDTO equipmentLogDTO) {
        return equipmentLogMapper.insertLog(equipmentLogDTO);
    }
}
