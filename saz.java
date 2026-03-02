import android.os.PersistableBundle;

public final class saz implements icih {
    final icih a;

    public saz(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        say say0;
        if((ibrl0 instanceof say)) {
            say0 = (say)ibrl0;
            int v = say0.b;
            if((v & 0x80000000) == 0) {
                say0 = new say(this, ibrl0);
            }
            else {
                say0.b = v - 0x80000000;
            }
        }
        else {
            say0 = new say(this, ibrl0);
        }
        Object object1 = say0.a;
        Object object2 = ibrx.a;
        switch(say0.b) {
            case 0: {
                ibnx.b(object1);
                rnv rnv0 = rnu.d(((PersistableBundle)object0));
                say0.b = 1;
                return this.a.a(rnv0, say0) == object2 ? object2 : ibom.a;
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

