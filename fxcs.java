final class fxcs {
    public final fwze a;
    public final boolean b;
    private final fwrd c;
    private final fwyc d;
    private final boolean e;

    private fxcs(fwze fwze0, fwrd fwrd0, fwyc fwyc0, boolean z, boolean z1) {
        this.a = fwze0;
        this.c = fwrd0;
        this.d = fwyc0;
        this.b = z;
        this.e = z1;
    }

    static gmcd a(fwze fwze0, fwrd fwrd0, fwyc fwyc0, boolean z, boolean z1, fvtd fvtd0) {
        fxcs fxcs0 = new fxcs(fwze0, fwrd0, fwyc0, z, z1);
        fwze fwze1 = fxcs0.a;
        gged_interceptors gged0 = fvtd0.b(fwze1.f().b(), fwze1.mH());
        int v = gged0.size();
        fwrm.a(fwze1.mH(), 16, v, -1);
        if(v > 0) {
            fwze1.m().mS(((fvta)gggq.p(gged0)));
        }
        return glzd.f(heci.c().a(fvtd0, fxcs0.e, true, fxcs0.c, fxcs0.d), new fxcr(fxcs0), fwze1.mJ().a);
    }
}

