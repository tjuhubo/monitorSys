package com.example.monitorserver.service.serviceImp;

import com.example.monitorserver.dto.OnlineDTO;
import com.example.monitorserver.mapper.OnlineMapper;
import com.example.monitorserver.service.OnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OnlineServiceImp implements OnlineService {

    @Autowired
    private OnlineMapper onlineMapper;

    @Override
    public List<OnlineDTO> selAllOn() {
        return onlineMapper.selAllOn();
    }

    @Override
    public List<OnlineDTO> selByName(OnlineDTO onlineDTO) {
        return onlineMapper.selByName(onlineDTO);
    }

    @Override
    public Boolean delClient(OnlineDTO onlineDTO) {
        return onlineMapper.delClient(onlineDTO);
    }

}
