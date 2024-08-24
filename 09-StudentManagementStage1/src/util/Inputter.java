package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
    Inputter là 1 cái khuôn:
        - nhưng đéo dùng để đúc
        - những hành động nhập (nhập số nguyên, số thực, chuỗi, ....)
        - Inputter này làm người đứng ra chịu trách nhiệm đó 
            nên là các thứ trong Inputter đều là static
*/
public class Inputter {
    public static Scanner sc = new Scanner(System.in);

    //trong này chứa các method hỗ trợ cho việc nhập chuẩn vcl
    
    //method: ép nhập số nguyên
    public static int getAnInteger(String inpMsg, String errMsg){
        System.out.println(inpMsg);
        while(true){
            try{
                int number =  Integer.parseInt(sc.nextLine());
                return number;
            }catch(Exception e ){
                System.out.println(errMsg);
            }
        }
    }

    //method: ép nhập số nguyên trong khoảng
    public static int getAnInteger(String inpMsg, String errMsg, int lowerBound, int upperBound){
        if(lowerBound > upperBound){
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }

        System.out.println(inpMsg);

        while(true){
            try{
                int number =  Integer.parseInt(sc.nextLine());
                if(number < lowerBound || number > upperBound){
                    throw new Exception();
                }
                return number;
            }catch(Exception e ){
                System.out.println(errMsg);
            }
        }
    }

    //method: ép nhập số thực
    public static double getADouble(String inpMsg, String errMsg){
        System.out.println(inpMsg);
        while(true){
            try{
                double number =  Double.parseDouble(sc.nextLine());
                return number;
            }catch(Exception e ){
                System.out.println(errMsg);
            }
        }
    }

    //method: ép nhập số thực trong khoảng
    public static double getADouble(String inpMsg, String errMsg, double lowerBound, double upperBound){
        if(lowerBound > upperBound){
            double tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }

        System.out.println(inpMsg);

        while(true){
            try{
                double number =  Double.parseDouble(sc.nextLine());
                if(number < lowerBound || number > upperBound){
                    throw new Exception();
                }
                return number;
            }catch(Exception e ){
                System.out.println(errMsg);
            }
        }
    }

    //method: ép nhập String, cấm rỗng
    public static String getAString(String inpMsg, String errMsg){
        System.out.println(inpMsg);
        while(true){
            try{
                String str = sc.nextLine();
                if(str.isEmpty()){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }

    //method: ép nhập String, cấm rỗng, có regex
    public static String getAString(String inpMsg, String errMsg, String regex){
        System.out.println(inpMsg);
        while(true){
            try{
                String str = sc.nextLine();
                if(str.isEmpty() || !str.matches(regex)){
                    throw new Exception();
                }
                return str;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
    
    //method: getADate
    public static String getADate(String inpMsg, String errMsg, String regex){
        System.out.println(inpMsg);
        //check xem ngày tháng năm nhập vào có đúng không kể cả năm nhuận
        while(true){
            try{
                String date = sc.nextLine();
                if(date.isEmpty() || !Validator.isValidDateFormat(date, regex)){
                    throw new Exception();
                }
                return date;
            }catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }












}
