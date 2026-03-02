public final class fuin {
    public static final void a(hfc hfc0, fuio fuio0, goz goz0, int v, int v1) {
        hll hll0;
        hfc hfc2;
        goz goz2;
        hfc hfc1;
        int v2;
        ibuq.f(fuio0, "state");
        goz goz1 = goz0.ao(-169654350);
        if(v1 != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = (goz1.X(hfc1) ? 4 : 2) | v;
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(fuio0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            hfc2 = hfc1;
            goto label_65;
        }
        hfc hfc3 = v1 == 0 ? hfc1 : hfc.e;
        iau iau0 = dll.b(dho.g(8.0f), hei.k, goz1, 54);
        long v3 = gol.c(goz1);
        gzk gzk0 = goz1.ak();
        hfc hfc4 = hew.c(goz1, hfc3);
        ibth ibth0 = iej.a;
        goz1.O();
        if(goz1.x) {
            goz1.t(ibth0);
        }
        else {
            goz1.T();
        }
        int v4 = (int)(v3 >>> 0x20 ^ v3);
        guo.b(goz1, iau0, iej.e);
        guo.b(goz1, gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
            Integer integer0 = v4;
            goz1.P(integer0);
            goz1.p(integer0, ibtw0);
        }
        guo.a(goz1, iej.g);
        guo.b(goz1, hfc4, iej.c);
        fuin.b(dls.k(iqn.a(hfc.e, "MetadataLeadingIcon"), 24.0f), fuio0, goz1, v2 & 0x70 | 6);
        fryv fryv0 = fuio0.b;
        jbn jbn0 = fpu.d(goz1).m;
        fuij fuij0 = fuio0.a;
        if((fuij0 instanceof fuii)) {
            goz1.M(2076998226);
            hll0 = fuin.c(((fuii)fuij0).a, goz1);
            goz1.x();
            goto label_58;
        }
        if((fuij0 instanceof fuih)) {
            goz1.M(2077000791);
            fuih fuih0 = (fuih)fuij0;
            fuin.d(goz1);
            goz1.x();
            hll0 = null;
        label_58:
            goz1.M(2076996252);
            long v5 = hll0 == null ? fpu.a(goz1).q : hll0.j;
            goz1.x();
            hfc2 = hfc3;
            ftzd.a(fryv0, null, v5, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFFA);
            goz2 = goz1;
            goz2.z();
        label_65:
            gsb gsb0 = goz2.af();
            if(gsb0 != null) {
                gsb0.d = new fuik(hfc2, fuio0, v, v1);
            }
            return;
        }
        goz1.M(2076996213);
        goz1.x();
        throw new ibnq();
    }

    public static final void b(hfc hfc0, fuio fuio0, goz goz0, int v) {
        ibuq.f(fuio0, "state");
        goz goz1 = goz0.ao(0x7C0C31D6);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fuio0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_49;
        }
        fuij fuij0 = fuio0.a;
        if((fuij0 instanceof fuii)) {
            goz1.M(0x8F1E6FFB);
            goz1.M(-1446565702);
            fuip fuip0 = ((fuii)fuij0).a;
            if(fuip0 == fuip.f) {
                fwy.g(hfc0, 0L, 0.0f, 0L, 0, 0.0f, goz1, v1 & 14, 62);
                goz1.x();
                goz1.x();
                gsb gsb0 = goz1.af();
                if(gsb0 == null) {
                    return;
                }
                gsb0.d = new fuil(hfc0, fuio0, v);
                return;
            }
            goz1.x();
            frxv frxv0 = null;
            switch(fuip0.ordinal()) {
                case 1: {
                    frxv0 = new frxv(new fryn(fuqf.a, 0, 6));
                    break;
                }
                case 2: {
                    frxv0 = new frxv(new fryn(fuqh.a, 0, 6));
                    break;
                }
                case 3: {
                    frxv0 = new fryh(0x7F08056E);  // drawable:gs_error_vd_theme_24
                    break;
                }
                case 4: {
                    frxv0 = new fryh(0x7F08067B);  // drawable:gs_warning_vd_theme_24
                    break;
                }
                case 0: 
                case 5: {
                    break;
                }
                case 6: {
                    frxv0 = new fryh(0x7F0805BB);  // drawable:gs_lock_vd_theme_24
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            if(frxv0 != null) {
                hll hll0 = fuin.c(fuip0, goz1);
                goz1.M(0xA9C7C71F);
                long v2 = hll0 == null ? fpu.a(goz1).a : hll0.j;
                goz1.x();
                ftyy.b(frxv0, null, hfc0, null, null, 0.0f, new hlb(v2, 5), goz1, v1 << 6 & 0x380 | 0x30, 56);
            }
            goz1.x();
            goto label_49;
        }
        if((fuij0 instanceof fuih)) {
            goz1.M(0x8F3485F8);
            fryk fryk0 = ((fuih)fuij0).a;
            if(fryk0 != null) {
                fuin.d(goz1);
                ftyy.b(fryk0, null, hfc0, null, null, 0.0f, null, goz1, v1 << 6 & 0x380 | 0x30, 56);
            }
            goz1.x();
        label_49:
            gsb gsb1 = goz1.af();
            if(gsb1 != null) {
                gsb1.d = new fuim(hfc0, fuio0, v);
            }
            return;
        }
        goz1.M(-1446566205);
        goz1.x();
        throw new ibnq();
    }

    public static final hll c(fuip fuip0, goz goz0) {
        hll hll0;
        ibuq.f(fuip0, "status");
        goz0.M(0x3AD199F7);
        switch(fuip0.ordinal()) {
            case 3: {
                goz0.M(-858580772);
                long v = fpu.a(goz0).w;
                goz0.x();
                hll0 = new hll(v);
                break;
            }
            case 4: {
                goz0.M(0xCCD3209E);
                long v1 = fpu.a(goz0).a;
                goz0.x();
                hll0 = new hll(v1);
                break;
            }
            case 0: 
            case 1: 
            case 2: 
            case 5: {
                goz0.M(0xCD8F1DE6);
                goz0.x();
                hll0 = null;
                break;
            }
            case 6: {
                goz0.M(-858576770);
                long v2 = fpu.a(goz0).a;
                goz0.x();
                hll0 = new hll(v2);
                break;
            }
            default: {
                goz0.M(0xCCD300E9);
                goz0.x();
                throw new ibnq();
            }
        }
        goz0.x();
        return hll0;
    }

    public static final void d(goz goz0) {
        goz0.M(0x13980A69);
        goz0.M(707050196);
        goz0.x();
        goz0.x();
    }
}

