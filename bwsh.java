import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

public abstract class bwsh extends bwse {
    private bwsg a;
    private final int b;

    protected bwsh(int v, int v1) {
        super(v);
        this.b = v1;
    }

    @Override  // bwse
    public final void d(bwqt bwqt0, bwud bwud0, bwmx bwmx0) {
        bwsg bwsg0 = this.a;
        if(bwsg0 == null) {
            return;
        }
        Set set0 = bwsg0.b;
        Set set1 = bwsg0.a;
        if(!set0.isEmpty() && !set1.isEmpty()) {
            HashSet hashSet0 = new HashSet(set1);
            hashSet0.removeAll(set0);
            set1 = hashSet0;
        }
        bwqt0.p(set0, bwud0, bwmx0, this.b);
        bwqt0.n(set1, bwud0, bwmx0, this.b);
    }

    @Override  // bwse
    public void e(bwmx bwmx0) {
    }

    @Override  // bwsi
    public final void f(Context context0, SQLiteDatabase sQLiteDatabase0, bwqt bwqt0, bwud bwud0, bwtc bwtc0) {
        this.a = this.g(sQLiteDatabase0, bwqt0, bwud0, bwtc0);
    }

    public abstract bwsg g(SQLiteDatabase arg1, bwqt arg2, bwud arg3, bwtc arg4);
}

