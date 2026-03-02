import android.content.Intent;

public final class dghx implements icih {
    final icih a;

    public dghx(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dghw dghw0;
        if((ibrl0 instanceof dghw)) {
            dghw0 = (dghw)ibrl0;
            int v = dghw0.b;
            if((v & 0x80000000) == 0) {
                dghw0 = new dghw(this, ibrl0);
            }
            else {
                dghw0.b = v - 0x80000000;
            }
        }
        else {
            dghw0 = new dghw(this, ibrl0);
        }
        Object object1 = dghw0.a;
        Object object2 = ibrx.a;
        switch(dghw0.b) {
            case 0: {
                ibnx.b(object1);
                Intent intent0 = (Intent)object0;
                dghw0.b = 1;
                return this.a.a(ibom.a, dghw0) == object2 ? object2 : ibom.a;
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

