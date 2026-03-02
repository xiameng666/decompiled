import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import j..util.Objects;

final class bmfq implements bnfi {
    final bmfr a;

    public bmfq(bmfr bmfr0) {
        Objects.requireNonNull(bmfr0);
        this.a = bmfr0;
        super();
    }

    @Override  // bnfi
    public final void a() {
        this.a.c.d();
    }

    @Override  // bnfi
    public final void b(ViewOptions viewOptions0) {
        this.a.c.f(viewOptions0.toString());
    }
}

