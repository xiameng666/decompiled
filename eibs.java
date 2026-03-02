import j..util.Objects;

final class eibs extends ali {
    final eibv a;

    public eibs(eibv eibv0) {
        Objects.requireNonNull(eibv0);
        this.a = eibv0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        if(v != 11 && v != 14) {
            this.a.d();
            return;
        }
        this.d();
    }

    @Override  // ali
    public final void b() {
    }

    @Override  // ali
    public final void c(alj alj0) {
        this.d();
    }

    private final void d() {
        eibv eibv0 = this.a;
        Boolean boolean0 = eibv0.f;
        if(boolean0 != null && eibv0.c.a(boolean0.booleanValue())) {
            eibv0.b.k(boolean0.booleanValue());
        }
        eibv0.d();
    }
}

