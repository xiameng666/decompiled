import java.util.Iterator;

public final class ggdy extends ggdq {
    public ggdy() {
        super(4);
    }

    public ggdy(int v) {
        super(v);
    }

    @Override  // ggdq
    public final void c(Object object0) {
        super.b(object0);
    }

    @Override  // ggdr
    public final ggds g() {
        return this.h();
    }

    public final gged_interceptors h() {
        this.c = true;
        return gged_interceptors.g(this.a, this.b);
    }

    public final void i(Object object0) {
        super.b(object0);
    }

    public final void j(Object[] arr_object) {
        super.d(arr_object);
    }

    public final void k(Iterable iterable0) {
        super.e(iterable0);
    }

    public final void l(Iterator iterator0) {
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            super.b(object0);
        }
    }
}

