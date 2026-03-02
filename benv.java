import java.util.List;

public final class benv implements icih {
    final icih a;

    public benv(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        benu benu0;
        if((ibrl0 instanceof benu)) {
            benu0 = (benu)ibrl0;
            int v = benu0.b;
            if((v & 0x80000000) == 0) {
                benu0 = new benu(this, ibrl0);
            }
            else {
                benu0.b = v - 0x80000000;
            }
        }
        else {
            benu0 = new benu(this, ibrl0);
        }
        Object object1 = benu0.a;
        Object object2 = ibrx.a;
        switch(benu0.b) {
            case 0: {
                ibnx.b(object1);
                benu0.b = 1;
                return this.a.a(Boolean.valueOf(((boolean)(((List)object0).isEmpty() ^ 1))), benu0) == object2 ? object2 : ibom.a;
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

