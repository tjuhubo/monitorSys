package com.example.serverinfo.dto;


public class EquipmentLogDTO {
    //id
    private Integer id;
    //设备名
    private String equipmentname;
    //统计时间
    private String time;
    //数量
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
