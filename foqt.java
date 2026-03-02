import j..util.Objects;

final class foqt implements foqo {
    final gful_cronetEngineProvider a;
    final gful_cronetEngineProvider b;
    final fork c;
    final foqv d;

    public foqt(foqv foqv0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, fork fork0) {
        this.a = gful0;
        this.b = gful1;
        this.c = fork0;
        Objects.requireNonNull(foqv0);
        this.d = foqv0;
        super();
    }

    private final void a() {
        foqv foqv0 = this.d;
        foql foql0 = foqv0.b;
        if(foql0 != null) {
            this.c.g.remove(foql0);
            foqv0.b = null;
        }
    }

    @Override  // foqo
    public final void g(fokg fokg0) {
        if(((Boolean)this.a.mr()).booleanValue()) {
            this.d.c.k(fokg0);
            return;
        }
        if(((Boolean)this.b.mr()).booleanValue()) {
            this.d.c.k(fokg0);
            return;
        }
        this.a();
    }

    @Override  // foqo
    public final void j(fokg fokg0) {
        if(((Boolean)this.a.mr()).booleanValue()) {
            this.d.c.l(fokg0);
            return;
        }
        if(((Boolean)this.b.mr()).booleanValue()) {
            this.d.c.l(fokg0);
            return;
        }
        this.a();
    }
}

