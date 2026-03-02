import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class epwr implements eqcr {
    public final Handler a;
    public D2DDevice b;
    public final erkv c;
    private final ScheduledExecutorService d;
    private final long e;
    private final eqcr f;
    private Future g;
    private boolean h;

    public epwr(Handler handler0, long v, eqcr eqcr0, erkv erkv0) {
        bbll bbll0 = new bbll(1, 10);
        super();
        this.h = true;
        this.a = handler0;
        this.d = bbll0;
        this.e = v;
        this.f = eqcr0;
        this.c = erkv0;
    }

    @Override  // eqcr
    public final void a(D2DDevice d2DDevice0) {
        if(d2DDevice0.equals(this.b)) {
            return;
        }
        D2DDevice d2DDevice1 = this.b;
        if(d2DDevice1 == null && this.h) {
            this.b = d2DDevice0;
            epwq epwq0 = new epwq(this);
            this.g = ((bbll)this.d).g(epwq0, this.e, TimeUnit.MILLISECONDS);
            return;
        }
        if(d2DDevice1 != null) {
            this.f.a(d2DDevice1);
            this.b = null;
        }
        Future future0 = this.g;
        if(future0 != null) {
            future0.cancel(true);
            this.g = null;
        }
        this.f.a(d2DDevice0);
        this.h = false;
    }

    @Override  // eqcr
    public final void b(D2DDevice d2DDevice0) {
    }

    @Override  // eqcr
    public final void c(int v) {
        this.b = null;
        Future future0 = this.g;
        if(future0 != null) {
            future0.cancel(true);
            this.g = null;
        }
    }

    @Override  // eqcr
    public final void d() {
    }
}

