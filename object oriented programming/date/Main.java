package date;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

import date.DataNow;
import date.TimeNow;
import date.DateTime;
import date.FormatDate;

public class Main implements DataNow, TimeNow, FormatDate {

    public LocalTime getTime(){
        return LocalTime.now();
    }

    public LocalDate getDate(){
        return LocalDate.now();
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    public String getFomattedTime(){
        DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss");
        String toString = LocalDateTime.now().format(formattedDateTime);
        return toString;
    }
    public static void main(String[] args){
        Main newObj = new Main();
        System.out.println(newObj.getDateTime());
        System.out.println("after being formatted");
        System.out.println(newObj.getFomattedTime());
    }
}
