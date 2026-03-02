import java.util.UUID;

public final class bbw implements bnb {
    public final blb a;

    public bbw() {
        this(blb.a());
    }

    private bbw(blb blb0) {
        this.a = blb0;
        Class class0 = (Class)blb0.m(bqt.D, null);
        if(class0 != null && !class0.equals(bce.class)) {
            throw new IllegalArgumentException(a.m(class0, this, "Invalid target class configuration for ", ": "));
        }
        blb0.c(bnc.y, bne.a);
        Class class1 = bce.class;
        blb0.c(bkk.D, class1);
        if(blb0.m(bkk.n, null) == null) {
            this.c(class1.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public static bbw a(bjt bjt0) {
        return new bbw(blb.b(bjt0));
    }

    public final bkk b() {
        return new bkk(blf.f(this.a));
    }

    public final void c(String s) {
        this.a.c(bkk.n, s);
    }

    @Override  // bnb
    public final bnc d() {
        return this.b();
    }

    @Override  // bau
    public final blb f() {
        return this.a;
    }
}

