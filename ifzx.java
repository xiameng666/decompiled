import android.os.Process;
import android.util.Log;
import j..time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class ifzx implements Runnable {
    public final ifzz a;

    public ifzx(ifzz ifzz0) {
        this.a = ifzz0;
    }

    @Override
    public final void run() {
        int v8;
        long v6;
        int v2;
        String s;
        Map map0;
        try {
            ifzz ifzz0 = this.a;
            igac igac0 = ifzz0.d;
            ifye ifye0 = igac0.t;
            long v = (long)igac0.s;
            igan igan0 = igac0.o;
            int v1 = 0;
            if(igan0 == null) {
                map0 = Collections.EMPTY_MAP;
                s = "";
                v2 = 0;
            }
            else {
                map0 = igan0.getAllHeaders();
                s = igac0.o.b;
                v2 = igac0.o.a;
            }
            long v3 = 0L;
            long v4 = 0L;
            for(Object object0: igac0.e.entrySet()) {
                String s1 = (String)((Map.Entry)object0).getKey();
                if(s1 != null) {
                    v4 += (long)s1.length();
                }
                String s2 = (String)((Map.Entry)object0).getValue();
                if(s2 != null) {
                    v4 += (long)s2.length();
                }
            }
            if(map0 != null) {
                long v5 = 0L;
                for(Object object1: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    String s3 = (String)map$Entry0.getKey();
                    if(s3 != null) {
                        v5 += (long)s3.length();
                    }
                    if(map$Entry0.getValue() != null) {
                        for(Object object2: ((List)map$Entry0.getValue())) {
                            String s4 = (String)object2;
                            if(s4 != null) {
                                v5 += (long)s4.length();
                            }
                        }
                    }
                }
                v3 = v5;
            }
            if(map0.containsKey("Content-Length")) {
                String s5 = (String)((List)map0.get("Content-Length")).get(0);
                try {
                    v6 = 0L;
                    v6 = Long.parseLong(s5);
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            else {
                v6 = -1L;
            }
            Duration duration0 = Duration.ofSeconds(0L);
            Duration duration1 = Duration.ofSeconds(0L);
            igac igac1 = ifzz0.d;
            int v7 = igac1.g.get();
            switch(v7) {
                case 6: {
                    v8 = 2;
                    break;
                }
                case 7: {
                    v8 = 1;
                    break;
                }
                case 8: {
                    v8 = 3;
                    break;
                }
                default: {
                    throw new IllegalStateException(a.f(v7, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                }
            }
            int v9 = igac1.w;
            int v10 = igac1.v;
            ifyw ifyw0 = igac1.y;
            if(ifyw0 != null) {
                v1 = ifyw0.g;
            }
            ifye0.d(v, new ifyc(v4, v3, v6, v2, duration0, duration1, s, v8, v9, v10, v1, igac1.x, Process.myUid(), ifyb.d));
        }
        catch(RuntimeException runtimeException0) {
            Log.i("igac", "Error while trying to log CronetTrafficInfo: ", runtimeException0);
        }
    }
}

