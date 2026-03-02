import j..util.Objects;

final class iayu implements Runnable {
    final iayv a;

    public iayu(iayv iayv0) {
        Objects.requireNonNull(iayv0);
        this.a = iayv0;
        super();
    }

    @Override
    public final void run() {
        ibbs ibbs0 = this.a.b.m;
        this.a.b.l = null;
        this.a.b.m = null;
        ibbs0.p(iapk.q.f("InternalSubchannel closed transport due to address change"));
    }
}

