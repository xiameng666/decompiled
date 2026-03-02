import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j..util.Objects;

final class ffja extends ffee {
    final ConnectionConfiguration c;
    final String d;
    final fdiy e;
    final fflv f;

    public ffja(fflv fflv0, ConnectionConfiguration connectionConfiguration0, String s, fdiy fdiy0) {
        this.c = connectionConfiguration0;
        this.d = s;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("cancelMigration");
    }

    @Override  // ffee
    public final void a() {
        int v;
        try {
            felm felm0 = this.f.k;
            fczq fczq0 = fczr.a(this.c, this.d);
            if(felm0.o(this.d, "cancelMigration()", fczq0, true)) {
                if(Log.isLoggable("Wear_ConnectionMgr", 3)) {
                    Log.d("Wear_ConnectionMgr", "cancelMigration: " + fczq0.toString());
                }
                v = felm0.e.a(fczq0, true);
            }
            else {
                v = 10;
            }
            Status status0 = fdlg.a(v);
            this.e.a(status0);
        }
        catch(RemoteException remoteException0) {
            Log.e("WearableService", "cancelMigration: exception returning status to caller", remoteException0);
            Status status1 = fdlg.a(8);
            this.e.a(status1);
        }
    }
}

