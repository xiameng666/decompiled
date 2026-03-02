import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class fuar {
    public static final Boolean a(gra gra0) {
        return (Boolean)gra0.a();
    }

    public static final Boolean b(gra gra0) {
        return (Boolean)gra0.a();
    }

    public static final void c(gra gra0, Boolean boolean0) {
        gra0.b(boolean0);
    }

    public static final boolean d(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final void e(boolean z, ibtw ibtw0, goz goz0, int v) {
        goz goz1 = goz0.ao(1382629090);
        int v1 = (v & 6) == 0 ? (goz1.Y(z) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            iau iau0 = dll.b(dho.a, (z ? hei.k : hei.j), goz1, 0);
            long v2 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hfc.e);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw1 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc0, iej.c);
            ibtw0.a(goz1, Integer.valueOf(v1 >> 3 & 14));
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ftzz(z, ibtw0, v);
        }
    }

    public static final void f(hfc hfc0, fuat fuat0, goz goz0, int v, int v1) {
        fuat fuat1;
        goz goz2;
        hfc hfc1;
        int v2;
        ibuq.f(fuat0, "state");
        goz goz1 = goz0.ao(0x1732317C);
        if(v1 != 0) {
            v2 = v | 6;
            hfc1 = hfc0;
        }
        else if((v & 6) == 0) {
            hfc1 = hfc0;
            v2 = v | (goz1.X(hfc1) ? 4 : 2);
        }
        else {
            hfc1 = hfc0;
            v2 = v;
        }
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(fuat0) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
            fuat1 = fuat0;
        }
        else {
            hfc hfc2 = v1 == 0 ? hfc1 : hfc.e;
            jbg jbg0 = jbh.a(goz1);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState1);
                object2 = parcelableSnapshotMutableState1;
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object3 = goz1.j();
            if(object3 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState2);
                object3 = parcelableSnapshotMutableState2;
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object4 = goz1.j();
            if(object4 == object1) {
                object4 = new dgh();
                goz1.P(object4);
            }
            goz1.x();
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            String s = isq.c(0x7F1500BD, goz1);  // string:accessibility_state_expanded "Expanded"
            String s1 = isq.c(0x7F1500BC, goz1);  // string:accessibility_state_collapsed "Collapsed"
            String s2 = isq.c(0x7F1500B1, goz1);  // string:accessibility_action_label_collapse "Collapse"
            String s3 = isq.c(0x7F1500B2, goz1);  // string:accessibility_action_label_expand "Expand"
            goz2 = goz1;
            fuat1 = fuat0;
            fugo.b(fuat0.e, (fuat0.f == null ? new fhvp[0] : fuat0.f), null, gzf.e(-887301071, new fuaq(fuat0, ((dgg)object4), s2, s3, s, s1, fuat0, hfc2, ((gra)object0), ((gra)object2), ((gra)object3), context0, jbg0), goz2), goz2, 0xC00, 4);
            hfc1 = hfc2;
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftzx(hfc1, fuat1, v, v1);
        }
    }

    public static final void g(ftzw ftzw0, ibth ibth0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xFB9FA38);
        int v1 = (v & 6) == 0 ? (goz1.Z(ftzw0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            dlv.a(dls.e(hfc.e, 16.0f), goz1);
            goz2 = goz1;
            fuhx.b(null, new fuhy(null, false, ftzw0.a, null, null, ftzw0.b, null, fuhp.a, ftzw0.c, ibth0, 347), null, goz2, 0x40, 5);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new ftzy(ftzw0, ibth0, v);
        }
    }

    public static final void h(boolean z, ibtw ibtw0, goz goz0) {
        fuar.e(z, ibtw0, goz0, 0x30);
    }
}

