import android.support.v7.widget.RecyclerView;

public final class uh extends tm {
    final RecyclerView a;

    public uh(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        super();
    }

    @Override  // tm
    public final void a() {
        RecyclerView recyclerView0 = this.a;
        recyclerView0.E(null);
        recyclerView0.N.f = true;
        recyclerView0.ae(true);
        if(!recyclerView0.f.l()) {
            recyclerView0.requestLayout();
        }
    }

    @Override  // tm
    public final void c(int v, int v1, Object object0) {
        this.a.E(null);
        ou ou0 = this.a.f;
        if(v1 > 0) {
            ot ot0 = ou0.c(4, v, v1, object0);
            ou0.a.add(ot0);
            ou0.d |= 4;
            if(ou0.a.size() == 1) {
                this.h();
            }
        }
    }

    @Override  // tm
    public final void d(int v, int v1) {
        this.a.E(null);
        ou ou0 = this.a.f;
        if(v1 > 0) {
            ot ot0 = ou0.c(1, v, v1, null);
            ou0.a.add(ot0);
            ou0.d |= 1;
            if(ou0.a.size() == 1) {
                this.h();
            }
        }
    }

    @Override  // tm
    public final void e(int v, int v1) {
        this.a.E(null);
        ou ou0 = this.a.f;
        if(v1 > 0) {
            ot ot0 = ou0.c(2, v, v1, null);
            ou0.a.add(ot0);
            ou0.d |= 2;
            if(ou0.a.size() == 1) {
                this.h();
            }
        }
    }

    @Override  // tm
    public final void f() {
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0.e != null && (recyclerView0.m != null && recyclerView0.m.E())) {
            recyclerView0.requestLayout();
        }
    }

    @Override  // tm
    public final void g(int v, int v1) {
        this.a.E(null);
        ou ou0 = this.a.f;
        if(v != v1) {
            ot ot0 = ou0.c(8, v, v1, null);
            ou0.a.add(ot0);
            ou0.d |= 8;
            if(ou0.a.size() == 1) {
                this.h();
            }
        }
    }

    final void h() {
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0.r && recyclerView0.q) {
            recyclerView0.postOnAnimation(recyclerView0.j);
            return;
        }
        recyclerView0.v = true;
        recyclerView0.requestLayout();
    }
}

