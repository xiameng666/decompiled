import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import j..util.Objects;

final class bndd implements bnfi {
    final bnde a;

    public bndd(bnde bnde0) {
        Objects.requireNonNull(bnde0);
        this.a = bnde0;
        super();
    }

    @Override  // bnfi
    public final void a() {
    }

    @Override  // bnfi
    public final void b(ViewOptions viewOptions0) {
        this.a.d.e(viewOptions0.toString());
    }
}

