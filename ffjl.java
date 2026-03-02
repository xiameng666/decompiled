import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j..util.Objects;

final class ffjl extends ffee {
    final ConnectionConfiguration c;
    final String d;
    final fdiy e;
    final fflv f;

    public ffjl(fflv fflv0, ConnectionConfiguration connectionConfiguration0, String s, fdiy fdiy0) {
        this.c = connectionConfiguration0;
        this.d = s;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("updateConfig");
    }

    @Override  // ffee
    public final void a() {
        try {
            felm felm0 = this.f.k;
            String s = this.d;
            fczq fczq0 = fczr.a(this.c, s);
            ffds ffds0 = felm0.c;
            fczq fczq1 = ffds0.d(fczq0.c);
            if(fczq1 != null && felm0.o(s, "updateConnection()", fczq0, true)) {
                if(hzys.c()) {
                    ffaz ffaz0 = fczq0.p;
                    if(!Objects.equals(fczq1.p, ffaz0) && !Objects.equals(fczq1.k, s)) {
                        throw new IllegalArgumentException(String.format("updateConnection: package: %s cannot update restrictions written by original package: %s", s, fczq1.k));
                    }
                    if(ffaz0 != null && !felo.k(ffaz0)) {
                        throw new IllegalArgumentException("updateConnection: Connection Restrictions are invalid.");
                    }
                }
                else if(fczq0.p != null) {
                    Log.w("Wear_ConnectionMgr", "Connection restrictions not enabled. Dropping restrictions. Original Config: " + fczq0.toString());
                    fczp fczp0 = new fczp(fczq0);
                    fczp0.g = null;
                    fczq0 = fczp0.a();
                }
                if(fczq1.o && !fczq0.o) {
                    Log.w("Wear_ConnectionMgr", "disabling dataItemSync is not allowed through updateConnection. keeping existing value dataItemSyncEnabled=" + true);
                    fczp fczp1 = new fczp(fczq0);
                    fczp1.e(true);
                    fczq0 = fczp1.a();
                }
                ffmn.a("ConnectionConfig", "updateConfig(%s)", new Object[]{fczq0});
                ContentValues contentValues0 = ffds0.b(fczq0, false);
                try {
                    if(ffds0.a.getWritableDatabase().updateWithOnConflict("connectionConfigurations", contentValues0, "name=?", new String[]{fczq0.b}, 5) > 0) {
                        goto label_29;
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    Log.e("ConnectionConfig", "updateConfig failed." + sQLiteException0.getMessage());
                }
                goto label_62;
            label_29:
                if(fczq1.s != fczq0.s && hzzr.c() && !felm0.y) {
                    felm0.z.a(fczq0);
                }
                if(hzys.c()) {
                    ffaz ffaz1 = fczq0.p;
                    if(!Objects.equals(ffaz1, fczq1.p)) {
                        if(ffaz1 == null) {
                            felm0.w.i(fczq0.j);
                        }
                        else {
                            felm0.w.g(fczq0.j, ffaz1);
                        }
                    }
                }
                felr felr0 = felm0.x;
                if(felr0 != null) {
                    String s1 = fczq0.j;
                    if(s1 != null) {
                        felr0.d(s1, fczq0.r);
                    }
                }
                if(!fczq1.o && fczq0.o) {
                    fdzv fdzv0 = felm0.e;
                    fczp fczp2 = new fczp(fczq0);
                    fczp2.d = fczq1.j;
                    fczq fczq2 = fczp2.a();
                    if(fczq2.j == null) {
                        Log.w("Wear_Transport", "Unable to handle configuration update with null nodeId");
                    }
                    else {
                        fdww fdww0 = fdzv.o(fczq2);
                        fdzv0.f.lock();
                        try {
                            for(Object object0: fdzv0.h) {
                                ((fdwx)object0).g(fczq2.j, fdww0);
                            }
                        }
                        finally {
                            fdzv0.f.unlock();
                        }
                    }
                }
            }
        label_62:
            Status status0 = new Status(0);
            this.e.a(status0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "updateConfig: exception during processing", exception0);
            Status status1 = new Status(8);
            this.e.a(status1);
        }
    }
}

