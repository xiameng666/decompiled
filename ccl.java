import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class ccl {
    public final clj a;
    public final gra b;
    public final gra c;
    public cii d;
    private final gra e;
    private final cfz f;

    public ccl(cfz cfz0, clj clj0, clb clb0, ccn ccn0) {
        this.f = cfz0;
        this.a = clj0;
        this.b = new ParcelableSnapshotMutableState(clb0, gul.a);
        this.c = new ParcelableSnapshotMutableState(ccn0, gul.a);
        this.d = ccm.a;
        this.e = new ParcelableSnapshotMutableState(null, gul.a);
    }

    public final clb a() {
        return (clb)this.b.a();
    }

    public final gui b() {
        return (gui)this.e.a();
    }

    public final hka c() {
        if(this.f.d()) {
            gui gui0 = this.b();
            return gui0 == null ? null : ((hka)gui0.a());
        }
        return null;
    }

    public final void d(hka hka0, hka hka1, ccn ccn0) {
        if(this.f.d()) {
            if(this.b() == null) {
                if(ccn0 == null) {
                    ccn0 = (ccn)this.c.a();
                }
                this.d = ccn0.a();
            }
            this.e(this.a().b(new ccj(this), new cck(this, hka1, hka0)));
        }
    }

    public final void e(gui gui0) {
        this.e.b(gui0);
    }

    public final boolean f() {
        return ((Boolean)this.a.g()).booleanValue();
    }
}

