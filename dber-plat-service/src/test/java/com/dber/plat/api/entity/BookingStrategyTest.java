package com.dber.plat.api.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.util.TypeUtils;
import com.dber.util.Util;
import org.junit.Test;

import java.util.Calendar;

public class BookingStrategyTest {
    {
        JSON.DEFAULT_PARSER_FEATURE |= SerializerFeature.WriteDateUseDateFormat.getMask();
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
//        FastJsonConfig config = converter.getFastJsonConfig();
//        config.setSerializerFeatures(SerializerFeature.BrowserSecure,
//                SerializerFeature.WriteDateUseDateFormat, SerializerFeature.PrettyFormat);
////        config.setDateFormat(JSON.DEFFAULT_DATE_FORMAT);
//        config.setParserConfig(ParserConfig.global);
    }

    @Test
    public void testTime(){
        String date= Util.formatDate(Calendar.getInstance());
        JSONObject map=new JSONObject();
        map.put("beginTime",date);
        map.put("endTime",date);
        map.put("createTime",date);
        map.put("modifyTime",date);
        BookingStrategy strategy=TypeUtils.castToJavaBean(map,BookingStrategy.class);
        System.out.println(JSON.toJSONStringWithDateFormat(strategy,"yyyy-MM-dd hh:mm:ss"));


        date= "2018-01-07T13:57:16.262Z";
        map=new JSONObject();
        map.put("beginTime",date);
        map.put("endTime",date);
        map.put("createTime",date);
        map.put("modifyTime",date);
        strategy=TypeUtils.castToJavaBean(map,BookingStrategy.class, ParserConfig.global);
        System.out.println(JSON.toJSONStringWithDateFormat(strategy,"yyyy-MM-dd hh:mm:ss"));


        date= "2018-01-07T13:57:16.262Z";
        FastJsonConfig config=new FastJsonConfig();
        map=new JSONObject();
        map.put("beginTime",-2870000);
        map.put("endTime",1515338885510l);
        map.put("createTime",1515338885510l);
        map.put("modifyTime",1515338885510l);
        strategy=TypeUtils.castToJavaBean(map,BookingStrategy.class, ParserConfig.global);
        System.out.println(JSON.toJSONStringWithDateFormat(strategy,"yyyy-MM-dd hh:mm:ss"));



    }


}