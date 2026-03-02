public final class sqx {
    public sxd a;
    public boolean b;
    public boolean c;
    public sxd d;
    public sxd e;
    public sxd f;
    public sxd g;
    public sxd h;
    public sqw i;

    public sqx() {
        this.a = sxd.a;
        this.b = false;
        this.c = false;
        this.d = sxd.a;
        this.e = sxd.a;
        this.f = sxd.a;
        this.g = sxd.a;
        this.h = sxd.a;
        this.i = sqw.a;
    }

    public final sxd a() {
        sxd sxd0 = this.h;
        if(sxd0.d()) {
            srn srn0 = ((stl)sxd0.b()).a().b;
            return srn0.c == null ? sxd.a(null) : sxd.a(new srq(srn0.c, srn0.d));
        }
        return sxd.a;
    }

    public final void b(stl stl0, sxd sxd0) {
        this.h = new sxd(stl0);
        this.d = sxd0;
        this.f();
    }

    public final void c() {
        sxd sxd0 = sxd.a;
        this.d = sxd0;
        sxd sxd1 = this.h;
        if(sxd1.d()) {
            srn srn0 = ((stl)sxd1.b()).a().b;
            srn0.a.c();
            srn0.b.c();
            srp srp0 = srn0.c;
            if(srp0 != null) {
                srp0.c();
                srn0.d.c();
            }
        }
        this.h = sxd0;
        this.c = false;
        this.f();
    }

    public final boolean d() {
        return this.h.d();
    }

    public final boolean e() {
        return this.d.d() && ((sqv)this.d.b()).a.b;
    }

    private final void f() {
        this.e = sxd.a;
        this.a = sxd.a;
        this.b = false;
        this.f = sxd.a;
        this.g = sxd.a;
        this.i = sqw.a;
    }
}

