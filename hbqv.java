import android.os.SystemClock;
import java.util.Map;

public final class hbqv implements Runnable {
    public final hbqy a;
    public final hbko b;
    public final Object c;
    public final long d;
    public final hbqw e;

    public hbqv(hbqy hbqy0, hbko hbko0, Object object0, long v, hbqw hbqw0) {
        this.a = hbqy0;
        this.b = hbko0;
        this.c = object0;
        this.d = v;
        this.e = hbqw0;
    }

    @Override
    public final void run() {
        hbqy hbqy0 = this.a;
        Map map0 = hbqy0.i;
        hbko hbko0 = this.b;
        if(!map0.containsKey(hbko0)) {
            map0.put(hbko0, new gfza());
        }
        ((gghp)map0.get(hbko0)).v(this.c, Long.valueOf(this.d));
        long v = SystemClock.elapsedRealtime();
        if(!hbqy0.f(hbko0, v)) {
            return;
        }
        hbqy0.h.put(hbko0, Long.valueOf(v));
        hbqs hbqs0 = new hbqs(hbqy0, hbko0, this.e);
        hawb.a.execute(hbqs0);
    }
}

