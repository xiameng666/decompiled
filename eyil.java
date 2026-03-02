import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockTrustAgentChimeraService;

final class eyil extends ibsl implements ibtw {
    int a;
    final iccs b;
    final ActiveUnlockTrustAgentChimeraService c;

    public eyil(iccs iccs0, ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0, ibrl ibrl0) {
        this.b = iccs0;
        this.c = activeUnlockTrustAgentChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyil)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyil(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.n(this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Boolean)object0).booleanValue()) {
            ((ggtj)this.c.a().h()).x("Relock requested, locking user");
            this.c.n.a.lockUser();
        }
        return ibom.a;
    }
}

