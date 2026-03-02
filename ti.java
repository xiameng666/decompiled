import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public final class ti {
    final RecyclerView a;

    public ti(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        super();
    }

    public final uq a(int v) {
        RecyclerView recyclerView0 = this.a;
        uq uq0 = recyclerView0.n(v, true);
        if(uq0 == null) {
            return null;
        }
        return recyclerView0.g.k(uq0.a) ? null : uq0;
    }

    final void b(ot ot0) {
        switch(ot0.a) {
            case 1: {
                this.a.n.x(ot0.b, ot0.d);
                return;
            }
            case 2: {
                this.a.n.A(ot0.b, ot0.d);
                return;
            }
            case 4: {
                this.a.n.B(ot0.b, ot0.d);
                return;
            }
            case 8: {
                this.a.n.z(ot0.b, ot0.d);
            }
        }
    }

    public final void c(int v, int v1, Object object0) {
        RecyclerView recyclerView0 = this.a;
        int v2 = recyclerView0.g.b();
        for(int v3 = 0; true; ++v3) {
            int v4 = v + v1;
            if(v3 >= v2) {
                break;
            }
            View view0 = recyclerView0.g.e(v3);
            uq uq0 = RecyclerView.p(view0);
            if(uq0 != null && !uq0.A() && (uq0.c >= v && uq0.c < v4)) {
                uq0.f(2);
                uq0.e(object0);
                ((ty)view0.getLayoutParams()).e = true;
            }
        }
        uf uf0 = recyclerView0.d;
        ArrayList arrayList0 = uf0.c;
        int v5 = arrayList0.size();
        while(true) {
            --v5;
            if(v5 < 0) {
                break;
            }
            uq uq1 = (uq)arrayList0.get(v5);
            if(uq1 != null && (uq1.c >= v && uq1.c < v4)) {
                uq1.f(2);
                uf0.k(v5);
            }
        }
        recyclerView0.Q = true;
    }

    public final void d(int v, int v1) {
        RecyclerView recyclerView0 = this.a;
        int v2 = recyclerView0.g.b();
        for(int v3 = 0; v3 < v2; ++v3) {
            uq uq0 = RecyclerView.p(recyclerView0.g.e(v3));
            if(uq0 != null && !uq0.A() && uq0.c >= v) {
                uq0.k(v1, false);
                recyclerView0.N.f = true;
            }
        }
        ArrayList arrayList0 = recyclerView0.d.c;
        int v4 = arrayList0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            uq uq1 = (uq)arrayList0.get(v5);
            if(uq1 != null && uq1.c >= v) {
                uq1.k(v1, false);
            }
        }
        recyclerView0.requestLayout();
        recyclerView0.P = true;
    }

    public final void e(int v, int v1) {
        RecyclerView recyclerView0 = this.a;
        int v2 = recyclerView0.g.b();
        for(int v3 = 0; true; ++v3) {
            int v4 = -1;
            if(v3 >= v2) {
                break;
            }
            uq uq0 = RecyclerView.p(recyclerView0.g.e(v3));
            if(uq0 != null) {
                int v5 = uq0.c;
                if(v5 >= (v >= v1 ? v1 : v) && v5 <= (v >= v1 ? v : v1)) {
                    if(v5 == v) {
                        uq0.k(v1 - v, false);
                    }
                    else {
                        if(v >= v1) {
                            v4 = 1;
                        }
                        uq0.k(v4, false);
                    }
                    recyclerView0.N.f = true;
                }
            }
        }
        ArrayList arrayList0 = recyclerView0.d.c;
        int v6 = arrayList0.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            uq uq1 = (uq)arrayList0.get(v7);
            if(uq1 != null) {
                int v8 = uq1.c;
                if(v8 >= (v >= v1 ? v1 : v) && v8 <= (v >= v1 ? v : v1)) {
                    if(v8 == v) {
                        uq1.k(v1 - v, false);
                    }
                    else {
                        uq1.k((v >= v1 ? 1 : -1), false);
                    }
                }
            }
        }
        recyclerView0.requestLayout();
        recyclerView0.P = true;
    }

    public final void f(int v, int v1) {
        this.a.Z(v, v1, true);
        this.a.P = true;
        this.a.N.c += v1;
    }
}

