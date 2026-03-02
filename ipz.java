import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ipz implements irc {
    public gra a;
    private ibth b;
    private final gra c;

    public ipz() {
        this.c = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
    }

    @Override  // irc
    public final long a() {
        if(this.a == null) {
            this.a = new ParcelableSnapshotMutableState(new jlk((this.b == null ? 0L : ((jlk)this.b.a()).a)), gul.a);
            this.b = null;
        }
        gra gra0 = this.a;
        ibuq.c(gra0);
        return ((jlk)gra0.a()).a;
    }

    public final void b(ibth ibth0) {
        if(this.a == null) {
            this.b = ibth0;
        }
    }

    public final void c(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    @Override  // irc
    public final boolean d() {
        return ((Boolean)this.c.a()).booleanValue();
    }

    public static final void e(int v) {
        hww hww0 = new hww(v);
        ird.a.b(hww0);
    }
}

