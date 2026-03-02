import j..time.Duration;
import java.util.function.Supplier;

public final class fxdc extends fxpd implements Supplier {
    private final gxnx a;

    public fxdc() {
        gxnx gxnx0 = new gxnx(Duration.ofMillis(huwd.a.n().p()).toNanos());
        super("ADPMSt");
        this.a = gxnx0;
    }

    @Override  // fxpd
    public final void a() {
        this.a.c = true;
        this.j();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        this.a.c = false;
        this.a.a();
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        return false;
    }

    @Override
    public final Object get() {
        return this.a;
    }
}

