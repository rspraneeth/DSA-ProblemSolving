package General;

import java.time.Duration;
import java.time.LocalTime;

public class Launch1 {
    public static void main(String[] args) {
        LocalTime t = LocalTime.parse("09:30");
        LocalTime t1 = LocalTime.parse("11:45");

        Duration duration = Duration.between(t, t1);

        System.out.println(duration.toHours()+" hr "+duration.toMinutesPart()+" mins");
    }
}
