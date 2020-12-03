package Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public interface Helper {
    
     static String UserLogin(String username){
        String password = "";
        switch (username){
            case "kraken":
                password = "kraken";
                break;
            case "febri":
                password = "alterra123";
                break;

            case "setio":
                password = "setio";
                break;
            default:
                password = "kraken123";
        }
        return password;
    }

     static String currentDateTime(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar calobj = Calendar.getInstance();
        String date = df.format(calobj.getTime());
        return date;
    }

     static String addSecondTime(int value){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar calobj = Calendar.getInstance();
        calobj.add(Calendar.SECOND,value);
        String date = df.format(calobj.getTime());
        return date;
    }

     static String addMinutesTime(int value){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar calobj = Calendar.getInstance();
        calobj.add(Calendar.MINUTE,value);
        String date = df.format(calobj.getTime());
        return date;
    }

     static String addHourTime(int value){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar calobj = Calendar.getInstance();
        calobj.add(Calendar.HOUR,value);
        String date = df.format(calobj.getTime());
        return date;
    }

     static String addDayTime(int value){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Calendar calobj = Calendar.getInstance();
        calobj.add(Calendar.DATE,value);
        String date = df.format(calobj.getTime());
        return date;
    }
}
