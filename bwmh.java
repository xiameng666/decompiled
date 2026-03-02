import j..util.Objects;

final class bwmh extends bwzp {
    final long a;
    final bwmx b;

    public bwmh(bwmx bwmx0, gltq gltq0, long v) {
        this.a = v;
        Objects.requireNonNull(bwmx0);
        this.b = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        bwmx bwmx0 = this.b;
        if(!bwmx0.F()) {
            bwne.f("Indexing retry skipped because init failed");
            return;
        }
        bwvg bwvg0 = bwmx0.n;
        if(bwvg0 != null) {
            long v = this.a;
            bwug bwug0 = new bwug();
            ggqj ggqj0 = bwvg0.c.b.h(bwug0).a.om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                bwvg0.b(((bwvl)object0), v + v);
            }
        }
    }
}

