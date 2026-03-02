final class irw implements gpf, lpp {
    public final ili a;
    public final gpf b;
    public boolean c;
    public lpg d;
    public ibtw e;

    public irw(ili ili0, gpf gpf0) {
        this.a = ili0;
        this.b = gpf0;
        this.e = ioa.a;
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        if(lpe0 == lpe.ON_DESTROY) {
            this.d();
            return;
        }
        if(lpe0 == lpe.ON_CREATE && !this.c) {
            this.e(this.e);
        }
    }

    @Override  // gpf
    public final void d() {
        if(!this.c) {
            this.c = true;
            this.a.setTag(0x7F0B2521, null);  // id:wrapped_composition_tag
            lpg lpg0 = this.d;
            if(lpg0 != null) {
                lpg0.d(this);
            }
        }
        this.b.d();
    }

    @Override  // gpf
    public final void e(ibtw ibtw0) {
        irv irv0 = new irv(this, ibtw0);
        ili ili0 = this.a;
        iki iki0 = ili0.C();
        if(iki0 != null) {
            irv0.a(iki0);
        }
        if(!ili0.isAttachedToWindow()) {
            ili0.F = irv0;
        }
    }

    @Override  // gpf
    public final boolean f() {
        return this.b.f();
    }
}

