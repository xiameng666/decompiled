public final class fndp {
    private static final ggsf a;
    private final int b;
    private final fndu c;

    static {
        fndp.a = ggsf.b("fndp");
    }

    public fndp(fndu fndu0, int v) {
        this.c = fndu0;
        this.b = v;
    }

    public final void a(gadt gadt0) {
        if((gadt0 instanceof gads)) {
            this.c.a(((gads)gadt0).a, this.b);
            return;
        }
        if((gadt0 instanceof gadq)) {
            switch(((gadq)gadt0).b.ordinal()) {
                case 1: {
                    this.c.a(((gadq)gadt0).a, 0x2EDE8);
                    return;
                }
                case 2: {
                    this.c.a(((gadq)gadt0).a, 0x2EDE9);
                    return;
                }
                default: {
                    ((ggsc)fndp.a.h().ar(0x48C9)).x("onButtonInflated is called on a non-primary non-secondary button");
                    return;
                }
            }
        }
        if((gadt0 instanceof gadr)) {
            if(((gadr)gadt0).b == gadp.b) {
                ibuq.f(((gadr)gadt0).a, "view");
                this.c.a.d(gltz.e, ((gadr)gadt0).a);
                return;
            }
            ((ggsc)fndp.a.h().ar(0x48C8)).x("onButtonInteracted is called on a non-tap interaction");
            return;
        }
        ((ggsc)fndp.a.h().ar(0x48C7)).x("GilLayoutObserver is called on a non-implemented event");
    }
}

