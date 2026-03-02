import j..util.Objects;

final class ueg implements ubk {
    final uhn a;
    final ueh b;

    public ueg(ueh ueh0, uhn uhn0) {
        this.a = uhn0;
        Objects.requireNonNull(ueh0);
        this.b = ueh0;
        super();
    }

    @Override  // ubk
    public final void c(Object object0) {
        ueh ueh0 = this.b;
        uhn uhn0 = this.a;
        if(ueh0.e(uhn0)) {
            if(object0 != null && ueh0.a.o.c(uhn0.c.fw())) {
                ueh0.c = object0;
                ((ucy)ueh0.b).f(2);
                return;
            }
            uag uag0 = uhn0.c.fw();
            ueh0.b.d(uhn0.a, object0, uhn0.c, uag0, ueh0.d);
        }
    }

    @Override  // ubk
    public final void f(Exception exception0) {
        ueh ueh0 = this.b;
        uhn uhn0 = this.a;
        if(ueh0.e(uhn0)) {
            ucq ucq0 = ueh0.d;
            uag uag0 = uhn0.c.fw();
            ueh0.b.c(ucq0, exception0, uhn0.c, uag0);
        }
    }
}

