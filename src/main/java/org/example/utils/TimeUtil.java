package org.example.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeUtil {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    public static final ZoneId zoneId = ZoneId.systemDefault();

    public static LocalDateTime of(Long epochMilli) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli), zoneId);
    }

    public static String toString(Long time){
        return toString(of(time));
    }

    public static String toString(LocalDateTime time) {
        return time.format(dateTimeFormatter);
    }

    public static String toString(LocalTime time){
        return time.format(timeFormatter);
    }

    public static String toString(LocalDate time){
        return time.format(dateFormatter);
    }

}
