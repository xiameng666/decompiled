import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import jeb.synthetic.FIN;

public final class bnba {
    public static final bboh a;
    public static final hhrq b;
    public static final hhrq c;
    public static final hhrq d;
    public static final bxoq e;
    private final bnbb f;

    static {
        bnba.a = bnaa.d("KeySQLiteDataStore");
        bnba.b = new hhrq("version");
        bnba.c = new hhrq("irk");
        bnba.d = new hhrq("lk");
        bnba.e = new bxop(((gful_cronetEngineProvider)new bnay()));
    }

    public bnba(Context context0) {
        this.f = bnbb.c(context0);
    }

    public final SQLiteDatabase a() {
        try {
            return bxlg.a(this.f, "fido_embedded_security_key.db", true);
        }
        catch(SQLiteException sQLiteException0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = sQLiteException0;
            bxly0.b = "Failed to open the database.";
            throw bxly0.a();
        }
    }

    public final bnaz b(String s) {
        gftb.check(s);
        try(Cursor cursor0 = this.f.getReadableDatabase().query("registered_credentials", null, "id = ?", new String[]{s}, null, null, null)) {
            try {
                return !cursor0.moveToFirst() ? null : new bnaz(cursor0);
            }
            catch(ParseException parseException0) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.c = parseException0;
                bxly0.b = "Unable to parse the key data.";
                throw bxly0.a();
            }
        }
    }

    public final gfsx c(String s) {
        gftb.z(s, "discoverableCredentialKeyHandle cannot be null");
        Cursor cursor0 = this.f.getReadableDatabase().query("device_bound_key_map", null, "discoverable_credential_id = ?", new String[]{s}, null, null, null);
        if(!cursor0.moveToFirst()) {
            return gfqx.a;
        }
        int v = cursor0.getColumnIndex("device_bound_key_id");
        String s1 = v == -1 ? null : cursor0.getString(v);
        cursor0.close();
        return gfsx.l(s1);
    }

    public static KeyPair d(byte[] arr_b) {
        try {
            ggfz ggfz0 = hhrs.q(arr_b).m().a;
            hhrn hhrn0 = new hhrn(1L);
            hhrn hhrn1 = new hhrn(2L);
            if(ggfz0.containsKey(hhrn0) && ggfz0.containsKey(hhrn1)) {
                KeyFactory keyFactory0 = KeyFactory.getInstance("EC");
                PrivateKey privateKey0 = keyFactory0.generatePrivate(new PKCS8EncodedKeySpec(((hhrs)ggfz0.get(hhrn0)).j().a.toByteArray()));
                return new KeyPair(keyFactory0.generatePublic(new X509EncodedKeySpec(((hhrs)ggfz0.get(hhrn1)).j().a.toByteArray())), privateKey0);
            }
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.b = "Unable to decode the key pair.";
            throw bxly0.a();
        }
        catch(hhrl | InvalidKeySpecException | hhrr | NoSuchAlgorithmException exception0) {
            bxly bxly1 = new bxly();
            bxly1.a = 8;
            bxly1.c = exception0;
            bxly1.b = "Unable to decode the key pair.";
            throw bxly1.a();
        }
    }

    public final List e(String s) {
        gftb.z(s, "rpId cannot be null");
        List list0 = new ArrayList();
        try(Cursor cursor0 = this.f.getReadableDatabase().query("registered_credentials", null, a.a(s, "id LIKE \'%", "\'"), null, null, null, null)) {
            try {
                cursor0.moveToFirst();
                while(true) {
                    if(cursor0.isAfterLast()) {
                        break;
                    }
                    list0.add(new bnaz(cursor0));
                    cursor0.moveToNext();
                }
                return list0;
            }
            catch(ParseException parseException0) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.c = parseException0;
                bxly0.b = "Unable to parse the key data.";
                throw bxly0.a();
            }
        }
    }

    public final void f(String s) {
        gftb.z(s, "discoverableCredentialKeyHandle cannot be null");
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        int v = FIN.finallyOpen$NT();
        if(sQLiteDatabase0.delete("device_bound_key_map", "discoverable_credential_id = ?", new String[]{s}) == 1) {
            sQLiteDatabase0.setTransactionSuccessful();
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        bxly bxly0 = new bxly();
        bxly0.a = 8;
        bxly0.b = "Error deleting key information from SQLite database";
        throw bxly0.a();
    }

    public final void g(String s) {
        SQLiteDatabase sQLiteDatabase0 = this.a();
        sQLiteDatabase0.beginTransaction();
        int v = FIN.finallyOpen$NT();
        String[] arr_s = {s};
        if(sQLiteDatabase0.delete("registered_credentials", "id = ?", arr_s) == 1) {
            sQLiteDatabase0.delete("usages", "id = ?", arr_s);
            sQLiteDatabase0.setTransactionSuccessful();
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        bxly bxly0 = new bxly();
        bxly0.a = 8;
        bxly0.b = "Error deleting key information from SQLite database";
        throw bxly0.a();
    }

    public final void h(String s, Date date0, gfsx gfsx0, boolean z) {
        byte[] arr_b;
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("id", s);
        contentValues0.put("registration_time", new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS", Locale.US).format(date0));
        contentValues0.put("counter", Integer.valueOf(0));
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            try {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(new hhro(new hhrn(1L), hhrs.k(((KeyPair)object0).getPrivate().getEncoded())));
                arrayList0.add(new hhro(new hhrn(2L), hhrs.k(((KeyPair)object0).getPublic().getEncoded())));
                arr_b = hhrs.n(arrayList0).s();
            }
            catch(hhrh | hhrm exception0) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.c = exception0;
                bxly0.b = "Unable to encode key pair.";
                throw bxly0.a();
            }
        }
        else {
            arr_b = null;
        }
        contentValues0.put("key_data", arr_b);
        if(hswf.c()) {
            contentValues0.put("payments_support", Integer.valueOf(((int)z)));
        }
        if(this.a().insert("registered_credentials", null, contentValues0) != -1L) {
            return;
        }
        bxly bxly1 = new bxly();
        bxly1.a = 8;
        bxly1.b = "Error storing key information into SQLite database";
        throw bxly1.a();
    }
}

