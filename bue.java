import java.util.UUID;

final class bue implements bnb {
    public final blb a;

    bue() {
        this(blb.a());
    }

    public bue(blb blb0) {
        this.a = blb0;
        bjr bjr0 = bqt.D;
        Class class0 = (Class)blb0.m(bjr0, null);
        if(class0 != null && !class0.equals(bud.class)) {
            throw new IllegalArgumentException(a.m(class0, this, "Invalid target class configuration for ", ": "));
        }
        blb0.c(bnc.y, bne.e);
        Class class1 = bud.class;
        blb0.c(bjr0, class1);
        bjr bjr1 = bqt.n;
        if(blb0.m(bjr1, null) == null) {
            blb0.c(bjr1, class1.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override  // bnb
    public final bnc d() {
        return new buf(blf.f(this.a));
    }

    @Override  // bau
    public final blb f() {
        return this.a;
    }
}

