import android.net.nsd.NsdManager;

public final class bwit extends ibsl implements ibtw {
    int a;
    final bwiu b;
    private Object c;

    public bwit(bwiu bwiu0, ibrl ibrl0) {
        this.b = bwiu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bwit)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bwit(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            bwiu bwiu0 = this.b;
            bwir bwir0 = new bwir(bwiu0, ichm0);
            NsdManager nsdManager0 = bwiu0.b;
            if(nsdManager0 == null) {
                ((ggtj)bwiu.a.j()).x("Unable to initialize NsdManager: cannot create discovery flow");
                ichm0.b(null);
                ichp.a(ichm0);
            }
            if(nsdManager0 != null) {
                nsdManager0.discoverServices("_ghp._tcp", 1, bwir0);
            }
            bwis bwis0 = new bwis(bwiu0, bwir0);
            this.a = 1;
            if(ichl.b(ichm0, bwis0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

