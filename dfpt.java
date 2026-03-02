final class dfpt implements ibtx {
    final ibth a;

    public dfpt(ibth ibth0) {
        this.a = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        hey hey0 = hfc.e;
        hfc hfc0 = cru.d(dls.w(cqx.c(hhi.a(hey0, fpu.c(((goz)object1)).a), fpu.a(((goz)object1)).D)), false, null, null, null, cmig.a(((cmhw)object0), this.a), 15);
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
        String s = isq.c(0x7F152D37, ((goz)object1));  // string:sharing_settings_view_contacts "View contacts"
        ddxv.b(((goz)object1));
        hfc hfc2 = dla.j(hey0, 68.0f, 0.0f, 0.0f, 12.0f, 6);
        jbn jbn0 = fpu.d(((goz)object1)).i;
        fiuk.b(s, hfc2, fpu.a(((goz)object1)).a, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, jbn0, ((goz)object1), 0, 0x6180, 0x1AFF8);
        ((goz)object1).z();
        return ibom.a;
    }
}

