import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class fkzt implements gfsi {
    public final flae a;
    public final AtomicReference b;

    public fkzt(flae flae0, AtomicReference atomicReference0) {
        this.a = flae0;
        this.b = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        Objects.requireNonNull(this.a.c);
        fkzq fkzq0 = new fkzq(this.a.c);
        flak flak0 = (flak)this.b.get();
        return new flad(fkzq0, this.a.b, this.a.a, flak0);
    }
}

