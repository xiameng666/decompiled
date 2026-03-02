import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class fvjc {
    public final Map a;
    public gged_interceptors b;
    gged_interceptors c;
    public gged_interceptors d;

    public fvjc() {
        this.a = new LinkedHashMap();
    }

    public final gged_interceptors a() {
        if(this.c == null) {
            this.c = gged_interceptors.h(gggq.d(this.a.values(), new fvja()));
        }
        return this.c;
    }

    public final Set b() {
        return this.a.keySet();
    }

    public final void c(fvix fvix0) {
        this.d();
        this.a.put(fvix0.a, fvix0);
    }

    public final void d() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void e(fveo fveo0, double f) {
        fvix fvix0 = (fvix)this.a.get(fveo0);
        if(fvix0 != null) {
            fvix0.k = f;
        }
    }

    public final void f(fveo fveo0, double f) {
        fvix fvix0 = (fvix)this.a.get(fveo0);
        if(fvix0 != null) {
            fvix0.h = f;
        }
    }

    public final void g(fveo fveo0, fvgr fvgr0) {
        fvix fvix0 = (fvix)this.a.get(fveo0);
        if(fvix0 != null) {
            fvix0.j = fvgr0;
        }
    }

    public final void h(fveo fveo0, boolean z) {
        fvix fvix0 = (fvix)this.a.get(fveo0);
        if(fvix0 != null) {
            fvix0.i = z;
        }
    }

    public final void i(fveo fveo0) {
        this.e(fveo0, NaN);
        this.g(fveo0, null);
    }
}

