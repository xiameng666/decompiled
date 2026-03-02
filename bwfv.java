import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

public final class bwfv extends SQLiteOpenHelper {
    public volatile boolean a;

    public bwfv(Context context0) {
        super(context0, "gservices.db", null, 4);
        this.a = false;
        bboo.m(this);
        bboo.l(this);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE main (name TEXT PRIMARY KEY, value TEXT)");
        sQLiteDatabase0.execSQL("CREATE TABLE overrides (name TEXT PRIMARY KEY, value TEXT)");
        sQLiteDatabase0.execSQL("CREATE TABLE saved_system (name TEXT PRIMARY KEY, value TEXT)");
        sQLiteDatabase0.execSQL("CREATE TABLE saved_secure (name TEXT PRIMARY KEY, value TEXT)");
        sQLiteDatabase0.execSQL("CREATE TABLE saved_global (name TEXT PRIMARY KEY, value TEXT)");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        Log.w("GservicesDatabaseHelper", "Something went wrong");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        boolean z;
        try(SQLiteStatement sQLiteStatement0 = sQLiteDatabase0.compileStatement("SELECT COUNT(*) FROM overrides")) {
            z = sQLiteStatement0.simpleQueryForLong() > 0L;
        }
        this.a = z;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        if(v == 1) {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS main");
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS overrides");
            this.onCreate(sQLiteDatabase0);
            v = 1;
        }
        if(v == 2 || v == 3) {
            sQLiteDatabase0.execSQL("CREATE TABLE saved_global (name TEXT PRIMARY KEY, value TEXT)");
        }
        sQLiteDatabase0.setVersion(v1);
    }
}

