final class demj implements ibtx {
    final ibtx a;

    public demj(ibtx ibtx0) {
        this.a = ibtx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((ccg)object0), "$this$AnimatedVisibility");
        ddxv.b(((goz)object1));
        ddxv.b(((goz)object1));
        ddxv.b(((goz)object1));
        hfc hfc0 = dla.j(hfc.e, 16.0f, 24.0f, 16.0f, 0.0f, 8);
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
        this.a.a(dic.a, ((goz)object1), Integer.valueOf(6));
        ((goz)object1).z();
        return ibom.a;
    }
}

