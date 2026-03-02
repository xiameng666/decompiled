import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gycx implements gyjd {
    public final gyey a;
    public final gyhk b;
    public final AtomicBoolean c;
    public final gygs d;

    public gycx(Context context0, gyhk gyhk0, gygs gygs0) {
        this.a = (gyey)cusq.c(context0, gyey.class);
        this.b = gyhk0;
        this.d = gygs0;
        this.c = new AtomicBoolean(false);
    }

    @Override  // gyjd
    public final MessageLite a() {
        return gygm.a;
    }

    @Override  // gyjd
    public final void b(gyim gyim0, gykr gykr0) {
        gycw gycw0 = new gycw(this, gykr0);
        this.a.g(gycw0);
    }

    @Override  // gyjd
    public final void c(gykr gykr0) {
        if(this.c.compareAndSet(true, false)) {
            this.a.d(null, new gyll[]{this.a.h.n});
        }
        this.a.e(gykr0);
    }

    public static void d(Context context0, gygl gygl0) {
        if(((gygl0.d == null ? gyhk.a : gygl0.d).b & 1) == 0 || (gygl0.d == null ? gyhk.a : gygl0.d).c.isEmpty()) {
            throw new gyla("Advertise data is not set");
        }
        gyey gyey0 = (gyey)cusq.e(context0, gyey.class);
        if(gyey0 == null || !gyey0.m()) {
            throw new gylc(gyey.class, gycx.class);
        }
        if((gygl0.b & 8) != 0 && gygq.b((gygl0.f == null ? gygs.a : gygl0.f).d) == 4) {
            throw new gyla("Requesting to advertise over BLE using the entire scan record is not a supported operation.");
        }
    }
}

