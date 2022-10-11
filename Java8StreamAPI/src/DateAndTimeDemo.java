
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deven
 */
public class DateAndTimeDemo {
    
    /*
    
    */
    public static void main(String[] args) {
        Date d = new Date();
        // there are two date showing one for sql package for sql database date
        // and other one is for human specific or machine specific date
        // you have to implement java.text package for that
        // not thread safe
        
        // new DateTime api
        // thread safe
        // LocalDate
        LocalDate x = LocalDate.now();
        System.out.println(x);
        LocalDate y = LocalDate.of(1989, Month.AUGUST, 20);
        System.out.println(y);
        
        LocalTime t = LocalTime.now();
        System.out.println(t);
        
        LocalTime k = LocalTime.of(12, 34, 10, 999);
        System.out.println(k);
        
        LocalTime zt = LocalTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println(zt);
        
        Instant i = Instant.now();
        System.out.println(i);
        // Month => enum
        
    }
}
