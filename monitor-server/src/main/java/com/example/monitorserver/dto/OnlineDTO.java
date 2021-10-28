package com.example.monitorserver.dto;

public class OnlineDTO {
    //id
    private Integer id;
    //客户ip地址
    private String ip;
    //客户急名称
    private String name;
    //操作系统
    private String os;
    //机器状态
    private String status;
    //cpu数量
    private Integer cpucount;
    //上线时间
    private String ontime;
    //下线时间（插入日志的时候用）
    private String offtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
