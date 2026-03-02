final class dfpl implements ibtx {
    final String a;

    public dfpl(String s) {
        this.a = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((ccg)object0), "$this$AnimatedVisibility");
        hey hey0 = hfc.e;
        ddxv.b(((goz)object1));
        hfc hfc0 = dla.j(hey0, 0.0f, 10.0f, 0.0f, 0.0f, 13);
        iau iau0 = dhw.a(hei.a, false);
        long v = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        jbn jbn0 = fpu.d(((goz)object1)).k;
        long v2 = fpu.a(((goz)object1)).s;
        ddxv.b(((goz)object1));
        hfc hfc2 = dla.i(hey0, 8.0f, 0.0f, 2);
        fiuk.b(this.a, hfc2, v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFF8);
        ((goz)object1).z();
        return ibom.a;
    }
}

