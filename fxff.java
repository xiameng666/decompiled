import j..util.Objects;
import j..util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

final class fxff implements fxep {
    final Optional a;
    final AtomicBoolean b;
    final fxfk c;

    public fxff(fxfk fxfk0, Optional optional0, AtomicBoolean atomicBoolean0) {
        this.a = optional0;
        this.b = atomicBoolean0;
        Objects.requireNonNull(fxfk0);
        this.c = fxfk0;
        super();
    }

    @Override  // fxep
    public final void a() {
        if(huwd.x() && this.b.get()) {
            fxni fxni0 = new fxni(new fxnh());
            this.c.q.c.b(fxni0, this.c.q.b);
        }
        fxfd fxfd0 = new fxfd();
        this.a.ifPresent(fxfd0);
    }

    @Override  // fxep
    public final void b() {
        fxfe fxfe0 = new fxfe();
        this.a.ifPresent(fxfe0);
    }
}

