import com.google.android.gms.nearby.common.ble.BleSighting;
import j..util.Objects;

final class gydn extends gyej {
    final gydq a;

    public gydn(gydq gydq0) {
        Objects.requireNonNull(gydq0);
        this.a = gydq0;
        super();
    }

    @Override  // gyej
    public final void a() {
        this.a.f();
    }

    @Override  // gyej
    public final void b(BleSighting bleSighting0) {
        this.a.g.c(bleSighting0);
    }

    @Override  // gyej
    public final void c(String s) {
        this.a.g.b(s);
    }

    @Override  // gyej
    public final void d(int v, int v1) {
        this.a.i = v;
        this.a.j = v1;
    }
}

