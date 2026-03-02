public final class fwvu implements glzn {
    public final fwvx a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final fwyc e;

    public fwvu(fwvx fwvx0, long v, boolean z, boolean z1, fwyc fwyc0) {
        this.a = fwvx0;
        this.b = v;
        this.c = z;
        this.d = z1;
        this.e = fwyc0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v = ((fvvj)object0).d();
        fwvx fwvx0 = this.a;
        boolean z = this.c;
        if(v == 0) {
            return fwvx0.e(this.b, z, this.d, this.e);
        }
        fwso.l(fwvx0.b, ((fvvj)object0), 0, 0, true);
        int v1 = ((fvvj)object0).d();
        fwvx0.e.g(1, 0, v1, 0, z, -1, 0, -1, -1, true, 0L);
        return gmbu.i(new hecl(1, ((fvvj)object0)));
    }
}

