import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j..util.Objects;

final class ffhz extends ffee {
    final ConnectionConfiguration c;
    final String d;
    final fdiy e;
    final fflv f;

    public ffhz(fflv fflv0, ConnectionConfiguration connectionConfiguration0, String s, fdiy fdiy0) {
        this.c = connectionConfiguration0;
        this.d = s;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("putConfig");
    }

    @Override  // ffee
    public final void a() {
        try {
            felm felm0 = this.f.k;
            String s = this.d;
            fczq fczq0 = new fczp(fczr.a(this.c, s)).a();
            if(fczq0.b == null) {
                fczq0.f(felm.b(fczq0));
            }
            fczq0.k = s;
            if(fczq0.b != null) {
                if(hzys.c()) {
                    if(fczq0.p != null && !felo.k(fczq0.p)) {
                        throw new IllegalArgumentException("putConnection: Connection Restrictions are invalid.");
                    }
                }
                else if(fczq0.p != null) {
                    Log.w("Wear_ConnectionMgr", "Connection restrictions not enabled. Dropping restrictions. Original Config: " + fczq0.toString());
                    fczp fczp0 = new fczp(fczq0);
                    fczp0.g = null;
                    fczq0 = fczp0.a();
                }
                if(Log.isLoggable("Wear_ConnectionMgr", 3)) {
                    Log.d("Wear_ConnectionMgr", "putConnection(), " + fczq0.toString());
                }
                ffds ffds0 = felm0.c;
                fczq fczq1 = ffds0.d(fczq0.c);
                String s1 = fczq0.c == null ? "[None]" : fczq0.c;
                if(fczq1 == null && fczq0.c == null) {
                    fczq fczq2 = ffds0.c(fczq0.b);
                    if(fczq2 != null && Objects.equals(fczq0.b, fczq2.b) && fczq0.d == fczq2.d && fczq0.e == fczq2.e) {
                        if(Log.isLoggable("Wear_ConnectionMgr", 4)) {
                            Log.i("Wear_ConnectionMgr", a.c(fczq2, fczq0, "Found a config that matches ", " except for transient fields "));
                        }
                        fczq0.d(fczq2.c);
                        fczq1 = fczq2;
                    }
                }
                if(fczq1 == null) {
                    felm0.c(s, "putConnection()", "No old config exists for address: " + s1);
                    ffds0.i(fczq0);
                    synchronized(felm0.i) {
                        felm0.f(fczq0);
                    }
                }
                else if(felm0.o(s, "putConnection()", fczq1, true)) {
                    boolean z = fczq1.o;
                    if(z != fczq0.o) {
                        Log.w("Wear_ConnectionMgr", "modifying dataItemSyncEnabled is not allowed through putConnection. keeping existing value dataItemSyncEnabled=" + z);
                        fczp fczp1 = new fczp(fczq0);
                        fczp1.e(z);
                        fczq0 = fczp1.a();
                    }
                    if(fczq1.s != fczq0.s && hzzr.c() && !felm0.y) {
                        felm0.z.a(fczq0);
                    }
                    if(fczq0.equals(fczq1)) {
                        felm0.c(s, "putConnection()", "resulted in no connection change, skipping update");
                        if(Log.isLoggable("Wear_ConnectionMgr", 3)) {
                            Log.d("Wear_ConnectionMgr", "putConnection(), resulted in no connection change, skipping update");
                        }
                    }
                    else {
                        felm0.c(s, "putConnection()", "Config is the same as old config. Address " + s1);
                        if(Log.isLoggable("Wear_ConnectionMgr", 3)) {
                            Log.d("Wear_ConnectionMgr", "putConnection()found config with same address " + fczq0.c + ", removing old config");
                        }
                        felm0.c.a(fczq1.b);
                        felm0.c.i(fczq0);
                        synchronized(felm0.i) {
                            felm0.f(fczq0);
                        }
                    }
                }
                Status status0 = fdlg.a(0);
                this.e.a(status0);
                return;
            }
            Log.e("Wear_ConnectionMgr", "putConnection(), " + fczq0.toString() + ", name is null");
            throw new IllegalArgumentException("putConnection: Config name must not be null");
        }
        catch(Exception exception0) {
            Log.e("WearableService", "putConfig: exception during processing: " + this.c.toString(), exception0);
            Status status1 = fdlg.a(8);
            this.e.a(status1);
        }
    }
}

