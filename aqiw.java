import android.app.backup.RestoreObserver;
import android.app.backup.RestoreSet;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.Arrays;

final class aqiw extends RestoreObserver {
    final aqix a;

    public aqiw(aqix aqix0) {
        Objects.requireNonNull(aqix0);
        this.a = aqix0;
        super();
    }

    @Override  // android.app.backup.RestoreObserver
    public final void onUpdate(int v, String s) {
        aqix.a.j("Restore update. Current package = %s", new Object[]{s});
    }

    @Override  // android.app.backup.RestoreObserver
    public final void restoreFinished(int v) {
        aqix.a.j("Restore finished, status: %d", new Object[]{v});
        if(hqjw.c()) {
            try {
                Status status0 = v == 0 ? Status.b : new Status(29030);
                this.a.b.a(status0);
            }
            catch(RemoteException remoteException0) {
                aqix.a.g("Unable to call back the client.", remoteException0, new Object[0]);
            }
        }
        this.a.f.q(Boolean.valueOf(true));
        this.a.d.endRestoreSession();
    }

    public final void restoreSetsAvailable(RestoreSet[] arr_restoreSet) {
        aqql aqql0 = aqix.a;
        aqql0.j("Received restore sets: %s sets", new Object[]{((int)(arr_restoreSet == null ? 0 : arr_restoreSet.length))});
        if(arr_restoreSet == null) {
            aqql0.j("Returned restore sets array is null", new Object[0]);
            this.a.e.q(ggna.a);
            return;
        }
        this.a.e.q(Arrays.asList(arr_restoreSet));
    }

    @Override  // android.app.backup.RestoreObserver
    public final void restoreStarting(int v) {
        aqix.a.j("Restore starting for %d packages", new Object[]{v});
    }
}

