public final class jnp extends hfb {
    public ibts a;
    public final ibts b;

    public jnp(ibts ibts0) {
        this.a = ibts0;
        this.b = new jno(this);
    }

    @Override  // hfb
    public final void dO() {
        this.a.a(this.b);
    }

    @Override  // hfb
    public final void dR() {
        this.a.a(null);
    }
}

