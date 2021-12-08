package com.example.serverinfo.service.serviceImp;

import com.example.serverinfo.dto.EquipmentDTO;
import com.example.serverinfo.dto.EquipmentInfoDTO;
import com.example.serverinfo.mapper.EquipmentInfoMapper;
import com.example.serverinfo.mapper.EquipmentMapper;
import com.example.serverinfo.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class EquipmentServiceImp implements EquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;
    @Autowired
    private EquipmentInfoMapper equipmentInfoMapper;

    @Override
    public List<EquipmentDTO> selAllOn() {
        return equipmentMapper.selAllOn();
    }

    @Override
    public List<EquipmentDTO> selByName(EquipmentDTO equipmentDTO) {
        return equipmentMapper.selByName(equipmentDTO);
    }

    //上线后加入上线时间（上线ip还没给，等客户端写好了加）
    @Override
    public Boolean updateToOn(EquipmentDTO equipmentDTO) {
        EquipmentInfoDTO equipmentInfoDTO = new EquipmentInfoDTO();
        equipmentInfoDTO.setName(equipmentDTO.getName());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String offtime = df.format(new Date()).toString();
        equipmentInfoDTO.setOntime(offtime);
        return equipmentMapper.updateToOn(equipmentDTO)&&equipmentInfoMapper.onUpdate(equipmentInfoDTO);
    }
    //加上了下线后更新设备的信息
    @Override
    public Boolean updateToOff(EquipmentDTO equipmentDTO) {
        return equipmentMapper.updateToOff(equipmentDTO)&&equipmentInfoMapper.offUpdate(equipmentDTO);
    }

    @Override
    public Boolean delClient(EquipmentDTO equipmentDTO) {
        return equipmentMapper.delClient(equipmentDTO);
    }

}
