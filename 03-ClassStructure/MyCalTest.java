public class MyCalTest {
    public static void main(String[]args){
        MyCalendar cal =  new MyCalendar();
        cal.year = 2023;
        cal.month = 02;
        cal.day = 01;
        long d = cal.days();
        System.out.println(d);
    }
}
