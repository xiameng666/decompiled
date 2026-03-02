final class dnem implements ibtx {
    final dnfc a;

    public dnem(dnfc dnfc0) {
        this.a = dnfc0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        jks jks0 = (jks)((goz)object1).h(ipa.d);
        irc irc0 = (irc)((goz)object1).h(ipa.n);
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new jkv(jks0.ec(((int)(irc0.a() >> 0x20))));
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        if(jkv.a(((jkv)object3).a, 600.0f) >= 0) {
            ((goz)object1).M(0x686F6AFA);
            hey hey0 = hfc.e;
            hfc hfc0 = dla.c(dls.v(hey0), ((dld)object0));
            dnfc dnfc0 = this.a;
            iau iau0 = dll.b(dho.a, hei.k, ((goz)object1), 0x30);
            int v1 = dnel.a(gol.c(((goz)object1)));
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
            if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                ((goz)object1).R(integer0);
                ((goz)object1).p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(((goz)object1), ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(((goz)object1), hfc1, ibtw3);
            dlv.a(dlo.a(dlq.a, hey0, 1.0f), ((goz)object1));
            hfc hfc2 = dls.u(hey0);
            hfc hfc3 = dlo.a(dlq.a, hfc2, 1.0f);
            iau iau1 = dii.a(dho.e, hei.n, ((goz)object1), 54);
            int v2 = dnel.a(gol.c(((goz)object1)));
            gzk gzk1 = ((goz)object1).ap();
            hfc hfc4 = hew.c(((goz)object1), hfc3);
            ((goz)object1).O();
            if(((goz)object1).ab()) {
                ((goz)object1).t(ibth0);
            }
            else {
                ((goz)object1).T();
            }
            guo.b(((goz)object1), iau1, ibtw0);
            guo.b(((goz)object1), gzk1, ibtw1);
            if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
                Integer integer1 = v2;
                ((goz)object1).R(integer1);
                ((goz)object1).p(integer1, ibtw2);
            }
            guo.a(((goz)object1), ibts0);
            guo.b(((goz)object1), hfc4, ibtw3);
            dnfc.J(dnfc0, ((goz)object1));
            ((goz)object1).z();
            ((goz)object1).z();
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(1752598710);
        hfc hfc5 = dla.c(dls.v(hfc.e), ((dld)object0));
        dnfc dnfc1 = this.a;
        iau iau2 = dhw.a(hei.e, false);
        int v3 = dnel.a(gol.c(((goz)object1)));
        gzk gzk2 = ((goz)object1).ap();
        hfc hfc6 = hew.c(((goz)object1), hfc5);
        ibth ibth1 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau2, iej.e);
        guo.b(((goz)object1), gzk2, iej.d);
        ibtw ibtw4 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v3))) {
            Integer integer2 = v3;
            ((goz)object1).R(integer2);
            ((goz)object1).p(integer2, ibtw4);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc6, iej.c);
        dnfc.J(dnfc1, ((goz)object1));
        ((goz)object1).z();
        ((goz)object1).A();
        return ibom.a;
    }
}

