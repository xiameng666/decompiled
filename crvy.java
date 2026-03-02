import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class crvy extends bboo {
    public static final bboh a;
    private final String c;
    private final Context d;

    static {
        crvy.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crvy(Context context0) {
        super(context0, "MdpSimBasedDatabase", crvy.i());
        this.c = "MdpSimBasedDatabase";
        this.d = context0;
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        Level level0 = cslm.h();
        ggtj ggtj0 = crvy.a.g(level0);
        int v = crvy.i();
        ggtj0.P("create MobileDataPlan database: %s, <%d>", this.c, v);
        sQLiteDatabase0.execSQL(String.format("CREATE TABLE %s (%s TEXT PRIMARY KEY, %s INTEGER, %s INTEGER,  %s TEXT, %s INTEGER NOT NULL, %s BLOB, %s BLOB, %s BLOB)", "SimCardTable", "iccid", "carrier_id", "sim_state", "cpid", "expiration_time", "notification_stats", "consent_record", "sim_extra"));
        sQLiteDatabase0.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s BLOB, %s TEXT, %s BLOB, %s BLOB, %s INTEGER NOT NULL, %s BLOB)", "CarrierTable", "carrier_id", "list_cpid_endpoints_resp", "mcc_mnc", "carrier_app_logo", "carrier_logo", "expiration_time", "carrier_extra"));
        sQLiteDatabase0.execSQL(String.format("CREATE TABLE %1$s (%2$s INTEGER, %3$s TEXT, %4$s TEXT, %5$s BLOB, %6$s BLOB, %7$s INTEGER NOT NULL, PRIMARY KEY(%2$s, %3$s))", "SubscriptionTable", "carrier_id", "cpid", "locale", "data_plan", "upsell_offer", "expiration_time"));
        crvy.n(sQLiteDatabase0);
        if(hvli.d()) {
            crvy.o(sQLiteDatabase0);
        }
        if(hvjq.i()) {
            try {
                sQLiteDatabase0.execSQL(String.format("CREATE TABLE IF NOT EXISTS %1$s (%2$s INTEGER, %3$s TEXT, %4$s TEXT, %5$s BLOB, %6$s BLOB, %7$s INTEGER NOT NULL, PRIMARY KEY(%2$s, %3$s))", "IccidSubscriptionTable", "carrier_id", "iccid", "locale", "data_plan", "upsell_offer", "expiration_time"));
            }
            catch(SQLiteException sQLiteException0) {
                a.e(crvy.a.j(), "Failed to create table %s", "IccidSubscriptionTable", sQLiteException0);
            }
        }
        crxn crxn0 = new crxn(this.d);
        int v1 = crvy.i();
        crxn0.J(hhct.cK, 25, "Db", "MDP_Database", v1);
    }

    public final SQLiteDatabase c() {
        return this.j(false);
    }

    public final SQLiteDatabase d() {
        return this.j(true);
    }

    public final crwg e(String s, String[] arr_s) {
        byte[] arr_b1;
        byte[] arr_b;
        String s2;
        Integer integer0;
        Long long0;
        String s1;
        this.g("SimCardTable");
        SQLiteDatabase sQLiteDatabase0 = this.c();
        crwg crwg0 = null;
        if(sQLiteDatabase0 == null) {
            return null;
        }
        try(Cursor cursor0 = sQLiteDatabase0.query("SimCardTable", null, s, arr_s, null, null, null)) {
            if(cursor0.moveToNext()) {
                crwf crwf0 = new crwf();
                int v = cursor0.getColumnIndex("iccid");
                s1 = cursor0.getType(v) == 0 ? null : cursor0.getString(v);
                crwf0.g(s1);
                int v1 = cursor0.getColumnIndex("carrier_id");
                long0 = cursor0.getType(v1) == 0 ? null : cursor0.getLong(v1);
                crwf0.b(long0);
                int v2 = cursor0.getColumnIndex("sim_state");
                integer0 = cursor0.getType(v2) == 0 ? null : cursor0.getInt(v2);
                crwf0.k(integer0);
                int v3 = cursor0.getColumnIndex("cpid");
                s2 = cursor0.getType(v3) == 0 ? null : cursor0.getString(v3);
                crwf0.c(s2);
                int v4 = cursor0.getColumnIndex("expiration_time");
                if(v4 >= -1) {
                    crwf0.f(Long.valueOf(cursor0.getLong(v4)));
                    int v5 = cursor0.getColumnIndex("notification_stats");
                    arr_b = cursor0.getType(v5) == 0 ? null : cursor0.getBlob(v5);
                    crwf0.h(arr_b);
                    int v6 = cursor0.getColumnIndex("consent_record");
                    arr_b1 = cursor0.getType(v6) == 0 ? null : cursor0.getBlob(v6);
                    crwf0.e(arr_b1);
                    int v7 = cursor0.getColumnIndex("sim_extra");
                    if(cursor0.getType(v7) != 0) {
                        crwg0 = cursor0.getBlob(v7);
                    }
                    crwf0.j(((byte[])crwg0));
                    return crwf0.a();
                }
            }
        }
        return null;
    }

    public final boolean f(String s, ContentValues contentValues0, String s1, String[] arr_s) {
        SQLiteDatabase sQLiteDatabase0 = this.d();
        if(sQLiteDatabase0 != null) {
            try {
                if(sQLiteDatabase0.update(s, contentValues0, s1, arr_s) == 0) {
                    goto label_10;
                }
                return true;
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
                a.ae(crvy.a.j(), "Failed to acquire lock for db. Failed to update.", sQLiteDatabaseLockedException0);
                return false;
            }
            catch(SQLiteException sQLiteException0) {
                a.ae(crvy.a.j(), "Failed to update writable database.", sQLiteException0);
                return false;
            }
            try {
            label_10:
                if(sQLiteDatabase0.insert(s, null, contentValues0) != -1L) {
                    return true;
                }
            }
            catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException1) {
                a.ae(crvy.a.j(), "Failed to acquire lock for db. Failed to insert.", sQLiteDatabaseLockedException1);
            }
            catch(SQLiteException sQLiteException1) {
                a.ae(crvy.a.j(), "Failed to insert into writable database.", sQLiteException1);
            }
            return false;
        }
        return false;
    }

    public final void g(String s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.d();
        if(sQLiteDatabase0 == null) {
            return;
        }
        if(s.equals("SimCardTable")) {
            v = hvjh.a.e().b();
        }
        else if(s.equals("CarrierTable")) {
            v = hvjh.a.e().a();
        }
        else {
            v = s.equals("SubscriptionTable") ? hvjh.a.e().c() : 0L;
        }
        String[] arr_s = {Long.toString(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - v)};
        try {
            sQLiteDatabase0.delete(s, "expiration_time-? <= 0", arr_s);
        }
        catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            a.e(crvy.a.j(), "Failed to acquire lock for db %s. Failed to delete.", s, sQLiteDatabaseLockedException0);
        }
        catch(SQLiteException sQLiteException0) {
            a.e(crvy.a.j(), "Failed to delete from writable database %s.", s, sQLiteException0);
        }
    }

    public final boolean h() {
        try {
            SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            a.ae(crvy.a.j(), "Cannot get writable SQLite database", sQLiteException0);
            return false;
        }
        try {
            if(sQLiteDatabase0.delete("DeviceTable", "version_index = ?", new String[]{Long.toString(1L)}) == 1) {
                return true;
            }
        }
        catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            a.ae(crvy.a.j(), "Failed to acquire lock for db. Failed to delete.", sQLiteDatabaseLockedException0);
        }
        catch(SQLiteException sQLiteException1) {
            a.ae(crvy.a.j(), "Failed to delete from writable database.", sQLiteException1);
        }
        return false;
    }

    private static int i() {
        if(hvjq.i()) {
            return 7;
        }
        return hvli.d() ? 6 : 5;
    }

    private final SQLiteDatabase j(boolean z) {
        SQLiteDatabase sQLiteDatabase0;
        try {
            return z ? this.getWritableDatabase() : this.getReadableDatabase();
        }
        catch(SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException0) {
            crxn.c().J(hhct.cL, 29, "Local_Cache", "MDP_BgTask", -1);
            bboh bboh0 = crvy.a;
            a.e(bboh0.j(), "Failed to open db. Failed to getDatabase. Writable: %b", Boolean.valueOf(z), sQLiteCantOpenDatabaseException0);
            if(hvjq.a.c().s()) {
                if(!this.d.deleteDatabase(this.c)) {
                    ((ggtj)bboh0.j()).x("Mdp db deletion failed");
                    return null;
                }
                try {
                    ((ggtj)bboh0.j()).x("Db deleted and trying to recreate db.");
                    sQLiteDatabase0 = z ? this.getWritableDatabase() : this.getReadableDatabase();
                }
                catch(SQLiteException sQLiteException1) {
                    a.ae(crvy.a.j(), "Failed to recreate db.", sQLiteException1);
                    return null;
                }
                crxn.c().J(hhct.cM, 29, "Local_Cache", "MDP_BgTask", -1);
                return sQLiteDatabase0;
            }
            return null;
        }
        catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            crxn.c().J(hhct.cN, 29, "Local_Cache", "MDP_BgTask", -1);
            a.e(crvy.a.j(), "Failed to acquire lock for db. Failed to getDatabase. Writable: %b", Boolean.valueOf(z), sQLiteDatabaseLockedException0);
            return null;
        }
        catch(SQLiteException sQLiteException0) {
            crxn.c().J(hhct.cO, 29, "Local_Cache", "MDP_BgTask", -1);
            a.e(crvy.a.j(), "Failed to get SQLite database. Writable: %b", Boolean.valueOf(z), sQLiteException0);
            return null;
        }
    }

    private static final void n(SQLiteDatabase sQLiteDatabase0) {
        try {
            sQLiteDatabase0.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s BLOB, %s BLOB)", "DeviceTable", "version_index", "consent_record", "device_info"));
        }
        catch(SQLiteException sQLiteException0) {
            a.e(crvy.a.j(), "Failed to create table %s", "DeviceTable", sQLiteException0);
        }
    }

    private static final void o(SQLiteDatabase sQLiteDatabase0) {
        try {
            sQLiteDatabase0.execSQL(String.format("CREATE TABLE IF NOT EXISTS %1$s (%2$s TEXT NOT NULL, %3$s TEXT NOT NULL, %4$s INTEGER, PRIMARY KEY(%2$s, %3$s))", "SdkNotificationTable", "iccid", "destination_package", "last_sent_notification_id"));
        }
        catch(SQLiteException sQLiteException0) {
            a.e(crvy.a.j(), "Failed to create table %s", "SdkNotificationTable", sQLiteException0);
        }
    }

    @Override  // bboo
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        Level level0 = cslm.h();
        crvy.a.g(level0).X("downgrade MobileDataPlan database: %s, <%d> to <%d>", this.c, Integer.valueOf(v), Integer.valueOf(v1));
        if(v >= 5 && v1 < 5) {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS DeviceTable");
        }
        if(v >= 7 && v1 < 7) {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS IccidSubscriptionTable");
        }
        if(v >= 6 && v1 < 6) {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS SdkNotificationTable");
        }
        new crxn(this.d).J(hhct.cJ, 25, "Db", "MDP_Database", v1);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        Level level0 = cslm.h();
        crvy.a.g(level0).X("upgrade MobileDataPlan database: %s, <%d> to <%d>", this.c, Integer.valueOf(v), Integer.valueOf(v1));
        if(v < 4) {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS SimCardTable");
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS CarrierTable");
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS SubscriptionTable");
            this.onCreate(sQLiteDatabase0);
        }
        if(v < 5 && v1 >= 5) {
            crvy.n(sQLiteDatabase0);
        }
        if(v < 6 && v1 >= 6 && hvli.d()) {
            crvy.o(sQLiteDatabase0);
        }
        new crxn(this.d).J(hhct.cI, 25, "Db", "MDP_Database", v1);
    }
}

