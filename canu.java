import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import j..util.Objects;

final class canu implements evqf {
    final gmcu a;
    final Integer b;
    final canx c;

    public canu(canx canx0, gmcu gmcu0, Integer integer0) {
        this.a = gmcu0;
        this.b = integer0;
        Objects.requireNonNull(canx0);
        this.c = canx0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        SQLiteDatabase sQLiteDatabase0;
        Void void0 = (Void)object0;
        this.a.q(Boolean.valueOf(true));
        canx canx0 = this.c;
        if(canx0.c()) {
            try {
                sQLiteDatabase0 = canx0.d.b.getWritableDatabase();
            }
            catch(SQLiteException unused_ex) {
                return;
            }
            sQLiteDatabase0.beginTransaction();
            try {
                sQLiteDatabase0.delete("IntermediateStore", "MEDIA_TYPE=?", new String[]{this.b.toString()});
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
        }
    }
}

