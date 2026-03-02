import com.google.android.gms.trustagent.activeunlock.primary.ui.discovereddevice.DiscoveredDeviceListFragment;

final class eyok extends ibsl implements ibtw {
    int a;
    final DiscoveredDeviceListFragment b;

    public eyok(DiscoveredDeviceListFragment discoveredDeviceListFragment0, ibrl ibrl0) {
        this.b = discoveredDeviceListFragment0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyok)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyok(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eypi eypi0 = this.b.E();
            this.a = 1;
            Object object2 = eypi0.m(eypi0.b(), this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

