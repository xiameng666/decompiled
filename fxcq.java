import java.util.List;

public final class fxcq {
    public final fwze a;
    public final fvtb b;
    public final fwrd c;
    public final fwzh d;
    public final fxcp e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    private final List l;

    public fxcq(fwze fwze0, fwrd fwrd0, fvtb fvtb0) {
        this.a = fwze0;
        this.c = fwrd0;
        fxcp fxcp0 = new fxcp(this, fwze0);
        this.e = fxcp0;
        this.d = fwze0.p(fxcp0);
        this.b = fvtb0;
        this.g = false;
        this.l = huvd.q() || huvd.j() ? gged_interceptors.l(new fxdb(fwze0)) : ggna.a;
    }

    public final gmcd a(fvtd fvtd0, int v) {
        gmcd gmcd0 = gmbu.i(fvtd0);
        ggqk ggqk0 = ((gged_interceptors)this.l).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            gmcd0 = glzd.g(gmcd0, new fxca(((fxdb)object0), v), this.a.mJ().a);
        }
        return gmcd0;
    }

    public final void b(fvtd fvtd0, int v, int v1) {
        fvwz fvwz0 = this.a.mH();
        long v2 = this.a.f().b();
        fvwz0.a(new fvwx(0x93, v2, "ScanDetails: type=%3$d, age=%4$d", null, 29, v - 1 << 4 | v1, ((int)(v2 - fvtd0.a(v2, fvwz0)))));
    }
}

