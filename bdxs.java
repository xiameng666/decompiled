import java.util.List;

public final class bdxs implements icih {
    final icih a;

    public bdxs(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bdxr bdxr0;
        if((ibrl0 instanceof bdxr)) {
            bdxr0 = (bdxr)ibrl0;
            int v = bdxr0.b;
            if((v & 0x80000000) == 0) {
                bdxr0 = new bdxr(this, ibrl0);
            }
            else {
                bdxr0.b = v - 0x80000000;
            }
        }
        else {
            bdxr0 = new bdxr(this, ibrl0);
        }
        Object object1 = bdxr0.a;
        Object object2 = ibrx.a;
        switch(bdxr0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                bdwq bdwq0 = ((List)object0).isEmpty() ? bdyj.a : new bdwq(bdxu.b(((List)object0), bdxi.a), bdxu.b(((List)object0), bdxj.a));
                bdxr0.b = 1;
                return icih0.a(bdwq0, bdxr0) == object2 ? object2 : ibom.a;
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

