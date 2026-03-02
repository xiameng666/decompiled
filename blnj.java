import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class blnj extends bboo {
    public blnj(Context context0) {
        super(context0, "fido-appid-cache.db", 1);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE appid_expiry (appid TEXT,expiry NUMERIC,PRIMARY KEY (appid))");
        sQLiteDatabase0.execSQL("CREATE TABLE appid_facet (appid TEXT,trustedfacet TEXT)");
    }

    private final void c(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS appid_expiry");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS appid_facet");
        this.onCreate(sQLiteDatabase0);
    }

    @Override  // bboo
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        this.c(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        this.c(sQLiteDatabase0);
    }
}

