package com.example.serverinfo.controller;

import com.example.serverinfo.dto.EquipmentForWebDTO;
import com.example.serverinfo.dto.EquipmentLogDTO;
import com.example.serverinfo.service.EquipmentLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipmentLogController {
    @Autowired
    EquipmentLogService equipmentLogService;

    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/log",method = RequestMethod.POST)
    @ResponseBody
    public List<EquipmentForWebDTO> getLog(@RequestBody EquipmentLogDTO equipmentLogDTO){
        System.out.println(equipmentLogDTO.getEquipmentname());
        System.out.println(equipmentLogDTO.getTime());
        return equipmentLogService.selLog(equipmentLogDTO);
    }
}
