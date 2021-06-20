import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time_date {
    public static void main(String[] args) throws ParseException {

        //Date---->String
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String time = simpleDateFormat.format(date);
        System.out.println(time);
        //String----->Date
        String str = "1999-11-22";
        Date date1 = simpleDateFormat.parse(str);
//        date1.setTime(10000000);
        System.out.println(simpleDateFormat.format(date1));
    }

}
