import j..util.Objects;

final class esrb implements espy {
    final essb a;

    public esrb(esrg esrg0, essb essb0) {
        this.a = essb0;
        Objects.requireNonNull(esrg0);
        super();
    }

    @Override  // espy
    public final esga a() {
        switch(this.a.a()) {
            case 1: {
                return esga.b;
            }
            case 2: {
                return esga.c;
            }
            case 3: {
                return esga.g;
            }
            case 4: {
                return esga.d;
            }
            case 5: {
                return esga.e;
            }
            case 6: {
                return esga.f;
            }
            case 7: {
                return esga.h;
            }
            case 8: {
                return esga.i;
            }
            case 9: {
                return esga.j;
            }
            default: {
                return esga.k;
            }
        }
    }

    @Override  // espy
    public final boolean b() {
        return this.a.b();
    }

    @Override  // espy
    public final boolean c() {
        return this.a.c();
    }

    @Override  // espy
    public final boolean d() {
        return this.a.d();
    }
}

