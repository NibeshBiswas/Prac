package com.nibesh;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nibesh on 6/5/17.
 */
public class DateFormat {
    public static void main(String[] args) {
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-YYY");
        System.out.println("Today is "+sdf.format(today));


    }
}
