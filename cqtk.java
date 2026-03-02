import j..util.Objects;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

final class cqtk extends TimerTask {
    final cqtn a;

    public cqtk(cqtn cqtn0) {
        Objects.requireNonNull(cqtn0);
        this.a = cqtn0;
        super();
    }

    @Override
    public final void run() {
        AtomicInteger atomicInteger0 = this.a.o;
        batl.s(atomicInteger0);
        int v = atomicInteger0.getAndSet(0);
        this.a.b(v);
    }
}

