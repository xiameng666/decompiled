public final class gqcz extends gqad {
    public static final gqae a;
    private final gqab b;

    static {
        gqcz.a = gqcz.c(gqab.b);
    }

    private gqcz(gqab gqab0) {
        this.b = gqab0;
    }

    @Override  // gqad
    public final Object a(gqff gqff0) {
        int v = gqff0.u();
        switch(v - 1) {
            case 5: 
            case 6: {
                return this.b.a(gqff0);
            }
            case 8: {
                gqff0.p();
                return null;
            }
            default: {
                throw new gpzy("Expecting number, got: " + gqfg.a(v) + "; at path " + gqff0.e());
            }
        }
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        gqfh0.l(((Number)object0));
    }

    public static gqae c(gqab gqab0) {
        return new gqcy(new gqcz(gqab0));
    }
}

