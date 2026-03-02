import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

abstract class bwsf extends bwse {
    private Set a;

    protected bwsf() {
        super(0);
        this.a = null;
    }

    @Override  // bwse
    public final void d(bwqt bwqt0, bwud bwud0, bwmx bwmx0) {
        Set set0 = this.a;
        if(set0 != null) {
            String s = bwud0.e;
            for(Object object0: set0) {
                bwqq bwqq0 = new bwqq(bwqt0, gltq.s, s, bwmx0, s, ((bwsa)object0));
                bwmx0.c.h(bwqq0);
                bwqq0.v();
            }
        }
    }

    @Override  // bwsi
    public final void f(Context context0, SQLiteDatabase sQLiteDatabase0, bwqt bwqt0, bwud bwud0, bwtc bwtc0) {
        this.a = this.g(sQLiteDatabase0, bwud0, bwtc0);
    }

    protected abstract Set g(SQLiteDatabase arg1, bwud arg2, bwtc arg3);
}

