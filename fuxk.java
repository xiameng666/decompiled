import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class fuxk {
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    public fuxk(int v, int v1, int v2, int v3) {
        this.c = v;
        this.d = v1;
        this.a = v2;
        this.b = v3;
    }

    public final fvsl a(long v) {
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar0.setTimeInMillis(v);
        gregorianCalendar0.set(11, this.c);
        gregorianCalendar0.set(12, this.d);
        gregorianCalendar0.set(13, 0);
        long v1 = gregorianCalendar0.getTimeInMillis();
        if(Long.compare(v1, v) > 0) {
            gregorianCalendar0.add(6, -1);
            v1 = gregorianCalendar0.getTimeInMillis();
        }
        gregorianCalendar0.set(11, this.a);
        gregorianCalendar0.set(12, this.b);
        gregorianCalendar0.set(13, 0);
        long v2 = gregorianCalendar0.getTimeInMillis();
        if(v2 <= v1) {
            gregorianCalendar0.add(6, 1);
            v2 = gregorianCalendar0.getTimeInMillis();
        }
        return new fvsl(v1, v2);
    }

    @Override
    public final String toString() {
        return "startHour=" + this.c + ", startMinute=" + this.d + ", endHour=" + this.a + ", endMinute=" + this.b;
    }
}

