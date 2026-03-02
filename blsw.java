import j..util.Objects;

final class blsw implements gmbg {
    final gfsx a;
    final blsy b;
    final blsu c;

    public blsw(blsy blsy0, blsu blsu0, gfsx gfsx0) {
        this.c = blsu0;
        this.a = gfsx0;
        Objects.requireNonNull(blsy0);
        this.b = blsy0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.b.b(blhc.an);
        this.c.a(gfqx.a);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((gfsx)object0).i()) {
            this.b.b(blhc.am);
            gfsx gfsx0 = gfsx.m(new blsx(this.b.c.getStringExtra("chrome_key_material"), ((String)this.a.d()), ((String)((gfsx)object0).d())));
            this.c.a(gfsx0);
            return;
        }
        this.b.b(blhc.an);
        this.c.a(gfqx.a);
    }
}

