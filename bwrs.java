public final class bwrs {
    public final bwrp a;
    public final bwru b;
    public final int c;
    public final bwrt d;
    private final gltq e;

    public bwrs(gltq gltq0, bwrp bwrp0, boolean z, int v, bwrt bwrt0) {
        this.e = gltq0;
        this.a = bwrp0;
        this.b = z ? new bwru() : null;
        this.c = v;
        this.d = bwrt0;
    }

    public final bwzp a() {
        return this.b(3);
    }

    public final bwzp b(int v) {
        return new bwrq(this, this.e, this.d.g, v, this.d.a);
    }

    public final boolean c() {
        return this.b != null;
    }
}

