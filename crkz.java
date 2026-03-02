import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMetadata;

public final class crkz implements Runnable {
    public final Bundle a;
    public final String b;
    public final AppMetadata c;
    public final crih d;

    public crkz(crih crih0, Bundle bundle0, String s, AppMetadata appMetadata0) {
        this.d = crih0;
        this.a = bundle0;
        this.b = s;
        this.c = appMetadata0;
    }

    @Override
    public final void run() {
        crih crih0 = this.d;
        String s = this.b;
        Bundle bundle0 = this.a;
        if(bundle0.isEmpty()) {
            crdg crdg0 = crih0.a.o();
            crdg0.n();
            crdg0.aA();
            try {
                crdg0.g().execSQL("delete from default_event_params where app_id=?", new String[]{s});
            }
            catch(SQLiteException sQLiteException0) {
                crdg0.aJ().c.b("Error clearing default event params", sQLiteException0);
            }
            return;
        }
        crdg crdg1 = crih0.a.o();
        crdg1.n();
        crdg1.aA();
        crdm crdm0 = new crdm(crdg1.y, "", s, "dep", 0L, 0L, bundle0);
        byte[] arr_b = crdg1.aw().l(crdm0).toBytesArray();
        crdg1.aJ().k.c("Saving default event parameters, appId, data size", s, Integer.valueOf(arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("parameters", arr_b);
        try {
            if(crdg1.g().insertWithOnConflict("default_event_params", null, contentValues0, 5) == -1L) {
                crdg1.aJ().c.b("Failed to insert default event parameters (got -1). appId", crji.a(s));
            }
        }
        catch(SQLiteException sQLiteException1) {
            crdg1.aJ().c.c("Error storing default event parameters. appId", crji.a(s), sQLiteException1);
        }
        AppMetadata appMetadata0 = this.c;
        crdg crdg2 = crih0.a.o();
        try {
            if(crdg2.f("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like \'!_%\' escape \'!\' limit 1;", new String[]{s, String.valueOf(appMetadata0.D)}, 0L) <= 0L && crdg2.f("select count(*) from raw_events where app_id=? and timestamp >= ? and name like \'!_%\' escape \'!\' limit 1;", new String[]{s, String.valueOf(appMetadata0.D)}, 0L) > 0L) {
                goto label_33;
            }
        }
        catch(SQLiteException sQLiteException2) {
            crdg2.aJ().c.b("Error checking backfill conditions", sQLiteException2);
        }
        return;
    label_33:
        crih0.a.o().B(s, Long.valueOf(appMetadata0.D), null, bundle0);
    }
}

