import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ggwk extends Enum {
    public static final enum ggwk A;
    public static final enum ggwk B;
    public static final enum ggwk C;
    public static final enum ggwk D;
    public static final enum ggwk E;
    public static final Map F;
    public final char G;
    private static final ggwk[] H;
    public static final enum ggwk a;
    public static final enum ggwk b;
    public static final enum ggwk c;
    public static final enum ggwk d;
    public static final enum ggwk e;
    public static final enum ggwk f;
    public static final enum ggwk g;
    public static final enum ggwk h;
    public static final enum ggwk i;
    public static final enum ggwk j;
    public static final enum ggwk k;
    public static final enum ggwk l;
    public static final enum ggwk m;
    public static final enum ggwk n;
    public static final enum ggwk o;
    public static final enum ggwk p;
    public static final enum ggwk q;
    public static final enum ggwk r;
    public static final enum ggwk s;
    public static final enum ggwk t;
    public static final enum ggwk u;
    public static final enum ggwk v;
    public static final enum ggwk w;
    public static final enum ggwk x;
    public static final enum ggwk y;
    public static final enum ggwk z;

    static {
        ggwk.a = new ggwk("TIME_HOUR_OF_DAY_PADDED", 0, 'H');
        ggwk.b = new ggwk("TIME_HOUR_OF_DAY", 1, 'k');
        ggwk.c = new ggwk("TIME_HOUR_12H_PADDED", 2, 'I');
        ggwk.d = new ggwk("TIME_HOUR_12H", 3, 'l');
        ggwk.e = new ggwk("TIME_MINUTE_OF_HOUR_PADDED", 4, 'M');
        ggwk.f = new ggwk("TIME_SECONDS_OF_MINUTE_PADDED", 5, 'S');
        ggwk.g = new ggwk("TIME_MILLIS_OF_SECOND_PADDED", 6, 'L');
        ggwk.h = new ggwk("TIME_NANOS_OF_SECOND_PADDED", 7, 'N');
        ggwk.i = new ggwk("TIME_AM_PM", 8, 'p');
        ggwk.j = new ggwk("TIME_TZ_NUMERIC", 9, 'z');
        ggwk.k = new ggwk("TIME_TZ_SHORT", 10, 'Z');
        ggwk.l = new ggwk("TIME_EPOCH_SECONDS", 11, 's');
        ggwk.m = new ggwk("TIME_EPOCH_MILLIS", 12, 'Q');
        ggwk.n = new ggwk("DATE_MONTH_FULL", 13, 'B');
        ggwk.o = new ggwk("DATE_MONTH_SHORT", 14, 'b');
        ggwk.p = new ggwk("DATE_MONTH_SHORT_ALT", 15, 'h');
        ggwk.q = new ggwk("DATE_DAY_FULL", 16, 'A');
        ggwk.r = new ggwk("DATE_DAY_SHORT", 17, 'a');
        ggwk.s = new ggwk("DATE_CENTURY_PADDED", 18, 'C');
        ggwk.t = new ggwk("DATE_YEAR_PADDED", 19, 'Y');
        ggwk.u = new ggwk("DATE_YEAR_OF_CENTURY_PADDED", 20, 'y');
        ggwk.v = new ggwk("DATE_DAY_OF_YEAR_PADDED", 21, 'j');
        ggwk.w = new ggwk("DATE_MONTH_PADDED", 22, 'm');
        ggwk.x = new ggwk("DATE_DAY_OF_MONTH_PADDED", 23, 'd');
        ggwk.y = new ggwk("DATE_DAY_OF_MONTH", 24, 'e');
        ggwk.z = new ggwk("DATETIME_HOURS_MINUTES", 25, 'R');
        ggwk.A = new ggwk("DATETIME_HOURS_MINUTES_SECONDS", 26, 'T');
        ggwk.B = new ggwk("DATETIME_HOURS_MINUTES_SECONDS_12H", 27, 'r');
        ggwk.C = new ggwk("DATETIME_MONTH_DAY_YEAR", 28, 'D');
        ggwk.D = new ggwk("DATETIME_YEAR_MONTH_DAY", 29, 'F');
        ggwk.E = new ggwk("DATETIME_FULL", 30, 'c');
        int v = 0;
        ggwk.H = new ggwk[]{ggwk.a, ggwk.b, ggwk.c, ggwk.d, ggwk.e, ggwk.f, ggwk.g, ggwk.h, ggwk.i, ggwk.j, ggwk.k, ggwk.l, ggwk.m, ggwk.n, ggwk.o, ggwk.p, ggwk.q, ggwk.r, ggwk.s, ggwk.t, ggwk.u, ggwk.v, ggwk.w, ggwk.x, ggwk.y, ggwk.z, ggwk.A, ggwk.B, ggwk.C, ggwk.D, ggwk.E};
        HashMap hashMap0 = new HashMap();
        ggwk[] arr_ggwk = ggwk.values();
        while(v < arr_ggwk.length) {
            ggwk ggwk0 = arr_ggwk[v];
            if(hashMap0.put(Character.valueOf(ggwk0.G), ggwk0) != null) {
                throw new IllegalStateException("duplicate format character: " + ggwk0);
            }
            ++v;
            continue;
        }
        ggwk.F = DesugarCollections.unmodifiableMap(hashMap0);
    }

    private ggwk(String s, int v, char c) {
        super(s, v);
        this.G = c;
    }

    public static ggwk[] values() {
        return (ggwk[])ggwk.H.clone();
    }
}

