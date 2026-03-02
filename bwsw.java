import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class bwsw extends bboo {
    public bwsw(Context context0) {
        super(context0, "icing-indexapi-errors.db", 4);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS [errors] ([id] INTEGER PRIMARY KEY AUTOINCREMENT, [package] TEXT, [data] BLOB, [timestamp] INTEGER DEFAULT (strftime(\'%s\', \'now\')))");
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS [user_actions] ([id] INTEGER PRIMARY KEY AUTOINCREMENT, [package] TEXT, [data] BLOB, [timestamp] INTEGER DEFAULT (strftime(\'%s\', \'now\')))");
    }

    private final void c(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS [errors]");
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS [user_actions]");
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

