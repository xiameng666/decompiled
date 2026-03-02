import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class dvih {
    public static final bboh a;
    public static final String b;
    public final Context c;
    public final String d;
    public final String e;
    private static final String f;

    static {
        dvih.a = bboh.b("Pay", bbcu.cZ);
        dvih.b = String.format("%s=? AND %s=? ", "account_id", "environment");
        dvih.f = String.format("%s=? AND %s=? AND %s=?", "account_id", "environment", "row_id");
    }

    public dvih(Context context0, String s, String s1) {
        this.c = context0;
        this.d = s;
        this.e = s1;
    }

    public final void a(SQLiteDatabase sQLiteDatabase0, int v) {
        sQLiteDatabase0.delete("SmartTapInsertRequest", dvih.f, new String[]{this.d, this.e, Integer.toString(v)});
    }
}

