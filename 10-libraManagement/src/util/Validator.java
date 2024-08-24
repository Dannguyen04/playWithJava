package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

/*
    Validator là 1 cái khuôn nhưng không dùng để đúc
        - nó chịu trách nhiệm chứa các hàm để check 
        - ví dụ 
            + check is valid date
            + check is date in past
            + ...
*/
public class Validator {
    
    //method: isValidDateByFormat
    //11-03-2024
    //.withResolverStyle(ResolverStyle.STRICT)
    //để kiểm tra ngày tháng năm khi nhập vào có valid với thực tế hay không 
    //theo một cách nghiêm ngặt nhất(STRICT)
    public static boolean isValidDateByFormat(String date, String format){
        try{
            LocalDate localdate = LocalDate.parse(date, 
                    DateTimeFormatter.ofPattern(format).withResolverStyle(ResolverStyle.STRICT));
            return true;
        }catch(DateTimeParseException e){
            return false;
        }
    }
}
