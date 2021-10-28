package com.example.monitorserver.dto;


import java.util.Date;

public class RegisterlogDTO {
    //id
    private Integer id;
    //客户机名称
    private String name;
    //操作系统
    private String os;
    //cpu数量
    private Integer cpucount;
    //上线时间
    private String ontime;
    //下线时间
    private String offtime;

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

    public Integer getCpucount() {
        return cpucount;
    }

    public void setCpucount(Integer cpucount) {
        this.cpucount = cpucount;
    }

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime;
    }

    public String getOfftime() {
        return offtime;
    }

    public void setOfftime(String offtime) {
        this.offtime = offtime;
    }
}
