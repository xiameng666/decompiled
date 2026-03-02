public final class blrj implements jqv {
    public final blrn a;
    public final bnaj b;
    public final blpi c;
    public final String d;
    public final boolean e;
    public final byte[] f;

    public blrj(blrn blrn0, bnaj bnaj0, blpi blpi0, String s, boolean z, byte[] arr_b) {
        this.a = blrn0;
        this.b = bnaj0;
        this.c = blpi0;
        this.d = s;
        this.e = z;
        this.f = arr_b;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        gfsx gfsx0;
        blrn blrn0 = this.a;
        bnaj bnaj0 = this.b;
        blpi blpi0 = this.c;
        blrm blrm0 = new blrm(blrn0, bnaj0, blpi0, this.d, jqt0, this.e, this.f);
        gfqx gfqx0 = gfqx.a;
        if(hstg.c() && blpi0.q()) {
            blpi0.j();
            gfsx0 = blpi0.d();
        }
        else {
            gfsx0 = gfqx0;
        }
        blrn0.f.a(blrn0.c, gfsx0, gfqx0, blrm0, bnaj0);
        return blrm0;
    }
}

