import android.os.RemoteException;
import com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class atjm {
    final arua a;
    final AtomicBoolean b;

    public atjm(MmsRestoreChimeraService mmsRestoreChimeraService0, arua arua0, AtomicBoolean atomicBoolean0) {
        this.a = arua0;
        this.b = atomicBoolean0;
        Objects.requireNonNull(mmsRestoreChimeraService0);
        super();
    }

    public final void a(int v, int v1) {
        try {
            this.a.c(((float)v1) / ((float)v), v);
        }
        catch(RemoteException remoteException0) {
            MmsRestoreChimeraService.a.n("Exception while updating MMS download progress", remoteException0, new Object[0]);
        }
    }

    public final boolean b() {
        return this.b.get();
    }
}

