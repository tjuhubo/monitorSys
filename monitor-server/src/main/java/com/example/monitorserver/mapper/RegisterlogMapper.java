package com.example.monitorserver.mapper;

import com.example.monitorserver.dto.RegisterlogDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegisterlogMapper {
    List<RegisterlogDTO> selAll();
    boolean insertIntoLog(RegisterlogDTO registerlogDTO);
}
