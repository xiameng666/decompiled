import j..util.Objects;
import java.util.List;

final class febq extends febb {
    final febr c;

    public febq(febr febr0) {
        Objects.requireNonNull(febr0);
        this.c = febr0;
        super(febr0);
    }

    @Override  // febb
    public final void b() {
        febo febo0 = new febo(this);
        this.c.a.post(febo0);
    }

    @Override  // febb
    public final void d(List list0) {
        febp febp0 = new febp(this, list0);
        this.c.a.post(febp0);
    }
}

