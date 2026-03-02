import j..util.Objects;

public final class bwmt extends bwzp {
    final bwmx a;

    public bwmt(bwmx bwmx0, gltq gltq0) {
        Objects.requireNonNull(bwmx0);
        this.a = bwmx0;
        super(gltq0);
    }

    @Override  // bwzp
    public final void w() {
        bwmx bwmx0 = this.a;
        bwmx0.c.c(2);
        bwur bwur0 = bwmx0.e();
        ggqj ggqj0 = bwmx0.e().h(new bwuf()).a.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            bwvl bwvl0 = (bwvl)object0;
            bwnq bwnq0 = bwur0.c(bwvl0);
            if(bwnq0 != null && bwmx.J(bwnq0.d)) {
                bwvg bwvg0 = bwmx0.n;
                if(bwvg0 != null) {
                    bwvg0.a(bwvl0);
                }
            }
        }
        bwrc bwrc0 = bwmx0.p;
        if(bwrc0 != null) {
            bwrc0.c();
        }
    }
}

