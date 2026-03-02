public final class eklz extends lsb {
    public final bxox a;
    public final ekmc b;
    public final ejyv c;
    public final ejyn d;
    public final lqi e;
    public final gmcg f;
    public final ekmk g;
    public final ekmp h;
    public final eghw i;
    public final ekmf j;
    private bxox k;

    public eklz(ekmc ekmc0, eghw eghw0, ekmk ekmk0, ekmp ekmp0, ejyv ejyv0, ekmf ekmf0, gmcg gmcg0, ejyn ejyn0) {
        this.a = ejyv0.c();
        this.b = ekmc0;
        this.c = ejyv0;
        this.h = ekmp0;
        this.g = ekmk0;
        this.i = eghw0;
        this.d = ejyn0;
        this.k = null;
        this.e = new lqi();
        this.j = ekmf0;
        this.f = gmcg0;
    }

    final void a() {
        this.a.l(Integer.valueOf(2));
    }

    final void b() {
        this.a.l(Integer.valueOf(4));
    }

    public final void c() {
        this.a.l(Integer.valueOf(0));
    }

    public final void e(String s) {
        this.c.v(s);
    }

    final void f(String s) {
        this.c.t(s);
        this.c.u(s);
        this.b.o();
    }

    final boolean g() {
        return this.c.b;
    }

    final bxox h(boolean z) {
        if(this.k == null) {
            this.k = new ekms(this.c, this.d, z);
        }
        return this.k;
    }
}

