import android.app.KeyguardManager;
import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockRemoteIntentChimeraService;

public final class eyid extends ibsl implements ibtw {
    int a;
    final ActiveUnlockRemoteIntentChimeraService b;

    public eyid(ActiveUnlockRemoteIntentChimeraService activeUnlockRemoteIntentChimeraService0, ibrl ibrl0) {
        this.b = activeUnlockRemoteIntentChimeraService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyid)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyid(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            ((ggtj)this.b.e().h()).B("Locked state change: %s", ((Boolean)object0));
        }
        while(true) {
            ActiveUnlockRemoteIntentChimeraService activeUnlockRemoteIntentChimeraService0 = this.b;
            KeyguardManager keyguardManager0 = activeUnlockRemoteIntentChimeraService0.d;
            if(keyguardManager0 == null) {
                ibuq.j("keyguardManager");
                keyguardManager0 = null;
            }
            if(!keyguardManager0.isDeviceLocked()) {
                break;
            }
            this.a = 1;
            object0 = activeUnlockRemoteIntentChimeraService0.e.i(this);
            if(object0 == object1) {
                return object1;
            }
            ((ggtj)this.b.e().h()).B("Locked state change: %s", ((Boolean)object0));
        }
        return ibom.a;
    }
}

