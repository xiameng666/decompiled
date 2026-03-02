import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class gw {
    public gv a;
    public gt b;
    public final du c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final List i;
    private final List j;
    private final List k;

    public gw(gv gv0, gt gt0, du du0) {
        ibuq.f(gv0, "finalState");
        ibuq.f(gt0, "lifecycleImpact");
        ibuq.f(du0, "fragment");
        super();
        this.a = gv0;
        this.b = gt0;
        this.c = du0;
        this.j = new ArrayList();
        this.h = true;
        ArrayList arrayList0 = new ArrayList();
        this.k = arrayList0;
        this.i = arrayList0;
    }

    public void a() {
        this.g = false;
        if(!this.e) {
            boolean z = !fm.ar(2);
            this.e = true;
            for(Object object0: this.j) {
                ((Runnable)object0).run();
            }
        }
    }

    public void b() {
        this.g = true;
    }

    public final void c(Runnable runnable0) {
        this.j.add(runnable0);
    }

    public final void d(gr gr0) {
        this.k.add(gr0);
    }

    public final void e(ViewGroup viewGroup0) {
        ibuq.f(viewGroup0, "container");
        this.g = false;
        if(!this.d) {
            this.d = true;
            if(this.k.isEmpty()) {
                this.a();
                return;
            }
            for(Object object0: ibpo.ar(this.i)) {
                gr gr0 = (gr)object0;
                ibuq.f(viewGroup0, "container");
                if(!gr0.j) {
                    gr0.a(viewGroup0);
                }
                gr0.j = true;
            }
        }
    }

    public final void f(gr gr0) {
        if(this.k.remove(gr0) && this.k.isEmpty()) {
            this.a();
        }
    }

    public final void g(gv gv0, gt gt0) {
        ibuq.f(gv0, "finalState");
        ibuq.f(gt0, "lifecycleImpact");
        int v = gt0.ordinal();
        if(v != 0) {
            switch(v) {
                case 1: {
                    goto label_6;
                }
                case 2: {
                    goto label_14;
                }
            }
            throw new ibnq();
        label_6:
            if(this.a == gv.a) {
                if(fm.ar(2)) {
                    Objects.toString(this.c);
                    Objects.toString(this.b);
                }
                this.a = gv.b;
                this.b = gt.b;
                this.h = true;
                return;
            label_14:
                if(fm.ar(2)) {
                    Objects.toString(this.c);
                    Objects.toString(this.a);
                    Objects.toString(this.b);
                }
                this.a = gv.a;
                this.b = gt.c;
                this.h = true;
            }
        }
        else if(this.a != gv.a) {
            if(fm.ar(2)) {
                Objects.toString(this.c);
                Objects.toString(this.a);
                Objects.toString(gv0);
            }
            this.a = gv0;
        }
    }

    public final void h() {
        this.h = false;
    }

    @Override
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.a + " lifecycleImpact = " + this.b + " fragment = " + this.c + '}';
    }
}

