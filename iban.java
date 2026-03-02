import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;

final class iban extends iamx {
    iauc a;
    final ibbd b;

    public iban(ibbd ibbd0) {
        Objects.requireNonNull(ibbd0);
        this.b = ibbd0;
        super();
    }

    @Override  // iamx
    public final iakt a() {
        return this.b.I;
    }

    @Override  // iamx
    public final ianc b(iamu iamu0) {
        this.b.n.d();
        gftb.r(((boolean)(this.b.E ^ 1)), "Channel is being terminated");
        return new iatx(this.b, iamu0);
    }

    @Override  // iamx
    public final iaps c() {
        return this.b.n;
    }

    @Override  // iamx
    public final ScheduledExecutorService d() {
        return this.b.k;
    }

    @Override  // iamx
    public final void e() {
        this.b.n.d();
        ibam ibam0 = new ibam(this);
        this.b.n.execute(ibam0);
    }

    @Override  // iamx
    public final void f(iall iall0, iand iand0) {
        ibbd ibbd0 = this.b;
        ibbd0.n.d();
        gftb.z(iall0, "newState");
        if(this == ibbd0.v && !ibbd0.w) {
            ibbd0.t(iand0);
            if(iall0 != iall.e) {
                ibbd0.I.b(2, "Entering {0} state with picker: {1}", new Object[]{iall0, iand0});
                ibbd0.q.a(iall0);
            }
        }
    }
}

