import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.TimingLogger;
import j..util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class fduz extends fduv {
    final fdvl a;
    private final fdpl b;
    private final String c;
    private final String d;
    private final boolean e;
    private int f;
    private ArrayList g;
    private boolean h;

    public fduz(fdvl fdvl0, fdpl fdpl0, Exception exception0) {
        Objects.requireNonNull(fdvl0);
        this.a = fdvl0;
        super();
        this.b = fdpl0;
        this.e = false;
        this.c = null;
        this.d = null;
        this.r(exception0);
    }

    public fduz(fdvl fdvl0, fdpl fdpl0, String s, String s1, boolean z) {
        Objects.requireNonNull(fdvl0);
        this.a = fdvl0;
        super();
        batl.s(fdpl0);
        this.b = fdpl0;
        this.c = s;
        this.d = s1;
        this.e = z;
    }

    @Override  // fduv
    protected final void c(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0, LinkedHashMap linkedHashMap0) {
        this.a.k.incrementAndGet();
        if(!this.h) {
            this.q(new fdva(this.f));
        }
        ArrayList arrayList0 = this.g;
        batl.s(arrayList0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            fduz.e(linkedHashMap0, fduq0);
            fdvl.aj(2, 4, fduq0);
        }
    }

    @Override  // fduv
    protected final boolean d(TimingLogger timingLogger0, SQLiteDatabase sQLiteDatabase0) {
        Cursor cursor0 = fdvl.ad(sQLiteDatabase0, this.b, this.c, this.d, false, null, this.e, "100");
        int v = cursor0.getCount();
        timingLogger0.addSplit("getDataItemsByHostAndPath");
        ArrayList arrayList0 = this.a.y(sQLiteDatabase0, cursor0);
        this.g = arrayList0;
        timingLogger0.addSplit("deleteDataItemsByCursorCloseAndNotify");
        this.f += arrayList0.size();
        this.h = v >= 100;
        return v >= 100;
    }
}

