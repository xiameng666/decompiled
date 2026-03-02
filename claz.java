public final class claz extends clcf {
    private final gfsx b;
    private final clbd c;
    private final ckcq d;

    protected claz(clay clay0) {
        this.b = clay0.b;
        clbd clbd0 = clay0.c;
        gftb.check(clbd0);
        this.c = clbd0;
        this.d = clay0.a;
    }

    @Override  // clcf
    public final ckcq a() {
        return this.d;
    }

    @Override  // clcf
    public final ckdh b() {
        ckdh ckdh1;
        ckdh ckdh0;
        clbd clbd0 = this.c;
        MessageLite hfvm0 = clbd0.e;
        if(hfvm0 == null) {
            ckdh0 = ckdh.a("", clbd0.b, clbd0.b);
        }
        else {
            gged_interceptors gged0 = gged_interceptors.l(hfvm0);
            ckdh0 = ckdh.b("", clbd0.b, clbd0.b, false, gged0);
        }
        gfsx gfsx0 = this.b;
        if(gfsx0.i()) {
            cldm cldm0 = (cldm)gfsx0.d();
            MessageLite hfvm1 = cldm0.d;
            String s = cldm0.c;
            ckdh1 = hfvm1 == null ? ckdh.a("", ((long)s.length()), ((long)s.length())) : ckdh.b("", ((long)s.length()), ((long)s.length()), false, gged_interceptors.l(hfvm1));
        }
        else {
            ckdh1 = ckdh.a;
        }
        ggdy ggdy0 = new ggdy();
        ggdy0.k(ckdh0.f);
        ggdy0.k(ckdh1.f);
        gged_interceptors gged1 = ggdy0.h();
        return ckdh.b("", ckdh0.c + ckdh1.c, ckdh0.d + ckdh1.d, false, gged1);
    }

    @Override  // clcf
    public final String c() {
        gfsx gfsx0 = this.b;
        if(gfsx0.i()) {
            cldm cldm0 = (cldm)gfsx0.d();
            String s = cldm0.c + cldm0.b;
            return s.isEmpty() || s.startsWith("?") ? this.c.c + s : this.c.c + ("?" + s.substring(1));
        }
        return this.c.c + "";
    }

    @Override  // clcf
    public final String d() {
        return this.c.d;
    }

    @Override  // clcf
    public final void e() {
        gfsx gfsx0 = this.b;
        if(gfsx0.i()) {
            gfsx0.d();
        }
    }
}

