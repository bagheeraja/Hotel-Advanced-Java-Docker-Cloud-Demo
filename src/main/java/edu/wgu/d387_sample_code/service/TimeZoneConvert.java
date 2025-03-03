package edu.wgu.d387_sample_code.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConvert {
    public static String getTime() {
        ZonedDateTime presentationTime = ZonedDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        ZonedDateTime easternTime = presentationTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mountainTime = presentationTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime universalTime = presentationTime.withZoneSameInstant(ZoneId.of("UTC"));

        return easternTime.format(dateTimeFormatter) + " EST | " + mountainTime.format(dateTimeFormatter) + " MST | " + universalTime.format(dateTimeFormatter) + " UTC.";
    }
}
