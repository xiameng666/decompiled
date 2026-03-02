import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;
import java.util.List;

public final class fudd {
    public static final void a(fuci fuci0, goz goz0, int v) {
        goz goz1 = goz0.ao(-1681127050);
        if((((v & 6) == 0 ? (goz1.Z(fuci0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                List list0 = fuci0.b;
                if(list0 == null) {
                    object0 = ibps.a;
                }
                else {
                    object0 = ibpo.aq(list0, fuci0.c);
                    if(object0 == null) {
                        object0 = ibps.a;
                    }
                    else {
                        fulg.c(((List)object0));
                    }
                }
                if(!((Collection)object0).isEmpty()) {
                    if(((List)object0).size() == 1 && fuci0.d != null) {
                        ((fuat)ibpo.R(((List)object0))).a(fule.b);
                    }
                    else if(((List)object0).size() > 1 && fuci0.d != null) {
                        ((fuat)ibpo.W(((List)object0))).a(fule.c);
                    }
                }
                goz1.P(object0);
            }
            goz1.x();
            dhg dhg0 = dho.g(2.0f);
            hey hey0 = hfc.e;
            goz1.M(-1633490746);
            int v1 = goz1.Z(((List)object0)) | goz1.Z(fuci0);
            Object object2 = goz1.j();
            if(v1 != 0 || object2 == object1) {
                object2 = new fucs(((List)object0), fuci0);
                goz1.P(object2);
            }
            goz1.x();
            hfc hfc0 = iuc.d(hey0, ((ibts)object2));
            iau iau0 = dii.a(dhg0, hei.m, goz1, 0);
            int v2 = fucj.a(gol.c(goz1));
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
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            goz1.M(-1270360727);
            int v3 = 0;
            for(Object object3: ((List)object0)) {
                if(v3 < 0) {
                    ibpo.m();
                }
                goz1.M(5004770);
                boolean z = goz1.V(v3);
                Object object4 = goz1.j();
                if(z || object4 == object1) {
                    object4 = new fuct(v3);
                    goz1.P(object4);
                }
                goz1.x();
                fuar.f(iuc.d(hey0, ((ibts)object4)), ((fuat)object3), goz1, 0x40, 0);
                ++v3;
            }
            goz1.x();
            goz1.M(0xB4480077);
            fucg fucg0 = fuci0.d;
            if(fucg0 != null) {
                gze gze0 = gzf.e(-2032367128, new fudb(fuci0, ((List)object0)), goz1);
                fugo.b(fucg0.b, fucg0.c, null, gze0, goz1, 0xC00, 4);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fucu(fuci0, v);
        }
    }

    public static final void b(hfc hfc0, fude fude0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0x9502D304);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fude0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            iau iau0 = dii.a(dho.g(16.0f), hei.m, goz1, 6);
            int v2 = fucj.a(gol.c(goz1));
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
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            fryv fryv0 = fude0.a;
            dim dim0 = dim.a;
            goz1.M(0x30C0DFCC);
            if(fryv0 != null) {
                jbn jbn0 = fpu.d(goz1).B;
                ftzd.a(fryv0, null, fpu.a(goz1).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFFA);
            }
            goz2 = goz1;
            goz2.x();
            fuci fuci0 = fude0.b;
            if(fuci0 != null && (fuci0.b != null && !fuci0.b.isEmpty())) {
                goz2.M(0xE75F49C1);
                fudd.a(fuci0, goz2, 0);
            }
            else {
                fuch fuch0 = fude0.c;
                if(fuch0 == null) {
                    goz2.M(-413017827);
                }
                else {
                    goz2.M(-413087980);
                    fudd.d(dim0, fuch0, goz2, 6);
                }
            }
            goz2.x();
            goz2.z();
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new fucr(hfc0, fude0, v);
        }
    }

    public static final void c(hfc hfc0, fude fude0, goz goz0, int v, int v1) {
        hfc hfc1;
        int v2;
        ibuq.f(fude0, "state");
        goz goz1 = goz0.ao(0x745EF40C);
        if(v1 == 0) {
            v2 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(fude0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(v1 != 0) {
                hfc0 = hfc.e;
            }
            if(hyxx.c()) {
                goz1.M(903058294);
                fudd.b(hfc0, fude0, goz1, v2 & 0x7E);
                goz1.x();
                hfc1 = hfc0;
            }
            else {
                goz1.M(0x35D4F7D7);
                fcp fcp0 = fiqw.b(fsbs.i(fpu.a(goz1), ((Context)goz1.h(AndroidCompositionLocals_androidKt.b)), goz1), 0L, goz1, 14);
                gze gze0 = gzf.e(0x45E07022, new fudc(fude0), goz1);
                hfc1 = hfc0;
                fira.a(hfc1, fitu.a.e, fcp0, null, null, gze0, goz1, v2 & 14 | 0x30000, 24);
                goz1 = goz1;
                goz1.x();
            }
            hfc0 = hfc1;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fucq(hfc0, fude0, v, v1);
        }
    }

    public static final void d(dim dim0, fuch fuch0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x4374657F);
        if((((v & 0x30) == 0 ? (goz1.Z(fuch0) ? 0x20 : 16) | v : v) & 17) == 16 && goz1.ac()) {
            goz1.G();
        }
        else {
            hey hey0 = hfc.e;
            hfc hfc0 = dla.e(hhi.a(cqx.a(dls.w(hey0), fpu.a(goz1).F, fulh.a(fule.a, goz1)), fulh.a(fule.a, goz1)), 20.0f, 20.0f);
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            int v1 = fucj.a(gol.c(goz1));
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
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v1))) {
                Integer integer0 = v1;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            fryv fryv0 = fuch0.a;
            dim dim1 = dim.a;
            goz1.M(-1750154320);
            if(fryv0 != null) {
                jbn jbn0 = fpu.d(goz1).l;
                ftzd.a(fryv0, null, fpu.a(goz1).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFFA);
                goz1 = goz1;
            }
            goz1.x();
            dlv.a(dls.e(hey0, 8.0f), goz1);
            fryk fryk0 = fuch0.b;
            goz1.M(0x97AEE200);
            if(fryk0 != null) {
                ftyy.b(fryk0, null, iqn.a(dim1.a(hey0, hei.n), "EmptyStateIcon"), null, null, 0.0f, null, goz1, 0x180030, 56);
            }
            goz1.x();
            dlv.a(dls.e(hey0, 8.0f), goz1);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fucp(dim0, fuch0, v);
        }
    }

    public static final void e(dim dim0, hfc hfc0, fude fude0, goz goz0, int v) {
        goz goz2;
        hfc hfc1;
        ibuq.f(fude0, "state");
        goz goz1 = goz0.ao(0x1B45152B);
        if((((v & 0x180) == 0 ? (goz1.Z(fude0) ? 0x100 : 0x80) | v : v) & 0x81) == 0x80 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goz2 = goz1;
            goto label_83;
        }
        else {
            hfc1 = hfc.e;
            fuci fuci0 = fude0.b;
            if(fuci0 == null) {
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new fucv(dim0, hfc1, fude0, v);
                }
            }
            else {
                goz1.M(1582599806);
                fryv fryv0 = fuci0.a;
                if(fryv0 != null) {
                    hfc hfc2 = dla.f(hfc1, 24.0f, (fude0.a == null ? 20.0f : 4.0f), 24.0f, 12.0f);
                    jbn jbn0 = fpu.d(goz1).h;
                    ftzd.a(fryv0, hfc2, fpu.a(goz1).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFF8);
                    goz1 = goz1;
                }
                goz1.x();
                goz1.M(0x5E54BC63);
                if(fryv0 == null && fude0.a != null) {
                    dlv.a(dls.e(hfc1, 8.0f), goz1);
                }
                goz1.x();
                List list0 = fuci0.b;
                List list1 = list0 == null ? null : ibpo.aq(list0, fuci0.c);
                goz1.M(-1633490746);
                int v1 = goz1.Z(list1) | goz1.Z(fuci0);
                Object object0 = goz1.j();
                if(v1 != 0 || object0 == gop.a) {
                    object0 = new fuck(list1, fuci0);
                    goz1.P(object0);
                }
                goz1.x();
                hfc hfc3 = iuc.d(hfc1, ((ibts)object0));
                iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
                int v2 = fucj.a(gol.c(goz1));
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
                guo.b(goz1, iau0, iej.e);
                guo.b(goz1, gzk0, iej.d);
                ibtw ibtw0 = iej.f;
                if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                    Integer integer0 = v2;
                    goz1.P(integer0);
                    goz1.p(integer0, ibtw0);
                }
                guo.a(goz1, iej.g);
                guo.b(goz1, hfc4, iej.c);
                goz1.M(0x3C82F1D4);
                if(list1 != null) {
                    int v3 = 0;
                    for(Object object1: list1) {
                        if(v3 < 0) {
                            ibpo.m();
                        }
                        hfc hfc5 = dls.w(hfc1);
                        goz1.M(5004770);
                        boolean z = goz1.V(v3);
                        Object object2 = goz1.j();
                        if(z || object2 == gop.a) {
                            object2 = new fucl(v3);
                            goz1.P(object2);
                        }
                        goz1.x();
                        fuar.f(dla.j(dla.i(iuc.d(hfc5, ((ibts)object2)), 24.0f, 0.0f, 2), 0.0f, (v3 != 0 || fude0.a != null || fryv0 != null ? 0.0f : 12.0f), 0.0f, (v3 != Math.min(list0.size(), fuci0.c) - 1 || fuci0.d != null ? 0.0f : 12.0f), 5), fuat.d(((fuat)object1), null, null, null, null, true, false, null, 0x3DFF), goz1, 0x40, 0);
                        ++v3;
                    }
                }
                goz1.x();
                goz1.M(1015242126);
                fucg fucg0 = fuci0.d;
                if(fucg0 != null) {
                    gze gze0 = gzf.e(0x2378F4F9, new fucy(fuci0, list1), goz1);
                    fugo.b(fucg0.b, fucg0.c, null, gze0, goz1, 0xC00, 4);
                }
                goz2 = goz1;
                goz2.x();
                goz2.z();
            label_83:
                gsb gsb1 = goz2.af();
                if(gsb1 != null) {
                    gsb1.d = new fucm(dim0, hfc1, fude0, v);
                }
            }
        }
    }

    public static final void f(dim dim0, hfc hfc0, fude fude0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(fude0, "state");
        goz goz1 = goz0.ao(0x37D9590F);
        int v1 = (v & 6) == 0 ? (goz1.X(dim0) ? 4 : 2) | v : v;
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(fude0) ? 0x100 : 0x80);
        }
        if((v1 & 0x83) == 130 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
            goto label_30;
        }
        else {
            hfc1 = hfc.e;
            fuch fuch0 = fude0.c;
            if(fuch0 == null) {
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new fucn(dim0, hfc1, fude0, v);
                }
            }
            else {
                goz1.M(0xA6E76ADF);
                fryv fryv0 = fuch0.a;
                if(fryv0 != null) {
                    hfc hfc2 = dla.f(hfc1, 24.0f, (fude0.a == null ? 20.0f : 8.0f), 24.0f, 8.0f);
                    jbn jbn0 = fpu.d(goz1).l;
                    ftzd.a(fryv0, hfc2, fpu.a(goz1).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz1, 0, 0, 0x1FFF8);
                    goz1 = goz1;
                }
                goz1.x();
                fryk fryk0 = fuch0.b;
                goz1.M(-1494771290);
                if(fryk0 != null) {
                    ftyy.b(fryk0, null, iqn.a(dim0.a(hfc1, hei.n), "EmptyStateIcon"), null, null, 0.0f, null, goz1, 0x180030, 56);
                }
                goz1.x();
                dlv.a(dls.e(hfc1, 20.0f), goz1);
            label_30:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new fuco(dim0, hfc1, fude0, v);
                }
            }
        }
    }
}

