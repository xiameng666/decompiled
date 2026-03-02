final class ftyb implements ibtx {
    final ftyi a;
    final ftyi b;
    final long c;

    public ftyb(ftyi ftyi0, ftyi ftyi1, long v) {
        this.a = ftyi0;
        this.b = ftyi1;
        this.c = v;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        long v6;
        long v7;
        long v5;
        long v4;
        jbn jbn0;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$PassListItemCard");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.e(dls.t(dls.w(hey0), 0.0f, (hyxx.c() ? 96.0f : NaNf), 1), 20.0f, 20.0f);
        hej hej0 = hei.m;
        dhf dhf0 = dho.h(16.0f, hej0);
        ftyi ftyi0 = this.a;
        ftyi ftyi1 = this.b;
        long v1 = this.c;
        hek hek0 = hei.k;
        iau iau0 = dll.b(dhf0, hek0, ((goz)object1), 54);
        int v2 = ftya.a(gol.c(((goz)object1)));
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
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object1), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer0 = v2;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw2);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(((goz)object1), hfc1, ibtw3);
        hek hek1 = hyxx.c() ? hek0 : hei.j;
        ftyd.a(dlq.a.a(hey0, hek1), ftyi1, ((goz)object1), 0);
        hfc hfc2 = dlq.a.a(dlo.a(dlq.a, hey0, 1.0f), hek0);
        iau iau1 = dii.a(dho.g(4.0f), hej0, ((goz)object1), 6);
        int v3 = ftya.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc3 = hew.c(((goz)object1), hfc2);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw0);
        guo.b(((goz)object1), gzk1, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v3))) {
            Integer integer1 = v3;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc3, ibtw3);
        ((goz)object1).M(0xB11EF120);
        ((goz)object1).A();
        ftyn ftyn0 = ftyi0.b;
        if((ftyn0 instanceof ftym)) {
            ((goz)object1).M(1925532802);
            hfc hfc4 = iqn.a(hey0, "Title");
            fryv fryv0 = ((ftym)ftyn0).a;
            if(hyxx.c()) {
                ((goz)object1).M(1925691708);
                jbn0 = fsbt.b(fpu.d(((goz)object1)));
            }
            else {
                ((goz)object1).M(0x72C94A2D);
                jbn0 = fpu.d(((goz)object1)).g;
            }
            ((goz)object1).A();
            ftxs ftxs0 = ftyi0.e;
            if(ftxs0.ordinal() == 1) {
                ((goz)object1).M(0xB11F6133);
                v4 = fsbs.b(fpu.a(((goz)object1)), ((goz)object1));
            }
            else {
                ((goz)object1).M(1926093716);
                v4 = hyxx.c() ? v1 : fpu.a(((goz)object1)).q;
            }
            ((goz)object1).A();
            ftzd.a(fryv0, hfc4, v4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object1), 0x30, 0, 0x1FFF8);
            goz goz0 = (goz)object1;
            goz0.A();
            fryv fryv1 = ftyi0.c;
            goz0.M(0xB11F9D3C);
            if(fryv1 != null) {
                hfc hfc5 = iqn.a(hey0, "Subtitle");
                jbn jbn1 = fpu.d(goz0).j;
                switch(ftxs0.ordinal()) {
                    case 1: {
                        goz0.M(-602847273);
                        v5 = fsbs.b(fpu.a(goz0), goz0);
                        goz0.A();
                        break;
                    }
                    case 4: {
                        goz0.M(-602850003);
                        v5 = fpu.a(goz0).w;
                        goz0.A();
                        break;
                    }
                    default: {
                        goz0.M(0xA618B9F0);
                        v5 = hyxx.c() ? v1 : fpu.a(goz0).q;
                        goz0.A();
                    }
                }
                ftzd.a(fryv1, hfc5, v5, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz0, 0x30, 0, 0x1FFF8);
                goz0 = goz0;
            }
            goz0.A();
            fryv fryv2 = ftyi0.d;
            goz0.M(-1323307909);
            if(fryv2 != null) {
                hfc hfc6 = iqn.a(hey0, "TertiaryTitle");
                jbn jbn2 = fpu.d(goz0).j;
                switch(ftxs0.ordinal()) {
                    case 1: {
                        goz0.M(0xB90E670B);
                        if(hyxx.c()) {
                            goz0.M(1757330022);
                            v7 = fpu.a(goz0).a;
                        }
                        else {
                            goz0.M(0x68C01384);
                            v7 = fpu.a(goz0).q;
                        }
                        goz0.A();
                        v6 = v7;
                        goz0.A();
                        break;
                    }
                    case 3: {
                        goz0.M(0xB90E5BF0);
                        v6 = fpu.a(goz0).a;
                        goz0.A();
                        break;
                    }
                    default: {
                        goz0.M(0x68C2212F);
                        v6 = hyxx.c() ? v1 : fpu.a(goz0).q;
                        goz0.A();
                    }
                }
                ftzd.a(fryv2, hfc6, v6, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn2, goz0, 0x30, 0, 0x1FFF8);
                goz0 = goz0;
            }
            goz0.A();
            goz0.M(0xB12050EC);
            goz0.A();
            goz0.z();
            goz0.M(0xF00AD2A4);
            goz0.A();
            goz0.z();
            return ibom.a;
        }
        ((goz)object1).M(0xB11F1CFC);
        ((goz)object1).A();
        throw new ibnq();
    }
}

