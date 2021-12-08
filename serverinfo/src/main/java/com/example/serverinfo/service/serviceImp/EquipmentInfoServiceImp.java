package com.example.serverinfo.service.serviceImp;

import com.example.serverinfo.dto.EquipmentDTO;
import com.example.serverinfo.dto.EquipmentInfoDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;
import com.example.serverinfo.mapper.EquipmentInfoMapper;
import com.example.serverinfo.service.EquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EquipmentInfoServiceImp implements EquipmentInfoService {
    @Autowired
    private EquipmentInfoMapper equipmentInfoMapper;
    @Override
    public List<EquipmentInfoDTO> selAll(){
        List<EquipmentInfoDTO> list = equipmentInfoMapper.selAll();
        for(EquipmentInfoDTO equipmentInfoDTO:list){
            equipmentInfoDTO.setRemain(equipmentInfoDTO.getMaxcount()-equipmentInfoDTO.getNowcount());
        }
        return list;
    }

    @Override
    public boolean insertIntoLog(EquipmentInfoDTO equipmentInfoDTO) {
        return equipmentInfoMapper.insertIntoLog(equipmentInfoDTO);
    }

    @Override
    public List<EquipmentLogDTO> selForLog(EquipmentDTO equipmentDTO) {
        return equipmentInfoMapper.selForLog(equipmentDTO);
    }
}
