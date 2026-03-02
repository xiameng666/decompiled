import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

public final class ajfp implements yhb {
    public final Context a;
    private static final baun b;

    static {
        ajfp.b = new baun(new String[]{"GroupKeyDatabaseOperation"}, null);
    }

    public ajfp(Context context0) {
        this.a = context0;
    }

    @Override  // yhb
    public final yhc a(String s, String s1) {
        yhc yhc0;
        Throwable throwable1;
        InvalidKeySpecException invalidKeySpecException1;
        Cursor cursor1;
        SQLiteDatabase sQLiteDatabase0;
        ajfo ajfo0 = ajfo.c(this.a);
        Cursor cursor0 = null;
        try {
            sQLiteDatabase0 = ajfo0.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            ajfp.b.n("Couldn\'t open database", sQLiteException0, new Object[0]);
            return null;
        }
        sQLiteDatabase0.beginTransaction();
        try {
            cursor1 = sQLiteDatabase0.query(true, "group_keys", new String[]{"public_key", "private_key"}, "key_name = ? AND account = ? AND key_state = 1", new String[]{s, s1}, null, null, null, null);
        }
        catch(InvalidKeySpecException invalidKeySpecException0) {
            invalidKeySpecException1 = invalidKeySpecException0;
            cursor1 = null;
            goto label_29;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_34;
        }
        if(cursor1 != null) {
            try {
                if(cursor1.moveToFirst()) {
                    yhc0 = ajfp.c(cursor1, s, s1);
                    sQLiteDatabase0.setTransactionSuccessful();
                    goto label_21;
                }
                goto label_25;
            }
            catch(InvalidKeySpecException invalidKeySpecException2) {
                goto label_28;
            }
            catch(Throwable throwable2) {
                goto label_32;
            }
        label_21:
            cursor1.close();
            sQLiteDatabase0.endTransaction();
            ajfo0.close();
            return yhc0;
        }
        try {
        label_25:
            ajfp.b.m("No key exists", new Object[0]);
            goto label_39;
        }
        catch(InvalidKeySpecException invalidKeySpecException2) {
        label_28:
            invalidKeySpecException1 = invalidKeySpecException2;
            try {
            label_29:
                ajfp.b.n("Key format error", invalidKeySpecException1, new Object[0]);
                goto label_39;
            }
            catch(Throwable throwable2) {
            }
            goto label_32;
        }
        catch(Throwable throwable2) {
        label_32:
            throwable1 = throwable2;
            cursor0 = cursor1;
        }
    label_34:
        if(cursor0 != null) {
            cursor0.close();
        }
        sQLiteDatabase0.endTransaction();
        ajfo0.close();
        throw throwable1;
    label_39:
        if(cursor1 != null) {
            cursor1.close();
        }
        sQLiteDatabase0.endTransaction();
        ajfo0.close();
        return null;
    }

    @Override  // yhb
    public final yhc b(String s, String s1) {
        yhc yhc0;
        Throwable throwable1;
        InvalidKeySpecException invalidKeySpecException1;
        Cursor cursor1;
        SQLiteDatabase sQLiteDatabase0;
        ajfo ajfo0 = ajfo.c(this.a);
        Cursor cursor0 = null;
        try {
            sQLiteDatabase0 = ajfo0.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            ajfp.b.n("Couldn\'t open database", sQLiteException0, new Object[0]);
            return null;
        }
        sQLiteDatabase0.beginTransaction();
        try {
            cursor1 = sQLiteDatabase0.query(true, "group_keys", new String[]{"public_key", "private_key"}, "key_name = ? AND account = ?", new String[]{s, s1}, null, null, null, null);
        }
        catch(InvalidKeySpecException invalidKeySpecException0) {
            invalidKeySpecException1 = invalidKeySpecException0;
            cursor1 = null;
            goto label_32;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_37;
        }
        if(cursor1 != null) {
            try {
                if(cursor1.moveToFirst()) {
                    yhc0 = ajfp.c(cursor1, s, s1);
                    if(yhc0.d != null && cursor1.getCount() == 2) {
                        cursor1.moveToNext();
                        yhc0 = ajfp.c(cursor1, s, s1);
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                    goto label_24;
                }
                goto label_28;
            }
            catch(InvalidKeySpecException invalidKeySpecException2) {
                goto label_31;
            }
            catch(Throwable throwable2) {
                goto label_35;
            }
        label_24:
            cursor1.close();
            sQLiteDatabase0.endTransaction();
            ajfo0.close();
            return yhc0;
        }
        try {
        label_28:
            ajfp.b.m("No key exists", new Object[0]);
            goto label_42;
        }
        catch(InvalidKeySpecException invalidKeySpecException2) {
        label_31:
            invalidKeySpecException1 = invalidKeySpecException2;
            try {
            label_32:
                ajfp.b.n("Key format error", invalidKeySpecException1, new Object[0]);
                goto label_42;
            }
            catch(Throwable throwable2) {
            }
            goto label_35;
        }
        catch(Throwable throwable2) {
        label_35:
            throwable1 = throwable2;
            cursor0 = cursor1;
        }
    label_37:
        if(cursor0 != null) {
            cursor0.close();
        }
        sQLiteDatabase0.endTransaction();
        ajfo0.close();
        throw throwable1;
    label_42:
        if(cursor1 != null) {
            cursor1.close();
        }
        sQLiteDatabase0.endTransaction();
        ajfo0.close();
        return null;
    }

    private static yhc c(Cursor cursor0, String s, String s1) {
        byte[] arr_b = bbmu.f(cursor0.getString(cursor0.getColumnIndexOrThrow("public_key")));
        byte[] arr_b1 = bbmu.f(cursor0.getString(cursor0.getColumnIndexOrThrow("private_key")));
        PublicKey publicKey0 = hhtk.b(arr_b);
        return arr_b1 == null ? new yhc(s, s1, publicKey0, null) : new yhc(s, s1, publicKey0, yha.a(arr_b1));
    }
}

