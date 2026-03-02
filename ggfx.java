import j..util.Objects;
import java.util.Arrays;
import java.util.Comparator;

public final class ggfx extends ggek {
    private transient Object[] f;
    private transient Object[] g;
    private final Comparator h;

    public ggfx(Comparator comparator0) {
        gftb.check(comparator0);
        this.h = comparator0;
        this.f = new Object[4];
        this.g = new Object[4];
    }

    public final ggfz a() {
        int v1 = this.c;
        switch(v1) {
            case 0: {
                return ggfz.z(this.h);
            }
            case 1: {
                Object object0 = Objects.requireNonNull(this.f[0]);
                Object object1 = Objects.requireNonNull(this.g[0]);
                return ggfz.C(this.h, object0, object1);
            }
            default: {
                Object[] arr_object = Arrays.copyOf(this.f, v1);
                Comparator comparator0 = this.h;
                Arrays.sort(arr_object, comparator0);
                Object[] arr_object1 = new Object[this.c];
                for(int v = 0; v < this.c; ++v) {
                    if(v > 0 && comparator0.compare(arr_object[v - 1], arr_object[v]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + arr_object[v - 1] + " and " + arr_object[v]);
                    }
                    int v2 = Arrays.binarySearch(arr_object, Objects.requireNonNull(this.f[v]), comparator0);
                    arr_object1[v2] = Objects.requireNonNull(this.g[v]);
                }
                return new ggfz(new ggnk(gged_interceptors.f(arr_object), comparator0), gged_interceptors.f(arr_object1));
            }
        }
    }

    @Override  // ggek
    public final ggeo b() {
        return this.a();
    }

    public final void c(Object object0, Object object1) {
        int v = this.c + 1;
        int v1 = this.f.length;
        if(v > v1) {
            int v2 = ggdr.f(v1, v);
            this.f = Arrays.copyOf(this.f, v2);
            this.g = Arrays.copyOf(this.g, v2);
        }
        ggag.a(object0, object1);
        int v3 = this.c;
        this.f[v3] = object0;
        this.g[v3] = object1;
        this.c = v3 + 1;
    }

    @Override  // ggek
    public final void i(Object object0, Object object1) {
        this.c(object0, object1);
    }
}

