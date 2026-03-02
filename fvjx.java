import android.os.SystemClock;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fvjx {
    public static final short[] a;
    public final boolean b;
    public long c;
    public int d;
    private final boolean e;
    private final int f;
    private final int g;
    private long h;

    static {
        fvjx.a = new short[]{7, 8, 3};
    }

    public fvjx(boolean z, boolean z1, int v, int v1) {
        this.c = -86400000000000L;
        this.h = -86400000000000L;
        this.d = 4;
        this.b = z;
        this.e = z1;
        this.f = v;
        this.g = v1;
    }

    public static void a(int v, List list0) {
        cmms cmms0 = new cmms();
        cmms0.a = v;
        cmms0.b(0);
        list0.add(cmms0.a());
        cmms cmms1 = new cmms();
        cmms1.a = v;
        cmms1.b(1);
        list0.add(cmms1.a());
    }

    public final void b(ActivityTransitionResult activityTransitionResult0) {
        synchronized(this) {
            this.d = 4;
            for(Object object0: activityTransitionResult0.a) {
                ActivityTransitionEvent activityTransitionEvent0 = (ActivityTransitionEvent)object0;
                if(activityTransitionEvent0.b == 0) {
                    this.d = activityTransitionEvent0.a;
                }
                int v1 = activityTransitionEvent0.a;
                if(this.e(v1)) {
                    this.c = Math.max(activityTransitionEvent0.c, this.c);
                }
                else {
                    if(v1 != 0) {
                        continue;
                    }
                    this.h = Math.max(activityTransitionEvent0.c, this.h);
                }
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtimeNanos();
            z = true;
            switch(this.d) {
                case 0: {
                    break;
                }
                case 3: {
                    if(this.h < this.c) {
                        z = false;
                    }
                    else if(TimeUnit.NANOSECONDS.toSeconds(v1 - this.h) > ((long)this.g)) {
                        return false;
                    }
                    break;
                }
                default: {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean d() {
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtimeNanos();
            if(this.d != 0 && this.h <= this.c && TimeUnit.NANOSECONDS.toSeconds(v1 - this.h) > ((long)this.g)) {
                return this.e(this.d) || TimeUnit.NANOSECONDS.toSeconds(v1 - this.c) < ((long)this.f);
            }
        }
        return false;
    }

    private final boolean e(int v) {
        short[] arr_v = fvjx.a;
        for(int v1 = 0; v1 < 3; ++v1) {
            if(arr_v[v1] == v) {
                return v == 3 ? this.e : true;
            }
        }
        return false;
    }
}

