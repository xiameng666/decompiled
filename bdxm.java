import java.util.List;

public final class bdxm implements icih {
    final icih a;

    public bdxm(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        List list0;
        bdxl bdxl0;
        if((ibrl0 instanceof bdxl)) {
            bdxl0 = (bdxl)ibrl0;
            int v = bdxl0.b;
            if((v & 0x80000000) == 0) {
                bdxl0 = new bdxl(this, ibrl0);
            }
            else {
                bdxl0.b = v - 0x80000000;
            }
        }
        else {
            bdxl0 = new bdxl(this, ibrl0);
        }
        Object object1 = bdxl0.a;
        Object object2 = ibrx.a;
        switch(bdxl0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if(((bedv)object0).c()) {
                    gged_interceptors gged0 = (gged_interceptors)((bedv)object0).b;
                    if(gged0 == null) {
                        list0 = ibps.a;
                    }
                    else {
                        list0 = ibpo.ar(gged0);
                        if(list0 == null) {
                            list0 = ibps.a;
                        }
                    }
                }
                else {
                    list0 = ibps.a;
                }
                bdxl0.b = 1;
                return icih0.a(list0, bdxl0) == object2 ? object2 : ibom.a;
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

