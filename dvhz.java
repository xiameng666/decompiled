import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class dvhz {
    public static final bboh a;
    public final Context b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final String f;
    private final String g;

    static {
        dvhz.a = bboh.b("Pay", bbcu.cZ);
        String s = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "valuable_id");
        dvhz.c = s;
        dvhz.d = s + String.format("AND %s>? AND %s<?", "time_millis", "time_millis");
        dvhz.e = s + String.format("AND %s<=?", "time_millis");
    }

    public dvhz(Context context0, String s, String s1) {
        this.b = context0;
        this.f = s;
        this.g = s1;
    }

    public final ContentValues a(String s, long v, String s1) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("account_id", this.f);
        contentValues0.put("environment", this.g);
        contentValues0.put("valuable_id", s);
        contentValues0.put("time_millis", Long.valueOf(v));
        contentValues0.put("encoded_value", s1);
        return contentValues0;
    }

    public final gvct b(String s, long v, long v1) {
        gfsx gfsx0;
        gvcr gvcr0;
        SQLiteDatabase sQLiteDatabase0;
        sQLiteDatabase0 = dmhk.d(this.b).c();
        gvcr0 = (gvcr)((ProtoLiteMessage)gvct.a).v_newBuilder();
        try(Cursor cursor0 = sQLiteDatabase0.query("PredefinedRotatingBarcodeValues", new String[]{"time_millis", "encoded_value"}, dvhz.e, new String[]{this.f, this.g, s, String.valueOf(v)}, null, null, "time_millis DESC", "1")) {
            gfsx0 = cursor0.moveToNext() ? gfsx.m(dvhz.d(cursor0)) : gfqx.a;
        }
        if(gfsx0.i()) {
            gvcr0.a(((gvcs)gfsx0.d()));
        }
        try(Cursor cursor1 = sQLiteDatabase0.query("PredefinedRotatingBarcodeValues", new String[]{"time_millis", "encoded_value"}, dvhz.d, new String[]{this.f, this.g, s, String.valueOf(v), String.valueOf(v1)}, null, null, "time_millis ASC")) {
            while(true) {
                if(!cursor1.moveToNext()) {
                    break;
                }
                gvcr0.a(dvhz.d(cursor1));
            }
        }
        return (gvct)((ProtoLiteBuilder)gvcr0).N_build();
    }

    public final void c(SQLiteDatabase sQLiteDatabase0, String s) {
        sQLiteDatabase0.delete("PredefinedRotatingBarcodeValues", dvhz.c, new String[]{this.f, this.g, s});
    }

    private static gvcs d(Cursor cursor0) {
        long v = cursor0.getLong(cursor0.getColumnIndexOrThrow("time_millis"));
        String s = cursor0.getString(cursor0.getColumnIndexOrThrow("encoded_value"));
        batl.s(s);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvcs.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvcs)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvcs)hftp0.b_message).b = s;
        return (gvcs)hftp0.N_build();
    }
}

