import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import jeb.synthetic.TWR;

final class aijw extends bboo {
    public aijw(Context context0) {
        super(context0, "auth.proximity.permit_store", 6);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        aijx.a.h("Creating database %s...", new Object[]{"auth.proximity.permit_store"});
        ajcq.e(sQLiteDatabase0, "permit", aika.a, aika.b);
        ajcq.e(sQLiteDatabase0, "permit__requester_access", aikb.a, aikb.b);
        String[][] arr2_s = aika.c;
        for(int v = 0; v < 2; ++v) {
            ajcq.d(sQLiteDatabase0, "permit", arr2_s[v]);
        }
        ajcq.d(sQLiteDatabase0, "permit__requester_access", aikb.c[0]);
    }

    @Override  // bboo
    protected final void b(SQLiteDatabase sQLiteDatabase0) {
        aijx.a.h("Opening database %s...", new Object[]{"auth.proximity.permit_store"});
    }

    @Override  // bboo
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        aijx.a.m("Downgrading from version %d to version %s...", new Object[]{v, v1});
        Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT name FROM sqlite_master  WHERE type IN (\'table\',\'view\') AND name NOT LIKE \'sqlite_%\'  UNION ALL  SELECT name FROM sqlite_temp_master  WHERE type IN (\'table\',\'view\')  ORDER BY 1 ", null);
        if(cursor0 != null) {
            while(true) {
                try {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS " + cursor0.getString(0));
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
            cursor0.close();
        }
        this.onCreate(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        aijx.a.h("Upgrading from version %d to version %s...", new Object[]{v, v1});
        if(v < 2) {
            ajcq.c(sQLiteDatabase0, "permit", "license__name", "STRING", "\'\'");
            ajcq.c(sQLiteDatabase0, "permit", "license__is_unlockable", "INTEGER", "0");
            ajcq.c(sQLiteDatabase0, "permit", "license__is_unlock_key", "INTEGER", "1");
            ajcq.c(sQLiteDatabase0, "permit", "license__is_mobile_hotspot_supported", "INTEGER", "0");
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "name", "STRING", "\'\'");
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "is_unlockable", "INTEGER", "0");
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "is_unlock_key", "INTEGER", "0");
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "is_mobile_hotspot_supported", "INTEGER", "0");
            ++v;
        }
        if(v < 3) {
            ajcq.c(sQLiteDatabase0, "permit", "license__bt_mac_address", "STRING", null);
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "bt_mac_address", "STRING", null);
            ++v;
        }
        if(v < 4) {
            ajcq.c(sQLiteDatabase0, "permit", "license__device_type", "STRING", null);
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "device_type", "STRING", null);
            ajcq.c(sQLiteDatabase0, "permit", "license__beacon_seeds", "BLOB", null);
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "beacon_seeds", "BLOB", null);
            ++v;
        }
        if(v < 5) {
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "last_update_time", "INTEGER", "0");
            ++v;
        }
        if(v < 6) {
            ajcq.c(sQLiteDatabase0, "permit", "license__is_pixel_phone", "INTEGER", "0");
            ajcq.c(sQLiteDatabase0, "permit", "license__is_arc_plus_plus", "INTEGER", "0");
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "is_pixel_phone", "INTEGER", "0");
            ajcq.c(sQLiteDatabase0, "permit__requester_access", "is_arc_plus_plus", "INTEGER", "0");
        }
    }
}

