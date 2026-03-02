import com.google.android.gms.nearby.sharing.DeviceVisibility;

public final class dfro implements icih {
    final icih a;

    public dfro(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dfrn dfrn0;
        if((ibrl0 instanceof dfrn)) {
            dfrn0 = (dfrn)ibrl0;
            int v = dfrn0.b;
            if((v & 0x80000000) == 0) {
                dfrn0 = new dfrn(this, ibrl0);
            }
            else {
                dfrn0.b = v - 0x80000000;
            }
        }
        else {
            dfrn0 = new dfrn(this, ibrl0);
        }
        Object object1 = dfrn0.a;
        Object object2 = ibrx.a;
        switch(dfrn0.b) {
            case 0: {
                ibnx.b(object1);
                dfrn0.b = 1;
                return this.a.a(new ibns(new Integer(((DeviceVisibility)object0).f), new Integer(((DeviceVisibility)object0).g)), dfrn0) == object2 ? object2 : ibom.a;
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

