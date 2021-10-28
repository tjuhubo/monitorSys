package com.example.monitorserver.service.serviceImp;

import com.example.monitorserver.dto.RegisterlogDTO;
import com.example.monitorserver.mapper.RegisterlogMapper;
import com.example.monitorserver.service.RegisterlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterlogServiceImp implements RegisterlogService {
    @Autowired
    private RegisterlogMapper registerlogMapper;
    @Override
    public List<RegisterlogDTO> selAll(){
        return registerlogMapper.selAll();
    }

    @Override
    public boolean insertIntoLog(RegisterlogDTO registerlogDTO) {
        return registerlogMapper.insertIntoLog(registerlogDTO);
    }
}
