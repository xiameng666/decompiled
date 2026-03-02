import android.os.PersistableBundle;

public final class rwn implements icih {
    final icih a;
    final rxl b;

    public rwn(icih icih0, rxl rxl0) {
        this.a = icih0;
        this.b = rxl0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        rwm rwm0;
        if((ibrl0 instanceof rwm)) {
            rwm0 = (rwm)ibrl0;
            int v = rwm0.b;
            if((v & 0x80000000) == 0) {
                rwm0 = new rwm(this, ibrl0);
            }
            else {
                rwm0.b = v - 0x80000000;
            }
        }
        else {
            rwm0 = new rwm(this, ibrl0);
        }
        Object object1 = rwm0.a;
        Object object2 = ibrx.a;
        switch(rwm0.b) {
            case 0: {
                ibnx.b(object1);
                PersistableBundle persistableBundle0 = this.b.s(((PersistableBundle)object0));
                rwm0.b = 1;
                return this.a.a(persistableBundle0, rwm0) == object2 ? object2 : ibom.a;
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

