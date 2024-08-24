package util;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Validator {
    
    //method: isValidDateFormat
    //withResolverStyle(ResolverStyle.STRICT) để kiểm tra ngày tháng năm có hợp lệ không theo cách nghiêm ngặt nhất(STRICT)
    public static boolean isValidDateFormat(String date, String format) {
        try {
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(format).withResolverStyle(ResolverStyle.STRICT));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
