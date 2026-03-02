public final class dxis implements evqc {
    public final dxjk a;
    public final evqc b;

    public dxis(dxjk dxjk0, evqc evqc0) {
        this.a = dxjk0;
        this.b = evqc0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(this.a.b.i(), "Failed to update privacy setting.", exception0);
        this.b.gv(exception0);
        this.a.J(exception0);
    }
}

