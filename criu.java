public final class criu implements evqc {
    public final criv a;
    public final long b;

    public criu(criv criv0, long v) {
        this.a = criv0;
        this.b = v;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.a.set(this.b);
    }
}

