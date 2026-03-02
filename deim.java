import com.google.android.gms.nearby.sharing.ShareTarget;

final class deim extends ibsl implements ibtw {
    int a;
    final dein b;
    final dcmf c;
    private Object d;

    public deim(dein dein0, dcmf dcmf0, ibrl ibrl0) {
        this.b = dein0;
        this.c = dcmf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deim)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new deim(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ShareTarget shareTarget0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.d;
                dems dems0 = new dems(dffg.a(this.b.a, dffn.a, false, 0x77F));
                shareTarget0 = this.b.a.k;
                this.d = shareTarget0;
                this.a = 1;
                if(icih0.a(dems0, this) != object1) {
                    goto label_14;
                }
                break;
            }
            case 1: {
                shareTarget0 = (ShareTarget)this.d;
                ibnx.b(object0);
            label_14:
                evql evql0 = this.c.u(shareTarget0);
                this.d = null;
                this.a = 2;
                if(dcwp.a(evql0, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

