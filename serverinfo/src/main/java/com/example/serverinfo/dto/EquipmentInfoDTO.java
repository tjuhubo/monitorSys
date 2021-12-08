package com.example.serverinfo.dto;

public class EquipmentInfoDTO {
    //id
    private Integer id;
    //客户机名称
    private String name;
    //操作系统
    private String os;
    //ip
    private String ip;
    //当前负载
    private Integer nowcount;
    //剩余负载
    private Integer remain;
    //最大负载

    public Integer getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(Integer maxcount) {
        this.maxcount = maxcount;
    }

    private Integer maxcount;

    public Integer getRemain() {
        return remain;
    }

    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    //上线时间
    private String ontime;

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

    public Integer getNowcount() {
        return nowcount;
    }

    public void setNowcount(Integer nowcount) {
        this.nowcount = nowcount;
    }

    public String getOntime() {
        return ontime;
    }

    public void setOntime(String ontime) {
        this.ontime = ontime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
