package com.example.serverinfo.dto;

public class EquipmentDTO {
    //id
    private Integer id;
    //客户急名称
    private String name;
    //操作系统
    private String os;
    //机器状态
    private Integer status;
    //cpu数量
    private Integer maxcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(Integer maxcount) {
        this.maxcount = maxcount;
    }
}
