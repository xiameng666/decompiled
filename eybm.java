import android.content.Intent;
import com.google.android.gms.trustagent.activeunlock.primary.data.proximity.ProximityIntentOperation;

public final class eybm extends ibsl implements ibtw {
    int a;
    final ProximityIntentOperation b;
    final Intent c;

    public eybm(ProximityIntentOperation proximityIntentOperation0, Intent intent0, ibrl ibrl0) {
        this.b = proximityIntentOperation0;
        this.c = intent0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eybm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eybm(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
            }
            catch(icfl icfl0) {
                a.ae(this.b.a().j(), "Ranging method enablement failed with timeout.", icfl0);
            }
            return ibom.a;
        }
        ibnx.b(object0);
        try {
            eybl eybl0 = new eybl(this.b, this.c, null);
            this.a = 1;
            if(glya.b(ProximityIntentOperation.b, eybl0, this) == object1) {
                return object1;
            }
        }
        catch(icfl icfl0) {
            a.ae(this.b.a().j(), "Ranging method enablement failed with timeout.", icfl0);
        }
        return ibom.a;
    }
}

