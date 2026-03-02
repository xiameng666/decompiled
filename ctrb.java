public final class ctrb implements evqc {
    public final ctrq a;

    public ctrb(ctrq ctrq0) {
        this.a = ctrq0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(this.a.d.j(), "Failed to listen for bandwidth upgrade", exception0);
        this.a.d();
    }
}

