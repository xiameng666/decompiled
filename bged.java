import java.util.Collection;

public final class bged implements icih {
    final icih a;

    public bged(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bgec bgec0;
        if((ibrl0 instanceof bgec)) {
            bgec0 = (bgec)ibrl0;
            int v = bgec0.b;
            if((v & 0x80000000) == 0) {
                bgec0 = new bgec(this, ibrl0);
            }
            else {
                bgec0.b = v - 0x80000000;
            }
        }
        else {
            bgec0 = new bgec(this, ibrl0);
        }
        Object object1 = bgec0.a;
        Object object2 = ibrx.a;
        switch(bgec0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                boolean z = false;
                if(((bedv)object0).c()) {
                    Collection collection0 = (Collection)((bedv)object0).b;
                    if(collection0 != null && !collection0.isEmpty()) {
                        z = true;
                    }
                }
                bgec0.b = 1;
                return icih0.a(Boolean.valueOf(z), bgec0) == object2 ? object2 : ibom.a;
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

