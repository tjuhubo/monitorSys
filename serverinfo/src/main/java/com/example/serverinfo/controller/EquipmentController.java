package com.example.serverinfo.controller;

import com.example.serverinfo.dto.EquipmentDTO;
import com.example.serverinfo.dto.EquipmentInfoDTO;
import com.example.serverinfo.service.EquipmentService;
import com.example.serverinfo.service.EquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @Autowired
    private EquipmentInfoService equipmentInfoService;
    //获取所有上线的客户端
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/eq",method = RequestMethod.GET)
    @ResponseBody
    public List<EquipmentDTO> getAllOn(){
        return equipmentService.selAllOn();
    }


    //获取某个客户端的状态
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/name",method = RequestMethod.POST)
    @ResponseBody
    public List<EquipmentDTO> getByName(@RequestBody EquipmentDTO equipmentDTO){
        return equipmentService.selByName(equipmentDTO);
    }

    //设备更新到on
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/on",method = RequestMethod.POST)
    @ResponseBody
    public Boolean updateToOn(@RequestBody EquipmentDTO equipmentDTO){
        return equipmentService.updateToOn(equipmentDTO);
    }

    //设备更新到off
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/off",method = RequestMethod.POST)
    @ResponseBody
    public Boolean updateToOff(@RequestBody EquipmentDTO equipmentDTO){
        return equipmentService.updateToOff(equipmentDTO);
    }
    //暂时没实现这个接口
    //删除某个客户端
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/delclient",method = RequestMethod.POST)
    @ResponseBody
    public Boolean delByName(@RequestBody EquipmentDTO equipmentDTO){
        //删除的同时要插入到日志中去
        List<EquipmentDTO> list = equipmentService.selByName(equipmentDTO);
        EquipmentDTO equipmentDTOInfo = list.get(0);
        EquipmentInfoDTO equipmentInfoDTO = new EquipmentInfoDTO();
        equipmentInfoDTO.setNowcount(equipmentDTOInfo.getMaxcount());
        equipmentInfoDTO.setName(equipmentDTOInfo.getName());
        equipmentInfoDTO.setOs(equipmentDTOInfo.getOs());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String offtime = df.format(new Date()).toString();
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        return equipmentService.delClient(equipmentDTO)&& equipmentInfoService.insertIntoLog(equipmentInfoDTO);
    }
}
