import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public final class aijx {
    public static final baun a;
    private static aijx b;
    private final aijw c;

    static {
        aijx.a = new baun(new String[]{"aijx"});
    }

    private aijx(Context context0) {
        aijw aijw0 = new aijw(context0);
        super();
        this.c = aijw0;
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase0;
        synchronized(this) {
            try {
                boolean z = hpqr.a.b().a();
                sQLiteDatabase0 = bxlg.a(this.c, "auth.proximity.permit_store", z);
            }
            catch(SQLiteException sQLiteException0) {
                throw new aijy(sQLiteException0);
            }
        }
        return sQLiteDatabase0;
    }

    public static aijx b(Context context0) {
        synchronized(aijx.class) {
            if(aijx.b == null) {
                aijx.b = new aijx(context0.getApplicationContext());
            }
        }
        return aijx.b;
    }
}

