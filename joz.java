final class joz extends ibur implements ibtw {
    final jqc a;
    final gui b;

    public joz(jqc jqc0, gui gui0) {
        this.a = jqc0;
        this.b = gui0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            hey hey0 = hfc.e;
            Object object2 = ((goz)object0).k();
            Object object3 = gop.a;
            if(object2 == object3) {
                object2 = jox.a;
                ((goz)object0).R(object2);
            }
            hfc hfc0 = iuc.d(hey0, ((ibts)object2));
            jqc jqc0 = this.a;
            boolean z = ((goz)object0).Z(jqc0);
            Object object4 = ((goz)object0).k();
            if(z || object4 == object3) {
                object4 = new joy(jqc0);
                ((goz)object0).R(object4);
            }
            hfc hfc1 = hhc.a(ibj.a(hfc0, ((ibts)object4)), (((Boolean)jqc0.h.a()).booleanValue() ? 1.0f : 0.0f));
            ibtw ibtw0 = (ibtw)this.b.a();
            Object object5 = ((goz)object0).k();
            if(object5 == object3) {
                object5 = jpd.a;
                ((goz)object0).R(object5);
            }
            long v1 = gol.c(((goz)object0));
            gzk gzk0 = ((goz)object0).ap();
            hfc hfc2 = hew.c(((goz)object0), hfc1);
            ibth ibth0 = iej.a;
            ((goz)object0).O();
            if(((goz)object0).ab()) {
                ((goz)object0).t(ibth0);
            }
            else {
                ((goz)object0).T();
            }
            int v2 = (int)(v1 ^ v1 >>> 0x20);
            guo.b(((goz)object0), ((iau)object5), iej.e);
            guo.b(((goz)object0), gzk0, iej.d);
            ibtw ibtw1 = iej.f;
            if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                ((goz)object0).R(integer0);
                ((goz)object0).p(integer0, ibtw1);
            }
            guo.a(((goz)object0), iej.g);
            guo.b(((goz)object0), hfc2, iej.c);
            ibtw0.a(((goz)object0), Integer.valueOf(0));
            ((goz)object0).z();
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

