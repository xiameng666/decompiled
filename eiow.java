import android.database.sqlite.SQLiteException;

public final class eiow {
    private static final bboh a;
    private static final Object b;
    private static long c;

    static {
        eiow.a = bboh.b("HeterodyneConfigVersion", bbcu.al);
        eiow.b = new Object();
        eiow.c = 0L;
    }

    public static long a(eiox eiox0) {
        synchronized(eiow.b) {
            long v1 = eiow.c;
            if(v1 != 0L) {
                return v1;
            }
            try {
                eiog eiog0 = eiox0.a().a();
                eiow.c = -1L;
                eiog0.close();
            }
            catch(SQLiteException sQLiteException0) {
                eiow.c = -1L;
                ((ggtj)((ggtj)eiow.a.i()).s(sQLiteException0)).B("Error getting Heterodyne serving version: %s", sQLiteException0);
            }
        }
        return eiow.c;
    }

    public static void b() {
        synchronized(eiow.b) {
            eiow.c = 0L;
        }
    }
}

