import java.util.List;

public final class buuv implements icih {
    final icih a;
    final buvc b;

    public buuv(icih icih0, buvc buvc0) {
        this.a = icih0;
        this.b = buvc0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        buuu buuu0;
        if((ibrl0 instanceof buuu)) {
            buuu0 = (buuu)ibrl0;
            int v = buuu0.b;
            if((v & 0x80000000) == 0) {
                buuu0 = new buuu(this, ibrl0);
            }
            else {
                buuu0.b = v - 0x80000000;
            }
        }
        else {
            buuu0 = new buuu(this, ibrl0);
        }
        Object object1 = buuu0.a;
        Object object2 = ibrx.a;
        switch(buuu0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                String s = (String)object0;
                Object object3 = this.b.a.a();
                if(s == null || s.length() == 0 || !((List)object3).contains(s)) {
                    s = (String)ibpo.T(((List)object3));
                }
                buuu0.b = 1;
                return icih0.a(s, buuu0) == object2 ? object2 : ibom.a;
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

