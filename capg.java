import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class capg extends bboo {
    private static capg a;

    private capg(Context context0) {
        super(context0, "mediastore-indexer.db", 3);
    }

    @Override  // bboo
    protected final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS IntermediateStore (_ID INTEGER PRIMARY KEY ON CONFLICT REPLACE, MEDIA_TYPE INTEGER);");
    }

    public static capg c(Context context0) {
        synchronized(capg.class) {
            if(capg.a == null) {
                capg.a = new capg(context0);
            }
        }
        return capg.a;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.beginTransaction();
        try {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS IntermediateStore");
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS IntermediateStore (_ID INTEGER PRIMARY KEY ON CONFLICT REPLACE, MEDIA_TYPE INTEGER);");
            sQLiteDatabase0.setTransactionSuccessful();
        }
        catch(Throwable throwable0) {
            sQLiteDatabase0.endTransaction();
            throw throwable0;
        }
        sQLiteDatabase0.endTransaction();
        sQLiteDatabase0.beginTransaction();
        try {
            sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS PhotoTagStore");
            sQLiteDatabase0.setTransactionSuccessful();
        }
        catch(Throwable throwable1) {
            sQLiteDatabase0.endTransaction();
            throw throwable1;
        }
        sQLiteDatabase0.endTransaction();
    }
}

