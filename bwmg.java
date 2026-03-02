import j..util.Objects;

final class bwmg extends bwzp {
    final bwmx a;

    public bwmg(bwmx bwmx0, gltq gltq0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final Object a() {
        bwmx bwmx0 = this.a;
        if(!bwmx0.F()) {
            bwne.f("Maintenance skipped because init failed");
            bwmx0.r.d("maintenance_skipped");
            return Boolean.valueOf(false);
        }
        bwmx0.s();
        return Boolean.valueOf(true);
    }
}

