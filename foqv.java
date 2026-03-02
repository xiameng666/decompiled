import j..util.Objects;

@ibnh
public final class foqv {
    public foqx a;
    public foql b;
    final foqu c;

    public foqv(forb forb0, fork fork0, ibnf ibnf0, ibnf ibnf1) {
        this.c = new foqu();
        Objects.requireNonNull(ibnf0);
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new foqr(ibnf0)));
        Objects.requireNonNull(ibnf1);
        gful_cronetEngineProvider gful1 = gfus.a(((gful_cronetEngineProvider)new foqr(ibnf1)));
        if(((Boolean)gful1.mr()).booleanValue()) {
            if(((Boolean)gful0.mr()).booleanValue()) {
                this.c(fork0, gful0, gful1);
                return;
            }
            this.d(forb0, gful0, gful1);
            return;
        }
        this.d(forb0, gful0, gful1);
        this.c(fork0, gful0, gful1);
    }

    public final void a(foqo foqo0) {
        this.c.b.add(foqo0);
    }

    public final void b(foqo foqo0) {
        this.c.b.remove(foqo0);
    }

    private final void c(fork fork0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1) {
        this.b = new foql(new foqt(this, gful1, gful0, fork0));
        fork0.g.add(this.b);
    }

    private final void d(forb forb0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1) {
        foqx foqx0 = new foqx(new foqs(this, gful1, gful0, forb0));
        this.a = foqx0;
        forb0.a(foqx0);
    }
}

