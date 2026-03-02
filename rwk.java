import android.os.PersistableBundle;

public final class rwk implements icih {
    final icih a;

    public rwk(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        rwj rwj0;
        if((ibrl0 instanceof rwj)) {
            rwj0 = (rwj)ibrl0;
            int v = rwj0.b;
            if((v & 0x80000000) == 0) {
                rwj0 = new rwj(this, ibrl0);
            }
            else {
                rwj0.b = v - 0x80000000;
            }
        }
        else {
            rwj0 = new rwj(this, ibrl0);
        }
        Object object1 = rwj0.a;
        Object object2 = ibrx.a;
        switch(rwj0.b) {
            case 0: {
                ibnx.b(object1);
                PersistableBundle persistableBundle0 = ((rnv)object0).a();
                rwj0.b = 1;
                return this.a.a(persistableBundle0, rwj0) == object2 ? object2 : ibom.a;
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

