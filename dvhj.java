import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.security.GeneralSecurityException;

public final class dvhj {
    public static final bboh a;
    public static final String b;
    public static final String c;
    public static final String d;
    public final Context e;
    public final String f;
    public final String g;
    public final eaqx h;

    static {
        dvhj.a = bboh.b("Pay", bbcu.cZ);
        dvhj.b = String.format("%s=? AND %s=?", "account_id", "environment");
        dvhj.c = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "parent_valuable_id");
        dvhj.d = String.format("%s=? AND %s=? AND %s=? AND %s=?", "account_id", "environment", "parent_valuable_id", "linked_valuable_id");
    }

    public dvhj(Context context0, String s, String s1, eaqx eaqx0) {
        this.e = context0;
        this.f = s;
        this.g = s1;
        this.h = eaqx0;
    }

    public final void a(SQLiteDatabase sQLiteDatabase0, String s) {
        sQLiteDatabase0.delete("LinkedValuable", dvhj.c, new String[]{this.f, this.g, s});
    }

    public final void b(String s, Iterable iterable0) {
        eaqw eaqw0 = this.h.a();
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.e).c();
        sQLiteDatabase0.beginTransaction();
        try {
            this.a(sQLiteDatabase0, s);
            ggqk ggqk0 = ((gged_interceptors)iterable0).E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                Valuable valuable0 = (Valuable)object0;
                ContentValues contentValues0 = new ContentValues();
                try {
                    Pair pair0 = eaqw0.a(valuable0.a.toBytesArray());
                    contentValues0.put("encrypted_filename", ((String)pair0.first));
                    contentValues0.put("encrypted_proto_bytes", ((byte[])pair0.second));
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    a.ae(dvhj.a.i(), "Failed to encrypt linked valuable using Android KeyStore.", generalSecurityException0);
                    contentValues0.remove("encrypted_filename");
                    contentValues0.remove("encrypted_proto_bytes");
                }
                try {
                    contentValues0.put("proto_bytes", eaqw0.f(valuable0.a.toBytesArray()));
                }
                catch(earn earn0) {
                    if(!contentValues0.containsKey("encrypted_filename") || !contentValues0.containsKey("encrypted_proto_bytes")) {
                        throw new eaqz("Failed to encrypt linked valuable using Android KeyStore and storage key. No way to store linked valuable.", earn0);
                    }
                    a.ae(dvhj.a.h(), "Failed to backfill linkedValuable proto bytes using the storage key.", earn0);
                    contentValues0.put("proto_bytes", new byte[0]);
                }
                contentValues0.put("account_id", this.f);
                contentValues0.put("environment", this.g);
                contentValues0.put("parent_valuable_id", s);
                String s1 = valuable0.b;
                contentValues0.put("linked_valuable_id", s1);
                contentValues0.put("sort_key", valuable0.s);
                if(sQLiteDatabase0.insertOrThrow("LinkedValuable", null, contentValues0) == -1L) {
                    throw new dmhl(new SQLiteException(String.format("Failed to insert linked pass into database. Parent valuable ID: %s Linked pass ID: %s", s, s1)));
                }
            }
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }
}

