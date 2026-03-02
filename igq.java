final class igq extends ibur implements ibth {
    final igt a;

    public igq(igt igt0) {
        this.a = igt0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        igt igt0 = this.a;
        ibp ibp0 = null;
        if(!ige.a(igt0.o()) && !igt0.f.c) {
            ihy ihy0 = igt0.q().x;
            if(ihy0 != null) {
                igm igm0 = ihy0.C();
                if(igm0 != null) {
                    ibp0 = igm0.m;
                }
            }
        }
        else {
            ihy ihy1 = igt0.q().x;
            if(ihy1 != null) {
                ibp0 = ihy1.m;
            }
        }
        if(ibp0 == null) {
            ibp0 = new ibl(igc.a(igt0.o()));
        }
        igm igm1 = igt0.q().C();
        ibuq.c(igm1);
        ibp.z(ibp0, igm1, igt0.m);
        return ibom.a;
    }
}

