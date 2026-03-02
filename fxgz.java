import android.os.SystemClock;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

final class fxgz extends fxpd {
    private long a;

    static {
        bboh.c("EQMon", bbcu.g, "Slnc");
    }

    public fxgz() {
        super("Slnc");
    }

    @Override  // fxpd
    public final void a() {
        SystemClock.elapsedRealtime();
        if(SystemClock.elapsedRealtime() >= this.a) {
            this.j();
        }
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        long v;
        switch(fxpj0.a) {
            case 20: {
                fxpi fxpi0 = (fxpi)fxpj0.b;
                this.g(fxpi0);
                Objects.requireNonNull(fxpi0);
                if(fxpi0 != null) {
                    if((fxpi0 instanceof fxgx)) {
                        v = ((fxgx)fxpi0).b;
                        goto label_11;
                    }
                    if((fxpi0 instanceof fxha)) {
                        v = ((fxha)fxpi0).a.a;
                    label_11:
                        long v1 = TimeUnit.SECONDS.toMillis(v);
                        this.a = SystemClock.elapsedRealtime() + v1;
                        this.h.f(21, null, v1);
                        return true;
                    }
                }
                throw new IllegalArgumentException("unknown downgrade reason");
            }
            case 21: {
                if(this.k()) {
                    this.j();
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

