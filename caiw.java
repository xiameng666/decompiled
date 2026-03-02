import android.accounts.Account;

final class caiw implements icih {
    final caiy a;

    public caiw(caiy caiy0) {
        this.a = caiy0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        return this.b(((String)object0), ibrl0);
    }

    public final Object b(String s, ibrl ibrl0) {
        icnl icnl1;
        caiv caiv0;
        if((ibrl0 instanceof caiv)) {
            caiv0 = (caiv)ibrl0;
            int v = caiv0.c;
            if((v & 0x80000000) == 0) {
                caiv0 = new caiv(this, ibrl0);
            }
            else {
                caiv0.c = v - 0x80000000;
            }
        }
        else {
            caiv0 = new caiv(this, ibrl0);
        }
        Object object0 = caiv0.a;
        Object object1 = ibrx.a;
        switch(caiv0.c) {
            case 0: {
                ibnx.b(object0);
                Account account0 = caiy.f(this.a.b, s);
                this.a.g.g(account0);
                icnl icnl0 = this.a.h;
                caiv0.d = icnl0;
                caiv0.c = 1;
                object0 = this.a.a(caiv0);
                if(object0 == object1) {
                    return object1;
                }
                icnl1 = icnl0;
                break;
            }
            case 1: {
                icnl1 = caiv0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icnl1.g(object0);
        return ibom.a;
    }
}

