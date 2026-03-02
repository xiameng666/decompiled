import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cex extends cgi {
    private final cgv a;
    private final gra b;
    private final gra c;

    public cex() {
        throw null;
    }

    public cex(cgv cgv0, cfe cfe0, hka hka0) {
        this.a = cgv0;
        this.b = new ParcelableSnapshotMutableState(cfe0, gul.a);
        this.c = new ParcelableSnapshotMutableState(hka0, gul.a);
    }

    @Override  // cgi
    public final cgi a() {
        hkb.b(hjz.d(this.a.a(), this.a.d()), this.a.c());
        cfk cfk0 = this.j().b;
        cfk0.d().b();
        cfk0.d();
        cfk0.c().b.a().g();
        return cey.a;
    }

    @Override  // cgi
    public final cgv b() {
        return this.a;
    }

    @Override  // cgi
    public final hka c() {
        return (hka)this.c.a();
    }

    @Override  // cgi
    public final void e(hka hka0) {
        this.c.b(hka0);
    }

    @Override  // cgi
    public final boolean f() {
        return true;
    }

    @Override  // cgi
    public final cgi g(cfj cfj0, cfe cfe0, long v, long v1, long v2) {
        int v3 = ibuq.m(this.j(), cfe0) ^ 1;
        cgk.b(this.a, v, v1, v2, ((boolean)v3));
        this.b.b(cfe0);
        return this;
    }

    @Override  // cgi
    public final cgi h(cfe cfe0) {
        return this;
    }

    @Override  // cgi
    public final boolean i() {
        return true;
    }

    public final cfe j() {
        return (cfe)this.b.a();
    }
}

