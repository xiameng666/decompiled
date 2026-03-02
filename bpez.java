public final class bpez implements glzn {
    public final bpik a;
    public final ByteString b;
    public final gtas c;
    public final boolean d;
    public final fqza e;
    public final boolean f;
    public final boov g;
    public final int h;

    public bpez(bpik bpik0, boov boov0, ByteString hfsf0, int v, gtas gtas0, boolean z, fqza fqza0, boolean z1) {
        this.a = bpik0;
        this.g = boov0;
        this.b = hfsf0;
        this.h = v;
        this.c = gtas0;
        this.d = z;
        this.e = fqza0;
        this.f = z1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        fqwo fqwo0 = new fqwo(null);
        fqwo0.e(this.b);
        fqwo0.d(hfyn.h(this.a.l.d().toEpochMilli()));
        fqwq fqwq0 = fqwo0.a();
        return gdta.g(this.a.y(this.e, this.c, this.d, this.g)).i(new bpfx(this.g, fqwq0), this.a.m).i(new bpfy(this.a, this.c, this.h, this.b, fqwq0, this.f, this.g), this.a.m).i(new bpfz(this.a, this.g), this.a.m);
    }
}

