import android.content.res.Configuration;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class delc {
    public static final void a(ibtx ibtx0, goz goz0, int v) {
        ibtx ibtx1;
        goz goz1 = goz0.ao(-2010070125);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtx0) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
            ibtx1 = ibtx0;
        }
        else {
            ddxv.b(goz1);
            dhf dhf0 = dho.h(8.0f, hei.o);
            ibtx1 = ibtx0;
            djr.e(dls.w(hfc.e), dhf0, null, null, 0, 0, ibtx1, goz1, v1 << 18 & 0x380000 | 6, 60);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new deku(ibtx1, v);
        }
    }

    public static final void b(ged ged0, String s, hpw hpw0, ibtx ibtx0, goz goz0, int v) {
        goz goz2;
        goz goz1 = goz0.ao(0xDACC18E8);
        int v1 = (v & 6) == 0 ? (goz1.Z(ged0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((v & 0x200) == 0 ? goz1.X(hpw0) : goz1.Z(hpw0)) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Y(false) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibtx0) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            long v2 = ddxv.a(goz1).c;
            jks jks0 = (jks)goz1.h(ipa.d);
            goz1.M(0x5829ABD1);
            int v3 = jks0.ei(((float)((Configuration)goz1.h(AndroidCompositionLocals_androidKt.a)).screenWidthDp));
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            hey hey0 = hfc.e;
            goz1.M(-1633490746);
            boolean z = goz1.Z(ged0);
            Object object2 = goz1.j();
            if(z || object2 == object1) {
                object2 = new dekr(((gra)object0), ged0);
                goz1.P(object2);
            }
            goz1.x();
            hfc hfc0 = hzt.a(hey0, ((ibtx)object2));
            goz1.M(-1224400529);
            int v4 = goz1.W(v2) | goz1.X(jks0) | goz1.V(v3);
            Object object3 = goz1.j();
            if((v4 | ((v1 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || object3 == object1) {
                deks deks0 = new deks(v2, jks0, v3, ((gra)object0));
                goz1.P(deks0);
                object3 = deks0;
            }
            goz1.x();
            goz2 = goz1;
            gaq.c(dls.z(hhm.b(hfc0, ((ibts)object3)), 240.0f, 64.0f, 296.0f, 0.0f, 8), fpu.c(goz1).e, v2, 0L, 0.0f, 3.0f, null, gzf.e(0x97BDE02D, new dela(ibtx0, hpw0, s), goz1), goz2, 88);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dekt(ged0, s, hpw0, ibtx0, v);
        }
    }

    public static final void c(gei gei0, String s, hpw hpw0, ibtx ibtx0, float f, ibtw ibtw0, goz goz0, int v, int v1) {
        ibtx ibtx2;
        float f1;
        ibtx ibtx1;
        int v2;
        hpw hpw1 = hpw0;
        ibuq.f(gei0, "state");
        ibuq.f(s, "text");
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(0x44FC9C2);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (goz1.Z(gei0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (((v & 0x200) == 0 ? goz1.X(hpw1) : goz1.Z(hpw1)) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            ibtx1 = ibtx0;
        }
        else if((v & 0xC00) == 0) {
            ibtx1 = ibtx0;
            v2 |= (goz1.Z(ibtx1) ? 0x800 : 0x400);
        }
        else {
            ibtx1 = ibtx0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            f1 = f;
        }
        else if((v & 0x6000) == 0) {
            f1 = f;
            v2 |= (goz1.U(f1) ? 0x4000 : 0x2000);
        }
        else {
            f1 = f;
        }
        int v3 = (0x180000 & v) == 0 ? v2 | 0x30000 | (goz1.Z(ibtw0) ? 0x100000 : 0x80000) : v2 | 0x30000;
        if((0x92493 & v3) == 0x92492 && goz1.ac()) {
            goz1.G();
            ibtx2 = ibtx1;
        }
        else {
            if((v1 & 4) != 0) {
                hpw1 = null;
            }
            ibtx ibtx3 = (v1 & 8) == 0 ? ibtx1 : null;
            if((v1 & 16) != 0) {
                f1 = 0.0f;
            }
            goz1.M(1055208850);
            int v4 = ((jks)goz1.h(ipa.d)).ei(8.0f + f1);
            int v5 = ((jks)goz1.h(ipa.d)).ei(34.0f);
            goz1.M(-1633490746);
            int v6 = goz1.V(v4) | goz1.V(v5);
            Object object0 = goz1.j();
            if(v6 != 0 || object0 == gop.a) {
                object0 = new delb(v5, v4);
                goz1.P(object0);
            }
            goz1.x();
            goz1.x();
            fiun.a(((delb)object0), gzf.e(0x635E49F7, new deky(s, hpw1, ibtx3), goz1), gei0, null, false, ibtw0, goz1, v3 << 6 & 0x380 | 0x30 | v3 << 6 & 0xE000000);
            ibtx2 = ibtx3;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dekv(gei0, s, hpw1, ibtx2, f1, ibtw0, v, v1);
        }
    }
}

