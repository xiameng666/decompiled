import android.os.Handler;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.HashMap;
import java.util.Set;

public final class gyjz {
    public static final gyju a;
    public final Handler b;
    public final HashMap c;
    public final ggdi d;
    public final ConcurrentLinkedQueue e;
    public final Set f;
    public final Runnable g;

    static {
        gyjz.a = new gyjq();
    }

    public gyjz(Handler handler0) {
        this.c = new HashMap();
        this.d = new ggdi();
        this.e = new ConcurrentLinkedQueue();
        this.f = ggog.l();
        this.g = new gyjr(this);
        this.b = handler0;
    }

    public final gyjs a(gyjv gyjv0) {
        gyjy gyjy0 = (gyjy)this.c.get(gyjv0);
        return gyjy0 == null ? null : gyjy0.b;
    }

    public final void b(gyjv gyjv0, gyjs gyjs0, gyjv[] arr_gyjv) {
        synchronized(this.c) {
            this.c(gyjv0);
            gyjy gyjy0 = new gyjy(this, gyjv0, gyjs0, arr_gyjv);
            this.c.put(gyjv0, gyjy0);
            this.d(gyjy0, 0L);
        }
    }

    public final void c(gyjv gyjv0) {
        HashMap hashMap0 = this.c;
        synchronized(hashMap0) {
            gyjy gyjy0 = (gyjy)hashMap0.remove(gyjv0);
            this.e.remove(gyjy0);
            Handler handler0 = this.b;
            handler0.removeCallbacks(gyjy0);
            for(Object object0: this.d.G(gyjy0)) {
                handler0.removeCallbacks(((Runnable)object0));
            }
            if(gyjy0 != null) {
                gyjy0.c = true;
                gyjy0.run();
            }
        }
    }

    public final void d(gyjy gyjy0, long v) {
        gyjt gyjt0 = new gyjt(this, gyjy0);
        synchronized(this.c) {
            this.d.v(gyjy0, gyjt0);
        }
        this.b.postDelayed(gyjt0, v);
    }
}

