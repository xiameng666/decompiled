import android.content.Context;

final class cbtb extends ibsl implements ibtw {
    Object a;
    int b;
    final cbte c;
    final Context d;

    public cbtb(cbte cbte0, Context context0, ibrl ibrl0) {
        this.c = cbte0;
        this.d = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbtb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbtb(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                cbte cbte0 = this.c;
                Context context0 = this.d;
                iccs iccs0 = cbte0.f;
                if(iccs0 == null) {
                    synchronized(cbte0) {
                        iccs0 = cbte0.f;
                        if(iccs0 == null) {
                            iccs iccs1 = icbb.a(lsc.a(cbte0), null, null, new cbtc(cbte0, context0, null), 3);
                            cbte0.f = iccs1;
                            iccs0 = iccs1;
                        }
                    }
                }
                object2 = cbte0.c;
                this.a = object2;
                this.b = 1;
                object0 = iccs0.n(this);
                if(object0 != object1) {
                    goto label_28;
                }
                break;
            }
            case 1: {
                object2 = this.a;
                ibnx.b(object0);
            label_28:
                this.a = null;
                this.b = 2;
                if(((icmn)object2).a(object0, this) != object1) {
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

