import j..util.Objects;

final class eqcj {
    public boolean a;
    public final eqsl b;
    final eqck c;
    private boolean d;

    public eqcj(eqck eqck0, long v) {
        Objects.requireNonNull(eqck0);
        this.c = eqck0;
        super();
        this.a = true;
        this.d = false;
        eqci eqci0 = new eqci(this);
        this.b = new eqsl(eqck0.b, null, v, eqci0);
    }

    public final void a() {
        this.d = true;
        this.c();
    }

    public final void b() {
        this.d = false;
        this.c();
    }

    public final void c() {
        if(this.a && !this.d) {
            this.b.a();
            return;
        }
        this.b.b();
    }

    public final void d() {
        this.b.d();
    }

    public final void e(long v) {
        this.b.e(v);
    }
}

