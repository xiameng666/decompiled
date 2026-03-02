import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j..util.Objects;

public final class fduy implements ffmj {
    final fdvl a;

    public fduy(fdvl fdvl0) {
        Objects.requireNonNull(fdvl0);
        this.a = fdvl0;
        super();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.a.c.getReadableDatabase();
        bbpd0.b();
        bbpd0.printf("%24s %12s %8s %22s\n", new Object[]{"nodeId", "from", "seqId", "lastActivity"});
        try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM nodeinfo ORDER BY node", null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                String s = cursor0.getString(0);
                String s1 = cursor0.getString(3);
                v = cursor0.isNull(1) ? -1L : cursor0.getLong(1);
                long v1 = cursor0.getLong(2);
                bbpd0.printf("%24s %12s %8s %22s (%d)\n", new Object[]{s, s1, v, ffmi.b(v1), v1});
            }
        }
        bbpd0.a();
    }
}

