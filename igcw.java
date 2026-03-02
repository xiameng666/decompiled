import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public abstract class igcw implements Serializable {
    private static igib a = null;
    public static final igcw b = null;
    public static Set c = null;
    public final String d;
    public static ighz e = null;
    private static volatile igcw f = null;
    private static iggt g = null;
    private static Map h = null;
    private static Map i = null;
    private static final long serialVersionUID = 0x4CF893D49479892AL;

    static {
        igib igib0;
        igcw.b = new igia("UTC", "UTC", 0, 0);
        ighz ighz0 = null;
        try {
            String s = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if(s == null) {
                goto label_9;
            }
            else {
                try {
                    igib0 = (igib)Class.forName(s).newInstance();
                }
                catch(Exception exception0) {
                    Thread thread0 = Thread.currentThread();
                    thread0.getThreadGroup().uncaughtException(thread0, exception0);
                    goto label_9;
                }
            }
            goto label_10;
        }
        catch(SecurityException unused_ex) {
        }
    label_9:
        igib0 = null;
    label_10:
        if(igib0 == null) {
            try {
                igib0 = new igie(null);
            }
            catch(Exception exception1) {
                Thread thread1 = Thread.currentThread();
                thread1.getThreadGroup().uncaughtException(thread1, exception1);
            }
        }
        if(igib0 == null) {
            igib0 = new igic();
        }
        Set set0 = igib0.a();
        if(set0 == null || set0.size() == 0) {
            throw new IllegalArgumentException("The provider doesn\'t have any available ids");
        }
        if(!set0.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn\'t support UTC");
        }
        igcw igcw0 = igib0.b("UTC");
        if(!igcw.b.equals(igcw0)) {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
        try {
            igcw.a = igib0;
            igcw.c = set0;
            String s1 = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if(s1 != null) {
                try {
                    ighz0 = (ighz)Class.forName(s1).newInstance();
                }
                catch(Exception exception2) {
                    Thread thread2 = Thread.currentThread();
                    thread2.getThreadGroup().uncaughtException(thread2, exception2);
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
        if(ighz0 == null) {
            ighz0 = new ighz();
        }
        igcw.e = ighz0;
    }

    protected igcw(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.d = s;
    }

    public abstract int a(long arg1);

    public abstract int b(long arg1);

    private static int c(String s) {
        igcu igcu0 = new igcu();
        return -((int)igcw.t().d(igcu0).a(s));
    }

    public abstract long d(long arg1);

    public abstract long e(long arg1);

    @Override
    public abstract boolean equals(Object arg1);

    private static String f(String s) {
        String s1;
        synchronized(igcw.class) {
            Map map0 = igcw.i;
            if(map0 == null) {
                map0 = new HashMap();
                map0.put("GMT", "UTC");
                map0.put("WET", "WET");
                map0.put("CET", "CET");
                map0.put("MET", "CET");
                map0.put("ECT", "CET");
                map0.put("EET", "EET");
                map0.put("MIT", "Pacific/Apia");
                map0.put("HST", "Pacific/Honolulu");
                map0.put("AST", "America/Anchorage");
                map0.put("PST", "America/Los_Angeles");
                map0.put("MST", "America/Denver");
                map0.put("PNT", "America/Phoenix");
                map0.put("CST", "America/Chicago");
                map0.put("EST", "America/New_York");
                map0.put("IET", "America/Indiana/Indianapolis");
                map0.put("PRT", "America/Puerto_Rico");
                map0.put("CNT", "America/St_Johns");
                map0.put("AGT", "America/Argentina/Buenos_Aires");
                map0.put("BET", "America/Sao_Paulo");
                map0.put("ART", "Africa/Cairo");
                map0.put("CAT", "Africa/Harare");
                map0.put("EAT", "Africa/Addis_Ababa");
                map0.put("NET", "Asia/Yerevan");
                map0.put("PLT", "Asia/Karachi");
                map0.put("IST", "Asia/Kolkata");
                map0.put("BST", "Asia/Dhaka");
                map0.put("VST", "Asia/Ho_Chi_Minh");
                map0.put("CTT", "Asia/Shanghai");
                map0.put("JST", "Asia/Tokyo");
                map0.put("ACT", "Australia/Darwin");
                map0.put("AET", "Australia/Sydney");
                map0.put("SST", "Pacific/Guadalcanal");
                map0.put("NST", "Pacific/Auckland");
                igcw.i = map0;
            }
            s1 = (String)map0.get(s);
        }
        return s1;
    }

    public abstract String g(long arg1);

    public abstract boolean h();

    @Override
    public int hashCode() {
        return this.d.hashCode() + 57;
    }

    public int i(long v) {
        int v1 = this.a(v);
        long v2 = v - ((long)v1);
        int v3 = this.a(v2);
        if(v1 != v3) {
            return v1 - v3 >= 0 || this.d(v2) == this.d(v - ((long)v3)) ? v3 : v1;
        }
        if(v1 >= 0) {
            long v4 = this.e(v2);
            if(v4 < v2) {
                int v5 = this.a(v4);
                return v2 - v4 > ((long)(v5 - v1)) ? v3 : v5;
            }
        }
        return v3;
    }

    public final long j(long v) {
        long v1 = (long)this.a(v);
        long v2 = v + v1;
        if((v ^ v2) < 0L && (v ^ v1) >= 0L) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return v2;
    }

    public final long k(igcw igcw0, long v) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        return igcw0 == this ? v : igcw0.q(this.j(v), v);
    }

    public static String l(int v) {
        StringBuffer stringBuffer0 = new StringBuffer();
        if(v >= 0) {
            stringBuffer0.append('+');
        }
        else {
            stringBuffer0.append('-');
            v = -v;
        }
        ighn.c(stringBuffer0, v / 3600000, 2);
        stringBuffer0.append(':');
        int v1 = v - v / 3600000 * 3600000;
        ighn.c(stringBuffer0, v1 / 60000, 2);
        int v2 = v1 - v1 / 60000 * 60000;
        if(v2 != 0) {
            stringBuffer0.append(':');
            ighn.c(stringBuffer0, v2 / 1000, 2);
            int v3 = v2 - v2 / 1000 * 1000;
            if(v3 != 0) {
                stringBuffer0.append('.');
                ighn.c(stringBuffer0, v3, 3);
                return stringBuffer0.toString();
            }
        }
        return stringBuffer0.toString();
    }

    public static igcw m(String s) {
        if(s == null) {
            return igcw.o();
        }
        if(!s.equals("UTC")) {
            igcw igcw0 = igcw.a.b(s);
            if(igcw0 != null) {
                return igcw0;
            }
            if(!s.startsWith("+") && !s.startsWith("-")) {
                throw new IllegalArgumentException(a.a(s, "The datetime zone id \'", "\' is not recognised"));
            }
            int v = igcw.c(s);
            return ((long)v) == 0L ? igcw.b : igcw.s(igcw.l(v), v);
        }
        return igcw.b;
    }

    public static igcw n(int v) {
        if(v >= 0xFAD9A401 && v <= 0x5265BFF) {
            return igcw.s(igcw.l(v), v);
        }
        throw new IllegalArgumentException("Millis out of range: " + v);
    }

    public static igcw o() {
        igcw igcw1;
        igcw igcw2;
        igcw igcw0 = igcw.f;
        if(igcw0 == null) {
            synchronized(igcw.class) {
                igcw1 = igcw.f;
                if(igcw1 == null) {
                    try {
                        igcw1 = null;
                        String s = System.getProperty("user.timezone");
                        igcw2 = null;
                        if(s != null) {
                            igcw2 = igcw.m(s);
                        }
                    }
                    catch(RuntimeException unused_ex) {
                    }
                    if(igcw2 == null) {
                        try {
                            TimeZone timeZone0 = TimeZone.getDefault();
                            if(timeZone0 == null) {
                                igcw1 = igcw.o();
                            }
                            else {
                                String s1 = timeZone0.getID();
                                if(s1.equals("UTC")) {
                                    igcw1 = igcw.b;
                                }
                                else {
                                    String s2 = igcw.f(s1);
                                    if(s2 != null) {
                                        igcw1 = igcw.a.b(s2);
                                    }
                                    if(igcw1 == null) {
                                        igcw1 = igcw.a.b(s1);
                                    }
                                    if(igcw1 == null) {
                                        if(s2 != null) {
                                            throw new IllegalArgumentException(a.a(s1, "The datetime zone id \'", "\' is not recognised"));
                                        }
                                        String s3 = timeZone0.getID();
                                        if(!s3.startsWith("GMT+") && !s3.startsWith("GMT-")) {
                                            throw new IllegalArgumentException(a.a(s1, "The datetime zone id \'", "\' is not recognised"));
                                        }
                                        int v1 = igcw.c(s3.substring(3));
                                        igcw1 = ((long)v1) == 0L ? igcw.b : igcw.s(igcw.l(v1), v1);
                                    }
                                }
                            }
                        }
                        catch(IllegalArgumentException unused_ex) {
                            igcw1 = igcw2;
                        }
                    }
                    else {
                        igcw1 = igcw2;
                    }
                    if(igcw1 == null) {
                        igcw1 = igcw.b;
                    }
                    igcw.f = igcw1;
                }
            }
            return igcw1;
        }
        return igcw0;
    }

    public final boolean p(long v) {
        return this.a(v) == this.b(v);
    }

    public final long q(long v, long v1) {
        int v2 = this.a(v1);
        long v3 = v - ((long)v2);
        if(this.a(v3) != v2) {
            int v4 = this.a(v);
            long v5 = v - ((long)v4);
            int v6 = this.a(v5);
            if(v4 != v6 && v4 < 0) {
                long v7 = this.d(v5);
                long v8 = 0x7FFFFFFFFFFFFFFFL;
                if(Long.compare(v7, v5) == 0) {
                    v7 = 0x7FFFFFFFFFFFFFFFL;
                }
                long v9 = v - ((long)v6);
                long v10 = this.d(v9);
                if(v10 != v9) {
                    v8 = v10;
                }
                if(v7 == v8) {
                    v4 = v6;
                }
            }
            else {
                v4 = v6;
            }
            v3 = v - ((long)v4);
            if((v ^ v3) < 0L && (v ^ ((long)v4)) < 0L) {
                throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
        }
        return v3;
    }

    public static igcw r(int v) {
        if(v != 0) {
            int v1 = v * 60;
            v1 = v1 >= 0 ? v * 60 : v1 - Math.abs(0);
            if(((long)v1) * 60000L >= 0xFFFFFFFF80000000L && ((long)v1) * 60000L <= 0x7FFFFFFFL) {
                return igcw.n(((int)(((long)v1) * 60000L)));
            }
            try {
                throw new ArithmeticException(a.z(60000, v1, "Multiplication overflows an int: ", " * "));
            }
            catch(ArithmeticException unused_ex) {
                throw new IllegalArgumentException("Offset is too large");
            }
        }
        return igcw.b;
    }

    private static igcw s(String s, int v) {
        igcw igcw1;
        synchronized(igcw.class) {
            if(v == 0) {
                return igcw.b;
            }
            if(igcw.h == null) {
                igcw.h = new HashMap();
            }
            Reference reference0 = (Reference)igcw.h.get(s);
            if(reference0 != null) {
                igcw igcw0 = (igcw)reference0.get();
                if(igcw0 != null) {
                    return igcw0;
                }
            }
            igcw1 = new igia(s, null, v, v);
            igcw.h.put(s, new SoftReference(igcw1));
        }
        return igcw1;
    }

    private static iggt t() {
        synchronized(igcw.class) {
            if(igcw.g == null) {
                ighi ighi0 = new ighi();
                ighi0.u(null, true, 4);
                igcw.g = ighi0.a();
            }
        }
        return igcw.g;
    }

    @Override
    public final String toString() {
        return this.d;
    }

    protected Object writeReplace() {
        return new igcv(this.d);
    }
}

