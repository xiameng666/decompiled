import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.TimingLogger;
import j..util.Objects;
import java.util.LinkedHashMap;

public final class fdve extends fduv {
    final fdvl a;
    private final fdpl b;
    private final String c;
    private final String d;
    private final long e;
    private fduq f;

    public fdve(fdvl fdvl0, fdpl fdpl0, String s, String s1, long v) {
        Objects.requireNonNull(fdvl0);
        this.a = fdvl0;
        super();
        this.b = fdpl0;
        this.c = s;
        this.d = s1;
        this.e = v;
    }

    @Override  // fduv
    protected final void c(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0, LinkedHashMap linkedHashMap0) {
        fduq fduq0 = this.f;
        if(fduq0 != null) {
            this.q(new fdvi(fduq0, null, null));
            fduq fduq1 = this.f;
            batl.s(fduq1);
            fdve.e(linkedHashMap0, fduq1);
        }
    }

    @Override  // fduv
    protected final boolean d(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0) {
        fduq fduq1;
        String s;
        fduq fduq0 = null;
        ffmn.e("DataItems", "RevSequenceIdDataItemFuture: - doInTransactionWork - appKey: %s, host: %s, path: %s, seqId: %s", new Object[]{this.b, this.c, this.d, ((long)this.e)});
        try(Cursor cursor0 = fdvl.ak(sQLiteDatabase0, this.b, this.c, this.d, true, null, false)) {
            if(cursor0.moveToFirst()) {
                s = fdur.i(cursor0);
                fduq1 = fdur.f(cursor0);
            }
            else {
                s = null;
                fduq1 = null;
            }
        }
        if(fduq1 != null) {
            if(this.e != fduq1.f) {
                ffmn.e("DataItems", "RevSequenceIdDataItemFuture: - The current seqId does not equal the request seqId.", new Object[0]);
                return false;
            }
            fdvl fdvl0 = this.a;
            fdvl0.F(fduq1);
            if(fduq1.f != -1L) {
                fdvl0.U(sQLiteDatabase0, fduq1);
            }
            int v = sQLiteDatabase0.update("dataitems", fdur.a(fduq1), "_id =?", new String[]{s});
            if(v > 0) {
                fduq0 = fduq1;
            }
            else if(v == -1) {
                ffmn.b("DataItems", "forceUpdateExistingDataItemLocked - Failed to update data item: %s", new Object[]{s});
            }
            this.f = fduq0;
            if(fduq0 == null) {
                ffmn.e("DataItems", "RevSequenceIdDataItemFuture: - Update was attempted but failed.", new Object[0]);
            }
            return false;
        }
        ffmn.e("DataItems", "RevSequenceIdDataItemFuture: - DataItem not found", new Object[0]);
        return false;
    }
}

