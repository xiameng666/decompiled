import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class bvdp {
    public static final void a(bvfm bvfm0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xF5326068);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvfm0) : goz1.Z(bvfm0)) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(0x99E7E26, new bvdc(bvfm0), goz1);
            cmig.g(bvfm0.a, gze0, goz1, 0x30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcr(bvfm0, v);
        }
    }

    public static final void b(bvgb bvgb0, goz goz0, int v) {
        goz goz1 = goz0.ao(652581410);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgb0) : goz1.Z(bvgb0)) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            long v1 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hey0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v2 = (int)(v1 ^ v1 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc0, iej.c);
            bvfm bvfm0 = bvgb0.a;
            goz1.M(0xB7C6652F);
            if(bvfm0 != null) {
                bvdp.a(bvfm0, goz1, 8);
            }
            goz1.x();
            bvge bvge0 = bvgb0.b;
            goz1.M(0xB7C66E0B);
            if(bvge0 != null) {
                bvdp.g(bvge0, dla.i(hey0, cltw.h, 0.0f, 2), null, goz1, 0);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcs(bvgb0, v);
        }
    }

    public static final void c(eoqf eoqf0, bvgx bvgx0, goz goz0, int v) {
        ibuq.f(eoqf0, "owner");
        ibuq.f(bvgx0, "uiModel");
        goz goz1 = goz0.ao(0x8EADC0FE);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(eoqf0) : goz1.Z(eoqf0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(bvgx0) : goz1.Z(bvgx0)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(-1100859844, new bvdi(bvgx0, eoqf0), goz1);
            cmig.g(bvgx0.d, gze0, goz1, 0x30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcw(eoqf0, bvgx0, v);
        }
    }

    public static final void d(bvgx bvgx0, goz goz0, int v) {
        ibuq.f(bvgx0, "uiModel");
        goz goz1 = goz0.ao(1712703313);
        boolean z = true;
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgx0) : goz1.Z(bvgx0)) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            ibom ibom0 = ibom.a;
            goz1.M(5004770);
            boolean z1 = (v1 & 14) == 4 || (v1 & 8) != 0 && goz1.Z(bvgx0);
            Object object2 = goz1.j();
            if(z1 || object2 == object1) {
                object2 = new bvdj(bvgx0, null);
                goz1.P(object2);
            }
            goz1.x();
            gqe.f(ibom0, ((ibtw)object2), goz1);
            lpe lpe0 = lpe.ON_RESUME;
            goz1.M(-1633490746);
            if((v1 & 14) != 4 && ((v1 & 8) == 0 || !goz1.Z(bvgx0))) {
                z = false;
            }
            Object object3 = goz1.j();
            if(z || object3 == object1) {
                object3 = new bvcu(bvgx0, ((gra)object0));
                goz1.P(object3);
            }
            goz1.x();
            ltn.b(lpe0, null, ((ibth)object3), goz1, 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcv(bvgx0, v);
        }
    }

    public static final void e(bvgc bvgc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x7121013E);
        if((((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgc0) : goz1.Z(bvgc0)) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(0x1085947C, new bvdo(bvgc0), goz1);
            cmig.g(bvgc0.a, gze0, goz1, 0x30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvct(bvgc0, v);
        }
    }

    public static final void f(bvgd bvgd0, ibtx ibtx0, ibtx ibtx1, goz goz0, int v) {
        ibuq.f(bvgd0, "uiModel");
        ibuq.f(ibtx1, "content");
        goz goz1 = goz0.ao(0x472432A5);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgd0) : goz1.Z(bvgd0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtx0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtx1) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            gze gze0 = gzf.e(0x6C3376F9, new bvdd(ibtx0), goz1);
            boolean z = htva.a.b().i();
            gze gze1 = gzf.e(0x34D2319F, new bvde(bvgd0), goz1);
            gze gze2 = gzf.e(-2096678106, new bvdf(ibtx1), goz1);
            clzs.a(bvgd0.a, gze0, z, gze1, gze2, goz1, 0x6C30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcx(bvgd0, ibtx0, ibtx1, v);
        }
    }

    public static final void g(bvge bvge0, hfc hfc0, cmdi cmdi0, goz goz0, int v) {
        cmdi cmdi1;
        goz goz1 = goz0.ao(-1884070020);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvge0) : goz1.Z(bvge0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= 0x80;
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            cmdi1 = cmdi0;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                cmdi1 = cmdi0;
            }
            else {
                cmdi1 = (cmdi)goz1.h(cmdp.a);
            }
            goz1.w();
            goz1.M(-1633490746);
            if((v2 & 14) != 4 && ((v2 & 8) == 0 || !goz1.Z(bvge0))) {
                v1 = 0;
            }
            int v3 = goz1.Z(cmdi1) | v1;
            Object object0 = goz1.j();
            if(v3 != 0 || object0 == gop.a) {
                object0 = new bvcy(bvge0, cmdi1);
                goz1.P(object0);
            }
            goz1.x();
            fiqv.a(((ibth)object0), hfc0, false, null, null, null, null, null, gzf.e(0x9C52898C, new bvdk(bvge0), goz1), goz1, v2 & 0x70 | 0x30000000, 508);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcz(bvge0, hfc0, cmdi1, v);
        }
    }
}

