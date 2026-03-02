import android.content.Intent;
import android.os.Trace;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;

public final class ercq implements Runnable {
    public final TargetQuickStartChimeraActivity a;

    public ercq(TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0) {
        this.a = targetQuickStartChimeraActivity0;
    }

    @Override
    public final void run() {
        Trace.beginSection("smartdevice-TargetQuickStartActivity-startAdvertising()");
        eqzq eqzq0 = new eqzq();
        TargetQuickStartChimeraActivity targetQuickStartChimeraActivity0 = this.a;
        eqzq0.a = eqxo.a(targetQuickStartChimeraActivity0);
        eqzq0.b = targetQuickStartChimeraActivity0.getIntent().getStringExtra("BACKUP_BT_RFCOMM_SERVER_UUID");
        if(targetQuickStartChimeraActivity0.G == 104) {
            String s = targetQuickStartChimeraActivity0.k;
            batl.s(s);
            eqzq0.b(s, targetQuickStartChimeraActivity0.x);
        }
        targetQuickStartChimeraActivity0.K = eqzq0.a();
        Trace.beginSection("smartdevice-TargetQuickStartActivity-startService()");
        Intent intent0 = new Intent();
        intent0.setClassName(targetQuickStartChimeraActivity0, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
        targetQuickStartChimeraActivity0.startService(intent0);
        Trace.endSection();
        Trace.beginSection("smartdevice-TargetQuickStartActivity-bindService()");
        targetQuickStartChimeraActivity0.s = new erde(targetQuickStartChimeraActivity0);
        bbic.a().d(targetQuickStartChimeraActivity0, intent0, targetQuickStartChimeraActivity0.s, 1);
        Trace.endSection();
        Trace.endSection();
    }
}

