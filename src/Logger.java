import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    private SimpleDateFormat sdf;
    private TimeZone timeZone;

    private Logger() {
        timeZone = TimeZone.getTimeZone("Europe/Moscow");
        sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
    }

    public void log(String msg) {
        Calendar calendar = Calendar.getInstance(timeZone);
        Date currentDate = calendar.getTime();
        String formattedDateTime = sdf.format(currentDate);
        System.out.println("[" + formattedDateTime + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}