public final class ddfz {
    public static final float a;
    private static final chz b;
    private static final float c;
    private static final float d;

    static {
        ddfz.b = new chz(0.8f, 0.0f, 0.8f, 0.15f);
        ddfz.c = 28.0f;
        ddfz.d = 4.0f;
        ddfz.a = 12.0f;
    }

    public static final Object a(ges ges0, float f, cib cib0, chl chl0, ibrl ibrl0) {
        ibva ibva0;
        ddfy ddfy0;
        if((ibrl0 instanceof ddfy)) {
            ddfy0 = (ddfy)ibrl0;
            int v = ddfy0.c;
            if((v & 0x80000000) == 0) {
                ddfy0 = new ddfy(ibrl0);
            }
            else {
                ddfy0.c = v - 0x80000000;
            }
        }
        else {
            ddfy0 = new ddfy(ibrl0);
        }
        Object object0 = ddfy0.b;
        Object object1 = ibrx.a;
        switch(ddfy0.c) {
            case 0: {
                ibnx.b(object0);
                if(ges0.a() < 0.01f) {
                    return new jls(0L);
                }
                if(ges0.a() == 1.0f) {
                    return new jls(0L);
                }
                ibva0 = new ibva();
                ibva0.a = f;
                if(cib0 != null && (Math.abs(f) > 1.0f)) {
                    ibva ibva1 = new ibva();
                    chn chn0 = cho.b(0.0f, f, 28);
                    ddfl ddfl0 = new ddfl(ibva1, ges0, ibva0);
                    ddfy0.a = ges0;
                    ddfy0.e = (ckh)chl0;
                    ddfy0.d = ibva0;
                    ddfy0.c = 1;
                    if(cku.i(chn0, cib0, ddfl0, ddfy0) == object1) {
                        return object1;
                    }
                }
                goto label_36;
            }
            case 1: {
                ibva ibva2 = ddfy0.d;
                chl0 = ddfy0.e;
                ges ges1 = (ges)ddfy0.a;
                ibnx.b(object0);
                ibva0 = ibva2;
                ges0 = ges1;
            label_36:
                if(chl0 != null && (ges0.c() < 0.0f) && (ges0.c() > ges0.b)) {
                    chn chn1 = cho.b(ges0.c(), 0.0f, 30);
                    float f1 = ges0.a() < 0.5f ? 0.0f : ges0.b;
                    ddfm ddfm0 = new ddfm(ges0);
                    ddfy0.a = ibva0;
                    ddfy0.e = null;
                    ddfy0.d = null;
                    ddfy0.c = 2;
                    if(cku.j(chn1, new Float(f1), chl0, false, ddfm0, ddfy0, 4) == object1) {
                        return object1;
                    }
                }
                return new jls(jlt.a(0.0f, ibva0.a));
            }
            case 2: {
                ibva ibva3 = (ibva)ddfy0.a;
                ibnx.b(object0);
                return new jls(jlt.a(0.0f, ibva3.a));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final void b(String s, hfc hfc0, ibtw ibtw0, ibtx ibtx0, dmf dmf0, gej gej0, gep gep0, float f, float f1, goz goz0, int v, int v1) {
        ibtx ibtx3;
        ibtw ibtw3;
        hfc hfc3;
        float f5;
        float f4;
        dmf dmf2;
        float f3;
        dmf dmf1;
        ibtx ibtx2;
        ibtw ibtw2;
        hfc hfc2;
        goz goz2;
        float f2;
        gep gep1;
        gej gej1;
        ibtx ibtx1;
        ibtw ibtw1;
        hfc hfc1;
        int v2;
        ibuq.f(s, "title");
        goz goz1 = goz0.ao(0x7BD00278);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            hfc1 = hfc0;
        }
        else if((v & 0x30) == 0) {
            hfc1 = hfc0;
            v2 |= (goz1.X(hfc1) ? 0x20 : 16);
        }
        else {
            hfc1 = hfc0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            ibtw1 = ibtw0;
        }
        else if((v & 0x180) == 0) {
            ibtw1 = ibtw0;
            v2 |= (goz1.Z(ibtw1) ? 0x100 : 0x80);
        }
        else {
            ibtw1 = ibtw0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            ibtx1 = ibtx0;
        }
        else if((v & 0xC00) == 0) {
            ibtx1 = ibtx0;
            v2 |= (goz1.Z(ibtx1) ? 0x800 : 0x400);
        }
        else {
            ibtx1 = ibtx0;
        }
        if((v & 0x6000) == 0) {
            v2 |= 0x2000;
        }
        if((0x30000 & v) == 0) {
            gej1 = gej0;
            v2 |= (goz1.X(gej1) ? 0x20000 : 0x10000);
        }
        else {
            gej1 = gej0;
        }
        if((0x180000 & v) == 0) {
            gep1 = gep0;
            v2 |= (goz1.X(gep1) ? 0x100000 : 0x80000);
        }
        else {
            gep1 = gep0;
        }
        if((0x2492493 & (v2 | 0x6C00000)) == 0x2492492 && goz1.ac()) {
            goz1.G();
            f2 = f;
            goz2 = goz1;
            hfc2 = hfc1;
            ibtw2 = ibtw1;
            ibtx2 = ibtx1;
            dmf1 = dmf0;
            f3 = f1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                dmf2 = dmf0;
                f4 = f;
                f5 = f1;
                hfc3 = hfc1;
                ibtw3 = ibtw1;
                ibtx3 = ibtx1;
            }
            else {
                hfc3 = (v1 & 2) == 0 ? hfc1 : hfc.e;
                ibtw3 = (v1 & 4) == 0 ? ibtw1 : ddcv.a;
                ibtx3 = (v1 & 8) == 0 ? ibtx1 : ddcv.b;
                dmf2 = fiuq.b(goz1);
                f4 = 164.0f;
                f5 = 56.0f;
            }
            goz1.w();
            jbn jbn0 = fpu.d(goz1).c;
            jbn jbn1 = fpu.d(goz1).g;
            gze gze0 = gzf.e(-506525080, new ddfr(s), goz1);
            gze gze1 = gzf.e(0xEC2D422B, new ddfs(s), goz1);
            int v3 = (0xFFFF1FFF & (v2 | 0x6C00000)) << 12;
            goz2 = goz1;
            ddfz.d(hfc3, gze0, jbn0, ddfz.c, gze1, jbn1, ibtw3, ibtx3, dmf2, gej1, f4, f5, gep1, goz2, (v2 | 0x6C00000) >> 3 & 14 | 0x6C30 | 0x380000 & v3 | 0x1C00000 & v3 | v3 & 0x70000000, (v2 | 0x6C00000) >> 21 & 0x7E | (v2 | 0x6C00000) >> 12 & 0x380);
            hfc2 = hfc3;
            ibtw2 = ibtw3;
            ibtx2 = ibtx3;
            dmf1 = dmf2;
            f2 = f4;
            f3 = f5;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddfn(s, hfc2, ibtw2, ibtx2, dmf1, gej0, gep0, f2, f3, v, v1);
        }
    }

    public static final void c(hfc hfc0, float f, long v, long v1, long v2, ibtw ibtw0, jbn jbn0, float f1, dhn dhn0, dhf dhf0, int v3, boolean z, ibtw ibtw1, ibtw ibtw2, goz goz0, int v4, int v5) {
        hfc hfc5;
        int v19;
        long v17;
        ibtw ibtw5;
        ibtw ibtw4;
        long v16;
        ibtw ibtw3;
        int v14;
        int v13;
        int v12;
        int v11;
        goz goz1 = goz0.ao(0x388F7AD5);
        int v6 = (v4 & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v4 : v4;
        int v7 = 16;
        if((v4 & 0x30) == 0) {
            v6 |= (goz1.U(f) ? 0x20 : 16);
        }
        int v8 = 0x80;
        if((v4 & 0x180) == 0) {
            v6 |= (goz1.W(v) ? 0x100 : 0x80);
        }
        int v9 = 0x400;
        int v10 = (v4 & 0xC00) == 0 ? v6 | (goz1.W(v1) ? 0x800 : 0x400) : v6;
        if((v4 & 0x6000) == 0) {
            v10 |= (goz1.W(v2) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x30000) == 0) {
            v10 |= (goz1.Z(ibtw0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x180000) == 0) {
            v10 |= (goz1.X(jbn0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0xC00000) == 0) {
            v10 |= (goz1.U(f1) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x6000000) == 0) {
            v10 |= (goz1.X(dhn0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x30000000) == 0) {
            v10 |= (goz1.X(dhf0) ? 0x20000000 : 0x10000000);
        }
        if((v5 & 6) == 0) {
            v11 = v3;
            v12 = v10;
            v13 = v5 | (goz1.V(v11) ? 4 : 2);
        }
        else {
            v11 = v3;
            v12 = v10;
            v13 = v5;
        }
        if((v5 & 0x30) == 0) {
            if(goz1.Y(z)) {
                v7 = 0x20;
            }
            v14 = v13 | v7;
        }
        else {
            v14 = v13;
        }
        if((v5 & 0x180) == 0) {
            ibtw3 = ibtw1;
            if(goz1.Z(ibtw3)) {
                v8 = 0x100;
            }
            v14 |= v8;
        }
        else {
            ibtw3 = ibtw1;
        }
        int v15 = v14;
        if((v5 & 0xC00) == 0) {
            if(goz1.Z(ibtw2)) {
                v9 = 0x800;
            }
            v15 |= v9;
        }
        if((v12 & 306783379) == 306783378 && (v15 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            v16 = v2;
            ibtw4 = ibtw2;
            ibtw5 = ibtw0;
            v17 = v1;
        }
        else {
            goz1.M(-1224400529);
            Object object0 = goz1.j();
            if((((v12 & 0x70) == 0x20 ? 1 : 0) | ((v12 & 0x70000000) == 0x20000000 ? 1 : 0) | ((v12 & 0xE000000) == 0x4000000 ? 1 : 0) | ((v15 & 14) == 4 ? 1 : 0)) != 0 || object0 == gop.a) {
                object0 = new ddfu(f, dhf0, dhn0, v11);
                goz1.P(object0);
            }
            goz1.x();
            int v18 = ddfi.a(gol.c(goz1));
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
            ibtw ibtw6 = iej.e;
            guo.b(goz1, ((iau)object0), ibtw6);
            ibtw ibtw7 = iej.d;
            guo.b(goz1, gzk0, ibtw7);
            ibtw ibtw8 = iej.f;
            if(goz1.x) {
                v19 = v18;
            label_80:
                Integer integer0 = v19;
                goz1.P(integer0);
                goz1.p(integer0, ibtw8);
            }
            else {
                v19 = v18;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v19))) {
                    goto label_80;
                }
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw9 = iej.c;
            guo.b(goz1, hfc1, ibtw9);
            hey hey0 = hfc.e;
            hfc hfc2 = dla.j(hzm.a(hey0, "navigationIcon"), ddfz.d, 0.0f, 0.0f, 0.0f, 14);
            float f2 = ddfz.d;
            iau iau0 = dhw.a(hei.a, false);
            int v20 = ddfi.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            goz1.O();
            hel hel0 = hei.a;
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau0, ibtw6);
            guo.b(goz1, gzk1, ibtw7);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v20))) {
                Integer integer1 = v20;
                goz1.P(integer1);
                goz1.p(integer1, ibtw8);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc3, ibtw9);
            grx grx0 = fft.a;
            gpo.a(grx0.c(new hll(v)), ibtw3, goz1, v15 >> 3 & 0x70 | 8);
            goz1.z();
            hfc hfc4 = dla.i(hzm.a(hey0, "title"), f2, 0.0f, 2);
            goz1.M(-2042118958);
            if(z) {
                goz1.M(0x6E3C21FE);
                Object object1 = goz1.j();
                if(object1 == gop.a) {
                    object1 = new ddfj();
                    goz1.P(object1);
                }
                goz1.x();
                hfc5 = iuc.b(hey0, ((ibts)object1));
            }
            else {
                hfc5 = hey0;
            }
            goz1.x();
            hfc hfc6 = hlv.c(hfc4.a(hfc5), 0.0f, 0.0f, f1, 0.0f, null, false, 0x7FFFB);
            iau iau1 = dhw.a(hel0, false);
            gzk gzk2 = goz1.ak();
            hfc hfc7 = hew.c(goz1, hfc6);
            goz1.O();
            int v21 = ddfi.a(gol.c(goz1));
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw6);
            guo.b(goz1, gzk2, ibtw7);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v21))) {
                Integer integer2 = v21;
                goz1.P(integer2);
                goz1.p(integer2, ibtw8);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc7, ibtw9);
            jbn jbn1 = ((jbn)goz1.h(gdh.a)).m(jbn0);
            gry[] arr_gry = new gry[2];
            v17 = v1;
            arr_gry[0] = grx0.c(new hll(v17));
            arr_gry[1] = gdh.a.c(jbn1);
            ibtw5 = ibtw0;
            gpo.b(arr_gry, ibtw5, goz1, v12 >> 12 & 0x70 | 8);
            goz1.z();
            hfc hfc8 = dla.j(hzm.a(hey0, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            iau iau2 = dhw.a(hel0, false);
            int v22 = ddfi.a(gol.c(goz1));
            gzk gzk3 = goz1.ak();
            hfc hfc9 = hew.c(goz1, hfc8);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw6);
            guo.b(goz1, gzk3, ibtw7);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v22))) {
                Integer integer3 = v22;
                goz1.P(integer3);
                goz1.p(integer3, ibtw8);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc9, ibtw9);
            v16 = v2;
            ibtw4 = ibtw2;
            gpo.a(grx0.c(new hll(v16)), ibtw4, goz1, v15 >> 6 & 0x70 | 8);
            goz1.z();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddfk(hfc0, f, v, v17, v16, ibtw5, jbn0, f1, dhn0, dhf0, v3, z, ibtw1, ibtw4, v4, v5);
        }
    }

    public static final void d(hfc hfc0, ibtw ibtw0, jbn jbn0, float f, ibtw ibtw1, jbn jbn1, ibtw ibtw2, ibtx ibtx0, dmf dmf0, gej gej0, float f1, float f2, gep gep0, goz goz0, int v, int v1) {
        hfc hfc1;
        goz goz2;
        int v6;
        ibtw ibtw4;
        ibtw ibtw3;
        goz goz1 = goz0.ao(0xD196B6E9);
        int v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        int v3 = 0x20;
        if((v & 0x30) == 0) {
            ibtw3 = ibtw0;
            v2 |= (goz1.Z(ibtw3) ? 0x20 : 16);
        }
        else {
            ibtw3 = ibtw0;
        }
        int v4 = 0x80;
        if((v & 0x180) == 0) {
            v2 |= (goz1.X(jbn0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v2 |= (goz1.U(f) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            ibtw4 = ibtw1;
            v2 |= (goz1.Z(ibtw4) ? 0x4000 : 0x2000);
        }
        else {
            ibtw4 = ibtw1;
        }
        if((0x30000 & v) == 0) {
            v2 |= (goz1.X(jbn1) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v2 |= (goz1.Z(ibtw2) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= (goz1.Z(ibtx0) ? 0x800000 : 0x400000);
        }
        if((v & 0x6000000) == 0) {
            v2 |= (goz1.X(dmf0) ? 0x4000000 : 0x2000000);
        }
        if((v & 0x30000000) == 0) {
            v2 |= (goz1.X(gej0) ? 0x20000000 : 0x10000000);
        }
        int v5 = (v1 & 6) == 0 ? v1 | (goz1.U(f1) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            if(!goz1.U(f2)) {
                v3 = 16;
            }
            v5 |= v3;
        }
        if((v1 & 0x180) == 0) {
            if(goz1.X(gep0)) {
                v4 = 0x100;
            }
            v6 = v5 | v4;
        }
        else {
            v6 = v5;
        }
        if((v2 & 306783379) == 306783378 && (v6 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            if(jkv.a(f1, f2) <= 0) {
                throw new IllegalArgumentException("A TwoRowsTopAppBar max height should be greater than its pinned height");
            }
            ibva ibva0 = new ibva();
            ibva ibva1 = new ibva();
            ibvb ibvb0 = new ibvb();
            jks jks0 = (jks)goz1.h(ipa.d);
            ibva0.a = jks0.eg(f2);
            ibva1.a = jks0.eg(f1);
            ibvb0.a = jks0.ei(f);
            goz1.M(0x97EA02AA);
            int v7 = goz1.U(ibva0.a) | ((v6 & 0x380) == 0x100 ? 1 : 0) | goz1.U(ibva1.a);
            Object object0 = goz1.j();
            if(v7 != 0 || object0 == gop.a) {
                object0 = new ddfo(gep0, ibva0, ibva1);
                goz1.P(object0);
            }
            goz1.x();
            gqe.h(((ibth)object0), goz1);
            float f3 = 0.0f;
            if(gep0 != null) {
                ges ges0 = gep0.b();
                if(ges0 != null) {
                    f3 = ges0.a();
                }
            }
            float f4 = cih.c.a(f3);
            long v8 = hln.h(gej0.a, gej0.b, f4);
            gze gze0 = gzf.e(0x7C0DE172, new ddfw(ibtx0), goz1);
            float f5 = ddfz.b.a(f3);
            int v9 = Float.compare(f3, 0.5f);
            goz1.M(-960107681);
            if(gep0 != null && !gep0.d()) {
                hey hey0 = hfc.e;
                dbw dbw0 = dbw.a;
                goz1.M(5004770);
                Object object1 = goz1.j();
                if((v6 & 0x380) == 0x100 || object1 == gop.a) {
                    object1 = new ddfp(gep0);
                    goz1.P(object1);
                }
                goz1.x();
                dat dat0 = dan.c(((ibts)object1), goz1);
                goz1.M(5004770);
                Object object2 = goz1.j();
                if((v6 & 0x380) == 0x100 || object2 == gop.a) {
                    object2 = new ddfx(gep0, null);
                    goz1.P(object2);
                }
                goz1.x();
                hfc1 = dan.b(hey0, dat0, dbw0, false, false, ((ibtx)object2), 0xBC);
            }
            else {
                hfc1 = hfc.e;
            }
            goz1.x();
            goz2 = goz1;
            gaq.c(hfc1, null, v8, 0L, 0.0f, 0.0f, null, gzf.e(0x314E70EE, new ddfv(dmf0, ibva0, gej0, ibtw4, jbn1, f5, v9 < 0, ibtw2, gze0, ibva1, gep0, ibtw3, jbn0, 1.0f - f3, ibvb0, v9 >= 0), goz1), goz2, 0x7A);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ddfq(hfc0, ibtw0, jbn0, f, ibtw1, jbn1, ibtw2, ibtx0, dmf0, gej0, f1, f2, gep0, v, v1);
        }
    }

    public static final void e(hfc hfc0, float f, long v, long v1, long v2, ibtw ibtw0, jbn jbn0, float f1, dhn dhn0, dhf dhf0, int v3, boolean z, ibtw ibtw1, ibtw ibtw2, goz goz0, int v4) {
        ddfz.c(hfc0, f, v, v1, v2, ibtw0, jbn0, f1, dhn0, dhf0, v3, z, ibtw1, ibtw2, goz0, 0x36000000, v4);
    }
}

