package com.main;

import java.util.*;

public class FirstAndLastDate{
public static Date getWeekStartDate() {
    Calendar calendar = Calendar.getInstance();
    while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
        calendar.add(Calendar.DATE, -1);
    }
    System.out.println(calendar.getTime());
    return calendar.getTime();
}

public static Date getWeekEndDate() {
    Calendar calendar = Calendar.getInstance();
    while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
        calendar.add(Calendar.DATE, 1);
    }
    calendar.add(Calendar.DATE, -1);
    System.out.println(calendar.getTime());
    return calendar.getTime();
}
}
