import java.io.File;

public final class cthd implements icih {
    final icih a;

    public cthd(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cthc cthc0;
        if((ibrl0 instanceof cthc)) {
            cthc0 = (cthc)ibrl0;
            int v = cthc0.b;
            if((v & 0x80000000) == 0) {
                cthc0 = new cthc(this, ibrl0);
            }
            else {
                cthc0.b = v - 0x80000000;
            }
        }
        else {
            cthc0 = new cthc(this, ibrl0);
        }
        Object object1 = cthc0.a;
        Object object2 = ibrx.a;
        switch(cthc0.b) {
            case 0: {
                ibnx.b(object1);
                ctyq ctyq0 = cthi.h(((File)object0));
                cthc0.b = 1;
                return this.a.a(ctyq0, cthc0) == object2 ? object2 : ibom.a;
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

