import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;

public final class fcvw {
    public final fcvm[] a;
    public final gra[] b;

    public fcvw(fcvm[] arr_fcvm) {
        ibuq.f(arr_fcvm, "pinPadButtons");
        super();
        this.a = arr_fcvm;
        gra[] arr_gra = new gra[arr_fcvm.length];
        for(int v = 0; v < arr_fcvm.length; ++v) {
            arr_gra[v] = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
        }
        this.b = arr_gra;
    }

    public final void a(ComposeView composeView0) {
        ibuq.f(composeView0, "composeView");
        composeView0.a(new gze(0x28E651BF, true, new fcvv(this)));
    }

    public static final void b(fcvm fcvm0, View view0) {
        fcvm0.a();
        view0.performHapticFeedback(3);
    }

    public final void c(fcvm[] arr_fcvm, goz goz0, int v) {
        goz goz1 = goz0.ao(0x98C1310E);
        int v1 = (v & 6) == 0 ? (goz1.Z(arr_fcvm) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            if(object0 == gop.a) {
                dgg[] arr_dgg = new dgg[arr_fcvm.length];
                for(int v2 = 0; v2 < arr_fcvm.length; ++v2) {
                    arr_dgg[v2] = new dgh();
                }
                goz1.P(arr_dgg);
                object0 = arr_dgg;
            }
            goz1.x();
            hey hey0 = hfc.e;
            hfc hfc0 = dla.d(dls.w(hey0), 1.0f);
            iau iau0 = dhw.a(hei.e, false);
            long v3 = gol.c(goz1);
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
            int v4 = (int)(v3 ^ v3 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            pmh.a(dls.w(hey0), 0.0f, null, null, gzf.e(193375900, new fcvr(arr_fcvm, this, ((dgg[])object0)), goz1), goz1, 0x30186);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fcvn(this, arr_fcvm, v);
        }
    }

    public final void d(pmf pmf0, fcvm fcvm0, dgg dgg0, gra gra0, goz goz0, int v) {
        pvn pvn2;
        int v8;
        hfc hfc1;
        long v3;
        long v2;
        gra gra1;
        goz goz1 = goz0.ao(0xD9B2B49B);
        int v1 = (v & 6) == 0 ? (goz1.Z(pmf0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(fcvm0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(dgg0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            gra1 = gra0;
            v1 |= (goz1.X(gra1) ? 0x800 : 0x400);
        }
        else {
            gra1 = gra0;
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(this) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            Object object0 = goz1.j();
            Object object1 = gop.a;
            boolean z = false;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            if((v1 >> 6 & 14 ^ 6) > 4 && goz1.X(dgg0) || (v1 >> 6 & 6) == 4) {
                z = true;
            }
            Object object2 = goz1.j();
            if(z || object2 == object1) {
                object2 = new dgn(dgg0, ((gra)object0), null);
                goz1.P(object2);
            }
            gqe.f(dgg0, ((ibtw)object2), goz1);
            if(fcvw.e(((gra)object0))) {
                goz1.M(-1020485368);
                v2 = pqq.a(goz1).l;
            }
            else {
                goz1.M(-1020416951);
                v2 = pqq.a(goz1).b;
            }
            goz1.x();
            gui gui0 = cgl.a(v2, null, goz1, 0x180, 10);
            if(fcvw.e(((gra)object0))) {
                goz1.M(-1020213591);
                v3 = pqq.a(goz1).n;
            }
            else {
                goz1.M(-1020146166);
                v3 = pqq.a(goz1).d;
            }
            goz1.x();
            gui gui1 = cgl.a(v3, null, goz1, 0x180, 10);
            gui gui2 = chg.b(Integer.valueOf((fcvw.e(((gra)object0)) ? 700 : 500)), cmv.b, chg.a, null, goz1, 0x6000, 8);
            goz1 = goz1;
            View view0 = (View)goz1.h(AndroidCompositionLocals_androidKt.f);
            if(((Boolean)gra1.a()).booleanValue()) {
                if(fcvm0.b) {
                    goz1.M(0xC338AE80);
                    goz1.M(0x97EA02AA);
                    int v4 = goz1.Z(this) | goz1.Z(fcvm0) | goz1.Z(view0);
                    Object object3 = goz1.j();
                    if(v4 != 0 || object3 == object1) {
                        object3 = new fcvo(fcvm0, view0);
                        goz1.P(object3);
                    }
                    goz1.x();
                    pqk.b(((ibth)object3), pmf0.a(dgg0), false, null, null, gzf.e(0x5A0D6522, new fcvs(fcvm0), goz1), goz1, 0x30000000);
                }
                else {
                    goz1.M(0xC33FF850);
                    hfc hfc0 = pmf0.a(dgg0);
                    long v5 = ((hll)gui0.a()).j;
                    long v6 = ((hll)gui1.a()).j;
                    long v7 = hll.i;
                    pmt pmt0 = pqq.a(goz1);
                    pvn pvn0 = pmt0.G;
                    if(pvn0 == null) {
                        hfc1 = hfc0;
                        v8 = v1;
                        pvn pvn1 = new pvn(pmv.b(pmt0, 18), pmv.b(pmt0, 8), pmv.a(pmv.b(pmt0, 12), 0.12f), pmv.a(pmv.b(pmt0, 12), 0.38f));
                        pmt0.G = pvn1;
                        pvn2 = pvn1;
                    }
                    else {
                        v8 = v1;
                        hfc1 = hfc0;
                        pvn2 = pvn0;
                    }
                    pvn pvn3 = pvn2.a(v5, v6, v7, v7);
                    eag eag0 = eah.b(12.0f);
                    pvg pvg0 = pqq.c(goz1);
                    pvt pvt0 = pvg0.e;
                    if(pvt0 == null) {
                        goz1.M(1388130797);
                        eaa eaa0 = pqq.c(goz1).a;
                        pvt0 = new pvt(pwi.c, eaa0);
                        pvg0.e = pvt0;
                    }
                    else {
                        goz1.M(1388123109);
                    }
                    goz1.x();
                    pvt pvt1 = new pvt(pvt0.a, eag0);
                    goz1.M(0x97EA02AA);
                    int v9 = goz1.Z(this) | goz1.Z(fcvm0) | goz1.Z(view0);
                    Object object4 = goz1.j();
                    if(v9 != 0 || object4 == object1) {
                        object4 = new fcvp(fcvm0, view0);
                        goz1.P(object4);
                    }
                    goz1.x();
                    pvs.a(((ibth)object4), hfc1, false, pvt1, pvn3, dgg0, gzf.e(-1802887730, new fcvt(fcvm0, gui2), goz1), goz1, v8 << 18 & 0xE000000 | 0x30000000, 0x9C);
                }
                goz1 = goz1;
            }
            else {
                goz1.M(-1019797044);
                dlv.a(dls.v(hfc.e), goz1);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new fcvq(this, pmf0, fcvm0, dgg0, gra0, v);
        }
    }

    private static final boolean e(gui gui0) {
        return ((Boolean)gui0.a()).booleanValue();
    }
}

