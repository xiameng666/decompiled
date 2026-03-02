import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ejsb {
    public static final long a(gra gra0) {
        return ((hjz)gra0.a()).a;
    }

    public static final long b(gra gra0) {
        return ((hjz)gra0.a()).a;
    }

    public static final long c(gra gra0) {
        return ((hjz)gra0.a()).a;
    }

    public static final void d(hfc hfc0, gra gra0, goz goz0, int v) {
        hfc hfc1;
        goz goz1 = goz0.ao(0x7CFA7681);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(gra0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
        }
        else if(ibuq.m(gra0.a(), ejst.a)) {
            goz1.M(-559498062);
            ejsb.e(hfc0, goz1, v1 & 14);
            goz1.x();
            hfc1 = hfc0;
        }
        else {
            goz1.M(-559440247);
            hfc1 = hfc0;
            cth.a(ism.a(((ejsv)gra0.a()).b, goz1, 0), null, hfc1, null, hys.b, 0.0f, null, goz1, v1 << 6 & 0x380 | 0x6038, 104);
            goz1.x();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ejrw(hfc1, gra0, v);
        }
    }

    public static final void e(hfc hfc0, goz goz0, int v) {
        gra gra0;
        goz goz1 = goz0.ao(-2009672544);
        if((((v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            ciy ciy0 = cjc.b(goz1);
            float f = ejsb.g(goz1);
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(new hjz(((long)Float.floatToRawIntBits(0.0f)) << 0x20 | ((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            gui gui0 = ejsb.f(ciy0, 0, goz1, 8, 1);
            float f1 = Float.intBitsToFloat(((int)(ejsb.b(((gra)object0)) >> 0x20)));
            ((gra)object0).b(new hjz(((long)Float.floatToRawIntBits(((Number)gui0.a()).floatValue())) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f1)) << 0x20));
            goz1.M(0x6E3C21FE);
            Object object2 = goz1.j();
            if(object2 == object1) {
                gra0 = (gra)object0;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = new ParcelableSnapshotMutableState(new hjz(((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(0.0f)) << 0x20), gul.a);
                goz1.P(parcelableSnapshotMutableState1);
                object2 = parcelableSnapshotMutableState1;
            }
            else {
                gra0 = (gra)object0;
            }
            goz1.x();
            gui gui1 = ejsb.f(ciy0, 20, goz1, 56, 0);
            float f2 = Float.intBitsToFloat(((int)(ejsb.c(((gra)object2)) >> 0x20)));
            ((gra)object2).b(new hjz(((long)Float.floatToRawIntBits(((Number)gui1.a()).floatValue())) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f2)) << 0x20));
            goz1.M(0x6E3C21FE);
            Object object3 = goz1.j();
            if(object3 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(new hjz(((long)Float.floatToRawIntBits(0.0f)) << 0x20 | ((long)Float.floatToRawIntBits(0.0f)) & 0xFFFFFFFFL), gul.a);
                goz1.P(parcelableSnapshotMutableState2);
                object3 = parcelableSnapshotMutableState2;
            }
            goz1.x();
            gui gui2 = ejsb.f(ciy0, 40, goz1, 56, 0);
            ((gra)object3).b(new hjz(((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(ejsb.a(((gra)object3)) >> 0x20))))) << 0x20 | ((long)Float.floatToRawIntBits(((Number)gui2.a()).floatValue())) & 0xFFFFFFFFL));
            hfc hfc1 = dls.w(hfc0);
            iau iau0 = dll.b(dho.e, hei.k, goz1, 54);
            long v1 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc2 = hew.c(goz1, hfc1);
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
            guo.b(goz1, hfc2, iej.c);
            hey hey0 = hfc.e;
            hfc hfc3 = dla.d(hey0, 10.0f);
            goz1.M(0x97EA02AA);
            boolean z = goz1.U(f);
            Object object4 = goz1.j();
            if(z || object4 == object1) {
                object4 = new ejrx(0xFF3B78E700000000L, f, gra0);
                goz1.P(object4);
            }
            goz1.x();
            crn.a(hfc3, ((ibts)object4), goz1, 6);
            hfc hfc4 = dla.d(hey0, 10.0f);
            goz1.M(0x97EA02AA);
            boolean z1 = goz1.U(f);
            Object object5 = goz1.j();
            if(z1 || object5 == object1) {
                object5 = new ejry(0xFF3B78E700000000L, f, ((gra)object2));
                goz1.P(object5);
            }
            goz1.x();
            crn.a(hfc4, ((ibts)object5), goz1, 6);
            hfc hfc5 = dla.d(hey0, 10.0f);
            goz1.M(0x97EA02AA);
            boolean z2 = goz1.U(f);
            Object object6 = goz1.j();
            if(z2 || object6 == object1) {
                object6 = new ejrz(0xFF3B78E700000000L, f, ((gra)object3));
                goz1.P(object6);
            }
            goz1.x();
            crn.a(hfc5, ((ibts)object6), goz1, 6);
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ejsa(hfc0, v);
        }
    }

    private static final gui f(ciy ciy0, int v, goz goz0, int v1, int v2) {
        goz0.M(1306455258);
        if(1 == v2) {
            v = 0;
        }
        gui gui0 = cjc.c(ciy0, 0.0f, ejsb.g(goz0), chm.d(new cmb(200, v, cih.d), 2, 0L, 4), goz0, v1 & 14 | 0x1038);
        goz0.x();
        return gui0;
    }

    private static final float g(goz goz0) {
        goz0.M(0xFAE54723);
        float f = ((jks)goz0.h(ipa.d)).eg(5.0f);
        goz0.x();
        return f;
    }
}

