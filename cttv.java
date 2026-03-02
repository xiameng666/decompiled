import com.google.android.gms.nearby.presence.PresenceDevice;

final class cttv implements icih {
    final cttz a;
    final PresenceDevice b;
    final ctoq c;
    final icck d;

    public cttv(cttz cttz0, PresenceDevice presenceDevice0, ctoq ctoq0, icck icck0) {
        this.a = cttz0;
        this.b = presenceDevice0;
        this.c = ctoq0;
        this.d = icck0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        return this.b(((ctow)object0), ibrl0);
    }

    public final Object b(ctow ctow0, ibrl ibrl0) {
        cttu cttu0;
        if((ibrl0 instanceof cttu)) {
            cttu0 = (cttu)ibrl0;
            int v = cttu0.c;
            if((v & 0x80000000) == 0) {
                cttu0 = new cttu(this, ibrl0);
            }
            else {
                cttu0.c = v - 0x80000000;
            }
        }
        else {
            cttu0 = new cttu(this, ibrl0);
        }
        Object object0 = cttu0.a;
        Object object1 = ibrx.a;
        switch(cttu0.c) {
            case 0: {
                ibnx.b(object0);
                if(!ibuq.m(ctow0, ctot.a)) {
                    return ibom.a;
                }
                this.c.d();
                this.a.d.remove(this.b);
                this.a.e.remove(this.b);
                ctoz ctoz0 = new ctoz(this.c);
                cttu0.c = 1;
                if(this.a.g.a(ctoz0, cttu0) == object1) {
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
        iceb.a(icei.c(this.d.c()));
        this.a.f.remove(this.b);
        return ibom.a;
    }
}

