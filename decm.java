import com.google.android.gms.nearby.sharing.ShareTarget;

final class decm extends ibsl implements ibtw {
    int a;
    final decn b;
    final dcmf c;
    private Object d;

    public decm(decn decn0, dcmf dcmf0, ibrl ibrl0) {
        this.b = decn0;
        this.c = dcmf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((decm)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new decm(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ShareTarget shareTarget1;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.d;
                dffg dffg0 = this.b.a;
                dffz dffz0 = dffg0.h;
                if((dffz0 instanceof dffs)) {
                    ShareTarget shareTarget0 = dffg0.k;
                    dems dems0 = new dems(dffg.a(dffg0, new dfft(((dffs)dffz0).a), false, 0x77F));
                    this.d = shareTarget0;
                    this.a = 1;
                    if(icih0.a(dems0, this) == object1) {
                        return object1;
                    }
                    shareTarget1 = shareTarget0;
                    goto label_18;
                }
                break;
            }
            case 1: {
                shareTarget1 = (ShareTarget)this.d;
                ibnx.b(object0);
            label_18:
                evql evql0 = this.c.b(shareTarget1);
                this.d = null;
                this.a = 2;
                if(dcwp.a(evql0, this) == object1) {
                    return object1;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

