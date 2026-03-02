final class cdb extends ibur implements ibtw {
    final clj a;
    final cii b;
    final Object c;
    final ibtx d;

    public cdb(clj clj0, cii cii0, Object object0, ibtx ibtx0) {
        this.a = clj0;
        this.b = cii0;
        this.c = object0;
        this.d = ibtx0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Object object4;
        Object object3;
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            clj clj0 = this.a;
            ccy ccy0 = new ccy(this.b);
            Object object2 = this.c;
            cmc cmc0 = cmv.a;
            if(clj0.z()) {
                ((goz)object0).M(0x635A29CD);
                ((goz)object0).A();
                object3 = clj0.f();
            }
            else {
                ((goz)object0).M(0x63564970);
                boolean z = ((goz)object0).X(clj0);
                object3 = ((goz)object0).k();
                if(z || object3 == gop.a) {
                    hbm hbm0 = hbl.a();
                    ibts ibts0 = hbm0 == null ? null : hbm0.i();
                    hbm hbm1 = hbl.b(hbm0);
                    try {
                        object4 = clj0.f();
                    }
                    finally {
                        hbl.d(hbm0, hbm1, ibts0);
                    }
                    ((goz)object0).R(object4);
                    object3 = object4;
                }
                ((goz)object0).A();
            }
            ((goz)object0).M(0x522F0047);
            float f = 0.0f;
            float f1 = ibuq.m(object3, object2) ? 1.0f : 0.0f;
            ((goz)object0).A();
            Float float0 = f1;
            boolean z1 = ((goz)object0).X(clj0);
            Object object5 = ((goz)object0).k();
            if(z1 || object5 == gop.a) {
                object5 = new gpx(new ccz(clj0), null);
                ((goz)object0).R(object5);
            }
            Object object6 = ((gui)object5).a();
            ((goz)object0).M(0x522F0047);
            if(ibuq.m(object6, object2)) {
                f = 1.0f;
            }
            ((goz)object0).A();
            Float float1 = f;
            boolean z2 = ((goz)object0).X(clj0);
            Object object7 = ((goz)object0).k();
            if(z2 || object7 == gop.a) {
                object7 = new gpx(new cda(clj0), null);
                ((goz)object0).R(object7);
            }
            Integer integer0 = (int)0;
            gui gui0 = clz.g(clj0, float0, float1, ((cii)ccy0.a(((gui)object7).a(), ((goz)object0), integer0)), cmc0, ((goz)object0), 0);
            hey hey0 = hfc.e;
            boolean z3 = ((goz)object0).X(gui0);
            Object object8 = ((goz)object0).k();
            if(z3 || object8 == gop.a) {
                object8 = new ccx(gui0);
                ((goz)object0).R(object8);
            }
            hfc hfc0 = hlv.a(hey0, ((ibts)object8));
            ibtx ibtx0 = this.d;
            Object object9 = this.c;
            iau iau0 = dhw.a(hei.a, false);
            long v2 = gol.c(((goz)object0));
            gzk gzk0 = ((goz)object0).ap();
            hfc hfc1 = hew.c(((goz)object0), hfc0);
            ibth ibth0 = iej.a;
            ((goz)object0).O();
            if(((goz)object0).ab()) {
                ((goz)object0).t(ibth0);
            }
            else {
                ((goz)object0).T();
            }
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(((goz)object0), iau0, iej.e);
            guo.b(((goz)object0), gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v3))) {
                Integer integer1 = v3;
                ((goz)object0).R(integer1);
                ((goz)object0).p(integer1, ibtw0);
            }
            guo.a(((goz)object0), iej.g);
            guo.b(((goz)object0), hfc1, iej.c);
            ibtx0.a(object9, ((goz)object0), integer0);
            ((goz)object0).z();
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

