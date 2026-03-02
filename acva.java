import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

final class acva extends bboo {
    public acva(Context context0) {
        super(context0, "google_account_history.db", 1);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL(acvb.b);
        sQLiteDatabase0.execSQL(acvb.c);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        ((ggtj)((ggtj)acvb.a.h()).ar(480)).F("[GoogleAccountHistoryStore]upgrading db from %s to %s.", v, v1);
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS AccountHistory");
        this.onCreate(sQLiteDatabase0);
    }
}

