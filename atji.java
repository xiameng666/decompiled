import android.os.RemoteException;
import com.google.android.gms.backup.transport.mms.MmsBackupChimeraService;
import j..util.Objects;

final class atji {
    final arsq a;

    public atji(atjk atjk0, arsq arsq0) {
        this.a = arsq0;
        Objects.requireNonNull(atjk0);
        super();
    }

    public final void a(int v, int v1) {
        try {
            if(hqje.K()) {
                this.a.c((v == 0 ? 0.0f : ((float)v1) / ((float)v)), v);
                return;
            }
            this.a.c(((float)v1) / ((float)v), v);
        }
        catch(RemoteException remoteException0) {
            MmsBackupChimeraService.a.n("Error communicating backup progress state", remoteException0, new Object[0]);
        }
    }
}

