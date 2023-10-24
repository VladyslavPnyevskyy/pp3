import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class MyCalendar {
    int year;
    int month;
    int day;
    public String myDate(){
return Integer.toString(this.year)+"-"+Integer.toString(this.month)+"-"+Integer.toString(this.day);
    }
    public Long days(){
        // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd",  Locale.ENGLISH);
                try {
        String dateInString = this.myDate();
        Date date1=new SimpleDateFormat("yyyy-M-dd").parse(dateInString); 
        String begOfYear = "01-01-2023";
        Date date2=new SimpleDateFormat("dd-M-yyyy").parse(begOfYear); 


        // Date date = formatter.parse(dateInString);
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd", Locale.ENGLISH);
        // LocalDate date = LocalDate.parse(dateInString, formatter);
        long dif = date1.getTime() - date2.getTime();
// long differenceDays = dif / (1000 * 60 * 60 * 24);
long differenceDays = TimeUnit.MILLISECONDS.toDays(dif);
return differenceDays;
                } catch (java.text.ParseException e) {
            e.printStackTrace();
            return (long)1;
        }
    }

}


