package com.example.serverinfo.utils;


import com.example.serverinfo.dto.EquipmentDTO;
import com.example.serverinfo.dto.EquipmentInfoDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;
import com.example.serverinfo.service.EquipmentInfoService;
import com.example.serverinfo.service.EquipmentLogService;
import com.example.serverinfo.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

//定时任务：每一个小时获取信息，用于画表
public class TimeCut extends TimerTask {

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private EquipmentLogService equipmentLogService;

    @Autowired
    private EquipmentInfoService equipmentInfoService;

    @Override
    public void run() {
        //System.out.println("aaaa");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());

        List<EquipmentDTO> nameList= equipmentService.selAllOn();

        for(EquipmentDTO equipmentDTO:nameList){
            List<EquipmentLogDTO> list = equipmentInfoService.selForLog(equipmentDTO);
            list.get(0).setTime(date.substring(0,13)+":00:00");
            equipmentLogService.insertLog(list.get(0));
        }



//        equipmentDTO.setName("设备2");
//        list = equipmentInfoService.selForLog(equipmentDTO);
//        list.get(0).setTime(date.substring(0,13)+":00:00");
//        equipmentLogService.insertLog(list.get(0));
//
//        equipmentDTO.setName("设备3");
//        list = equipmentInfoService.selForLog(equipmentDTO);
//        list.get(0).setTime(date.substring(0,13)+":00:00");
//        equipmentLogService.insertLog(list.get(0));
//
//        equipmentDTO.setName("设备4");
//        list = equipmentInfoService.selForLog(equipmentDTO);
//        list.get(0).setTime(date.substring(0,13)+":00:00");
//        equipmentLogService.insertLog(list.get(0));

    }
}
