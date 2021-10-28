package com.example.monitorserver.controller;

import com.example.monitorserver.dto.OnlineDTO;
import com.example.monitorserver.dto.RegisterlogDTO;
import com.example.monitorserver.service.OnlineService;
import com.example.monitorserver.service.RegisterlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class OnlineController {

    @Autowired
    private OnlineService onlineService;

    @Autowired
    private RegisterlogService registerlogService;
    //获取所有上线的客户端
    @RequestMapping(value = "/client",method = RequestMethod.GET)
    @ResponseBody
    public List<OnlineDTO> getAllOn(){
        return onlineService.selAllOn();
    }


    //获取某个客户端的状态
    @RequestMapping(value = "/name",method = RequestMethod.GET)
    @ResponseBody
    public List<OnlineDTO> getByName(@RequestBody OnlineDTO onlineDTO){
        return onlineService.selByName(onlineDTO);
    }

    //删除某个客户端
    @RequestMapping(value = "/delclient",method = RequestMethod.POST)
    @ResponseBody
    public Boolean delByName(@RequestBody OnlineDTO onlineDTO){
        //删除的同时要插入到日志中去
        List<OnlineDTO> list = onlineService.selByName(onlineDTO);
        OnlineDTO onlineDTOInfo = list.get(0);
        RegisterlogDTO registerlogDTO = new RegisterlogDTO();
        registerlogDTO.setCpucount(onlineDTOInfo.getCpucount());
        registerlogDTO.setName(onlineDTOInfo.getName());
        registerlogDTO.setOntime(onlineDTOInfo.getOntime());
        registerlogDTO.setOs(onlineDTOInfo.getOs());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String offtime = df.format(new Date()).toString();
        registerlogDTO.setOfftime(offtime);
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        return onlineService.delClient(onlineDTO)&&registerlogService.insertIntoLog(registerlogDTO);
    }
}
