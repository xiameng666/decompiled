public final class ctue implements evqc {
    public final ctuy a;

    public ctue(ctuy ctuy0) {
        this.a = ctuy0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(this.a.b.i(), "Failed to listen for connections", exception0);
        this.a.d.clear();
        icck icck0 = this.a.c;
        if(icck0 != null) {
            iccl.i(icck0);
        }
    }
}

