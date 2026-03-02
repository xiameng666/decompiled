import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.FIN;

public abstract class tr {
    private final ArrayList a;
    public long h;
    public long i;
    public ts j;

    public tr() {
        this.j = null;
        this.a = new ArrayList();
        this.h = 120L;
        this.i = 120L;
    }

    public abstract void b(uq arg1);

    public abstract void c();

    public abstract void d();

    public boolean h(uq uq0, List list0) {
        throw null;
    }

    public abstract boolean i();

    public final void l(uq uq0) {
        ts ts0 = this.j;
        if(ts0 != null) {
            int v = 1;
            uq0.n(true);
            if(uq0.h != null && uq0.i == null) {
                uq0.h = null;
            }
            uq0.i = null;
            if((uq0.j & 16) == 0) {
                View view0 = uq0.a;
                RecyclerView recyclerView0 = ts0.a;
                recyclerView0.at();
                qo qo0 = recyclerView0.g;
                int v1 = qo0.c;
                if(v1 == 1) {
                    if(qo0.d != view0) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    }
                    v = 0;
                }
                else {
                    if(v1 == 2) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                    }
                    int v2 = FIN.finallyOpen$NT();
                    qo0.c = 2;
                    th th0 = qo0.e;
                    int v3 = th0.b(view0);
                    if(v3 == -1) {
                        qo0.l(view0);
                        goto label_31;
                    }
                    else {
                        qn qn0 = qo0.a;
                        if(qn0.f(v3)) {
                            qn0.g(v3);
                            qo0.l(view0);
                            th0.e(v3);
                        label_31:
                            FIN.finallyCodeBegin$NT(v2);
                        }
                        else {
                            FIN.finallyExec$NT(v2);
                            v = 0;
                        }
                    }
                }
                if(v != 0) {
                    uq uq1 = RecyclerView.p(view0);
                    recyclerView0.d.o(uq1);
                    recyclerView0.d.m(uq1);
                }
                recyclerView0.au(((boolean)(v ^ 1)));
                if(v == 0 && uq0.x()) {
                    ts0.a.removeDetachedView(uq0.a, false);
                }
            }
        }
    }

    public final void m() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((tp)arrayList0.get(v1)).a();
        }
        arrayList0.clear();
    }

    public abstract boolean n(uq arg1, tq arg2, tq arg3);

    public abstract boolean o(uq arg1, uq arg2, tq arg3, tq arg4);

    public abstract boolean p(uq arg1, tq arg2, tq arg3);

    public abstract boolean q(uq arg1, tq arg2, tq arg3);

    public boolean r(uq uq0) {
        throw null;
    }

    public static final tq s(uq uq0) {
        tq tq0 = new tq();
        tq0.a(uq0);
        return tq0;
    }

    public static void t(uq uq0) {
        if(!uq0.t() && (uq0.j & 4) == 0) {
            uq0.fp();
        }
    }
}

