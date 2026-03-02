import android.content.Intent;
import com.google.android.gms.trustagent.activeunlock.primary.data.proximity.ProximityIntentOperation;

final class eybj extends ibsl implements ibtw {
    int a;
    final ProximityIntentOperation b;
    final Intent c;

    public eybj(ProximityIntentOperation proximityIntentOperation0, Intent intent0, ibrl ibrl0) {
        this.b = proximityIntentOperation0;
        this.c = intent0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eybj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eybj(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.d(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

