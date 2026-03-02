import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class dvim {
    public static final bboh a;
    public static final String b;
    public final Context c;
    public final String d;
    public final String e;

    static {
        dvim.a = bboh.b("Pay", bbcu.cZ);
        dvim.b = String.format("%s=? AND %s=?", "account_id", "environment");
    }

    public dvim(Context context0, String s, String s1) {
        this.c = context0;
        this.d = s;
        this.e = s1;
    }

    final void a(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.delete("SmartTapOverride", dvim.b, new String[]{this.d, this.e});
    }
}

