import java.util.Date;
import java.text.SimpleDateFormat;

public class DigitalClock {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            Date date = new Date();
            String time = formatter.format(date);

            System.out.print("\rCurrent Time: " + time);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}