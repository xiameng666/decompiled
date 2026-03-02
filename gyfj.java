import j..util.Objects;

final class gyfj extends gyll {
    final gyfs a;

    public gyfj(gyfs gyfs0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfs0);
        this.a = gyfs0;
        super("BackgroundScannerPiggybacking", arr_gyll);
    }

    @Override  // gyll
    public final long a() {
        batl.s(this.a.a);
        hiex hiex0 = this.a.a.a().e;
        if(hiex0 == null) {
            hiex0 = hiex.a;
        }
        return hiex0.k;
    }

    @Override  // gyll
    public final boolean c() {
        gyel gyel0 = this.a.d;
        return gyel0 == null ? true : gyel0.l != null;
    }

    @Override  // gyll
    public final boolean d() {
        gyel gyel0 = this.a.d;
        if(gyel0 != null) {
            gyel0.l = (int)3;
            gyel0.d();
        }
        return true;
    }
}

