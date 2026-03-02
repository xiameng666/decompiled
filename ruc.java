import android.os.DeadObjectException;

final class ruc extends ibsl implements ibtw {
    int a;
    final rxn b;
    final ryh c;
    private Object d;

    public ruc(rxn rxn0, ryh ryh0, ibrl ibrl0) {
        this.b = rxn0;
        this.c = ryh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ruc)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ruc(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icig icig0;
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.d;
                rtz rtz0 = new rtz(this.c);
                rub rub0 = new rub(this.c, null);
                this.d = icih0;
                this.a = 1;
                object0 = rxn.b(this.b, this.c, rtz0, rub0, this);
                if(object0 != object1) {
                    icig0 = (icig)object0;
                    goto label_17;
                }
                break;
            }
            case 1: {
                icih0 = (icih)this.d;
                ibnx.b(object0);
                icig0 = (icig)object0;
                try {
                label_17:
                    rua rua0 = new rua(this.c, icih0);
                    this.d = null;
                    this.a = 2;
                    if(icig0.oR(rua0, this) != object1) {
                        return ibom.a;
                    }
                    break;
                }
                catch(DeadObjectException deadObjectException0) {
                label_23:
                    sar sar0 = new sar(this.c, deadObjectException0, "Task execution failed because the task service died.");
                    sct.f("DefaultCrossProcessTaskManager", "Task service died while observing task metadata!", sar0);
                    throw sar0;
                }
                return ibom.a;
            }
            default: {
                try {
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(DeadObjectException deadObjectException0) {
                    goto label_23;
                }
            }
        }
        return object1;
    }
}

