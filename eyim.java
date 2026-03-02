import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockTrustAgentChimeraService;

final class eyim extends ibsl implements ibtw {
    int a;
    final ActiveUnlockTrustAgentChimeraService b;
    final exjx c;
    final ConnectionInfo d;
    final icbr e;

    public eyim(ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0, icbr icbr0, exjx exjx0, ConnectionInfo connectionInfo0, ibrl ibrl0) {
        this.b = activeUnlockTrustAgentChimeraService0;
        this.e = icbr0;
        this.c = exjx0;
        this.d = connectionInfo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyim)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyim(this.b, this.e, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eyis eyis0 = this.b.e();
            Boolean boolean0 = Boolean.valueOf(this.b.h());
            this.a = 1;
            if(eyis0.a(this.e, this.c, this.d, boolean0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

