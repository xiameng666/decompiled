import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class eiav {
    public static final boolean a(ehwv ehwv0) {
        ibuq.f(ehwv0, "<this>");
        return ehwv0.a == ehwt.b || eiav.b(ehwv0);
    }

    public static final boolean b(ehwv ehwv0) {
        ibuq.f(ehwv0, "<this>");
        return hxjr.f() ? ehwv0.e.g() == ehwu.d : ehwv0.a == ehwt.c;
    }

    public static final void c(hfc hfc0, gui gui0, eiam eiam0, goz goz0, int v) {
        ibuq.f(hfc0, "modifier");
        ibuq.f(gui0, "uiState");
        goz goz1 = goz0.ao(-2031260295);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(gui0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(eiam0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
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
            clj clj0 = ehxo.c(gui0, "ProximityUi", goz1, v1 >> 3 & 14 | 0x30);
            ehzx.d(null, clj0, eiam0.a, goz1, 0);
            goz1.M(-190964462);
            ehyl.a(null, clj0, goz1, 0);
            goz1.x();
            ehze.a(null, clj0, goz1, 0);
            jks jks0 = (jks)goz1.h(ipa.d);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(new jkv(0.0f), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            hey hey0 = hfc.e;
            goz1.M(-1633490746);
            boolean z = goz1.X(jks0);
            Object object2 = goz1.j();
            if(z || object2 == object1) {
                object2 = new eiat(jks0, ((gra)object0));
                goz1.P(object2);
            }
            goz1.x();
            ehyw.c(ibf.a(hey0, ((ibts)object2)), clj0, eiam0.b, eiam0.c, goz1, 0);
            eibc.a(null, clj0, eiav.d(((gra)object0)), eiav.d(((gra)object0)), goz1, 0);
            String s = eiam0.f;
            if(s != null) {
                goz1.M(0x9F3647E7);
                ehyh.a(dls.d(dls.b(hey0, 0.2f), 0.2f), clj0, s, goz1, 6);
            }
            else if(eiam0.e == null) {
                goz1.M(0x9F40EEEF);
            }
            else {
                goz1.M(0x9F3CE2DB);
                ehyh.c(dls.d(dls.b(hey0, 0.2f), 0.2f), clj0, goz1, 6);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new eiau(hfc0, gui0, eiam0, v);
        }
    }

    private static final float d(gra gra0) {
        return ((jkv)gra0.a()).a;
    }
}

