public final class stw implements svi {
    private final byte[] a;

    public stw(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // svi
    public final swj a(srb srb0) {
        sww.a(srb0, 97);
        sqx sqx0 = srb0.c;
        sxd sxd0 = sqx0.a();
        swy swy0 = swq.b.a(this.a, srb0.b.d, sxd0);
        if(!swy0.c()) {
            throw sxf.h(((swp)swy0.a()).f);
        }
        svt svt0 = (svt)swy0.b();
        if(!svt0.q(sxd.a)) {
            throw sxf.c();
        }
        swh swh0 = new swh();
        if(swh.e(svt0)) {
            swy swy1 = new swy(svt0, null);
            swh0.c.add(swy1);
        }
        srb0.c(swh0);
        srb0.d(srb0.a(), ((boolean)(sqx0.e() ^ 1)), true);
        return new swl();
    }
}

