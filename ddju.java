import android.content.Intent;

public final class ddju implements icih {
    final icih a;

    public ddju(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ddjt ddjt0;
        if((ibrl0 instanceof ddjt)) {
            ddjt0 = (ddjt)ibrl0;
            int v = ddjt0.b;
            if((v & 0x80000000) == 0) {
                ddjt0 = new ddjt(this, ibrl0);
            }
            else {
                ddjt0.b = v - 0x80000000;
            }
        }
        else {
            ddjt0 = new ddjt(this, ibrl0);
        }
        Object object1 = ddjt0.a;
        Object object2 = ibrx.a;
        switch(ddjt0.b) {
            case 0: {
                ibnx.b(object1);
                Intent intent0 = (Intent)object0;
                ddjt0.b = 1;
                return this.a.a(ibom.a, ddjt0) == object2 ? object2 : ibom.a;
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

