import android.database.sqlite.SQLiteDatabase;

public final class dvii {
    public static final bboh a;

    static {
        dvii.a = bboh.b("Pay", bbcu.cZ);
    }

    public static final boolean a(Iterable iterable0, dvih dvih0) {
        try {
            SQLiteDatabase sQLiteDatabase0 = dmhk.d(dvih0.c).c();
            sQLiteDatabase0.beginTransaction();
            try {
                for(Object object0: iterable0) {
                    dvih0.a(sQLiteDatabase0, ((dvij)object0).a);
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            return true;
        }
        catch(dmhl dmhl0) {
            a.ae(dvii.a.i(), "Failed to delete smart tap insert requests.", dmhl0);
            return false;
        }
    }
}

