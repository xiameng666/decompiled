public final class aaag {
    public static final void a(gra gra0, jhk jhk0) {
        gra0.b(jhk0);
    }

    public static final boolean b(gui gui0) {
        return ((Boolean)gui0.a()).booleanValue();
    }

    public static final void c(aapz aapz0, goz goz0, int v) {
        gui gui3;
        ibuq.f(aapz0, "viewModel");
        goz goz1 = goz0.ao(0xF76FA21C);
        if((((v & 6) == 0 ? v | (goz1.Z(aapz0) ? 4 : 2) : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            ipc ipc0 = (ipc)goz1.h(ipa.j);
            hio hio0 = (hio)goz1.h(ipa.e);
            ibuq.e(aapz0.e, "getSearchItemsList(...)");
            gui gui0 = gzx.a(aapz0.e, ggna.a, goz1);
            ibuq.e(aapz0.i, "getPlaceholderText(...)");
            gui gui1 = gzx.a(aapz0.i, "", goz1);
            ibuq.e(aapz0.g, "getLoading(...)");
            Object object0 = aapz0.g.ij();
            gui gui2 = gzx.a(aapz0.g, object0, goz1);
            hax hax0 = jhk.a;
            goz1.M(0x6E3C21FE);
            Object object1 = goz1.j();
            Object object2 = gop.a;
            if(object1 == object2) {
                object1 = new zzt();
                goz1.P(object1);
            }
            goz1.x();
            gra gra0 = had.b(new Object[0], hax0, ((ibth)object1), goz1, 0x180);
            goz1.M(0x6E3C21FE);
            Object object3 = goz1.j();
            if(object3 == object2) {
                object3 = new hix();
                goz1.P(object3);
            }
            goz1.x();
            doz doz0 = dpc.a(0, goz1, 3);
            goz1.M(0x6E3C21FE);
            Object object4 = goz1.j();
            if(object4 == object2) {
                gpx gpx0 = new gpx(new zzu(doz0), null);
                goz1.P(gpx0);
                object4 = gpx0;
            }
            goz1.x();
            Boolean boolean0 = Boolean.valueOf(aaag.b(((gui)object4)));
            goz1.M(0x97EA02AA);
            int v1 = goz1.X(ipc0) | goz1.Z(hio0);
            Object object5 = goz1.j();
            if(v1 != 0 || object5 == object2) {
                object5 = new zzz(ipc0, hio0, ((gui)object4), null);
                goz1.P(object5);
            }
            goz1.x();
            gqe.f(boolean0, ((ibtw)object5), goz1);
            ibom ibom0 = ibom.a;
            goz1.M(-1633490746);
            boolean z = goz1.X(ipc0);
            Object object6 = goz1.j();
            if(z || object6 == object2) {
                object6 = new aaaa(((hix)object3), ipc0, null);
                goz1.P(object6);
            }
            goz1.x();
            gqe.f(ibom0, ((ibtw)object6), goz1);
            hey hey0 = hfc.e;
            hfc hfc0 = dla.c(cqx.c(hey0, fpu.a(goz1).G), dmk.b(new dkt(dmw.d(goz1), 0x1F), goz1));
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v2 = zzs.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, iej.e);
            ibtw ibtw0 = iej.d;
            guo.b(goz1, gzk0, ibtw0);
            ibtw ibtw1 = iej.f;
            ibtw ibtw2 = iej.e;
            if(goz1.x) {
                gui3 = gui1;
            label_77:
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            else {
                gui3 = gui1;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                    goto label_77;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            Object object7 = gui3.a();
            ibuq.e(object7, "<get-value>(...)");
            jhk jhk0 = (jhk)gra0.a();
            goz1.M(-1633490746);
            int v3 = goz1.X(gra0) | goz1.Z(aapz0);
            Object object8 = goz1.j();
            if(v3 != 0 || object8 == object2) {
                object8 = new zzv(aapz0, gra0);
                goz1.P(object8);
            }
            goz1.x();
            aaag.d(((String)object7), jhk0, ((ibts)object8), gzf.e(0x27D79BC6, new aaac(aapz0), goz1), gzf.e(0x1FD20A25, new aaae(gra0, aapz0), goz1), hiz.a(hey0, ((hix)object3)), goz1, 0x6C00);
            iau iau1 = dhw.a(hei.a, false);
            int v4 = zzs.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hey0);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw2);
            guo.b(goz1, gzk1, ibtw0);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer1 = v4;
                goz1.P(integer1);
                goz1.p(integer1, ibtw1);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc2, ibtw3);
            zzd.a(ibuq.m(((Boolean)gui2.a()), Boolean.valueOf(true)), dic.a.a(hey0, hei.b), gzf.e(0x52CC0B43, new aaaf(doz0, gui0), goz1), goz1, 0x180);
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new zzw(aapz0, v);
        }
    }

    public static final void d(String s, jhk jhk0, ibts ibts0, ibtw ibtw0, ibtw ibtw1, hfc hfc0, goz goz0, int v) {
        goz goz2;
        hfc hfc1;
        ibuq.f(s, "placeholder");
        ibuq.f(jhk0, "value");
        ibuq.f(ibts0, "onValueChange");
        ibuq.f(ibtw0, "leadingIcon");
        ibuq.f(ibtw1, "trailingIcon");
        goz goz1 = goz0.ao(685010169);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(jhk0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x4000 : 0x2000);
        }
        if((0x30000 & v) == 0) {
            hfc1 = hfc0;
            v1 |= (goz1.X(hfc1) ? 0x20000 : 0x10000);
        }
        else {
            hfc1 = hfc0;
        }
        if((74899 & v1) == 74898 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            eeq eeq0 = new eeq(0, null, 0, 3, null, null, 0x77);
            goz1.M(0x6FC8BAE1);
            long v2 = firh.g(fivw.b, goz1);
            long v3 = firh.g(fivw.b, goz1);
            long v4 = hll.h(firh.g(fivg.e, goz1), 0.38f);
            long v5 = firh.g(fivg.a, goz1);
            euw euw0 = (euw)goz1.h(euy.a);
            long v6 = firh.g(fivw.c, goz1);
            long v7 = firh.g(fivw.c, goz1);
            long v8 = hll.h(firh.g(fivg.i, goz1), 0.38f);
            long v9 = firh.g(fivw.e, goz1);
            long v10 = firh.g(fivw.e, goz1);
            long v11 = hll.h(firh.g(fivg.m, goz1), 0.38f);
            long v12 = firh.g(fivw.d, goz1);
            long v13 = firh.g(fivw.d, goz1);
            long v14 = hll.h(firh.g(fivg.e, goz1), 0.38f);
            long v15 = firh.g(fivg.C, goz1);
            long v16 = firh.g(fivg.C, goz1);
            long v17 = hll.h(firh.g(fivg.C, goz1), 0.38f);
            long v18 = firh.g(fivg.D, goz1);
            long v19 = firh.g(fivg.D, goz1);
            long v20 = hll.h(firh.g(fivg.D, goz1), 0.38f);
            goz2 = goz1;
            gcd gcd0 = gcj.d(v2, v3, v4, 0L, firh.g(fivw.a, goz1), firh.g(fivw.a, goz1), firh.g(fivw.a, goz1), 0L, v5, 0L, euw0, 0L, 0L, 0L, 0L, v6, v7, v8, 0L, v9, v10, v11, 0L, 0L, 0L, 0L, 0L, v12, v13, v14, 0L, 0L, 0L, 0L, 0L, v15, v16, v17, 0L, v18, v19, v20, 0L, goz2, 1204058760, 0x88F);
            goz2.x();
            gcs.b(jhk0, ibts0, dls.w(hfc1), false, null, gzf.e(-1704960332, new zzy(s), goz2), ibtw0, ibtw1, null, eeq0, null, null, gcd0, goz2, v1 >> 3 & 0x70 | (v1 >> 3 & 14 | 0xC00000) | 0xE000000 & v1 << 15 | v1 << 15 & 0x70000000, 0x36C30000, 0);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new zzx(s, jhk0, ibts0, ibtw0, ibtw1, hfc0, v);
        }
    }
}

