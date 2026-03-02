import java.util.List;

public final class bges implements icih {
    final icih a;

    public bges(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bger bger0;
        if((ibrl0 instanceof bger)) {
            bger0 = (bger)ibrl0;
            int v = bger0.b;
            if((v & 0x80000000) == 0) {
                bger0 = new bger(this, ibrl0);
            }
            else {
                bger0.b = v - 0x80000000;
            }
        }
        else {
            bger0 = new bger(this, ibrl0);
        }
        Object object1 = bger0.a;
        Object object2 = ibrx.a;
        switch(bger0.b) {
            case 0: {
                ibnx.b(object1);
                List list0 = ((List)object0) == null ? null : ibpo.ao(((List)object0), new bgdy());
                bger0.b = 1;
                return this.a.a(list0, bger0) == object2 ? object2 : ibom.a;
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

