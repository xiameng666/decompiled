import android.accounts.Account;

final class cbqd extends ibsl implements ibtw {
    int a;
    final cbqh b;
    final Account c;
    private Object d;

    public cbqd(cbqh cbqh0, Account account0, ibrl ibrl0) {
        this.b = cbqh0;
        this.c = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbqd)this.c(((lqf)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cbqd(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        lqf lqf0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                lqf0 = (lqf)this.d;
                ibuq.c(this.c);
                this.d = lqf0;
                this.a = 1;
                cbqf cbqf0 = new cbqf(this.b, this.c, null);
                object0 = icbd.a(cclw.d, cbqf0, this);
                if(object0 != object1) {
                    goto label_15;
                }
                break;
            }
            case 1: {
                lqf0 = (lqf)this.d;
                ibnx.b(object0);
            label_15:
                this.d = null;
                this.a = 2;
                if(lqf0.a(object0, this) != object1) {
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

