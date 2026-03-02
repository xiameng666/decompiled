import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import j..util.Objects;

final class crio extends ccsp {
    final criq a;

    public crio(criq criq0, Context context0) {
        Objects.requireNonNull(criq0);
        this.a = criq0;
        super(context0, "google_app_measurement_local.db", 1);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        }
        catch(SQLiteDatabaseLockedException sQLiteDatabaseLockedException0) {
            throw sQLiteDatabaseLockedException0;
        }
        catch(SQLiteException unused_ex) {
            criq criq0 = this.a;
            criq0.aJ().c.a("Opening the local database failed, dropping and recreating it");
            if(!criq0.aj().getDatabasePath("google_app_measurement_local.db").delete()) {
                criq0.aJ().c.b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            }
            catch(SQLiteException sQLiteException0) {
                this.a.aJ().c.b("Failed to open local database. Events will bypass local storage", sQLiteException0);
                return null;
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        crdh.b(this.a.aJ(), sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        crdh.a(this.a.aJ(), sQLiteDatabase0, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", criq.a);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

