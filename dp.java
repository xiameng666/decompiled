import java.util.concurrent.atomic.AtomicReference;

final class dp extends ds {
    final akp a;
    final AtomicReference b;
    final adc c;
    final acn d;
    final du e;

    public dp(du du0, akp akp0, AtomicReference atomicReference0, adc adc0, acn acn0) {
        this.e = du0;
        this.a = akp0;
        this.b = atomicReference0;
        this.c = adc0;
        this.d = acn0;
        super();
    }

    @Override  // ds
    public final void a() {
        acw acw0 = (acw)this.a.a(null);
        this.b.set(acw0.c("fragment_" + this.e.k + "_rq#" + this.e.ae.getAndIncrement(), this.e, this.c, this.d));
    }
}

