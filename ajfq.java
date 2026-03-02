import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import java.util.List;

public final class ajfq implements yhh {
    public final Context a;
    public static final baun b;

    static {
        ajfq.b = new baun(new String[]{"ClientDataOperation"}, null);
    }

    public ajfq(Context context0) {
        this.a = context0;
    }

    @Override  // yhh
    public final byte[] a(String s, String s1) {
        Throwable throwable1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        batl.q(s1);
        batl.q(s);
        baun baun0 = ajfq.b;
        baun0.d("Retrieving keyMetadata for keyName=%s", new Object[]{s1});
        ajfo ajfo0 = ajfo.c(this.a);
        byte[] arr_b = null;
        try {
            sQLiteDatabase0 = ajfo0.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            ajfq.b.g("Failed to retrieve keyMetadata", sQLiteException0, new Object[0]);
            return null;
        }
        try {
            cursor0 = ajfq.i(sQLiteDatabase0, new String[]{"client_metadata"}, "identifier = ? AND account = ?", new String[]{"key_" + s1, s});
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            ajfq.k(((Cursor)arr_b));
            ajfo0.close();
            throw throwable1;
        }
        if(cursor0 == null) {
            goto label_22;
        }
        else {
            try {
                if(cursor0.moveToFirst()) {
                    arr_b = ajfq.h(cursor0);
                }
                else {
                    baun0.m("No keyMetadata found for keyName=%s", new Object[]{s1});
                    goto label_29;
                label_22:
                    baun0.m("No keyMetadata found for keyName=%s", new Object[]{s1});
                }
            }
            catch(Throwable throwable1) {
                arr_b = cursor0;
                ajfq.k(((Cursor)arr_b));
                ajfo0.close();
                throw throwable1;
            }
        }
    label_29:
        ajfq.k(cursor0);
        ajfo0.close();
        return arr_b;
    }

    public static String b(String s) {
        return "key_" + s;
    }

    public final List c(String s) {
        Throwable throwable1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        batl.q(s);
        baun baun0 = ajfq.b;
        baun0.d("Retrieving all featureMetadata", new Object[0]);
        ajfo ajfo0 = ajfo.c(this.a);
        List list0 = null;
        try {
            sQLiteDatabase0 = ajfo0.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            ajfq.b.g("Failed to retrieve featureMetadata", sQLiteException0, new Object[0]);
            return null;
        }
        try {
            cursor0 = ajfq.i(sQLiteDatabase0, new String[]{"client_metadata", "identifier"}, "account = ?", new String[]{s});
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            ajfq.k(((Cursor)list0));
            ajfo0.close();
            throw throwable1;
        }
        if(cursor0 == null) {
            goto label_26;
        }
        else {
            try {
                if(cursor0.moveToFirst()) {
                    list0 = new ArrayList();
                    while(!cursor0.isAfterLast()) {
                        if(cursor0.getString(cursor0.getColumnIndexOrThrow("identifier")).startsWith("feature_")) {
                            list0.add(ajfq.h(cursor0));
                        }
                        cursor0.moveToNext();
                    }
                }
                else {
                    baun0.m("No keyMetadata found.", new Object[0]);
                    goto label_33;
                label_26:
                    baun0.m("No keyMetadata found.", new Object[0]);
                }
            }
            catch(Throwable throwable1) {
                list0 = cursor0;
                ajfq.k(((Cursor)list0));
                ajfo0.close();
                throw throwable1;
            }
        }
    label_33:
        ajfq.k(cursor0);
        ajfo0.close();
        return list0;
    }

    public static void d(ContentValues contentValues0, String s) {
        contentValues0.put("account", s);
    }

    public static void e(ContentValues contentValues0, byte[] arr_b) {
        contentValues0.put("client_metadata", bbmu.c(arr_b));
    }

    public final void f(String s, gquw gquw0, byte[] arr_b) {
        long v1;
        SQLiteDatabase sQLiteDatabase0;
        batl.s(gquw0);
        batl.q(s);
        if(arr_b.length == 0) {
            ajfq.b.d("Null/empty featureMetadata.", new Object[0]);
            return;
        }
        ajfq.b.d("Updating featureMetadata", new Object[0]);
        ajfo ajfo0 = ajfo.c(this.a);
        try {
            sQLiteDatabase0 = ajfo0.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            ajfq.b.g("Failed to upload keyMetadata to db", sQLiteException0, new Object[0]);
            return;
        }
        sQLiteDatabase0.beginTransaction();
        try {
            ContentValues contentValues0 = new ContentValues();
            ajfq.d(contentValues0, s);
            contentValues0.put("identifier", ajfq.j(gquw0));
            ajfq.e(contentValues0, arr_b);
            if(hptp.c()) {
                try {
                    v1 = sQLiteDatabase0.insertWithOnConflict("metadata", null, contentValues0, 5);
                }
                catch(SQLiteException sQLiteException1) {
                    ajfq.b.g("Failed to update feature metadata", sQLiteException1, new Object[0]);
                    v1 = -1L;
                }
            }
            else {
                v1 = sQLiteDatabase0.insertWithOnConflict("metadata", null, contentValues0, 5);
            }
            if(v1 < 0L) {
                ajfq.b.f("Failed to insert keyMetadata for feature=%s", new Object[]{gquw0.toString()});
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
            ajfo0.close();
        }
    }

    public final byte[] g(String s, gquw gquw0) {
        Throwable throwable1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        batl.q(s);
        batl.s(gquw0);
        baun baun0 = ajfq.b;
        baun0.d("Retrieving a featureMetadata", new Object[0]);
        ajfo ajfo0 = ajfo.c(this.a);
        byte[] arr_b = null;
        try {
            sQLiteDatabase0 = ajfo0.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            ajfq.b.g("Failed to retrieve featureMetadata", sQLiteException0, new Object[0]);
            return null;
        }
        try {
            String[] arr_s = {s, ajfq.j(gquw0)};
            cursor0 = ajfq.i(sQLiteDatabase0, new String[]{"client_metadata", "identifier"}, "account = ? AND identifier = ?", arr_s);
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            ajfq.k(((Cursor)arr_b));
            ajfo0.close();
            throw throwable1;
        }
        if(cursor0 == null) {
            goto label_23;
        }
        else {
            try {
                if(cursor0.moveToFirst()) {
                    arr_b = ajfq.h(cursor0);
                }
                else {
                    baun0.m("No featureMetadata found.", new Object[0]);
                    goto label_30;
                label_23:
                    baun0.m("No featureMetadata found.", new Object[0]);
                }
            }
            catch(Throwable throwable1) {
                arr_b = cursor0;
                ajfq.k(((Cursor)arr_b));
                ajfo0.close();
                throw throwable1;
            }
        }
    label_30:
        ajfq.k(cursor0);
        ajfo0.close();
        return arr_b;
    }

    static byte[] h(Cursor cursor0) {
        return bbmu.f(cursor0.getString(cursor0.getColumnIndexOrThrow("client_metadata")));
    }

    static Cursor i(SQLiteDatabase sQLiteDatabase0, String[] arr_s, String s, String[] arr_s1) {
        return sQLiteDatabase0.query(true, "metadata", arr_s, s, arr_s1, null, null, null, null);
    }

    private static String j(gquw gquw0) {
        return "feature_" + gquw0.a();
    }

    private static final void k(Cursor cursor0) {
        if(cursor0 != null) {
            cursor0.close();
        }
    }
}

