import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;

final class eyvj extends ibsl implements ibtw {
    int a;
    final eyvq b;
    final DiscoveredDevice c;

    public eyvj(eyvq eyvq0, DiscoveredDevice discoveredDevice0, ibrl ibrl0) {
        this.b = eyvq0;
        this.c = discoveredDevice0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyvj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyvj(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                exur exur0 = this.b.a();
                this.a = 1;
                if(exur0.d(this.c, exjx.f, this) != object1) {
                    goto label_8;
                }
                break;
            }
            case 1: {
            label_8:
                this.a = 2;
                if(this.b.m(this.c, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                return ibom.a;
            }
        }
        return object1;
    }
}

