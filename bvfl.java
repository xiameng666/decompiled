import java.util.List;

public final class bvfl {
    public static final void a(eoqf eoqf0, bvky bvky0, goz goz0, int v) {
        ibuq.f(eoqf0, "owner");
        ibuq.f(bvky0, "uiModel");
        goz goz1 = goz0.ao(0xE5FBC77D);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(eoqf0) : goz1.Z(eoqf0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(bvky0) : goz1.Z(bvky0)) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmdi cmdi0 = (cmdi)goz1.h(cmdp.a);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new bvco();
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(5004770);
            boolean z = goz1.X(cmdi0);
            Object object2 = goz1.j();
            if(z || object2 == object1) {
                object2 = new bvek(eoqf0, cmdi0);
                goz1.P(object2);
            }
            goz1.x();
            gze gze0 = gzf.e(0x555CE910, new bvfk(bvky0, ((bvco)object0), ((bvek)object2)), goz1);
            clzw.a(bvky0.f, gze0, goz1, 0x30);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvey(eoqf0, bvky0, v);
        }
    }

    public static final void b(String s, String s1, ibth ibth0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x713A41CB);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if(((v1 | 0xC00) & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            clxc.a(s, s1, ibth0, dls.v(dmp.b(hfc0)), goz1, (v1 | 0xC00) & 0x3FE);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvfb(s, s1, ibth0, hfc0, v);
        }
    }

    public static final void c(List list0, bvft bvft0, cmai cmai0, hfc hfc0, goz goz0, int v) {
        List list1;
        bvft bvft1;
        cmai cmai1;
        hfc hfc1;
        goz goz1 = goz0.ao(2111958120);
        int v1 = (v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(bvft0) : goz1.Z(bvft0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? goz1.X(cmai0) : goz1.Z(cmai0)) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            cmai1 = cmai0;
            bvft1 = bvft0;
            list1 = list0;
        }
        else {
            bvck.e(list0, bvft0, cmai0, null, null, goz1, v1 & 14 | 0x40 | v1 & 0x70 | v1 & 0x380);
            list1 = list0;
            bvft1 = bvft0;
            cmai1 = cmai0;
            hfc1 = hfc.e;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvfd(list1, bvft1, cmai1, hfc1, v);
        }
    }

    public static final void d(String s, String s1, ibth ibth0, hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x3508036B);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if(((v1 | 0xC00) & 0x493) == 1170 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            clxc.a(s, s1, ibth0, dls.v(dmp.b(hfc0)), goz1, (v1 | 0xC00) & 0x3FE);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvfc(s, s1, ibth0, hfc0, v);
        }
    }

    public static final void e(eoqf eoqf0, List list0, cmai cmai0, hfc hfc0, goz goz0, int v) {
        goz goz2;
        hfc hfc1;
        goz goz1 = goz0.ao(0x59A9504);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(eoqf0) : goz1.Z(eoqf0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(list0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (((v & 0x200) == 0 ? goz1.X(cmai0) : goz1.Z(cmai0)) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc2 = dla.j(dls.v(hey0), 0.0f, 0.0f, 0.0f, 0.0f, 13);
            dld dld0 = dmk.b(dmw.c(goz1), goz1);
            dhg dhg0 = dho.g(cltw.f);
            goz1.M(0x97EA02AA);
            int v3 = goz1.Z(list0);
            int v4 = (v2 & 14) == 4 || (v2 & 8) != 0 && goz1.Z(eoqf0) ? 1 : 0;
            if((v2 & 0x380) != 0x100 && ((v2 & 0x200) == 0 || !goz1.Z(cmai0))) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v4 | v3 | v1) != 0 || object0 == gop.a) {
                object0 = new bvfe(list0, cmai0, eoqf0);
                goz1.P(object0);
            }
            goz1.x();
            goz2 = goz1;
            dnh.a(hfc2, null, dld0, false, dhg0, null, null, false, null, ((ibts)object0), goz2, 6, 490);
            hfc1 = hey0;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bvff(eoqf0, list0, cmai0, hfc1, v);
        }
    }

    public static final void f(hfc hfc0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x9EC72238);
        if((v & 1) == 0 && goz1.ac()) {
            goz1.G();
        }
        else {
            hfc0 = hfc.e;
            clwx.a(null, goz1, 6, 2);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvez(hfc0, v);
        }
    }
}

