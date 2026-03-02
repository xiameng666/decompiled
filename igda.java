import java.io.Serializable;

public abstract class igda implements Serializable {
    public static final igda a = null;
    public static final igda b = null;
    public static final igda c = null;
    public static final igda d = null;
    public static final igda e = null;
    public static final igda f = null;
    public static final igda g = null;
    public static final igda h = null;
    public static final igda i = null;
    public static final igda j = null;
    public static final igda k = null;
    public static final igda l = null;
    public final String m;
    private static final long serialVersionUID = 0x7F8CAC4ED77L;

    static {
        igda.a = new igcz("eras", 1);
        igda.b = new igcz("centuries", 2);
        igda.c = new igcz("weekyears", 3);
        igda.d = new igcz("years", 4);
        igda.e = new igcz("months", 5);
        igda.f = new igcz("weeks", 6);
        igda.g = new igcz("days", 7);
        igda.h = new igcz("halfdays", 8);
        igda.i = new igcz("hours", 9);
        igda.j = new igcz("minutes", 10);
        igda.k = new igcz("seconds", 11);
        igda.l = new igcz("millis", 12);
    }

    protected igda(String s) {
        this.m = s;
    }

    public abstract igcy a(igcm arg1);

    @Override
    public final String toString() {
        return this.m;
    }
}

