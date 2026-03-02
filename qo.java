import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public final class qo {
    public final qn a;
    public final List b;
    public int c;
    public View d;
    public final th e;

    public qo(th th0) {
        this.c = 0;
        this.e = th0;
        this.a = new qn();
        this.b = new ArrayList();
    }

    public final int a() {
        return this.e.a() - this.b.size();
    }

    public final int b() {
        return this.e.a();
    }

    final int c(View view0) {
        int v = this.e.b(view0);
        if(v != -1) {
            return this.a.f(v) ? -1 : v - this.a.a(v);
        }
        return -1;
    }

    public final View d(int v) {
        int v1 = this.m(v);
        return this.e.c(v1);
    }

    public final View e(int v) {
        return this.e.c(v);
    }

    public final void f(View view0, int v, boolean z) {
        int v1 = v >= 0 ? this.m(v) : this.e.a();
        this.a.c(v1, z);
        if(z) {
            this.i(view0);
        }
        RecyclerView recyclerView0 = this.e.a;
        recyclerView0.addView(view0, v1);
        uq uq0 = RecyclerView.p(view0);
        tk tk0 = recyclerView0.m;
        if(tk0 != null && uq0 != null) {
            tk0.j(uq0);
        }
        List list0 = recyclerView0.w;
        if(list0 != null) {
            int v2 = list0.size();
            while(true) {
                --v2;
                if(v2 < 0) {
                    break;
                }
                ((tz)recyclerView0.w.get(v2)).c(view0);
            }
        }
    }

    public final void g(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        int v1 = v >= 0 ? this.m(v) : this.e.a();
        this.a.c(v1, z);
        if(z) {
            this.i(view0);
        }
        th th0 = this.e;
        uq uq0 = RecyclerView.p(view0);
        if(uq0 != null) {
            if(!uq0.x() && !uq0.A()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + uq0 + th0.a.t());
            }
            uq0.j();
        }
        th0.a.attachViewToParent(view0, v1, viewGroup$LayoutParams0);
    }

    final void h(int v) {
        int v1 = this.m(v);
        this.a.g(v1);
        th th0 = this.e;
        View view0 = th0.c(v1);
        if(view0 != null) {
            uq uq0 = RecyclerView.p(view0);
            if(uq0 != null) {
                if(uq0.x() && !uq0.A()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + uq0 + th0.a.t());
                }
                uq0.f(0x100);
            }
        }
        th0.a.detachViewFromParent(v1);
    }

    public final void i(View view0) {
        this.b.add(view0);
        uq uq0 = RecyclerView.p(view0);
        if(uq0 != null) {
            th th0 = this.e;
            int v = uq0.p;
            uq0.o = v == -1 ? uq0.a.getImportantForAccessibility() : v;
            th0.a.aG(uq0, 4);
        }
    }

    final void j(int v) {
        switch(this.c) {
            case 1: {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            case 2: {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            default: {
                try {
                    int v2 = this.m(v);
                    th th0 = this.e;
                    View view0 = th0.c(v2);
                    if(view0 != null) {
                        this.c = 1;
                        this.d = view0;
                        if(this.a.g(v2)) {
                            this.l(view0);
                        }
                        th0.e(v2);
                    }
                }
                finally {
                    this.c = 0;
                    this.d = null;
                }
            }
        }
    }

    public final boolean k(View view0) {
        return this.b.contains(view0);
    }

    public final void l(View view0) {
        if(this.b.remove(view0)) {
            this.e.d(view0);
        }
    }

    private final int m(int v) {
        if(v < 0) {
            return -1;
        }
        int v1 = this.e.a();
        for(int v2 = v; v2 < v1; v2 += v3) {
            qn qn0 = this.a;
            int v3 = v - (v2 - qn0.a(v2));
            if(v3 == 0) {
                while(qn0.f(v2)) {
                    ++v2;
                }
                return v2;
            }
        }
        return -1;
    }

    @Override
    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}

