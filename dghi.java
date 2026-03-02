import java.util.concurrent.CancellationException;

final class dghi extends ibsl implements ibtw {
    int a;
    final dghl b;
    final dghj c;
    final ichm d;

    public dghi(dghl dghl0, dghj dghj0, ichm ichm0, ibrl ibrl0) {
        this.b = dghl0;
        this.c = dghj0;
        this.d = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dghi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dghi(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = this.b.b.c(this.b.c, this.c);
                try {
                    this.a = 1;
                    object0 = ictn.b(evql0, this);
                    if(object0 == object1) {
                        return object1;
                    label_10:
                        ibnx.b(object0);
                    }
                }
                catch(Throwable throwable0) {
                    object0 = ibnx.a(throwable0);
                }
                break;
            }
            case 1: {
                goto label_10;
            }
            default: {
                ibnx.b(object0);
                goto label_26;
            }
        }
        Throwable throwable1 = ibnw.a(object0);
        if((throwable1 instanceof CancellationException)) {
            throw throwable1;
        }
        ichm ichm0 = this.d;
        Throwable throwable2 = ibnw.a(object0);
        if(throwable2 != null) {
            dcvz.a.e().f(throwable2).p("Failed to accept connection.", new Object[0]);
            dghg.a(ichm0, new dggr(throwable2));
            return ibom.a;
        }
        long v = hvqs.o();
        this.a = 2;
        if(iccv.c(v, this) == object1) {
            return object1;
        }
    label_26:
        dcvz.a.e().p("Times out while waiting for connection resolution.", new Object[0]);
        this.b.b.r(this.b.c);
        dggr dggr0 = new dggr(15);
        dghg.a(this.d, dggr0);
        return ibom.a;
    }
}

