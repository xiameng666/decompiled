import java.util.Comparator;
import java.util.Iterator;

public final class ggga extends ggfn {
    private final Comparator e;

    public ggga(Comparator comparator0) {
        gftb.check(comparator0);
        this.e = comparator0;
    }

    @Override  // ggfn
    public final void c(Object object0) {
        super.i(object0);
    }

    @Override  // ggfn
    public final ggds g() {
        return this.n();
    }

    @Override  // ggfn
    public final ggfp h() {
        return this.n();
    }

    public final gggc n() {
        gggc gggc0 = gggc.R(this.e, this.b, this.a);
        this.b = gggc0.size();
        this.c = true;
        return gggc0;
    }

    public final void o(Object object0) {
        super.i(object0);
    }

    public final void p(Object[] arr_object) {
        super.j(arr_object);
    }

    public final void q(Iterable iterable0) {
        super.k(iterable0);
    }

    public final void r(Iterator iterator0) {
        super.l(iterator0);
    }
}

