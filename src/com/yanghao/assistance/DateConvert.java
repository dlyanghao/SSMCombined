package com.yanghao.assistance;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换器
 */
public class DateConvert implements Converter<String,Date>{


    @Override
    public Date convert(String dateString) {

        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
        try {
            date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
