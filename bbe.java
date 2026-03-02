import android.util.Size;
import java.util.UUID;

public final class bbe implements bnb {
    public final blb a;

    public bbe() {
        this(blb.a());
    }

    private bbe(blb blb0) {
        this.a = blb0;
        Class class0 = (Class)blb0.m(bqt.D, null);
        if(class0 != null && !class0.equals(bbh.class)) {
            throw new IllegalArgumentException(a.m(class0, this, "Invalid target class configuration for ", ": "));
        }
        blb0.c(bnc.y, bne.c);
        Class class1 = bbh.class;
        blb0.c(bnc.D, class1);
        bjr bjr0 = bnc.n;
        if(blb0.m(bjr0, null) == null) {
            blb0.c(bjr0, class1.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    static bbe a(bjt bjt0) {
        return new bbe(blb.b(bjt0));
    }

    public final bbh b() {
        bkj bkj0 = this.c();
        bkn.c(bkj0);
        return new bbh(bkj0);
    }

    public final bkj c() {
        return new bkj(blf.f(this.a));
    }

    @Override  // bnb
    public final bnc d() {
        return this.c();
    }

    @Deprecated
    public final void e(Size size0) {
        this.a.c(bko.K, size0);
    }

    @Override  // bau
    public final blb f() {
        return this.a;
    }
}

