import com.google.android.gms.trustagent.activeunlock.primary.data.discovereddevice.scanner.DiscoveredDevice;

final class eyvn extends ibsl implements ibts {
    int a;
    final eyvq b;
    final DiscoveredDevice c;

    public eyvn(eyvq eyvq0, DiscoveredDevice discoveredDevice0, ibrl ibrl0) {
        this.b = eyvq0;
        this.c = discoveredDevice0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new eyvn(this.b, this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        exur exur0 = this.b.a();
        this.a = 1;
        Object object2 = exur0.g(this.c.c, this);
        return object2 == object1 ? object1 : object2;
    }
}

