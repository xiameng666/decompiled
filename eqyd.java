import android.os.RemoteException;
import com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService;
import j..util.Objects;

public final class eqyd implements eqsk {
    final SourceQuickStartChimeraService a;

    public eqyd(SourceQuickStartChimeraService sourceQuickStartChimeraService0) {
        Objects.requireNonNull(sourceQuickStartChimeraService0);
        this.a = sourceQuickStartChimeraService0;
        super();
    }

    @Override  // eqsk
    public final void a() {
        SourceQuickStartChimeraService.a.m("Service running for %d millis, stopping.", new Object[]{((long)this.a.c.e)});
        eqwi eqwi0 = this.a.i;
        if(eqwi0 != null) {
            try {
                eqwi0.b();
            }
            catch(RemoteException remoteException0) {
                SourceQuickStartChimeraService.a.l(remoteException0);
            }
        }
        eqrl.b(this.a);
        this.a.stopSelf();
    }
}

