import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jeb.synthetic.FIN;

public final class ajfn implements ajiw, yhg {
    public static final byte[] a;
    public final Context b;
    public static final baun c;

    static {
        ajfn.c = new baun(new String[]{"CryptauthDatabaseOperation"}, null);
        ajfn.a = "hashedPk".getBytes(Charset.forName("UTF-8"));
    }

    public ajfn(Context context0) {
        this.b = context0;
    }

    @Override  // yhg
    public final void a(ygr ygr0, List list0) {
        SQLiteDatabase sQLiteDatabase0;
        ygr ygr1 = ygr0;
        ajfn.c.d("Updating status for key=%s", new Object[]{ygr1.a});
        ajfo ajfo0 = ajfo.c(this.b);
        try {
            sQLiteDatabase0 = ajfo0.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            ajfn.c.n("failed to update key status ", sQLiteException0, new Object[0]);
            return;
        }
        sQLiteDatabase0.beginTransaction();
        int v = 0;
        try {
            while(v < ygr1.d.size()) {
                if(((ygu)list0.get(v)).equals(ygu.c)) {
                    String s = ygr1.a;
                    String s1 = !s.equals("PublicKey") || Arrays.equals(ygr1.a(v).a, "device_key".getBytes(StandardCharsets.UTF_8)) ? bbmu.c(ygr1.a(v).a) : bbmu.c("device_key".getBytes(StandardCharsets.UTF_8));
                    baun baun0 = ajfn.c;
                    baun0.d("Deleting key=%s, account=%s, name=%s", new Object[]{s1, ygr1.c, s});
                    if(sQLiteDatabase0.delete("keys", "key_name = ? AND key_handle = ? AND account = ?", new String[]{s, s1, ygr1.c}) <= 0) {
                        baun0.m("No rows found for [key=%s handle=%s]", new Object[]{s, s1});
                    }
                    else {
                        baun0.d("Successfully updated the keyStatus.", new Object[0]);
                        try {
                            ygc.d(ygr1.a(v).a);
                        }
                        catch(ygj unused_ex) {
                        }
                    }
                }
                else {
                    ContentValues contentValues0 = new ContentValues();
                    ajfn.m(contentValues0, ((ygu)list0.get(v)));
                    String s2 = bbmu.c(ygr1.a(v).a);
                    baun baun1 = ajfn.c;
                    String s3 = ygr1.a;
                    Integer integer0 = (int)((ygu)list0.get(v)).e;
                    baun1.d("Updating key status for key=%s, account=%s, name=%s to %d", new Object[]{s2, ygr1.c, s3, integer0});
                    int v2 = sQLiteDatabase0.update("keys", contentValues0, "key_name = ? AND key_handle = ? AND account = ?", new String[]{s3, s2, ygr1.c});
                    if(v2 > 1) {
                        baun1.m("Too many rows (%d) updated for [key=%s handle=%s]", new Object[]{v2, s3, s2});
                    }
                    else if(v2 <= 0) {
                        baun1.m("No rows found for [key=%s handle=%s]", new Object[]{s3, s2});
                    }
                    else {
                        baun1.d("Successfully updated the keyStatus.", new Object[0]);
                    }
                }
                ++v;
                ygr1 = ygr0;
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
            ajfo0.close();
        }
    }

    public static long b(Cursor cursor0) {
        return cursor0.getLong(cursor0.getColumnIndexOrThrow("creation_time"));
    }

    public static long c(Cursor cursor0) {
        return cursor0.getLong(cursor0.getColumnIndexOrThrow("expiration_time"));
    }

    public static ygg d(Cursor cursor0) {
        switch(cursor0.getInt(cursor0.getColumnIndexOrThrow("key_form"))) {
            case 1: {
                return ygg.a;
            }
            case 2: {
                return ygg.b;
            }
            case 3: {
                return ygg.c;
            }
            default: {
                return ygg.d;
            }
        }
    }

    public static ygu e(Cursor cursor0) {
        switch(cursor0.getInt(cursor0.getColumnIndexOrThrow("active_status"))) {
            case 1: {
                return ygu.a;
            }
            case 2: {
                return ygu.b;
            }
            case 3: {
                throw new yhd("Value=3 implies deleted and shouldn\'t be stored.");
            }
            default: {
                return ygu.d;
            }
        }
    }

    @Override  // ajiw
    public final ajiz f(String s, Account account0) {
        int v3;
        long v2;
        SQLiteDatabase sQLiteDatabase0;
        ajfn.c.d("Querying signing active keys for [keyname=%s] and [account=%s].", new Object[]{s, account0.name});
        ajfo ajfo0 = ajfo.c(this.b);
        try {
            sQLiteDatabase0 = ajfo0.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            throw new ajiv("failed to open db ", sQLiteException0);
        }
        sQLiteDatabase0.beginTransaction();
        int v = FIN.finallyOpen$NT();
        Cursor cursor0 = ajfn.u(sQLiteDatabase0, new String[]{"key_handle", "key_type", "private_key", "public_key", "creation_time", "expiration_time", "exportable"}, "key_name = ? AND account = ? AND active_status = ? AND key_form = ?", new String[]{s, account0.name, Integer.toString(ygu.a.e), Integer.toString(ygg.a.e)});
        if(cursor0 != null && cursor0.moveToFirst()) {
            if(cursor0.getCount() == 1) {
                byte[] arr_b = ajfn.o(cursor0);
                byte[] arr_b1 = ajfn.q(cursor0);
                byte[] arr_b2 = ajfn.p(cursor0);
                long v1 = ajfn.c(cursor0);
                try {
                    v2 = ajfn.b(cursor0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    throw new ajiv("Illegal creation time value", illegalArgumentException0);
                }
                gmkv gmkv0 = ajfn.j(cursor0);
                try {
                    v3 = ajfn.r(cursor0);
                }
                catch(yhd yhd0) {
                    ajfn.c.l(yhd0);
                    v3 = 1;
                }
                sQLiteDatabase0.setTransactionSuccessful();
                ajiz ajiz0 = new ajiz(s, arr_b, arr_b1, arr_b2, gmkv0, ygu.a, v3, account0.name, v2, v1);
                FIN.finallyCodeBegin$NT(v);
                return ajiz0;
            }
            throw new ajiv("Found " + cursor0.getCount() + " keys. Should be 1.");
        }
        throw new ajiv(a.a(s, "No key for keyName=", " found."));
    }

    @Override  // ajiw
    public final ajiz g(byte[] arr_b) {
        ygu ygu0;
        SQLiteDatabase sQLiteDatabase0;
        String s = bbmu.c(arr_b);
        ajfn.c.d("Querying signing active keys for [keyHandle=%s].", new Object[]{s});
        ajfo ajfo0 = ajfo.c(this.b);
        try {
            sQLiteDatabase0 = ajfo0.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            throw new ajiv("failed to open db ", sQLiteException0);
        }
        sQLiteDatabase0.beginTransaction();
        int v = FIN.finallyOpen$NT();
        int v1 = 1;
        Cursor cursor0 = ajfn.u(sQLiteDatabase0, new String[]{"key_name", "key_handle", "key_type", "account", "private_key", "public_key", "creation_time", "expiration_time", "exportable", "active_status"}, "key_handle = ? AND key_form = ?", new String[]{s, Integer.toString(ygg.a.e)});
        if(cursor0 != null && cursor0.moveToFirst()) {
            if(cursor0.getCount() == 1) {
                String s1 = ajfn.l(cursor0);
                String s2 = ajfn.k(cursor0);
                byte[] arr_b1 = ajfn.q(cursor0);
                byte[] arr_b2 = ajfn.p(cursor0);
                long v2 = ajfn.c(cursor0);
                long v3 = ajfn.b(cursor0);
                gmkv gmkv0 = ajfn.j(cursor0);
                try {
                    ygu0 = ajfn.e(cursor0);
                }
                catch(yhd yhd0) {
                    ajfn.c.l(yhd0);
                    ygu0 = ygu.d;
                }
                try {
                    v1 = ajfn.r(cursor0);
                }
                catch(yhd yhd1) {
                    ajfn.c.l(yhd1);
                }
                sQLiteDatabase0.setTransactionSuccessful();
                ajiz ajiz0 = new ajiz(s1, arr_b, arr_b1, arr_b2, gmkv0, ygu0, v1, s2, v3, v2);
                FIN.finallyCodeBegin$NT(v);
                return ajiz0;
            }
            throw new ajiv("Found " + cursor0.getCount() + " keys. Should be 1.");
        }
        throw new ajiv(a.a(s, "No key for keyHandle=", " found."));
    }

    @Override  // ajiw
    public final ajjb h(String s, Account account0) {
        return this.i(s, account0.name);
    }

    public final ajjb i(String s, String s1) {
        ajjb ajjb0;
        Throwable throwable1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        ajfo ajfo0 = ajfo.c(this.b);
        try {
            sQLiteDatabase0 = ajfo0.getReadableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            throw new ajiv("Failed to open db ", sQLiteException0);
        }
        sQLiteDatabase0.beginTransaction();
        try {
            cursor0 = ajfn.u(sQLiteDatabase0, new String[]{"key_handle", "key_type", "master_key", "active_status", "creation_time", "expiration_time"}, "key_name = ? AND account = ? AND key_form = ?", new String[]{s, s1, Integer.toString(ygg.b.e)});
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            cursor0 = null;
            sQLiteDatabase0.endTransaction();
            ajfn.s(cursor0);
            ajfo0.close();
            throw throwable1;
        }
        if(cursor0 != null) {
            try {
                if(!cursor0.moveToFirst()) {
                    throw new ajiv(a.a(s, "No key for keyName=", " found."));
                }
                sQLiteDatabase0.setTransactionSuccessful();
                ajjb0 = ajfn.t(cursor0, s, s1);
            }
            catch(Throwable throwable2) {
                goto label_22;
            }
            sQLiteDatabase0.endTransaction();
            ajfn.s(cursor0);
            ajfo0.close();
            return ajjb0;
        }
        try {
            throw new ajiv(a.a(s, "No key for keyName=", " found."));
        }
        catch(Throwable throwable2) {
        label_22:
            throwable1 = throwable2;
        }
        sQLiteDatabase0.endTransaction();
        ajfn.s(cursor0);
        ajfo0.close();
        throw throwable1;
    }

    public static gmkv j(Cursor cursor0) {
        String s = cursor0.getString(cursor0.getColumnIndexOrThrow("key_type"));
        return (gmkv)Enum.valueOf(gmkv.class, s);
    }

    public static String k(Cursor cursor0) {
        return cursor0.getString(cursor0.getColumnIndexOrThrow("account"));
    }

    public static String l(Cursor cursor0) {
        return cursor0.getString(cursor0.getColumnIndexOrThrow("key_name"));
    }

    public static void m(ContentValues contentValues0, ygu ygu0) {
        contentValues0.put("active_status", Integer.valueOf(ygu0.e));
    }

    public static byte[] n(Cursor cursor0) {
        return bbmu.f(cursor0.getString(cursor0.getColumnIndexOrThrow("master_key")));
    }

    public static byte[] o(Cursor cursor0) {
        return bbmu.f(cursor0.getString(cursor0.getColumnIndexOrThrow("key_handle")));
    }

    public static byte[] p(Cursor cursor0) {
        return bbmu.f(cursor0.getString(cursor0.getColumnIndexOrThrow("private_key")));
    }

    public static byte[] q(Cursor cursor0) {
        return bbmu.f(cursor0.getString(cursor0.getColumnIndexOrThrow("public_key")));
    }

    public static int r(Cursor cursor0) {
        switch(cursor0.getInt(cursor0.getColumnIndexOrThrow("exportable"))) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            default: {
                throw new yhd("Unrecognized value");
            }
        }
    }

    public static final void s(Cursor cursor0) {
        if(cursor0 != null) {
            cursor0.close();
        }
    }

    public static final ajjb t(Cursor cursor0, String s, String s1) {
        ArrayList arrayList0 = new ArrayList();
        Object object0 = null;
        while(!cursor0.isAfterLast()) {
            ajfn.o(cursor0);
            byte[] arr_b = ajfn.n(cursor0);
            gmkv gmkv0 = ajfn.j(cursor0);
            try {
                ygu ygu0 = ajfn.e(cursor0);
            }
            catch(yhd yhd0) {
                ajfn.c.n(String.format("invalid attributes. key=%s", s), yhd0, new Object[0]);
                cursor0.moveToNext();
                continue;
            }
            ajja ajja0 = new ajja(arr_b, gmkv0, ajfn.b(cursor0), ajfn.c(cursor0));
            if(ygu0.equals(ygu.a)) {
                object0 = ajja0;
            }
            else {
                arrayList0.add(ajja0);
            }
            cursor0.moveToNext();
        }
        gftb.check(object0);
        gftb.check(s);
        gftb.check(s1);
        return new ajjb(arrayList0, ((ajja)object0));
    }

    public static Cursor u(SQLiteDatabase sQLiteDatabase0, String[] arr_s, String s, String[] arr_s1) {
        return sQLiteDatabase0.query(true, "keys", arr_s, s, arr_s1, null, null, null, null);
    }

    public static final ygw v(SQLiteDatabase sQLiteDatabase0, String s, String s1, String[] arr_s) {
        ygw ygw0;
        String s2;
        gmkv gmkv0;
        int v2;
        long v1;
        long v;
        byte[] arr_b2;
        KeyPair keyPair0;
        Cursor cursor1;
        Cursor cursor0;
        try {
            cursor0 = ajfn.u(sQLiteDatabase0, new String[]{"key_handle", "private_key", "public_key", "creation_time", "expiration_time", "exportable"}, s1, arr_s);
        }
        catch(Throwable throwable0) {
            cursor1 = null;
            ajfn.s(cursor1);
            throw throwable0;
        }
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    try {
                        byte[] arr_b = ajfn.q(cursor0);
                        byte[] arr_b1 = ajfn.p(cursor0);
                        keyPair0 = new KeyPair(hhtk.b(arr_b), yha.a(arr_b1));
                        arr_b2 = ajfn.o(cursor0);
                        v = ajfn.b(cursor0);
                        v1 = ajfn.c(cursor0);
                        try {
                            v2 = ajfn.r(cursor0);
                        }
                        catch(yhd yhd0) {
                            ajfn.c.l(yhd0);
                            v2 = 1;
                        }
                        gmkv0 = gmkv.e;
                    }
                    catch(InvalidKeySpecException unused_ex) {
                        s2 = s;
                        goto label_25;
                    }
                    s2 = s;
                    try {
                        ygw0 = new ygw("PublicKey", s2, arr_b2, gmkv0, ygu.a, v2, keyPair0, v, v1);
                    }
                    catch(InvalidKeySpecException unused_ex) {
                    label_25:
                        baun baun0 = ajfn.c;
                        baun0.m("Deleting invalid Authzen\'s PublicKey from db", new Object[0]);
                        if(sQLiteDatabase0.delete("keys", "key_name = ? AND account = ? AND key_form = ?", new String[]{"PublicKey", s2, Integer.toString(ygg.a.e)}) <= 0) {
                            baun0.d("No rows found for [key=%s account=%s]", new Object[]{"PublicKey", s2});
                        }
                        else {
                            baun0.d("Deleted corrupted keys [key=%s account=%s]", new Object[]{"PublicKey", s2});
                        }
                        ygw0 = null;
                    }
                    sQLiteDatabase0.setTransactionSuccessful();
                    goto label_33;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                cursor1 = cursor0;
                ajfn.s(cursor1);
                throw throwable0;
            }
        label_33:
            ajfn.s(cursor0);
            return ygw0;
        }
        try {
        label_35:
            ajfn.c.m("No key exists", new Object[0]);
        }
        catch(Throwable throwable0) {
            cursor1 = cursor0;
            ajfn.s(cursor1);
            throw throwable0;
        }
        ajfn.s(cursor0);
        return null;
    }
}

