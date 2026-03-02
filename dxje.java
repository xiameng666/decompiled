public final class dxje implements evqc {
    public final dxjk a;

    public dxje(dxjk dxjk0) {
        this.a = dxjk0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(this.a.b.i(), "Failed to get settings.", exception0);
        this.a.J(exception0);
        this.a.I(true);
    }
}

