import java.util.Map.Entry;

final class dcqv extends ibsl implements ibtw {
    int a;
    final dcrd b;
    private Object c;

    public dcqv(dcrd dcrd0, ibrl ibrl0) {
        this.b = dcrd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcqv)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcqv(this.b, ibrl0);
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
            dcrd dcrd0 = this.b;
            dcrd0.c = ichm0;
            for(Object object2: dcrd0.a.d()) {
                ibuq.c(((Map.Entry)object2));
                dcst dcst0 = (dcst)((Map.Entry)object2).getKey();
                dcrn dcrn0 = (dcrn)((Map.Entry)object2).getValue();
                ibuq.c(dcrn0);
                dcrd.d(ichm0, dcrn0);
            }
            dcqu dcqu0 = new dcqu(dcrd0);
            this.a = 1;
            if(ichl.b(ichm0, dcqu0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

