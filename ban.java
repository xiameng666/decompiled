import java.util.UUID;

public final class ban {
    public final blb a;

    public ban() {
        this(blb.a());
    }

    public ban(blb blb0) {
        this.a = blb0;
        bjr bjr0 = bqt.D;
        Class class0 = (Class)blb0.m(bjr0, null);
        if(class0 != null && !class0.equals(bam.class)) {
            throw new IllegalArgumentException(a.m(class0, this, "Invalid target class configuration for ", ": "));
        }
        Class class1 = bam.class;
        blb0.c(bjr0, class1);
        bjr bjr1 = bqt.n;
        if(blb0.m(bjr1, null) == null) {
            blb0.c(bjr1, class1.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public final bap a() {
        return new bap(blf.f(this.a));
    }
}

