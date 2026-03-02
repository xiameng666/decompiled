import com.google.android.gms.nearby.common.ble.BleSighting;
import j..util.Objects;

final class gyfy extends cuny {
    final gyel a;

    public gyfy() {
        throw null;
    }

    public gyfy(gyel gyel0) {
        Objects.requireNonNull(gyel0);
        this.a = gyel0;
        super();
    }

    @Override  // cuny
    public final void b(String s) {
        batl.s(this.a.d);
        gyee gyee0 = new gyee(this, s);
        this.a.d.f(gyee0);
    }

    @Override  // cuny
    public final void c(BleSighting bleSighting0) {
        batl.s(this.a.d);
        gyed gyed0 = new gyed(this, bleSighting0);
        this.a.d.f(gyed0);
    }
}

