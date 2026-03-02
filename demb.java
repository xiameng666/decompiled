import android.app.Activity;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import java.util.Set;

public final class demb {
    public static final Set a;

    static {
        demb.a = ibqg.c(new String[]{"text/vnd.android.intent", "image/", "text/", "video/", "audio/"});
    }

    public static final void a(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final void b(gra gra0, dekp dekp0) {
        gra0.b(dekp0);
    }

    public static final boolean c(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final void d(ibth ibth0, ibts ibts0, goz goz0, int v) {
        long v2;
        ibuq.f(ibth0, "onClick");
        ibuq.f(ibts0, "onDragAndDropReceived");
        goz goz1 = goz0.ao(-479702164);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(dekp.a, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            Activity activity0 = (Activity)goz1.h(abv.a);
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new dema(((gra)object0), activity0, ibts0);
                goz1.P(object2);
            }
            goz1.x();
            switch(((dekp)((gra)object0).a()).ordinal()) {
                case 0: {
                    goz1.M(-1432230791);
                    v2 = fpu.a(goz1).D;
                    goz1.x();
                    break;
                }
                case 1: {
                    goz1.M(-1432228290);
                    v2 = fpu.a(goz1).h;
                    goz1.x();
                    break;
                }
                case 2: {
                    goz1.M(0xAAA1F8A0);
                    v2 = fpu.a(goz1).i;
                    goz1.x();
                    break;
                }
                default: {
                    goz1.M(-1432233310);
                    goz1.x();
                    throw new ibnq();
                }
            }
            cmig.f(0x40950, gzf.e(0x733F1C6E, new delz(ibth0, ((dema)object2), cgl.a(v2, null, goz1, 0x180, 10)), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new delj(ibth0, ibts0, v);
        }
    }

    public static final void e(goz goz0, int v) {
        goz goz1 = goz0.ao(1580001651);
        int v1 = 0;
        if(v != 0) {
        label_8:
            lnm lnm0 = fpr.p;
            if(lnm0 == null) {
                lnm0 = gke.a(lno.c(12, 0.0f, 0.8f, fpr.c, 0xF2), fpr.f).c();
                fpr.p = lnm0;
            }
            hmu hmu0 = fpt.a(lnm0, goz1);
            hey hey0 = hfc.e;
            hfc hfc0 = cqx.c(hhi.a(dls.h(hey0, 100.0f), hmu0), fpu.a(goz1).c);
            iau iau0 = dhw.a(hei.e, false);
            long v2 = gol.c(goz1);
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
            int v3 = (int)(v2 ^ v2 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            fiso.a(ism.a(0x7F0804BF, goz1, 0), isq.c(0x7F1507D4, goz1), dls.h(hey0, 24.0f), fpu.a(goz1).a, goz1, 392, 0);  // drawable:gs_add_vd_theme_24
            goz1.z();
            v1 = v;
        }
        else if(!goz1.ac()) {
            v = 0;
            goto label_8;
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new delf(v1);
        }
    }

    public static final void f(gei gei0, ibth ibth0, goz goz0, int v) {
        ibuq.f(gei0, "tooltipState");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(0x4EFD5197);
        int v1 = (v & 6) == 0 ? (goz1.Z(gei0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40950, gzf.e(0xB74A15D5, new delx(gei0, ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new delg(gei0, ibth0, v);
        }
    }

    public static final void g(gei gei0, ibtw ibtw0, goz goz0, int v) {
        ibtw ibtw1;
        gei gei1;
        ibuq.f(gei0, "tooltipState");
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(47107506);
        int v1 = (v & 6) == 0 ? (goz1.Z(gei0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            gei1 = gei0;
            ibtw1 = ibtw0;
        }
        else {
            gei1 = gei0;
            ibtw1 = ibtw0;
            delc.c(gei1, isq.c(0x7F1529F4, goz1), ism.a(0x7F080EEC, goz1, 0), null, 0.0f, ibtw1, goz1, v1 & 14 | 0x200 | v1 << 15 & 0x380000, 56);  // string:select_files_tip_text "Select files to share first"
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deld(gei1, ibtw1, v);
        }
    }

    public static final void h(List list0, ibth ibth0, boolean z, goz goz0, int v) {
        ibuq.f(list0, "attachments");
        goz goz1 = goz0.ao(0xE50FED2A);
        int v1 = (v & 6) == 0 ? (goz1.Z(list0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Y(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            Object[] arr_object = {list0};
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                object0 = new delh();
                goz1.P(object0);
            }
            goz1.x();
            gra gra0 = (gra)had.c(arr_object, ((ibth)object0), goz1, 0x30);
            goz1.M(5004770);
            boolean z1 = goz1.X(gra0);
            Object object2 = goz1.j();
            if(z1 || object2 == object1) {
                object2 = new delk(gra0, null);
                goz1.P(object2);
            }
            goz1.x();
            gqe.f(list0, ((ibtw)object2), goz1);
            cmig.f(0x4094E, gzf.e(0x5E27872C, new delt(gra0, list0, ibth0, z), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deli(list0, ibth0, z, v);
        }
    }
}

