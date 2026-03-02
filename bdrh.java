final class bdrh implements ibtw {
    final ibth a;
    final ibth b;
    final bdsf c;

    public bdrh(ibth ibth0, ibth ibth1, bdsf bdsf0) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = bdsf0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = dla.d(dls.B(dls.w(hfc.e)), 16.0f);
        ibth ibth0 = this.a;
        ibth ibth1 = this.b;
        bdsf bdsf0 = this.c;
        iau iau0 = dll.b(dho.g, hei.j, ((goz)object0), 6);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth2 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth2);
        }
        else {
            ((goz)object0).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        fiqv.c(ibth0, null, false, null, null, null, null, bdpj.j, ((goz)object0), 0x30000000, 510);
        fiqv.a(ibth1, null, false, null, null, null, null, null, gzf.e(0x371AA7D3, new bdrg(bdsf0), ((goz)object0)), ((goz)object0), 0x30000000, 510);
        ((goz)object0).z();
        return ibom.a;
    }
}

