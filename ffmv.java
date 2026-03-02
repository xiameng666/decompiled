import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public final class ffmv implements ComponentCallbacks2, ffmj {
    final bxh a;
    private Integer b;
    private final AtomicLong c;

    public ffmv() {
        this.a = new bxh();
        this.c = new AtomicLong(0L);
    }

    public static String a(ffbw ffbw0) {
        return (ffbw0.b & 0x100) == 0 ? String.valueOf(ffbw0.h.size()) : ffmv.m((ffbw0.j == null ? feyj.a : ffbw0.j));
    }

    public static String b(ffbw ffbw0) {
        if((ffbw0.b & 0x1000) != 0) {
            return (ffbv.a(ffbw0.n) == 0 ? 1 : ffbv.a(ffbw0.n)) == 3 ? "hi" : "lo";
        }
        return "un";
    }

    public final void c(String s, String s1) {
        bxh bxh0 = this.a;
        synchronized(bxh0) {
            if(this.b == null) {
                this.b = (int)hzzi.a.i().P();
            }
            while(bxh0.a() >= ((int)this.b)) {
                bxh0.c();
            }
            String s2 = String.format(Locale.US, "%-8s%s", s, s1);
            Object[] arr_object = bxh0.a;
            int v1 = bxh0.c;
            arr_object[v1] = new ffmu(System.currentTimeMillis(), s2);
            int v2 = bxh0.d & v1 + 1;
            bxh0.c = v2;
            if(v2 == bxh0.b) {
                bxh0.e();
            }
            if(Log.isLoggable("rpcs", 2)) {
                Log.v("rpcs", s2);
            }
        }
    }

    public final void d(String s, ffbw ffbw0) {
        String s1 = ffmv.b(ffbw0);
        this.c("inbound", String.format(Locale.US, " [%s:%3d:%3d] %s -> %s (via %8s) %-31s %s %s", s1, ((int)ffbw0.k), ((int)ffbw0.c), ffbw0.i, ffbw0.f, s, ffmr.a(ffbw0.d), ffbw0.g, ffmv.a(ffbw0)));
    }

    public final void f(String s, ffbw ffbw0, String s1) {
        String s2 = ffmv.b(ffbw0);
        this.c("inbound", String.format(Locale.US, "*[%s:%3d:%3d] %s -> %s (via %8s) %-31s %s %s DROPPED %s", s2, ((int)ffbw0.k), ((int)ffbw0.c), ffbw0.i, ffbw0.f, s, ffmr.a(ffbw0.d), ffbw0.g, ffmv.a(ffbw0), s1));
    }

    public final void g(String s, int v, byte[] arr_b, String s1) {
        this.c("offload-inbound", String.format(Locale.US, "*[offload] %s -> local, endpoint %d, length %d DROPPED %s", s, v, ((int)arr_b.length), s1));
    }

    public final void h(String s, int v, byte[] arr_b, String s1) {
        this.c("offload-inbound", String.format(Locale.US, "*[offload] %s -> local, response ID %d, length %d DROPPED %s", s, v, ((int)arr_b.length), s1));
    }

    public final void i(String s, ffbw ffbw0) {
        String s1 = ffmv.b(ffbw0);
        this.c("outbound", String.format(Locale.US, " [%s:%3d:%3d] %s -> %s (via %8s) %-31s %s %s", s1, ((int)ffbw0.k), ((int)ffbw0.c), ffbw0.i, ffbw0.f, s, ffmr.a(ffbw0.d), ffbw0.g, ffmv.a(ffbw0)));
    }

    public final void j(String s, ffbw ffbw0, String s1) {
        String s2 = ffmv.b(ffbw0);
        this.c("outbound", String.format(Locale.US, "*[%s:%3d:%3d] %s -> %s (via %8s) %-31s %s %s DROPPED %s", s2, ((int)ffbw0.k), ((int)ffbw0.c), ffbw0.i, ffbw0.f, s, ffmr.a(ffbw0.d), ffbw0.g, ffmv.a(ffbw0), s1));
    }

    public static final String k(int v, int v1, int v2, String s, String s1, String s2, byte[] arr_b) {
        Locale locale0 = Locale.US;
        String s3 = v == 1 ? "hi" : "lo";
        Integer integer0 = v1;
        Integer integer1 = v2;
        String s4 = ffmr.a(s1);
        return arr_b == null ? String.format(locale0, "[%s:%3d:%3d] %s %-31s %s %s", s3, integer0, integer1, s, s4, s2, ((int)0)) : String.format(locale0, "[%s:%3d:%3d] %s %-31s %s %s", s3, integer0, integer1, s, s4, s2, ((int)arr_b.length));
    }

    public static final String l(int v, int v1, String s, String s1, String s2, feyj feyj0) {
        return String.format(Locale.US, "[%3d:%3d] %s %-31s %s %s", v, v1, s, ffmr.a(s1), s2, ffmv.m(feyj0));
    }

    private static String m(feyj feyj0) {
        StringBuilder stringBuilder0 = new StringBuilder("channel request");
        int v = feyj0.b;
        if((v & 4) != 0) {
            if(((feyj0.e == null ? feye.a : feyj0.e).b & 2) != 0) {
                stringBuilder0.append(" id: ");
                stringBuilder0.append((feyj0.e == null ? feye.a : feyj0.e).d);
            }
            String s = (feyj0.e == null ? feye.a : feyj0.e).h;
            if(!TextUtils.isEmpty(s)) {
                stringBuilder0.append(" ");
                stringBuilder0.append(s);
            }
            int v1 = feyd.a((feyj0.e == null ? feye.a : feyj0.e).c);
            if(v1 != 0) {
                switch(v1) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        stringBuilder0.append(" (OPEN_ACK)");
                        return stringBuilder0.toString();
                    }
                    default: {
                        stringBuilder0.append(" (CLOSE)");
                        return stringBuilder0.toString();
                    }
                }
            }
            stringBuilder0.append(" (OPEN)");
            return stringBuilder0.toString();
        }
        if((v & 8) != 0) {
            feyh feyh0 = feyj0.f == null ? feyh.a : feyj0.f;
            if(((feyh0.c == null ? feyg.a : feyh0.c).b & 1) != 0) {
                stringBuilder0.append(" id: ");
                feyh feyh1 = feyj0.f == null ? feyh.a : feyj0.f;
                stringBuilder0.append((feyh1.c == null ? feyg.a : feyh1.c).c);
            }
            stringBuilder0.append(" (DATA: ");
            feyh feyh2 = feyj0.f;
            if(((feyh2 == null ? feyh.a : feyh2).b & 2) == 0) {
                stringBuilder0.append("0");
            }
            else {
                if(feyh2 == null) {
                    feyh2 = feyh.a;
                }
                stringBuilder0.append(feyh2.d.size());
            }
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
        if((v & 16) != 0) {
            feyf feyf0 = feyj0.g == null ? feyf.a : feyj0.g;
            if(((feyf0.c == null ? feyg.a : feyf0.c).b & 1) != 0) {
                stringBuilder0.append(" id: ");
                feyf feyf1 = feyj0.g == null ? feyf.a : feyj0.g;
                stringBuilder0.append((feyf1.c == null ? feyg.a : feyf1.c).c);
            }
            stringBuilder0.append(" (DATA_ACK)");
        }
        return stringBuilder0.toString();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bxh bxh0 = this.a;
        synchronized(bxh0) {
            int v1 = bxh0.a();
            int v4 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                v4 = v4 + 8 + ((ffmu)bxh0.b(v3)).b.length() + 16;
            }
            bbpd0.println("num events: " + bxh0.a() + ", bytes used: " + v4);
            long v5 = this.c.get();
            if(v5 > 0L) {
                bbpd0.println(a.u(v5, "received a lowMemory notification and cleared rpcs at "));
            }
            int v6 = bxh0.a();
            for(int v2 = 0; v2 < v6; ++v2) {
                ffmu ffmu0 = (ffmu)bxh0.b(v2);
                String s = ffmi.a(ffmu0.a);
                bbpd0.println(a.r(ffmu0.b, s, ": "));
            }
        }
    }

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        if(v >= 10) {
            bxh bxh0 = this.a;
            synchronized(bxh0) {
                int v2 = bxh0.a();
                if(v2 > 0) {
                    if(v2 > bxh0.a()) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    int v3 = bxh0.a.length;
                    int v4 = bxh0.b;
                    if(v2 < v3 - v4) {
                        v3 = v4 + v2;
                    }
                    while(v4 < v3) {
                        bxh0.a[v4] = null;
                        ++v4;
                    }
                    int v5 = v3 - bxh0.b;
                    int v6 = v2 - v5;
                    bxh0.b = bxh0.d & bxh0.b + v5;
                    if(v6 > 0) {
                        for(int v7 = 0; v7 < v6; ++v7) {
                            bxh0.a[v7] = null;
                        }
                        bxh0.b = v6;
                    }
                }
                this.c.set(System.currentTimeMillis());
            }
        }
    }
}

