import android.content.Context;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ezww {
    public static final ezww a;
    public static final ezww b;
    public final long c;
    public final long d;
    private static final Pattern e;

    static {
        ezww.e = Pattern.compile("^([0-2][0-9])([0-5][0-9])-([0-2][0-9])([0-5][0-9])$");
        ezww.a = new ezww(-1L, -1L);
        ezww.b = new ezww(0L, 0L);
    }

    public ezww(long v, long v1) {
        if(v != -1L && v1 != -1L) {
            if(v == v1) {
                this.c = 0L;
                this.d = 0L;
                return;
            }
            this.c = v;
            this.d = v1;
            return;
        }
        this.c = -1L;
        this.d = -1L;
    }

    public static long a(long v, long v1) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        if(ezww.b(v) > v1) {
            calendar0.add(5, 1);
        }
        calendar0.set(11, ((int)TimeUnit.MILLISECONDS.toHours(v1)));
        calendar0.set(12, ((int)(TimeUnit.MILLISECONDS.toMinutes(v1) % 60L)));
        calendar0.set(13, 0);
        return calendar0.getTimeInMillis() - v;
    }

    public static long b(long v) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        return TimeUnit.HOURS.toMillis(((long)calendar0.get(11))) + TimeUnit.MINUTES.toMillis(((long)calendar0.get(12))) + TimeUnit.SECONDS.toMillis(((long)calendar0.get(13))) + ((long)calendar0.get(14));
    }

    public final long c(long v) {
        if(!this.h()) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return this.f() ? 0L : ezww.a(v, TimeUnit.MINUTES.toMillis(this.c));
    }

    public static ezww d(String s) {
        int v1;
        int v;
        if(!gfta.c(s) && !"none".equalsIgnoreCase(s)) {
            Matcher matcher0 = ezww.e.matcher(s);
            if(!matcher0.matches()) {
                throw new ezwa("Unable to parse time window string: " + s);
            }
            try {
                v = Integer.parseInt(gfta.b(matcher0.group(1))) * 60 + Integer.parseInt(gfta.b(matcher0.group(2)));
                v1 = Integer.parseInt(gfta.b(matcher0.group(3))) * 60 + Integer.parseInt(gfta.b(matcher0.group(4)));
            }
            catch(NumberFormatException numberFormatException0) {
                throw new ezwa("Unable to parse time window string: " + s, numberFormatException0);
            }
            if(v < 0x5A0 && v1 < 0x5A0) {
                return new ezww(((long)v), ((long)v1));
            }
            throw new ezwa("Invalid time window: " + s);
        }
        return ezww.a;
    }

    public final String e(Context context0, long v) {
        return this.g(v) ? DateUtils.formatDateTime(context0, v, 1) : DateUtils.formatDateTime(context0, v + this.c(v), 1);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ezww) ? this.c == ((ezww)object0).c && this.d == ((ezww)object0).d : false;
    }

    public final boolean f() {
        return this.c == 0L && this.d == 0L;
    }

    public final boolean g(long v) {
        if(!this.h()) {
            return false;
        }
        if(this.f()) {
            return true;
        }
        long v1 = ezww.b(v);
        long v2 = TimeUnit.MINUTES.toMillis(this.c);
        long v3 = TimeUnit.MINUTES.toMillis(this.d);
        int v4 = Long.compare(v2, v1);
        if(v4 <= 0 && v1 <= v3) {
            return true;
        }
        if(v2 > v3) {
            return v4 <= 0 ? true : v1 <= v3;
        }
        return false;
    }

    public final boolean h() {
        return this.c != -1L && this.d != -1L;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.c), ((long)this.d)});
    }
}

