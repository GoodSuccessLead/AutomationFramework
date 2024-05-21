package Util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class newlog {
    static Date d = new Date();
        //System.out.println(d.toString());
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private static final String LOG_FILE = "MenuHamburguer_logfile_"+sdf.format(d)+".txt";

    public static void log(String message) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = dateFormat.format(new Date());
        //String logEntry = timestamp + ": " + message + "\n";
        String logEntry = timestamp + ": " + message;
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(logEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
