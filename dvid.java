import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.security.SecureRandom;

public final class dvid {
    public static final bboh a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public final Context f;
    public final String g;
    public final String h;
    public final SecureRandom i;
    private static final String j;
    private static final String k;
    private static final String l;

    static {
        dvid.a = bboh.b("Pay", bbcu.cZ);
        dvid.b = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "valuable_id");
        dvid.j = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "service_id");
        String s = String.format("%s=? AND %s=?", "account_id", "environment");
        dvid.k = s;
        dvid.c = String.format("%s DESC ", "row_id");
        dvid.d = String.format("SELECT %s, COUNT(%s) as count FROM %s WHERE %s GROUP BY %s", "valuable_id", "row_id", "SmartTapHistory", s, "valuable_id");
        String s1 = String.format("SELECT %s, MAX(%s) as row_id FROM %s WHERE %s GROUP BY %s", "valuable_id", "row_id", "SmartTapHistory", s, "valuable_id");
        dvid.l = s1;
        dvid.e = String.format("SELECT a.%s, a.%s, a.%s as history_proto FROM %s a INNER JOIN (%s) b ON a.%s = b.%s AND a.%s = b.%s", "valuable_id", "row_id", "history_proto", "SmartTapHistory", s1, "valuable_id", "valuable_id", "row_id", "row_id");
    }

    public dvid(Context context0, String s, String s1) {
        this.f = context0;
        this.g = s;
        this.h = s1;
        this.i = new SecureRandom();
    }

    public final gvav a(byte[] arr_b) {
        SQLiteDatabase sQLiteDatabase0 = dmhk.d(this.f).c();
        String s = dvid.c(ByteString.copyFrom(arr_b));
        try(Cursor cursor0 = sQLiteDatabase0.query("SmartTapHistory", new String[]{"history_proto"}, dvid.j, new String[]{this.g, this.h, s}, null, null, null)) {
            if(cursor0.moveToNext()) {
                return dvid.b(dvid.d(cursor0));
            }
            ((ggtj)dvid.a.h()).B("No matching smart tap event found. Service ID: %s", arr_b);
        }
        return null;
    }

    public static gvav b(byte[] arr_b) {
        if(arr_b == null) {
            ((ggtj)dvid.a.i()).x("SmartTapEvent proto bytes were null.");
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gvav.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (gvav)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(dvid.a.i(), "Failed to parse SmartTapEvent.", hfur0);
            return null;
        }
    }

    public static String c(ByteString hfsf0) {
        return Base64.encodeToString(hfsf0.toByteArray(), 0);
    }

    public static byte[] d(Cursor cursor0) {
        int v = cursor0.getColumnIndex("history_proto");
        if(v == -1) {
            ((ggtj)dvid.a.i()).x("Cursor is not valid for this operation!");
            return null;
        }
        return cursor0.getBlob(v);
    }
}

