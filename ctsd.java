import android.os.IBinder;

final class ctsd implements icih {
    final ctsg a;
    final IBinder b;
    final ctoq c;
    final icck d;

    public ctsd(ctsg ctsg0, IBinder iBinder0, ctoq ctoq0, icck icck0) {
        this.a = ctsg0;
        this.b = iBinder0;
        this.c = ctoq0;
        this.d = icck0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        return this.b(((ctow)object0), ibrl0);
    }

    public final Object b(ctow ctow0, ibrl ibrl0) {
        ctsc ctsc0;
        if((ibrl0 instanceof ctsc)) {
            ctsc0 = (ctsc)ibrl0;
            int v = ctsc0.c;
            if((v & 0x80000000) == 0) {
                ctsc0 = new ctsc(this, ibrl0);
            }
            else {
                ctsc0.c = v - 0x80000000;
            }
        }
        else {
            ctsc0 = new ctsc(this, ibrl0);
        }
        Object object0 = ctsc0.a;
        Object object1 = ibrx.a;
        switch(ctsc0.c) {
            case 0: {
                ibnx.b(object0);
                if(!ibuq.m(ctow0, ctot.a)) {
                    return ibom.a;
                }
                this.c.d();
                ctoz ctoz0 = new ctoz(this.c);
                ctsc0.c = 1;
                if(this.a.c.a(ctoz0, ctsc0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        synchronized(this.a) {
            this.a.e.remove(this.b);
            this.a.f.remove(this.b);
            iceb.a(icei.c(this.d.c()));
            this.a.g.remove(this.b);
        }
        return ibom.a;
    }
}

