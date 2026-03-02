import android.accounts.Account;

public final class asnc implements icih {
    final icih a;

    public asnc(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        asnb asnb0;
        if((ibrl0 instanceof asnb)) {
            asnb0 = (asnb)ibrl0;
            int v = asnb0.b;
            if((v & 0x80000000) == 0) {
                asnb0 = new asnb(this, ibrl0);
            }
            else {
                asnb0.b = v - 0x80000000;
            }
        }
        else {
            asnb0 = new asnb(this, ibrl0);
        }
        Object object1 = asnb0.a;
        Object object2 = ibrx.a;
        switch(asnb0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                Object object3 = ((aqqh)object0).b();
                Account account0 = null;
                asmk asmk0 = (object3 instanceof asmk) ? ((asmk)object3) : null;
                if(asmk0 != null) {
                    account0 = asmk0.a;
                }
                asnb0.b = 1;
                return icih0.a(account0, asnb0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

