import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class dexb {
    public static final void a(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final void b(gra gra0) {
        dexb.a(gra0, false);
    }

    public static final void c(ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(-1401682200);
        if((((v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40955, gzf.e(0x6DC051A6, new dewu(ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dewt(ibth0, v);
        }
    }

    public static final void d(ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(0x65258497);
        if((((v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40956, gzf.e(1709270741, new dewz(ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dews(ibth0, v);
        }
    }

    public static final void e(ibth ibth0, goz goz0, int v) {
        goz goz1 = goz0.ao(0xB69B4006);
        if((((v & 6) == 0 ? (goz1.Z(ibth0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40952, gzf.e(2011663044, new dexa(ibth0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dewr(ibth0, v);
        }
    }

    public static final void f(boolean z, ibth ibth0, ibth ibth1, ibth ibth2, goz goz0, int v) {
        goz goz2;
        boolean z1;
        ibuq.f(ibth0, "onSettingsClick");
        ibuq.f(ibth1, "onFeedbackClick");
        ibuq.f(ibth2, "onDebugToggle");
        goz goz1 = goz0.ao(582884203);
        int v1 = (v & 6) == 0 ? (goz1.Y(false) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            z1 = z;
            v1 |= (goz1.Y(z1) ? 0x20 : 16);
        }
        else {
            z1 = z;
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibth1) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibth2) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            goz1.M(5004770);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new dewo(((gra)object0));
                goz1.P(object2);
            }
            goz1.x();
            dexb.d(((ibth)object2), goz1, 6);
            boolean z2 = ((Boolean)((gra)object0).a()).booleanValue();
            goz1.M(5004770);
            Object object3 = goz1.j();
            if(object3 == object1) {
                object3 = new dewp(((gra)object0));
                goz1.P(object3);
            }
            goz1.x();
            goz2 = goz1;
            fisw.b(z2, ((ibth)object3), null, 0L, null, null, null, 0L, 0.0f, gzf.e(0x2E3766A6, new dewy(ibth0, ibth1, z1, ibth2, ((gra)object0)), goz1), goz2, 0x30, 0x30, 0x7FC);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new dewq(z, ibth0, ibth1, ibth2, v);
        }
    }
}

