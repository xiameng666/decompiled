import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

public final class flnc {
    private final SQLiteOpenHelper a;

    public flnc(SQLiteOpenHelper sQLiteOpenHelper0) {
        this.a = sQLiteOpenHelper0;
    }

    public final int a(Uri uri0, String s, String[] arr_s) {
        return this.a.getWritableDatabase().delete(flnc.i(uri0), s, arr_s);
    }

    public final int b(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return this.a.getWritableDatabase().update(flnc.i(uri0), contentValues0, s, arr_s);
    }

    public final long c(Uri uri0, ContentValues contentValues0, int v) {
        return this.a.getWritableDatabase().insertWithOnConflict(flnc.i(uri0), null, contentValues0, v);
    }

    public final void d() {
        this.a.getWritableDatabase().beginTransaction();
    }

    public final void e() {
        this.a.getWritableDatabase().endTransaction();
    }

    public final void f() {
        this.a.getWritableDatabase().setTransactionSuccessful();
    }

    public final boolean g() {
        return this.a.getWritableDatabase().inTransaction();
    }

    public final Cursor h(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, String s2) {
        return this.a.getReadableDatabase().query(flnc.i(uri0), arr_s, s, arr_s1, null, null, s1, s2);
    }

    private static final String i(Uri uri0) {
        return (String)uri0.getPathSegments().get(1);
    }
}

