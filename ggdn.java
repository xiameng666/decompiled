import java.util.Arrays;

public final class ggdn extends ggek {
    public ggdn() {
    }

    public ggdn(int v) {
        super(v);
    }

    public final ggdp a() {
        int v = this.c;
        if(v == 0) {
            return ggmz.a;
        }
        if(this.a != null) {
            if(this.d) {
                this.b = Arrays.copyOf(this.b, v + v);
            }
            ggdn.h(this.b, this.c, this.a);
        }
        this.d = true;
        return new ggmz(this.b, this.c);
    }

    @Override  // ggek
    public final ggeo b() {
        return this.a();
    }

    final void c(ggek ggek0) {
        super.k(ggek0);
    }

    public final void d(Object object0, Object object1) {
        super.i(object0, object1);
    }

    public final void e(Iterable iterable0) {
        super.l(iterable0);
    }
}

