import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ezzz implements fabs {
    private static final baun a;
    private static final long b;
    private final fagt c;
    private final AtomicBoolean d;

    static {
        ezzz.a = fabk.e("DefaultThrottler");
        ezzz.b = TimeUnit.SECONDS.toMillis(3L);
    }

    public ezzz() {
        this.c = (fagt)fagt.a.b();
        this.d = new AtomicBoolean(false);
    }

    @Override  // fabs
    public final void a() {
        this.d.set(true);
    }

    @Override  // fabs
    public final void b() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: gfud.e(',').l(((String)ezwo.c(hvzv.h, String.class)))) {
            arrayList0.add(Long.valueOf(Long.parseLong(((String)object0))));
        }
        fagt fagt0 = this.c;
        long v = SystemClock.elapsedRealtime();
        fagq fagq0 = ezyq.m;
        gged_interceptors gged0 = (gged_interceptors)fagt0.b(fagq0);
        long v1 = 0L;
        long v2 = 0L;
        for(int v3 = 0; true; ++v3) {
            if(v3 >= gged0.size() || v3 >= arrayList0.size()) {
                v1 = v2;
                break;
            }
            if(v < ((long)(((Long)gged0.get(v3))))) {
                fagt0.c(new fagn[]{fagq0});
                break;
            }
            v2 = Math.max(v2, ((long)(((Long)gged0.get(v3)))) + ((long)(((Long)arrayList0.get(v3)))));
        }
        if(SystemClock.elapsedRealtime() < v1) {
            Object[] arr_object = {SystemClock.elapsedRealtime(), v1};
            ezzz.a.h("Throttling: current time=%d, earliest retry time=%d.", arr_object);
        }
        while(true) {
            AtomicBoolean atomicBoolean0 = this.d;
            if(atomicBoolean0.get() || SystemClock.elapsedRealtime() >= v1) {
                break;
            }
            SystemClock.sleep(ezzz.b);
        }
        gged_interceptors gged1 = (gged_interceptors)fagt0.b(fagq0);
        if(!atomicBoolean0.get()) {
            ggdy ggdy0 = new ggdy();
            ggdy0.i(Long.valueOf(SystemClock.elapsedRealtime()));
            if(gged1.size() >= 15) {
                ggdy0.k(gged1.b(0, 14));
            }
            else {
                ggdy0.k(gged1);
            }
            fagt0.e(new fagh[]{new fagh(fagq0, ggdy0.h())});
        }
    }
}

