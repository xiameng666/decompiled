import android.util.Size;
import java.util.UUID;

public final class bdc implements bnb {
    public final blb a;

    public bdc() {
        this(blb.a());
    }

    private bdc(blb blb0) {
        this.a = blb0;
        Class class0 = (Class)blb0.m(bqt.D, null);
        if(class0 != null && !class0.equals(bdf.class)) {
            throw new IllegalArgumentException(a.m(class0, this, "Invalid target class configuration for ", ": "));
        }
        blb0.c(bnc.y, bne.b);
        Class class1 = bdf.class;
        blb0.c(bli.D, class1);
        if(blb0.m(bli.n, null) == null) {
            this.e(class1.getCanonicalName() + "-" + UUID.randomUUID());
        }
        bjr bjr0 = bko.J;
        if(((int)(((Integer)blb0.m(bjr0, Integer.valueOf(-1))))) == -1) {
            blb0.c(bjr0, Integer.valueOf(2));
        }
    }

    static bdc a(bjt bjt0) {
        return new bdc(blb.b(bjt0));
    }

    public final bdf b() {
        bli bli0 = this.c();
        bkn.c(bli0);
        return new bdf(bli0);
    }

    public final bli c() {
        return new bli(blf.f(this.a));
    }

    @Override  // bnb
    public final bnc d() {
        return this.c();
    }

    public final void e(String s) {
        this.a.c(bli.n, s);
    }

    @Override  // bau
    public final blb f() {
        return this.a;
    }

    @Deprecated
    public final void g(Size size0) {
        this.a.c(bko.K, size0);
    }
}

