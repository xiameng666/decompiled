public final class ctjv {
    public static final void a(String s, ctho ctho0, ibth ibth0, goz goz0, int v) {
        ibvd ibvd1;
        bboh bboh1;
        icmn icmn0;
        goz goz2;
        ctho ctho1;
        String s1;
        ibth ibth1;
        ibuq.f(ibth0, "onClose");
        goz goz1 = goz0.ao(0x1FCAE326);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ctho0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            ibth1 = ibth0;
            s1 = s;
            ctho1 = ctho0;
            goz2 = goz1;
        }
        else {
            bboh bboh0 = ctnb.b("AppCast");
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = gqe.a(ibru.a, goz1);
                goz1.P(object0);
            }
            ibvd ibvd0 = new ibvd();
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = icnm.a(Boolean.valueOf(false));
                goz1.P(object2);
            }
            goz1.x();
            ibvd0.a = (icnl)object2;
            goz1.M(0x6E3C21FE);
            Object object3 = goz1.j();
            if(object3 == object1) {
                object3 = icmu.e(0, 0, 0, 7);
                goz1.P(object3);
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object4 = goz1.j();
            if(object4 == object1) {
                object4 = icmu.e(0, 0, 0, 7);
                goz1.P(object4);
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object5 = goz1.j();
            if(object5 == object1) {
                icmn0 = (icmn)object3;
                bboh1 = bboh0;
                ctho1 = ctho0;
                ibvd1 = ibvd0;
                object5 = icbb.b(((icck)object0), null, null, new ctju(ctho0, icmn0, ibvd0, bboh0, ((icmn)object4), null), 3);
                goz1.P(object5);
            }
            else {
                bboh1 = bboh0;
                icmn0 = (icmn)object3;
                ibvd1 = ibvd0;
                ctho1 = ctho0;
            }
            goz1.x();
            hey hey0 = hfc.e;
            goz1.M(0x6E3C21FE);
            Object object6 = goz1.j();
            if(object6 == object1) {
                object6 = new ctji();
                goz1.P(object6);
            }
            goz1.x();
            hfc hfc0 = iuc.c(hey0, false, ((ibts)object6));
            s1 = s;
            ibth1 = ibth0;
            goz2 = goz1;
            jnl.b(new ctjj(((icck)object0), ((icmn)object4), bboh1, ibvd1, s, icmn0, ((iced)object5), ibth0), hfc0, new ctjk(ibvd1, s1), goz2, 0, 0);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ctjl(s1, ctho1, ibth1, v);
        }
    }
}

