public final class ctkp {
    public static final void a(goz goz0, int v) {
        goz goz2;
        int v2;
        goz goz1 = goz0.ao(0xF47250C1);
        int v1 = 0;
        if(v != 0) {
            v2 = v;
        label_10:
            hey hey0 = hfc.e;
            hfc hfc0 = dls.v(hey0);
            iau iau0 = dii.a(dho.e, hei.n, goz1, 54);
            int v3 = ctkn.a(gol.c(goz1));
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
            ibtw ibtw0 = iej.e;
            guo.b(goz1, iau0, ibtw0);
            ibtw ibtw1 = iej.d;
            guo.b(goz1, gzk0, ibtw1);
            ibtw ibtw2 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc1, ibtw3);
            hfc hfc2 = dla.d(hey0, 10.0f);
            iau iau1 = dhw.a(hei.a, false);
            int v4 = ctkn.a(gol.c(goz1));
            gzk gzk1 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            guo.b(goz1, iau1, ibtw0);
            guo.b(goz1, gzk1, ibtw1);
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer1 = v4;
                goz1.P(integer1);
                goz1.p(integer1, ibtw2);
            }
            guo.a(goz1, ibts0);
            guo.b(goz1, hfc3, ibtw3);
            fpo.b(null, 0L, null, goz1, 0, 7);
            goz1.z();
            goz2 = goz1;
            gdh.b(isq.c(0x7F151945, goz1), null, hll.e, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, goz2, 0x180, 0, 0x3FFFA);  // string:multidevice_sync_app_cast_searching_for_devices "Searching for nearby devices"
            goz2.z();
            v1 = v2;
        }
        else if(!goz1.ac()) {
            v2 = 0;
            goto label_10;
        }
        else {
            goz1.G();
            goz2 = goz1;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ctko(v1);
        }
    }
}

