import j..time.Duration;

public final class bwhy extends ibsl implements ibtw {
    int a;
    final icig b;

    public bwhy(icig icig0, ibrl ibrl0) {
        this.b = icig0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bwhy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bwhy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                long v = Duration.ofSeconds(htyb.b()).toMillis();
                bwhx bwhx0 = new bwhx(this.b, null);
                this.a = 1;
                object0 = icfo.a(v, bwhx0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_11:
                ibom ibom0 = (ibom)object0;
            }
            catch(icfl unused_ex) {
                ((ggtj)bwhz.a.h()).x("Hub search duration has expired");
            }
            return ibom.a;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(icfl unused_ex) {
                ((ggtj)bwhz.a.h()).x("Hub search duration has expired");
                return ibom.a;
            }
        }
        goto label_11;
    }
}

