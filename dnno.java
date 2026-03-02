public final class dnno {
    public static final void a(hfc hfc0, ibth ibth0, goz goz0, int v) {
        goz goz2;
        hfc hfc1;
        ibth ibth1 = ibth0;
        ibuq.f(ibth1, "onClick");
        goz goz1 = goz0.ao(0x696CC6DA);
        int v1 = (v & 0x30) == 0 ? v | 6 | (goz1.Z(ibth1) ? 0x20 : 16) : v | 6;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(true) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            hfc1 = hfc.e;
            if(hwev.c()) {
                goz1.M(0x697B65F5);
                hfc hfc2 = dla.j(dls.C(hfc1, null, 3), 0.0f, 0.0f, 0.0f, 32.0f, 7);
                fryh fryh0 = new fryh(0x7F08060D);  // drawable:gs_qr_code_scanner_vd_theme_24
                fryr fryr0 = new fryr(0x7F1520D1);  // string:pay_scan_qr_code_text "Credit or Debit QR Code"
                frxq frxq0 = new frxq(fpu.a(goz1).q);
                goz2 = goz1;
                fuhx.b(hfc2, new fuhy(fuhq.b, true, fryr0, null, frxq0, fryh0, null, null, null, ibth0, 968), null, goz2, 0x40, 4);
                goz2.x();
                ibth1 = ibth0;
            }
            else {
                goz1.M(1770207852);
                ibth1 = ibth0;
                fiqv.b(ibth1, dla.j(dls.C(hfc1, null, 3), 0.0f, 12.0f, 0.0f, 24.0f, 5), true, null, null, null, null, gzf.e(2095936900, new dnnn(hfc1), goz1), goz1, v1 >> 3 & 14 | 0x30000000 | v1 & 0x380, 504);
                goz2 = goz1;
                goz2.x();
            }
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dnnm(hfc1, ibth1, v);
        }
    }
}

