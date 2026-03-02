import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public final class dmtn {
    public static final bboh a;
    public static final String b;
    public final Context c;
    private static final String d;
    private final String e;
    private final String f;
    private final earj g;

    static {
        dmtn.a = bboh.b("Pay", bbcu.cZ);
        dmtn.d = String.format("%s=? AND %s=? AND %s IS NULL", "account_id", "environment", "wear_android_id");
        dmtn.b = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "wear_android_id");
    }

    public dmtn(Context context0, String s, String s1, earj earj0) {
        this.c = context0;
        this.e = s;
        this.f = s1;
        this.g = earj0;
    }

    public final gged_interceptors a(Cursor cursor0) {
        hkhr hkhr0;
        byte[] arr_b1;
        ggdy ggdy0 = new ggdy();
        while(cursor0.moveToNext()) {
            String s = cursor0.getString(cursor0.getColumnIndexOrThrow("client_stable_id"));
            batl.s(s);
            byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndexOrThrow("encrypted_payment_method"));
            Object object0 = null;
            if(arr_b != null && arr_b.length > 0) {
                try {
                    arr_b1 = this.g.b(arr_b);
                }
                catch(earn | dmhl exception0) {
                    a.ae(dmtn.a.i(), "Failed to encrypt", exception0);
                    goto label_29;
                }
            }
            else {
                arr_b1 = null;
            }
            if(arr_b1 != null && arr_b1.length > 0) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hkhr.b), arr_b1, 0, arr_b1.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    hkhr0 = (hkhr)hftv0;
                }
                catch(hfur hfur0) {
                    a.ae(dmtn.a.i(), "Invalid proto for payment method after decryption", hfur0);
                    goto label_21;
                }
            }
            else {
                try {
                label_21:
                    byte[] arr_b2 = cursor0.getBlob(cursor0.getColumnIndexOrThrow("payment_method"));
                    hftc hftc1 = hftc.a();
                    ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hkhr.b), arr_b2, 0, arr_b2.length, hftc1);
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    hkhr0 = (hkhr)hftv1;
                    goto label_30;
                }
                catch(hfur hfur1) {
                    a.ae(dmtn.a.i(), "Invalid proto for payment method in unencrypted column", hfur1);
                }
            label_29:
                hkhr0 = null;
            }
        label_30:
            if(hkhr0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dxes.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((dxes)hftv2).d = s;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((dxes)hftp0.b_message).c = hkhr0;
                ((dxes)hftp0.b_message).b |= 1;
                object0 = (dxes)hftp0.N_build();
            }
            if(object0 == null) {
                ((ggtj)dmtn.a.i()).x("Failed to parse payment method cache data, skipping this row.");
            }
            else {
                ggdy0.i(object0);
            }
        }
        return ggdy0.h();
    }

    final gged_interceptors b() {
        try(Cursor cursor0 = dmhk.d(this.c).c().query("PaymentMethods", new String[]{"client_stable_id", "payment_method", "encrypted_payment_method"}, dmtn.d, this.g(), null, null, null)) {
            return this.a(cursor0);
        }
        catch(dmhl dmhl0) {
            a.ae(dmtn.a.i(), "getPaymentMethodCacheData failed", dmhl0);
            return ggna.a;
        }
    }

    public final String[] c(long v) {
        return new String[]{this.e, this.f, Long.toString(v)};
    }

    final void d(gged_interceptors gged0) {
        try {
            SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.c).c();
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.delete("PaymentMethods", dmtn.d, this.g());
                ggqk ggqk0 = gged0.E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    ContentValues contentValues0 = new ContentValues(4);
                    contentValues0.put("account_id", this.e);
                    contentValues0.put("environment", this.f);
                    contentValues0.put("client_stable_id", ((dxes)object0).d);
                    hkhr hkhr0 = ((dxes)object0).c;
                    if(hkhr0 == null) {
                        hkhr0 = hkhr.b;
                    }
                    this.f(contentValues0, hkhr0);
                    sQLiteDatabase0.insertOrThrow("PaymentMethods", null, contentValues0);
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
        }
        catch(SQLException | dmhl exception0) {
            a.ae(dmtn.a.i(), "setPaymentMethodCacheData failed", exception0);
        }
    }

    final void e(gged_interceptors gged0, long v) {
        try {
            SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.c).c();
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.delete("PaymentMethods", dmtn.b, this.c(v));
                ggqk ggqk0 = gged0.E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    ContentValues contentValues0 = new ContentValues(5);
                    contentValues0.put("account_id", this.e);
                    contentValues0.put("environment", this.f);
                    contentValues0.put("client_stable_id", ((dxes)object0).d);
                    contentValues0.put("wear_android_id", Long.toString(v));
                    hkhr hkhr0 = ((dxes)object0).c;
                    if(hkhr0 == null) {
                        hkhr0 = hkhr.b;
                    }
                    this.f(contentValues0, hkhr0);
                    sQLiteDatabase0.insertOrThrow("PaymentMethods", null, contentValues0);
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
        }
        catch(SQLException | dmhl exception0) {
            a.ae(dmtn.a.i(), "setPaymentMethodCacheData failed", exception0);
        }
    }

    private final void f(ContentValues contentValues0, hkhr hkhr0) {
        byte[] arr_b;
        if(earj.a()) {
            try {
                arr_b = new byte[0];
                byte[] arr_b1 = hkhr0.toBytesArray();
                arr_b = this.g.c(arr_b1);
            }
            catch(dmhl | earn exception0) {
                a.ae(dmtn.a.i(), "Failed to encrypted payment method proto", exception0);
            }
            if(arr_b.length > 0) {
                contentValues0.put("encrypted_payment_method", arr_b);
                contentValues0.put("payment_method", new byte[0]);
                return;
            }
            contentValues0.put("payment_method", hkhr0.toBytesArray());
            return;
        }
        contentValues0.put("payment_method", hkhr0.toBytesArray());
    }

    private final String[] g() {
        return new String[]{this.e, this.f};
    }
}

