import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class cqph {
    public final List a;
    final cqpi b;

    public cqph(cqpi cqpi0) {
        Objects.requireNonNull(cqpi0);
        this.b = cqpi0;
        super();
        this.a = new ArrayList();
    }

    final void a() {
        this.a.clear();
    }

    final void b(evql evql0, cqpf cqpf0) {
        cqpg cqpg0 = new cqpg(evql0, cqpf0);
        this.a.add(cqpg0);
        evql0.r(this.b.M(), new cqpd(this));
    }
}

