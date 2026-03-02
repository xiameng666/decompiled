public final class ddgc {
    public static final void a(ibtw ibtw0, ibtw ibtw1, boolean z, ibts ibts0, goz goz0, int v) {
        long v10;
        fiul fiul1;
        int v4;
        long v2;
        ibtw ibtw3;
        ibtw ibtw2;
        goz goz1 = goz0.ao(1310559315);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x800 : 0x400);
        }
        if((v1 & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
            ibtw2 = ibtw1;
            ibtw3 = ibtw0;
        }
        else {
            boolean z1 = ((Boolean)goz1.h(ddid.a)).booleanValue();
            fiul fiul0 = (fiul)goz1.h(ddid.b);
            if(z) {
                goz1.M(1022094874);
                v2 = ddhw.a(goz1).a;
            }
            else {
                goz1.M(1022096188);
                v2 = ddhw.a(goz1).f;
            }
            goz1.x();
            hey hey0 = hfc.e;
            hfc hfc0 = dla.e(hey0, 16.0f, 24.0f);
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v3 = ddga.a(gol.c(goz1));
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
            ibtw ibtw4 = iej.e;
            guo.b(goz1, iau0, ibtw4);
            ibtw ibtw5 = iej.d;
            guo.b(goz1, gzk0, ibtw5);
            ibtw ibtw6 = iej.f;
            if(goz1.x) {
                v4 = v3;
            label_44:
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw6);
            }
            else {
                v4 = v3;
                if(!ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                    goto label_44;
                }
            }
            ibts ibts1 = iej.g;
            guo.a(goz1, ibts1);
            ibtw ibtw7 = iej.c;
            guo.b(goz1, hfc1, ibtw7);
            hfc hfc2 = dls.w(dla.d(cqx.c(dzu.b(hhi.a(hey0, fpu.c(goz1).e), z, new its(2), ibts0), v2), 20.0f));
            iau iau1 = dll.b(dho.a, hei.k, goz1, 0x30);
            int v5 = ddga.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw4);
            guo.b(goz1, gzk1, ibtw5);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v5))) {
                Integer integer1 = v5;
                goz1.P(integer1);
                goz1.p(integer1, ibtw6);
            }
            guo.a(goz1, ibts1);
            guo.b(goz1, hfc3, ibtw7);
            hfc hfc4 = dlo.a(dlq.a, hey0, 1.0f);
            iau iau2 = dhw.a(hei.a, false);
            int v6 = ddga.a(gol.c(goz1));
            gzk gzk2 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hfc4);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau2, ibtw4);
            guo.b(goz1, gzk2, ibtw5);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer2 = v6;
                goz1.P(integer2);
                goz1.p(integer2, ibtw6);
            }
            guo.a(goz1, ibts1);
            guo.b(goz1, hfc5, ibtw7);
            ibtw3 = ibtw0;
            ibtw3.a(goz1, Integer.valueOf(v1 & 14));
            goz1.z();
            hfc hfc6 = dla.j(hey0, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            long v7 = ddhw.a(goz1).a;
            long v8 = ddhw.a(goz1).e;
            long v9 = hll.h;
            if(z1) {
                fiul1 = fiul0;
                v10 = fiul1.c;
            }
            else {
                fiul1 = fiul0;
                v10 = fiul1.b;
            }
            fiua.a(z, null, hfc6, null, false, fity.a(v7, v8, v9, v10, (z1 ? fiul1.e : fiul1.d), v9, goz1, 0xFF88), null, goz1, v1 >> 6 & 14 | 0x1B0, 88);
            goz1.z();
            goz1.M(0x6D312DCB);
            if(ibtw1 == null) {
                ibtw2 = null;
            }
            else {
                ibtw2 = ibtw1;
                ibtw2.a(goz1, Integer.valueOf(v1 >> 3 & 14));
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ddgb(ibtw3, ibtw2, z, ibts0, v);
        }
    }
}

