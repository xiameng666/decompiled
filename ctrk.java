public final class ctrk implements evqc {
    public final ctrq a;

    public ctrk(ctrq ctrq0) {
        this.a = ctrq0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)this.a.d.j()).s(exception0)).B("Failed to send payload: %s", this.a.h);
        this.a.d();
    }
}

