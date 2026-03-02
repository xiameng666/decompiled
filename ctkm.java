import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Set;

public final class ctkm {
    public static final void a(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    public static final boolean b(gra gra0) {
        return ((Boolean)gra0.a()).booleanValue();
    }

    public static final void c(Set set0, ctho ctho0, ibts ibts0, goz goz0, int v) {
        ibuq.f(set0, "devices");
        ibuq.f(ibts0, "onDeviceSelected");
        goz goz1 = goz0.ao(0xD2B8B116);
        int v1 = (v & 6) == 0 ? (goz1.Z(set0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ctho0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            if(set0.isEmpty()) {
                throw new IllegalStateException("At least one device must be provided");
            }
            if(!set0.contains(ctho0)) {
                throw new IllegalStateException("Selected device must be in device list");
            }
            goz1.M(0x6E3C21FE);
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            boolean z = ctkm.b(((gra)object0));
            goz1.M(5004770);
            Object object2 = goz1.j();
            if(object2 == object1) {
                object2 = new ctkc(((gra)object0));
                goz1.P(object2);
            }
            goz1.x();
            flt.d(z, ((ibts)object2), dla.i(dls.w(hfc.e), 64.0f, 0.0f, 2), gzf.e(-1137009344, new ctkl(set0, ((gra)object0), ctho0, ibts0), goz1), goz1, 0xDB0);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ctkd(set0, ctho0, ibts0, v);
        }
    }
}

