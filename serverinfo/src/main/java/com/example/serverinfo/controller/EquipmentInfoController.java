package com.example.serverinfo.controller;

import com.example.serverinfo.dto.EquipmentInfoDTO;
import com.example.serverinfo.service.EquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EquipmentInfoController {

    @Autowired
    private EquipmentInfoService equipmentInfoService;


    //获取所有设备当前信息
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/eqinfo",method = RequestMethod.GET)
    @ResponseBody
    public List<EquipmentInfoDTO> getAll(){
        return equipmentInfoService.selAll();
    }

}
