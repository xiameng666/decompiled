import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import j..util.Objects;

public final class crqj implements Runnable {
    final String a;
    final long b;
    final crqq c;

    public crqj(crqq crqq0, String s, long v) {
        this.a = s;
        this.b = v;
        Objects.requireNonNull(crqq0);
        this.c = crqq0;
        super();
    }

    @Override
    public final void run() {
        long v1;
        crqq crqq0 = this.c;
        crqq0.E();
        crqq0.G();
        crqq0.F();
        crdg crdg0 = crqq0.o();
        String s = this.a;
        crca crca0 = crdg0.i(s);
        if(crca0 != null && !TextUtils.isEmpty(crca0.w())) {
            crdg crdg1 = crqq0.o();
            batl.q(s);
            crdg1.as();
            crdg1.n();
            crdg1.aA();
            SQLiteDatabase sQLiteDatabase0 = crdg1.g();
            sQLiteDatabase0.beginTransaction();
            try {
                batl.q(s);
                crdg1.as();
                crdg1.n();
                crdg1.aA();
                try {
                    v1 = crdg1.f("select previous_install_count from app2 where app_id=? limit 1;", new String[]{s}, -1L);
                }
                catch(SQLiteException sQLiteException1) {
                    crdg1.aJ().c.c("Error reading previous install count. appId, error", crji.a(s), sQLiteException1);
                    v1 = -1L;
                }
                if(v1 == -1L) {
                    crdg1.as();
                    batl.q(s);
                    crdg1.n();
                    crdg1.aA();
                    crdg1.d(s, "previous_install_count");
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
            catch(SQLiteException sQLiteException0) {
                crdg1.aJ().c.c("Error trying to ensure previous install count. appId", crji.a(s), sQLiteException0);
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            Bundle bundle0 = new Bundle();
            bundle0.putLong("_r", 1L);
            crqq0.O(new EventParcel("_ui", new EventParams(bundle0), "auto", this.b, 0L), s);
        }
        else {
            crqq0.aJ().j.b("No app data available; not logging uninstall event", s);
        }
        crqq0.n();
        long v2 = crcu.C();
        for(int v3 = 0; ((long)v3) < v2 && crqq0.an(s); ++v3) {
        }
        crqq0.aJ().k.b("Upload on package removal", s);
        crqq0.av();
        crqq0.aj(s, System.currentTimeMillis());
        crqq0.o().D(s);
        crqq0.aJ().j.b("Invalidating remote config cache", s);
        crqq0.v().g(s);
    }
}

