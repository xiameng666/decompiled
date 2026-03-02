import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;

final class eyvk extends ibsl implements ibtw {
    int a;
    final eyvq b;
    final DiscoveredDevice c;

    public eyvk(eyvq eyvq0, DiscoveredDevice discoveredDevice0, ibrl ibrl0) {
        this.b = eyvq0;
        this.c = discoveredDevice0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyvk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyvk(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.m(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

