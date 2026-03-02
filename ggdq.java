import java.util.Arrays;
import java.util.Collection;

abstract class ggdq extends ggdr {
    Object[] a;
    int b;
    boolean c;

    public ggdq(int v) {
        ggag.c(v, "initialCapacity");
        this.a = new Object[v];
        this.b = 0;
    }

    final void a(Object[] arr_object, int v) {
        ggml.g(arr_object, v);
        this.h(v);
        System.arraycopy(arr_object, 0, this.a, this.b, v);
        this.b += v;
    }

    public final void b(Object object0) {
        gftb.check(object0);
        this.h(1);
        int v = this.b;
        this.b = v + 1;
        this.a[v] = object0;
    }

    @Override  // ggdr
    public void c(Object object0) {
        throw null;
    }

    public final void d(Object[] arr_object) {
        this.a(arr_object, arr_object.length);
    }

    @Override  // ggdr
    public final void e(Iterable iterable0) {
        if((iterable0 instanceof Collection)) {
            this.h(((Collection)iterable0).size());
            if((((Collection)iterable0) instanceof ggds)) {
                this.b = ((ggds)(((Collection)iterable0))).x(this.a, this.b);
                return;
            }
        }
        super.e(iterable0);
    }

    private final void h(int v) {
        int v1 = this.a.length;
        int v2 = ggdq.f(v1, this.b + v);
        if(v2 <= v1 && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, v2);
        this.c = false;
    }
}

