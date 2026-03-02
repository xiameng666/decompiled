import j..util.Objects;

final class foqs implements foqo {
    final gful_cronetEngineProvider a;
    final gful_cronetEngineProvider b;
    final forb c;
    final foqv d;

    public foqs(foqv foqv0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, forb forb0) {
        this.a = gful0;
        this.b = gful1;
        this.c = forb0;
        Objects.requireNonNull(foqv0);
        this.d = foqv0;
        super();
    }

    private final void a() {
        foqv foqv0 = this.d;
        foqx foqx0 = foqv0.a;
        if(foqx0 != null) {
            this.c.b(foqx0);
            foqv0.a = null;
        }
    }

    @Override  // foqo
    public final void g(fokg fokg0) {
        if(((Boolean)this.a.mr()).booleanValue()) {
            this.d.c.k(fokg0);
            return;
        }
        if(((Boolean)this.b.mr()).booleanValue()) {
            this.a();
            return;
        }
        this.d.c.k(fokg0);
    }

    @Override  // foqo
    public final void j(fokg fokg0) {
        if(((Boolean)this.a.mr()).booleanValue()) {
            this.d.c.l(fokg0);
            return;
        }
        if(((Boolean)this.b.mr()).booleanValue()) {
            this.a();
            return;
        }
        this.d.c.l(fokg0);
    }
}

