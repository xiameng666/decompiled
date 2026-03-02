import android.util.Pair;
import androidx.core.widget.NestedScrollView;

public final class dvxu implements kij {
    public final dvxv a;
    public final xob b;
    public final int c;
    public final int d;
    public final int e;

    public dvxu(dvxv dvxv0, xob xob0, int v, int v1, int v2) {
        this.a = dvxv0;
        this.b = xob0;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    @Override  // kij
    public final void a(NestedScrollView nestedScrollView0, int v, int v1) {
        dvxv dvxv0 = this.a;
        dvxv0.p(this.b, nestedScrollView0, this.c, this.d);
        int v2 = this.e;
        if(dvxv0.b == v2) {
            dvxv0.c = v;
            ggqk ggqk0 = ((gged_interceptors)dvxv0.u()).E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                Pair pair0 = (Pair)object0;
                if(((int)(((Integer)pair0.first))) != v2) {
                    ((dvuz)pair0.second).setScrollY(v);
                }
            }
        }
    }
}

