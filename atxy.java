import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public final class atxy {
    public final Context a;
    public final atxp b;
    public final cjpc c;
    public final Set d;
    public final Set e;
    public long f;
    private final Runnable g;
    private final Handler h;

    public atxy(Context context0, atxp atxp0) {
        this.d = new HashSet();
        this.e = new HashSet();
        this.a = context0;
        this.b = atxp0;
        cjpc cjpc0 = avjn.e(context0);
        this.c = cjpc0;
        this.g = new atxx(this);
        this.h = new clht(Looper.getMainLooper());
        this.f = cjpd.b(cjpc0, "com.google.android.gms.cast.KEY_CAST_ANALYTICS_LAST_SELF_DEVICE_ROUTE_LOG_TIMESTAMP", 0L);
        long v = System.currentTimeMillis();
        HashSet hashSet0 = new HashSet();
        for(Object object0: cjpd.d(cjpc0).keySet()) {
            String s = (String)object0;
            if(s != null && s.startsWith("self_device_route_timestamp_")) {
                long v1 = cjpd.b(this.c, s, 0L);
                if(v1 != 0L && v - v1 > 172800000L) {
                    hashSet0.add(s);
                }
                else if(s.startsWith("self_device_route_timestamp_reported_")) {
                    String s1 = s.substring(37);
                    this.d.add(s1);
                    this.e.add(s1);
                }
                else {
                    if(!s.startsWith("self_device_route_timestamp_detected_")) {
                        continue;
                    }
                    this.d.add(s.substring(37));
                }
            }
        }
        if(!hashSet0.isEmpty()) {
            for(Object object1: hashSet0) {
                cjpa cjpa0 = this.c.c();
                cjpa0.j(((String)object1));
                cjpd.g(cjpa0);
            }
        }
        this.c();
    }

    static String a(String s, String s1) {
        return String.format("%s%s", s, s1);
    }

    public final String b(String s) {
        try {
            String s1 = atxy.a("self_device_route_timestamp_reported_", s);
            if(this.c.h(s1)) {
                return s1;
            }
        }
        catch(IOException unused_ex) {
        }
        return atxy.a("self_device_route_timestamp_detected_", s);
    }

    public final void c() {
        this.h.post(this.g);
    }
}

