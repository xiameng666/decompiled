public final class cla implements gui {
    public final clf a;
    public ibts b;
    public ibts c;
    final clb d;

    public cla(clb clb0, clf clf0, ibts ibts0, ibts ibts1) {
        this.d = clb0;
        super();
        this.a = clf0;
        this.b = ibts0;
        this.c = ibts1;
    }

    @Override  // gui
    public final Object a() {
        this.b(this.d.a.e());
        return this.a.a();
    }

    public final void b(cld cld0) {
        Object object0 = this.c.a(cld0.f());
        if(this.d.a.z()) {
            Object object1 = this.c.a(cld0.e());
            cii cii0 = (cii)this.b.a(cld0);
            this.a.l(object1, object0, cii0);
            return;
        }
        cii cii1 = (cii)this.b.a(cld0);
        this.a.m(object0, cii1);
    }
}

