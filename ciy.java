import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ciy {
    public final gwq a;
    public long b;
    public final gra c;
    private final gra d;

    public ciy() {
        this.a = new gwq(new cit[16]);
        this.d = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
        this.b = 0x8000000000000000L;
        this.c = new ParcelableSnapshotMutableState(Boolean.valueOf(true), gul.a);
    }

    public final void a(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }

    public final void b(goz goz0, int v) {
        goz goz1 = goz0.ao(0xED0B0967);
        int v1 = (v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v;
        if(goz1.ad((v1 & 3) != 2, v1 & 1)) {
            Object object0 = goz1.j();
            Object object1 = gop.a;
            if(object0 == object1) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(null, gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object0 = parcelableSnapshotMutableState0;
            }
            if(!((Boolean)this.c.a()).booleanValue() && !((Boolean)this.d.a()).booleanValue()) {
                goz1.M(0xF6F2CB1B);
            }
            else {
                goz1.M(0xF75EC7B8);
                boolean z = goz1.Z(this);
                Object object2 = goz1.j();
                if(z || object2 == object1) {
                    object2 = new cix(((gra)object0), this, null);
                    goz1.P(object2);
                }
                gqe.f(this, ((ibtw)object2), goz1);
            }
            goz1.x();
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new cis(this, v);
        }
    }
}

