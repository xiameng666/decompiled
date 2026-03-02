import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public final class aqly extends bboo {
    public aqly(Context context0) {
        super(context0, "backupencryption.db", 1);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE tertiary_keys ( _id INTEGER PRIMARY KEY,secondary_key_alias TEXT,package_name TEXT,wrapped_key_bytes BLOB,UNIQUE(secondary_key_alias,package_name))");
    }

    public final SQLiteDatabase c() {
        try {
            return super.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            throw new aqlz(sQLiteException0);
        }
    }

    public final SQLiteDatabase d() {
        try {
            return super.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            throw new aqlz(sQLiteException0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS tertiary_keys");
        this.onCreate(sQLiteDatabase0);
    }
}

