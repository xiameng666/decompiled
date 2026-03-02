import android.os.RemoteException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadResult;
import com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService;

public final class atjl implements Runnable {
    public final arua a;
    public final aruc b;

    public atjl(aruc aruc0, arua arua0) {
        this.b = aruc0;
        this.a = arua0;
    }

    @Override
    public final void run() {
        try {
            arua arua0 = this.a;
            MmsRestoreChimeraService mmsRestoreChimeraService0 = this.b.b;
            atjs atjs0 = new atjs(mmsRestoreChimeraService0, mmsRestoreChimeraService0.b, new aqjk(mmsRestoreChimeraService0), mmsRestoreChimeraService0.a(), new aqpe(mmsRestoreChimeraService0), (hqje.D() ? new aqnp(mmsRestoreChimeraService0) : null), ModuleManager.get(mmsRestoreChimeraService0), new aqwp(mmsRestoreChimeraService0, mmsRestoreChimeraService0.getPackageManager()), new aqyv(mmsRestoreChimeraService0), new atjm(mmsRestoreChimeraService0, arua0, this.b.a), arua0);
            try {
                atjs0.c();
            }
            catch(atjr atjr0) {
                arua0.a(new CustomBackupDataDownloadResult(false, "GENERIC"));
                MmsRestoreChimeraService.a.n("Exception while restoring MMSes", atjr0, new Object[0]);
            }
        }
        catch(RemoteException remoteException0) {
            MmsRestoreChimeraService.a.n("Exception while startMmsRestoreBlocking", remoteException0, new Object[0]);
        }
    }
}

