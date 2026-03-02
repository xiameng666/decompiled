public final class svh implements svi {
    private final ssg a;
    private final boolean b;

    public svh(ssg ssg0, boolean z) {
        this.a = ssg0;
        this.b = z;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        swj swj0;
        boolean z1;
        svt svt0 = srb0.a();
        boolean z = false;
        if(this.b) {
            ssg ssg0 = this.a;
            sxd sxd0 = svt0.j(ssg0);
            sre sre0 = srb0.e;
            if(sxd0.d()) {
                z1 = false;
            }
            else {
                sxd0 = sre0.j(ssg0);
                z1 = true;
                svt0 = sre0;
            }
            srl srl0 = svt0.r() ? srl.c : srl.b;
            swj0 = new swo(new srz(srk.b, srl0), svt0.e(), svt0.d(), sxd0, svt0 == sre0);
        }
        else {
            swj0 = new swl();
            z1 = false;
        }
        if(z1 || !srb0.c.e()) {
            z = true;
        }
        srb0.d(svt0, z, true);
        return swj0;
    }
}

