import java.io.Serializable;

public abstract class igcr implements Serializable {
    public static final igcr b = null;
    public static final igcr c = null;
    public static final igcr d = null;
    public static final igcr e = null;
    public static final igcr f = null;
    public static final igcr g = null;
    public static final igcr h = null;
    public static final igcr i = null;
    public static final igcr j = null;
    public static final igcr k = null;
    public static final igcr l = null;
    public static final igcr m = null;
    public static final igcr n = null;
    public static final igcr o = null;
    public static final igcr p = null;
    public static final igcr q = null;
    public static final igcr r = null;
    public static final igcr s = null;
    private static final long serialVersionUID = 0xFFFFD93DDB047C1AL;
    public static final igcr t;
    public static final igcr u;
    public static final igcr v;
    public static final igcr w;
    public static final igcr x;
    public final String y;

    static {
        igcr.b = new igcq("era", 1, igda.a);
        igcr.c = new igcq("yearOfEra", 2, igda.d);
        igcr.d = new igcq("centuryOfEra", 3, igda.b);
        igcr.e = new igcq("yearOfCentury", 4, igda.d);
        igcr.f = new igcq("year", 5, igda.d);
        igcr.g = new igcq("dayOfYear", 6, igda.g);
        igcr.h = new igcq("monthOfYear", 7, igda.e);
        igcr.i = new igcq("dayOfMonth", 8, igda.g);
        igcr.j = new igcq("weekyearOfCentury", 9, igda.c);
        igcr.k = new igcq("weekyear", 10, igda.c);
        igcr.l = new igcq("weekOfWeekyear", 11, igda.f);
        igcr.m = new igcq("dayOfWeek", 12, igda.g);
        igcr.n = new igcq("halfdayOfDay", 13, igda.h);
        igcr.o = new igcq("hourOfHalfday", 14, igda.i);
        igcr.p = new igcq("clockhourOfHalfday", 15, igda.i);
        igcr.q = new igcq("clockhourOfDay", 16, igda.i);
        igcr.r = new igcq("hourOfDay", 17, igda.i);
        igcr.s = new igcq("minuteOfDay", 18, igda.j);
        igcr.t = new igcq("minuteOfHour", 19, igda.j);
        igcr.u = new igcq("secondOfDay", 20, igda.k);
        igcr.v = new igcq("secondOfMinute", 21, igda.k);
        igcr.w = new igcq("millisOfDay", 22, igda.l);
        igcr.x = new igcq("millisOfSecond", 23, igda.l);
    }

    protected igcr(String s) {
        this.y = s;
    }

    public abstract igcp a(igcm arg1);

    @Override
    public final String toString() {
        return this.y;
    }
}

