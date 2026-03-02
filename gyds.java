import android.content.Context;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gyds implements gyjd {
    public final gyey a;
    public final gyhc b;
    public final gyhk c;
    public final AtomicBoolean d;

    static {
        Collections.singleton(hiib.c);
    }

    public gyds(Context context0, gyhc gyhc0, gyhk gyhk0) {
        this.a = (gyey)cusq.c(context0, gyey.class);
        this.b = gyhc0;
        this.c = gyhk0;
        this.d = new AtomicBoolean(false);
    }

    @Override  // gyjd
    public final MessageLite a() {
        return gygm.a;
    }

    @Override  // gyjd
    public final void b(gyim gyim0, gykr gykr0) {
        gydr gydr0 = new gydr(this, gykr0);
        this.a.g(gydr0);
    }

    @Override  // gyjd
    public final void c(gykr gykr0) {
        if(this.d.compareAndSet(true, false)) {
            this.a.d(null, new gyll[]{this.a.h.m, this.a.h.o});
        }
        this.a.e(gykr0);
    }

    public static void d(Context context0, gygl gygl0) {
        gyhc gyhc0 = gygl0.e == null ? gyhc.a : gygl0.e;
        gyhk gyhk0 = gygl0.d == null ? gyhk.a : gygl0.d;
        if(gyhc0 != null && (gyhc0.b & 1) != 0) {
            gyhd gyhd0 = gyhc0.c == null ? gyhd.a : gyhc0.c;
            if((gyhd0.b & 1) != 0 && gyhd0.c.length() > 0 && gyhk0 != null && (gyhk0.b & 1) != 0 && ((gyhd0.b & 2) == 0 || (gyhd0.d == 0 || gyhd0.d == gyhk0.c.size()))) {
                gyey gyey0 = (gyey)cusq.e(context0, gyey.class);
                if(gyey0 != null && gyey0.o()) {
                    return;
                }
                throw new gylc(gyey.class, gyds.class);
            }
        }
        throw new gyla("Data to advertise on bluetooth name is not correctly set");
    }
}

