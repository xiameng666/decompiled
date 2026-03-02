final class byls implements ibtx {
    final String a;
    final ibtw b;
    final ibth c;

    public byls(String s, ibtw ibtw0, ibth ibth0) {
        this.a = s;
        this.b = ibtw0;
        this.c = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dls.C(hey0, null, 3);
        String s = this.a;
        ibtw ibtw0 = this.b;
        ibth ibth0 = this.c;
        iau iau0 = dll.b(dho.a, hei.k, ((goz)object1), 0x30);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth1 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
        }
        else {
            ((goz)object1).T();
        }
        int v2 = (int)(v1 ^ v1 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw1 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw1);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        byml.f(s, dla.j(hey0, 24.0f, 18.0f, 0.0f, 18.0f, 4), ((goz)object1), 0);
        ((goz)object1).M(0xD1D1E82A);
        if(ibtw0 != null) {
            ibtw0.a(((goz)object1), Integer.valueOf(0));
        }
        ((goz)object1).A();
        fnl.b(ibth0, dla.f(hey0, 2.0f, 4.0f, 10.0f, 4.0f), false, null, null, byjl.a, ((goz)object1), 0x180000, 60);
        ((goz)object1).z();
        return ibom.a;
    }
}

