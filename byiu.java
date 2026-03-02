import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class byiu {
    public static final void a(String s, ibth ibth0, goz goz0, int v) {
        ibth ibth1;
        ibuq.f(s, "text");
        ibuq.f(ibth0, "onClick");
        goz goz1 = goz0.ao(1705234026);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            ibth1 = ibth0;
        }
        else {
            ibth1 = ibth0;
            fcm.d(ibth1, dla.i(hfc.e, 0.0f, 4.0f, 1), false, null, fbz.q(fpu.a(goz1).a, goz1), new dle(12.0f, 10.0f, 12.0f, 10.0f), gzf.e(0xF7160C67, new byis(s), goz1), goz1, v1 >> 3 & 14 | 0x30C00030, 364);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byip(s, ibth1, v);
        }
    }

    public static final void b(hfc hfc0, ibts ibts0, goz goz0, int v) {
        hfc hfc1;
        ibuq.f(ibts0, "onToggle");
        goz goz1 = goz0.ao(0xD9DAB221);
        int v1 = (v & 6) == 0 ? (goz1.X(hfc0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            hfc1 = hfc0;
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
            goz1.M(-1633490746);
            Object object2 = goz1.j();
            if((v1 & 0x70) == 0x20 || object2 == object1) {
                object2 = new byiq(((gra)object0), ibts0);
                goz1.P(object2);
            }
            goz1.x();
            hfc1 = hfc0;
            fnl.b(((ibth)object2), hfc1, false, null, null, gzf.e(-404071233, new byit(((gra)object0)), goz1), goz1, v1 << 3 & 0x70 | 0x180000, 60);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byir(hfc1, ibts0, v);
        }
    }
}

