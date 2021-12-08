package com.example.serverinfo;

import com.example.serverinfo.utils.TimeCut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

@SpringBootApplication
public class ServerinfoApplication {

    public static void main(String[] args) throws ParseException {
        //添加定时任务
        Timer timer = new Timer();
        long period = 1000*60*60*24;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String  tempdate = format.format(new Date());
        String datestr = tempdate.substring(0,13)+":00:00";

        Date date = format.parse(datestr);
         //schedule(TimerTask task, Date time,long period); 特定时间 time 执行并每隔 period毫秒 执行一次
        timer.schedule(new TimeCut(), date,1000);
        //启动
        SpringApplication.run(ServerinfoApplication.class, args);
    }

}
