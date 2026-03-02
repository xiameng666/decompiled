import j..util.DesugarCollections;
import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class igct {
    public static volatile Map a;
    private static final igcs b;
    private static volatile igcs c;

    static {
        igcs igcs0 = new igcs();
        igct.b = igcs0;
        igct.c = igcs0;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("UT", igcw.b);
        linkedHashMap0.put("UTC", igcw.b);
        linkedHashMap0.put("GMT", igcw.b);
        igct.f(linkedHashMap0, "EST", "America/New_York");
        igct.f(linkedHashMap0, "EDT", "America/New_York");
        igct.f(linkedHashMap0, "CST", "America/Chicago");
        igct.f(linkedHashMap0, "CDT", "America/Chicago");
        igct.f(linkedHashMap0, "MST", "America/Denver");
        igct.f(linkedHashMap0, "MDT", "America/Denver");
        igct.f(linkedHashMap0, "PST", "America/Los_Angeles");
        igct.f(linkedHashMap0, "PDT", "America/Los_Angeles");
        igct.a = DesugarCollections.unmodifiableMap(linkedHashMap0);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final long b(igdk igdk0) {
        return igdk0 == null ? igct.a() : igdk0.oT();
    }

    public static final DateFormatSymbols c(Locale locale0) {
        try {
            return DateFormatSymbols.getInstance(locale0);
        }
        catch(Exception unused_ex) {
            return new DateFormatSymbols(locale0);
        }
    }

    public static final igcm d(igcm igcm0) {
        return igcm0 == null ? igev.Q() : igcm0;
    }

    public static final igcw e(igcw igcw0) {
        return igcw0 == null ? igcw.o() : igcw0;
    }

    private static void f(Map map0, String s, String s1) {
        try {
            map0.put(s, igcw.m(s1));
        }
        catch(RuntimeException unused_ex) {
        }
    }
}

