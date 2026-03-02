import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;
import java.util.ArrayList;

final class crll implements Runnable {
    final AppMetadata a;
    final crih b;

    public crll(crih crih0, AppMetadata appMetadata0) {
        this.a = appMetadata0;
        Objects.requireNonNull(crih0);
        this.b = crih0;
        super();
    }

    @Override
    public final void run() {
        crqq crqq0 = this.b.a;
        crqq0.F();
        if(crqq0.q != null) {
            crqq0.r = new ArrayList();
            crqq0.r.addAll(crqq0.q);
        }
        AppMetadata appMetadata0 = this.a;
        crdg crdg0 = crqq0.o();
        String s = appMetadata0.a;
        batl.s(s);
        batl.q(s);
        crdg0.n();
        crdg0.aA();
        try {
            SQLiteDatabase sQLiteDatabase0 = crdg0.g();
            String[] arr_s = {s};
            int v = sQLiteDatabase0.delete("apps", "app_id=?", arr_s) + sQLiteDatabase0.delete("events", "app_id=?", arr_s) + sQLiteDatabase0.delete("events_snapshot", "app_id=?", arr_s) + sQLiteDatabase0.delete("user_attributes", "app_id=?", arr_s) + sQLiteDatabase0.delete("conditional_properties", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events", "app_id=?", arr_s) + sQLiteDatabase0.delete("raw_events_metadata", "app_id=?", arr_s) + sQLiteDatabase0.delete("queue", "app_id=?", arr_s) + sQLiteDatabase0.delete("audience_filter_values", "app_id=?", arr_s) + sQLiteDatabase0.delete("main_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("default_event_params", "app_id=?", arr_s) + sQLiteDatabase0.delete("trigger_uris", "app_id=?", arr_s) + sQLiteDatabase0.delete("upload_queue", "app_id=?", arr_s);
            if(v > 0) {
                crdg0.aJ().k.c("Reset analytics data. app, records", s, Integer.valueOf(v));
            }
        }
        catch(SQLiteException sQLiteException0) {
            crdg0.aJ().c.c("Error resetting analytics data. appId, error", crji.a(s), sQLiteException0);
        }
        if(appMetadata0.h) {
            crqq0.U(appMetadata0);
        }
    }
}

