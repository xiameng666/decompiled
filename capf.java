import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.List;

public final class capf {
    static final String[] a;
    public final bboo b;
    public static final int c;
    private static final bboh d;

    static {
        capf.d = bboh.b("GmscoreIpa", bbcu.ee);
        capf.a = new String[]{"_ID", "MEDIA_TYPE"};
    }

    public capf(bboo bboo0) {
        batl.s(bboo0);
        this.b = bboo0;
    }

    public final int a(List list0) {
        int v1;
        SQLiteDatabase sQLiteDatabase0;
        try {
            sQLiteDatabase0 = this.b.getWritableDatabase();
        }
        catch(SQLiteException unused_ex) {
            return 0;
        }
        sQLiteDatabase0.beginTransaction();
        try {
            v1 = 0;
            for(Object object0: list0) {
                ContentValues contentValues0 = new ContentValues();
                Long long0 = ((cape)object0).a;
                contentValues0.put("_ID", long0);
                contentValues0.put("MEDIA_TYPE", ((cape)object0).b);
                int v2 = Long.compare(sQLiteDatabase0.insert("IntermediateStore", null, contentValues0), 0L);
                if(v2 < 0) {
                    ((ggtj)((ggtj)capf.d.i()).ar(6001)).B("Insert failed for fileId: %d", long0);
                }
                Boolean.valueOf(v2 >= 0).getClass();
                if(v2 >= 0) {
                    ++v1;
                }
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        return v1;
    }

    public final Cursor b() {
        return this.b.getReadableDatabase().query(false, "IntermediateStore", capf.a, null, null, null, null, "_ID DESC", null);
    }
}

