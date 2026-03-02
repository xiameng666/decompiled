import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockTrustAgentChimeraService;

public final class eyij extends ibsl implements ibtw {
    int a;
    final ActiveUnlockTrustAgentChimeraService b;

    public eyij(ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0, ibrl ibrl0) {
        this.b = activeUnlockTrustAgentChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyij)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyij(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(glya.a(ActiveUnlockTrustAgentChimeraService.a, this) == object1) {
                return object1;
            }
        }
        eyig eyig0 = this.b.o;
        eyaz eyaz0 = this.b.c();
        ibuq.f(eyig0, "listener");
        if(!eyaz0.k.add(eyig0)) {
            ((ggtj)eyaz0.d.j()).x("This listener is already registered.");
            return ibom.a;
        }
        if(eyaz0.g) {
            eyig0.a(((Boolean)eyaz0.h.a(eyaz0, eyaz.a[0])).booleanValue());
        }
        if(!eyaz0.g) {
            ((ggtj)eyaz0.d.h()).x("started!");
            eyaz0.g = true;
            eyaw eyaw0 = new eyaw(eyaz0, null);
            eyaz0.f = icbb.b(eyaz0.e, null, null, eyaw0, 3);
            eyaz0.b.b(eyaz0.j);
        }
        return ibom.a;
    }
}

