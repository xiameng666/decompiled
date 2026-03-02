import android.util.Log;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class cjkh {
    private static cjkh a;
    private final SecureRandom b;
    private final Map c;
    private int d;
    private final byte[] e;
    private long f;
    private long g;

    public cjkh() {
        this.e = new byte[8];
        this.c = new HashMap();
        this.b = new SecureRandom();
        this.f = System.currentTimeMillis();
        cjkh.a = this;
    }

    public static cjkh a() {
        cjkh cjkh0;
        synchronized(cjkh.class) {
            cjkh0 = cjkh.a;
            if(cjkh0 == null) {
                return new cjkh();
            }
        }
        return cjkh0;
    }

    public final boolean b(cjkg cjkg0, int v) {
        synchronized(this) {
            Map map0 = this.c;
            Integer integer0 = v;
            if(map0.containsKey(integer0)) {
                return false;
            }
            map0.put(integer0, cjkg0);
            int v2 = this.d;
            if(v2 != 0 && !cjkh.f(v, v2)) {
                cjkg0.d(false);
                cjkg0.c(this.e);
            }
            else {
                cjkg cjkg1 = (cjkg)map0.get(Integer.valueOf(v2));
                if(cjkg1 != null && this.d != 0) {
                    cjkg1.d(false);
                }
                this.e();
                cjkg cjkg2 = (cjkg)map0.get(Integer.valueOf(this.d));
                if(cjkg2 != null && this.d != 0) {
                    cjkg2.d(true);
                }
            }
        }
        return true;
    }

    public final boolean c() {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            if(v1 > this.f + 3600000L) {
                this.f = v1;
                this.g = 0L;
            }
            else {
                long v2 = this.g;
                if(v2 >= 20L) {
                    Log.w("NearbyPresence", "DedupHintManager is at the throttling limit of (20/3600000 millis): skipping action.");
                    Log.w("NearbyPresence", "Hint generation failed");
                    return false;
                }
                this.g = v2 + 1L;
            }
            byte[] arr_b = this.e;
            this.b.nextBytes(arr_b);
            for(Object object0: this.c.values()) {
                ((cjkg)object0).c(Arrays.copyOf(arr_b, 8));
            }
        }
        return true;
    }

    public final boolean d(int v) {
        synchronized(this) {
            Map map0 = this.c;
            Integer integer0 = v;
            if(!map0.containsKey(integer0)) {
                return false;
            }
            map0.remove(integer0);
            if(this.d == v) {
                this.e();
                cjkg cjkg0 = (cjkg)map0.get(Integer.valueOf(this.d));
                if(cjkg0 != null && this.d != 0) {
                    cjkg0.d(true);
                }
            }
        }
        return true;
    }

    private final void e() {
        int v = 0;
        for(Object object0: this.c.keySet()) {
            int v1 = (int)(((Integer)object0));
            if(v == 0 || cjkh.f(v1, v)) {
                v = v1;
            }
        }
        this.d = v;
        this.g = 0L;
    }

    private static final boolean f(int v, int v1) {
        return v < v1 && v != 0;
    }
}

