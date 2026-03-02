import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cgv {
    public final gra a;
    public final gra b;
    public final gra c;
    public final gra d;

    public cgv(long v, long v1, long v2) {
        this.a = new ParcelableSnapshotMutableState(new hkf(v), gul.a);
        this.b = new ParcelableSnapshotMutableState(new hjz(v1), gul.a);
        this.c = new ParcelableSnapshotMutableState(new hjz(v2), gul.a);
        this.d = new ParcelableSnapshotMutableState(new hjz(v1), gul.a);
    }

    public final long a() {
        return ((hjz)this.d.a()).a;
    }

    public final long b() {
        return ((hjz)this.b.a()).a;
    }

    public final long c() {
        return ((hkf)this.a.a()).a;
    }

    public final long d() {
        return ((hjz)this.c.a()).a;
    }
}

