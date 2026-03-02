import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class aadq {
    public static final zeq a(gra gra0) {
        return (zeq)gra0.a();
    }

    public static final void b(zhr zhr0, hyt hyt0, hfc hfc0, long v, int v1, int v2, goz goz0, int v3, int v4) {
        hfc hfc3;
        int v16;
        int v15;
        long v14;
        int v13;
        int v12;
        hfc hfc2;
        int v11;
        int v9;
        long v7;
        hfc hfc1;
        int v5;
        ibuq.f(zhr0, "image");
        goz goz1 = goz0.ao(-1529309419);
        if((v4 & 1) == 0) {
            v5 = (v3 & 6) == 0 ? (((v3 & 8) == 0 ? goz1.X(zhr0) : goz1.Z(zhr0)) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x30) == 0) {
            v5 |= (goz1.X(hyt0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
            hfc1 = hfc0;
        }
        else if((v3 & 0x180) == 0) {
            hfc1 = hfc0;
            v5 |= (goz1.X(hfc1) ? 0x100 : 0x80);
        }
        else {
            hfc1 = hfc0;
        }
        int v6 = 0x400;
        if((v3 & 0xC00) == 0) {
            if((v4 & 8) == 0) {
                v7 = v;
                if(goz1.W(v7)) {
                    v6 = 0x800;
                }
            }
            else {
                v7 = v;
            }
            v5 |= v6;
        }
        else {
            v7 = v;
        }
        int v8 = 0x2000;
        if((v3 & 0x6000) == 0) {
            if((v4 & 16) == 0) {
                v9 = v1;
                if(goz1.V(v9)) {
                    v8 = 0x4000;
                }
            }
            else {
                v9 = v1;
            }
            v5 |= v8;
        }
        else {
            v9 = v1;
        }
        int v10 = 0x10000;
        if((0x30000 & v3) == 0) {
            if((v4 & 0x20) == 0) {
                v11 = v2;
                if(goz1.V(v11)) {
                    v10 = 0x20000;
                }
            }
            else {
                v11 = v2;
            }
            v5 |= v10;
        }
        else {
            v11 = v2;
        }
        if((v5 & 74899) == 74898 && goz1.ac()) {
            goz1.G();
            hfc2 = hfc1;
            v12 = v9;
            v13 = v11;
            v14 = v7;
        }
        else {
            goz1.I();
            if((v3 & 1) != 0 && !goz1.aa()) {
                goz1.G();
                v15 = v9;
                v16 = v11;
                hfc3 = hfc1;
            }
            else {
                hfc hfc4 = (v4 & 4) == 0 ? hfc1 : hfc.e;
                if((v4 & 8) != 0) {
                    v7 = fpu.a(goz1).q;
                }
                int v17 = (v4 & 16) == 0 ? v9 : zhr0.e;
                if((v4 & 0x20) == 0) {
                    hfc3 = hfc4;
                    v15 = v17;
                    v16 = v11;
                }
                else {
                    hfc3 = hfc4;
                    v16 = zhr0.f;
                    v15 = v17;
                }
            }
            goz1.w();
            Context context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b);
            zem zem0 = (zem)goz1.h(aadh.a);
            Integer integer0 = zhr0.a;
            String s = cchl.d() ? zhr0.c : zhr0.b;
            goz1.M(5004770);
            boolean z = goz1.X(s);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                int v18 = aabq.a(context0, grwd.b(integer0.intValue()));
                zen zen0 = v18 == 0 ? zen.a : new zeo(v18, s.length() == 0);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(zen0, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            goz1.M(5004770);
            boolean z1 = goz1.X(s);
            Object object1 = goz1.j();
            if(z1 || object1 == gop.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = new ParcelableSnapshotMutableState(Boolean.valueOf((aadq.a(((gra)object0)) instanceof zep) || (aadq.a(((gra)object0)) instanceof zeo)), gul.a);
                goz1.P(parcelableSnapshotMutableState1);
                object1 = parcelableSnapshotMutableState1;
            }
            goz1.x();
            if(!(aadq.a(((gra)object0)) instanceof zep)) {
                zem0.b(s, new aado(((gra)object0), ((gra)object1)));
            }
            iau iau0 = dhw.a(hei.e, false);
            long v19 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc5 = hew.c(goz1, hfc3);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v20 = (int)(v19 ^ v19 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v20))) {
                Integer integer1 = v20;
                goz1.P(integer1);
                goz1.p(integer1, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc5, iej.c);
            ccf.b(((Boolean)((gra)object1).a()).booleanValue(), null, cef.o(chm.c(500, 0, null, 6), 2), null, null, gzf.e(0xC06F7377, new aadp(zhr0, hyt0, v7, v15, v16, ((gra)object0)), goz1), goz1, 0x30180, 26);
            goz1.z();
            v12 = v15;
            v14 = v7;
            hfc2 = hfc3;
            v13 = v16;
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aadm(zhr0, hyt0, hfc2, v14, v12, v13, v3, v4);
        }
    }

    public static final void c(zeq zeq0, String s, hyt hyt0, long v, hfc hfc0, goz goz0, int v1) {
        goz goz1 = goz0.ao(0x62FF8021);
        int v2 = (v1 & 6) == 0 ? (goz1.Z(zeq0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.X(s) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.X(hyt0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v2 |= (goz1.W(v) ? 0x800 : 0x400);
        }
        if((v1 & 0x6000) == 0) {
            v2 |= (goz1.X(hfc0) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
        }
        else {
            if((zeq0 instanceof zep)) {
                goz1.M(0xA1201933);
                cth.c(new hkn(((zep)zeq0).a), s, iqn.a(hfc0, "image-success"), null, hyt0, 0.0f, null, goz1, v2 & 0x70 | v2 << 6 & 0xE000, 0xE8);
            }
            else if((zeq0 instanceof zeo)) {
                goz1.M(0x82E6A104);
                hpw hpw0 = ism.a(((zeo)zeq0).a, goz1, 0);
                hlb hlb0 = ((zeo)zeq0).b ? new hlb(v, 5) : null;
                cth.a(hpw0, s, iqn.a(hfc0, "image-placeholder"), null, hyt0, 0.0f, hlb0, goz1, v2 & 0x70 | 8 | v2 << 6 & 0xE000, 40);
            }
            else if(ibuq.m(zeq0, zen.a)) {
                goz1.M(0xA1205F27);
                dhw.d(iqn.a(hfc0, "image-empty"), goz1, 0);
            }
            else {
                goz1.M(0x82EC23E1);
            }
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new aadn(zeq0, s, hyt0, v, hfc0, v1);
        }
    }
}

