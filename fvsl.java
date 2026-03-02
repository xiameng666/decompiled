import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;

public final class fvsl {
    public static final Comparator a;
    public final long b;
    public final long c;

    static {
        fvsl.a = new fvsk();
    }

    public fvsl(int v, int v1, int v2) {
        this(fvsl.d(v, v1, 0, 0), fvsl.d(v2, 0, 0, 0));
    }

    public fvsl(long v, long v1) {
        this.b = v;
        this.c = v1;
        if(v1 > v) {
            return;
        }
        throw new IllegalArgumentException("Invalid time span.");
    }

    public final long a() {
        return this.c - this.b;
    }

    public static long b(long v) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        return fvsl.c(calendar0);
    }

    public static long c(Calendar calendar0) {
        return fvsl.d(calendar0.get(11), calendar0.get(12), calendar0.get(13), calendar0.get(14));
    }

    public static long d(int v, int v1, int v2, int v3) {
        return ((long)v) * 3600000L + ((long)v1) * 60000L + ((long)v2) * 1000L + ((long)v3);
    }

    public static String e(long v) {
        long v1 = v % 3600000L;
        long v2 = v1 % 60000L;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", ((long)(v / 3600000L)), ((long)(v1 / 60000L)), ((long)(v2 / 1000L)), ((long)(v2 % 1000L)));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvsl) ? this.b == ((fvsl)object0).b && this.c == ((fvsl)object0).c : false;
    }

    public static void f(Calendar calendar0, long v) {
        calendar0.set(11, ((int)(v / 3600000L)));
        long v1 = v % 3600000L;
        calendar0.set(12, ((int)(v1 / 60000L)));
        long v2 = v1 % 60000L;
        calendar0.set(13, ((int)(v2 / 1000L)));
        calendar0.set(14, ((int)(v2 % 1000L)));
    }

    public final boolean g(Calendar calendar0) {
        long v = fvsl.b(calendar0.getTimeInMillis());
        return this.c <= v;
    }

    public final boolean h(long v) {
        return this.b <= v && v < this.c;
    }

    @Override
    public final int hashCode() {
        return (int)(this.c - this.b);
    }

    public final boolean i(Calendar calendar0) {
        return this.h(fvsl.c(calendar0));
    }

    public static boolean j(Calendar calendar0, Calendar calendar1) {
        return calendar0.get(1) == calendar1.get(1) && calendar0.get(2) == calendar1.get(2) && calendar0.get(5) == calendar1.get(5);
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "TimeSpan: [%s, %s)", fvsl.e(this.b), fvsl.e(this.c));
    }
}

