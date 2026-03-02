final class dvag implements ibtx {
    final hkas a;
    final ibth b;
    final ibth c;

    public dvag(hkas hkas0, ibth ibth0, ibth ibth1) {
        this.a = hkas0;
        this.b = ibth0;
        this.c = ibth1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$BottomAppBar");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dls.w(hfc.e);
        hkas hkas0 = this.a;
        ibth ibth0 = this.b;
        ibth ibth1 = this.c;
        iau iau0 = dll.b(dho.g, hei.k, ((goz)object1), 54);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth2 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth2);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        dval.i(null, hkas0, ibth0, ((goz)object1), 0);
        dval.h(null, ibth1, ((goz)object1), 0);
        ((goz)object1).z();
        return ibom.a;
    }
}

