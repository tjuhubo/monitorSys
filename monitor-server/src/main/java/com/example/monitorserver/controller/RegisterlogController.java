package com.example.monitorserver.controller;

import com.example.monitorserver.dto.RegisterlogDTO;
import com.example.monitorserver.service.RegisterlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RegisterlogController {

    @Autowired
    private RegisterlogService registerlogService;


    //获取客户端日志
    @RequestMapping(value = "/log",method = RequestMethod.GET)
    @ResponseBody
    public List<RegisterlogDTO> getAll(){
        return registerlogService.selAll();
    }

}
