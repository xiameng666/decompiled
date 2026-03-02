import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import jeb.synthetic.TWR;

public final class egyq {
    private final Context a;

    public egyq(Context context0) {
        this.a = context0;
    }

    public final int a(Uri uri0, String s) {
        ContentResolver contentResolver0 = this.a.getContentResolver();
        try(Cursor cursor0 = contentResolver0.query(uri0, new String[]{"_count"}, s, null, null)) {
            if(cursor0 != null) {
                if(cursor0.moveToLast()) {
                    return cursor0.getInt(0);
                }
                throw new cjuh(13, "Failed to operate Cursor.moveToLast()");
            }
            TWR.useResource$NT(null);
            throw new cjuh(13, "Failed to query contact count: NULL cursor");
        }
        catch(SecurityException securityException0) {
            throw new cjuh(13, "Failed to query contact count: SecurityException: " + securityException0.getMessage());
        }
    }

    public final int b() {
        return this.i(this.j());
    }

    public final int c(String s) {
        return this.a(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", s).appendQueryParameter("account_type", "com.google").build(), "dirty = 1 AND deleted = 0");
    }

    public final int d(String s) {
        return this.a(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", s).appendQueryParameter("account_type", "com.google").build(), "deleted = 0");
    }

    public final int e(String s) {
        return this.a(ContactsContract.RawContacts.CONTENT_URI, String.format("((%s) AND deleted = 0)", s));
    }

    public final int f() {
        return this.i(String.format(("(" + this.j() + ") AND (%s)"), "NOT ((sourceid = _id OR sourceid IS NULL ) AND sync1 IS NULL AND sync2 IS NULL AND sync3 IS NULL AND sync4 IS NULL ) "));
    }

    public final int g() {
        int v = this.b();
        egyq.k();
        int v1 = this.f();
        if(egyq.h(v, v1)) {
            if(egyq.k()) {
                return v;
            }
            return v <= v1 ? 0 : v - v1;
        }
        return 0;
    }

    public static boolean h(int v, int v1) {
        return Long.compare(v1, hxba.a.e().c()) <= 0 ? !(((double)v1) > ((double)v) * hxba.a.e().a()) : false;
    }

    private final int i(String s) {
        return this.a(ContactsContract.RawContacts.CONTENT_URI, s);
    }

    private final String j() {
        efpm efpm0 = efpb.c(this.a).e(EnumSet.of(efpa.f));
        EnumSet enumSet0 = EnumSet.of(efoy.d);
        EnumSet enumSet1 = EnumSet.of(efpa.f);
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(int v = 0; true; ++v) {
            efow efow0 = efpm0.a;
            if(v >= efow0.b.size()) {
                break;
            }
            efov efov0 = (efov)efow0.b.get(v);
            if(enumSet0.contains((efoy.b(efov0.b) == null ? efoy.a : efoy.b(efov0.b))) && enumSet1.contains((efpa.b(efov0.h) == null ? efpa.a : efpa.b(efov0.h)))) {
                arrayList0.clear();
                arrayList0.addAll(((Collection)efpm0.b.get(v)));
                arrayList0.removeAll(((Collection)efpm0.c.get(v)));
                hashSet0.addAll(arrayList0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(hxba.x()) {
            stringBuilder0.append("(data_set IS NULL) AND ");
        }
        stringBuilder0.append("(deleted = 0) AND ((account_name IS NULL AND account_type IS NULL) OR (account_type IN ( ");
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: hashSet0) {
            arrayList1.add(DatabaseUtils.sqlEscapeString(((String)object0)));
        }
        stringBuilder0.append(TextUtils.join(",", arrayList1));
        stringBuilder0.append(")))");
        return stringBuilder0.toString();
    }

    private static boolean k() {
        return !hxba.z();
    }
}

