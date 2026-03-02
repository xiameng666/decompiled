import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockTrustAgentChimeraService;

public final class eyik extends ibsl implements ibtw {
    int a;
    final ActiveUnlockTrustAgentChimeraService b;

    public eyik(ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0, ibrl ibrl0) {
        this.b = activeUnlockTrustAgentChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyik)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyik(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eyas eyas0 = this.b.g;
            if(eyas0 == null) {
                ibuq.j("lockscreenRepository");
                eyas0 = null;
            }
            this.a = 1;
            if(eyas0.a(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

