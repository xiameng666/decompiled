import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bvck {
    public static final clxk a(bvfn bvfn0, cmdi cmdi0) {
        ibuq.f(cmdi0, "launcher");
        bvcf bvcf0 = new bvcf(bvfn0, cmdi0);
        return new clxk(bvfn0.a, bvcf0, bvfn0.c);
    }

    public static final void b(bvgk bvgk0, hfc hfc0, goz goz0, int v) {
        clxh clxh0;
        ibuq.f(bvgk0, "card");
        goz goz1 = goz0.ao(0x812B3464);
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvgk0) : goz1.Z(bvgk0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if(((v1 | 0x180) & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            boolean z = false;
            goz1.M(0xE32FC0B5);
            cmdi cmdi0 = (cmdi)goz1.h(cmdp.a);
            goz1.x();
            goz1.M(5004770);
            if(((v1 | 0x180) & 14) == 4 || ((v1 | 0x180) & 8) != 0 && goz1.X(bvgk0)) {
                z = true;
            }
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                String s = bvgk0.a;
                String s1 = bvgk0.b;
                Integer integer0 = bvgk0.d;
                Integer integer1 = bvgk0.e;
                bvch bvch0 = bvgk0.g == null ? null : new bvch(bvgk0.g, cmdi0);
                bvfr bvfr0 = bvgk0.h;
                ibuq.f(cmdi0, "launcher");
                if((bvfr0 instanceof bvfp)) {
                    clxh0 = clxh.a;
                    goto label_32;
                }
                else if((bvfr0 instanceof bvfq)) {
                    clxh0 = new clxi(bvck.a(((bvfq)bvfr0).a, cmdi0));
                    goto label_32;
                }
                else {
                    if(!(bvfr0 instanceof bvfo)) {
                        throw new ibnq();
                    }
                    clxh0 = new clxg(bvck.a(((bvfo)bvfr0).a, cmdi0), bvck.a(((bvfo)bvfr0).b, cmdi0));
                label_32:
                    clye clye0 = new clye(s, s1, integer0, integer1, new gze(-1050906346, true, new bvcj(bvgk0)), bvch0, bvgk0.j, clxh0);
                    goz1.P(clye0);
                    object0 = clye0;
                }
            }
            goz1.x();
            clyd.e(((clye)object0), hfc0, bvgk0.c, goz1, (v1 | 0x180) & 0x70 | 8);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvci(bvgk0, hfc0, v);
        }
    }

    public static final void c(List list0, hfc hfc0, int v, goz goz0, int v1) {
        hfc hfc7;
        float f;
        bvcl bvcl1;
        Iterator iterator3;
        int v4;
        hfc hfc1;
        goz goz1 = goz0.ao(1936021580);
        int v2 = 1;
        int v3 = (v1 & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v1 : v1;
        if(((v3 | 0x1B0) & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            v4 = v;
        }
        else {
            hfc1 = hfc.e;
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new ParcelableSnapshotMutableIntState(0);
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(-1633490746);
            int v5 = goz1.X(list0);
            if(((v3 | 0x1B0) & 0x380) != 0x100) {
                v2 = 0;
            }
            Object object2 = goz1.j();
            if((v5 | v2) != 0 || object2 == object1) {
                ArrayList arrayList0 = new ArrayList();
                object2 = new ArrayList();
                for(Object object3: list0) {
                    bvgk bvgk0 = (bvgk)object3;
                    if(bvgk0.i) {
                        bvck.f(arrayList0, ((List)object2));
                        ((List)object2).add(new bvcl(ibpo.b(bvgk0), false));
                    }
                    else {
                        arrayList0.add(bvgk0);
                        if(arrayList0.size() != 2) {
                            continue;
                        }
                        bvck.f(arrayList0, ((List)object2));
                    }
                }
                bvck.f(arrayList0, ((List)object2));
                goz1.P(object2);
            }
            goz1.x();
            hfc hfc2 = dla.j(hfc1, 0.0f, 0.0f, 0.0f, 10.0f, 7);
            iau iau0 = dii.a(dho.g(10.0f), hei.m, goz1, 6);
            int v6 = bvcb.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
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
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v6))) {
                Integer integer0 = v6;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            goz1.M(0xCCF9D409);
            for(Iterator iterator1 = ((List)object2).iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                Object object4 = iterator1.next();
                bvcl bvcl0 = (bvcl)object4;
                hfc hfc4 = dls.w(hfc1);
                iau iau1 = dll.b(dho.g(10.0f), hei.j, goz1, 6);
                gzk gzk1 = goz1.ak();
                hfc hfc5 = hew.c(goz1, hfc4);
                goz1.O();
                int v7 = bvcb.a(gol.c(goz1));
                if(goz1.x) {
                    goz1.t(ibth0);
                }
                else {
                    goz1.T();
                }
                guo.b(goz1, iau1, ibtw0);
                guo.b(goz1, gzk1, ibtw1);
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v7))) {
                    Integer integer1 = v7;
                    goz1.P(integer1);
                    goz1.p(integer1, ibtw2);
                }
                guo.a(goz1, ibts0);
                guo.b(goz1, hfc5, ibtw3);
                dlq dlq0 = dlq.a;
                goz1.M(0xD30E3D39);
                Iterator iterator2 = bvcl0.a.iterator();
                while(iterator2.hasNext()) {
                    Object object5 = iterator2.next();
                    goz1.M(0xA8F7CB6F);
                    if(bvcl0.b) {
                        goz1.M(5004770);
                        Object object6 = goz1.j();
                        if(object6 == object1) {
                            object6 = new bvcc(((gtl)object0));
                            goz1.P(object6);
                        }
                        goz1.x();
                        hfc hfc6 = ibf.a(hfc1, ((ibts)object6));
                        if(((gtl)object0).e() > 0) {
                            iterator3 = iterator2;
                            bvcl1 = bvcl0;
                            f = ((jks)goz1.h(ipa.d)).ec(((gtl)object0).e());
                        }
                        else {
                            iterator3 = iterator2;
                            bvcl1 = bvcl0;
                            f = NaNf;
                        }
                        hfc7 = dls.e(hfc6, f);
                    }
                    else {
                        iterator3 = iterator2;
                        bvcl1 = bvcl0;
                        hfc7 = hfc1;
                    }
                    goz1.x();
                    bvck.b(((bvgk)object5), dlo.a(dlq0, hfc7, 1.0f), goz1, 0);
                    iterator2 = iterator3;
                    bvcl0 = bvcl1;
                }
                goz1.x();
                goz1.z();
            }
            goz1.x();
            goz1.z();
            v4 = 2;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bvcg(list0, hfc1, v4, v1);
        }
    }

    public static final void d(bvga bvga0, hfc hfc0, goz goz0, int v) {
        jbn jbn0;
        long v2;
        hfc hfc1;
        goz goz1 = goz0.ao(0x7C10D2E8);
        if(((((v & 6) == 0 ? (((v & 8) == 0 ? goz1.X(bvga0) : goz1.Z(bvga0)) ? 4 : 2) | v : v) | 0x30) & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goto label_57;
        }
        hey hey0 = hfc.e;
        iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
        int v1 = bvcb.a(gol.c(goz1));
        gzk gzk0 = goz1.ak();
        hfc hfc2 = hew.c(goz1, hey0);
        ibth ibth0 = iej.a;
        goz1.O();
        if(goz1.x) {
            goz1.t(ibth0);
        }
        else {
            goz1.T();
        }
        guo.b(goz1, iau0, iej.e);
        guo.b(goz1, gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            goz1.P(integer0);
            goz1.p(integer0, ibtw0);
        }
        guo.a(goz1, iej.g);
        guo.b(goz1, hfc2, iej.c);
        hfc hfc3 = iqn.a(hhi.a(dla.j(dls.e(dls.w(hey0), 16.0f), 0.0f, 0.0f, 0.0f, cltw.n, 7), eah.a(50)), "ProgressBarIndicator");
        float f = bvga0.a;
        bvgi bvgi0 = bvga0.c;
        if((bvgi0 instanceof bvgg)) {
            goz1.M(0x60C59E25);
            v2 = fpu.a(goz1).a;
            goz1.x();
            goto label_42;
        }
        if((bvgi0 instanceof bvgh)) {
            goz1.M(0x60C5A726);
            v2 = fpu.a(goz1).j;
            goz1.x();
            goto label_42;
        }
        if((bvgi0 instanceof bvgf)) {
            goz1.M(0x60C5B003);
            v2 = fpu.a(goz1).w;
            goz1.x();
        label_42:
            fitn.e(f, hfc3, v2, fpu.a(goz1).I, 0, goz1, 0);
            hfc hfc4 = iqn.a(dla.j(hey0, 0.0f, 0.0f, 0.0f, cltw.o, 7), "ProgressBarLabel");
            String s = bvga0.b;
            if(clua.a()) {
                goz1.M(0xB7F510E1);
                jbn0 = fpu.d(goz1).z;
            }
            else {
                goz1.M(-1208604021);
                jbn0 = fpu.d(goz1).k;
            }
            goz1.x();
            fiuk.b(s, hfc4, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0, 0, 0x1FFFC);
            goz1 = goz1;
            goz1.z();
            hfc1 = hey0;
        label_57:
            gsb gsb0 = goz1.af();
            if(gsb0 != null) {
                gsb0.d = new bvcd(bvga0, hfc1, v);
            }
            return;
        }
        goz1.M(0x60C593B7);
        goz1.x();
        throw new ibnq();
    }

    public static final void e(List list0, bvft bvft0, cmai cmai0, hfc hfc0, cvq cvq0, goz goz0, int v) {
        cvq cvq3;
        cvq cvq2;
        hfc hfc1;
        goz goz2;
        cvq cvq1;
        goz goz1 = goz0.ao(-1092007550);
        int v1 = (v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? goz1.X(bvft0) : goz1.Z(bvft0)) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? goz1.X(cmai0) : goz1.Z(cmai0)) ? 0x100 : 0x80);
        }
        int v2 = (v & 0x6000) == 0 ? v1 | 0x2C00 : v1 | 0xC00;
        if((v2 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            cvq1 = cvq0;
            goz2 = goz1;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                hfc1 = hfc0;
                cvq2 = cvq0;
            }
            else {
                cvq2 = cvf.d(0, goz1, 0, 1);
                hfc1 = hfc.e;
            }
            goz1.w();
            hfc hfc2 = cvf.c(dls.v(dla.f(hfc1, cltw.e, 0.0f, cltw.e, 0.0f)), cvq2);
            dhn dhn0 = dho.c;
            hej hej0 = hei.m;
            iau iau0 = dii.a(dhn0, hej0, goz1, 0);
            int v3 = bvcb.a(gol.c(goz1));
            gzk gzk0 = goz1.ak();
            hfc hfc3 = hew.c(goz1, hfc2);
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
            hfc0 = hfc1;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw2);
            }
            ibts ibts0 = iej.g;
            guo.a(goz1, ibts0);
            ibtw ibtw3 = iej.c;
            guo.b(goz1, hfc3, ibtw3);
            hey hey0 = hfc.e;
            dlv.a(dls.e(hey0, 20.0f), goz1);
            hfc hfc4 = dmp.b(hey0);
            iau iau1 = dii.a(dhn0, hej0, goz1, 0);
            gzk gzk1 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hfc4);
            goz1.O();
            int v4 = bvcb.a(gol.c(goz1));
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
            guo.b(goz1, hfc5, ibtw3);
            bvck.c(list0, null, 0, goz1, v2 & 14);
            goz1.M(0xCCD3040D);
            if(bvft0 == null) {
                goz2 = goz1;
                cvq3 = cvq2;
            }
            else {
                hfc hfc6 = iqn.a(dla.j(dls.w(hey0), 8.0f, 20.0f, 0.0f, 8.0f, 4), "ContinueToManageTitle");
                jbn jbn0 = fpu.d(goz1).n;
                long v5 = fpu.a(goz1).a;
                cvq3 = cvq2;
                fiuk.b(bvft0.a, hfc6, v5, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, jbn0, goz1, 0, 0, 0x1FFF8);
                goz2 = goz1;
                bvck.c(bvft0.b, null, 0, goz2, 0);
            }
            goz2.x();
            goz2.M(-858561960);
            bvcq.a(cmai0, null, goz2, v2 >> 6 & 14);
            goz2.x();
            goz2.z();
            goz2.z();
            cvq1 = cvq3;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new bvce(list0, bvft0, cmai0, hfc0, cvq1, v);
        }
    }

    private static final void f(List list0, List list1) {
        if(list0.size() > 0) {
            list1.add(new bvcl(ibpo.ar(list0), list0.size() > 1));
            list0.clear();
        }
    }
}

