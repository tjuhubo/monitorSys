package com.example.monitorserver.mapper;

import com.example.monitorserver.dto.OnlineDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OnlineMapper {
    List<OnlineDTO> selAllOn();
    List<OnlineDTO> selByName(OnlineDTO onlineDTO);
    Boolean delClient(OnlineDTO onlineDTO);
}
