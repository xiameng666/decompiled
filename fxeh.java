import android.location.Location;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import jeb.synthetic.FIN;

final class fxeh extends fxpd {
    private final Supplier a;
    private Location b;
    private long c;

    static {
        bboh.c("EQMon", bbcu.g, "LocVldSt");
    }

    public fxeh(Supplier supplier0) {
        super("LocVldSt");
        this.a = supplier0;
    }

    @Override  // fxpd
    public final void a() {
        synchronized(this) {
            this.e();
            this.h.i();
        }
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        synchronized(this) {
            this.e();
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(fxpj0.a) {
            case 2: {
                fxob fxob0 = (fxob)this.a.get();
                if(fxob0 != fxob.a) {
                    Location location0 = fxob0.b.a;
                    if(huwd.a.n().aC() && this.b != null && SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(location0.getElapsedRealtimeNanos()) > huwd.a.n().V()) {
                        this.f(22);
                    }
                    else {
                        Location location1 = this.b;
                        if(location1 == null) {
                            this.b = location0;
                        }
                        else if((location1.distanceTo(location0) >= ((float)huwd.l()))) {
                            this.f(21);
                        }
                    }
                }
            label_16:
                FIN.finallyCodeBegin$NT(v);
                return false;
            }
            case 25: {
                if(this.h.j(this) && this.c != 0L) {
                    long v1 = SystemClock.elapsedRealtime() - this.c;
                    long v2 = huwd.h() - v1;
                    if(v2 > 60000L) {
                        this.h.l(25, v2);
                    }
                    else {
                        this.e();
                        this.j();
                    }
                }
                FIN.finallyExec$NT(v);
                return true;
            }
            default: {
                goto label_16;
            }
        }
    }

    private final void e() {
        this.b = null;
        this.c = 0L;
    }

    private final void f(int v) {
        this.g(new fxph(v));
        this.h.l(25, huwd.h());
        this.c = SystemClock.elapsedRealtime();
    }
}

