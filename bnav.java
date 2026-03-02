import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

final class bnav extends bboo {
    public bnav(Context context0) {
        super(context0, "fido_auto_enrollment.db", 1);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        try {
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS account_enrollment_status(id INTEGER PRIMARY KEY AUTOINCREMENT,account TEXT,original_enroll_time_millis TEXT,enroll_time_millis TEXT,key_type INTEGER,credential_identifier TEXT,validity INTEGER)");
        }
        catch(SQLException sQLException0) {
            throw new SQLiteException(sQLException0.getMessage(), sQLException0.getCause());
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

