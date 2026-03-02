public final class ctrw implements evqc {
    public final ctsg a;

    public ctrw(ctsg ctsg0) {
        this.a = ctsg0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ctsg ctsg0 = this.a;
        a.ae(ctsg0.b.i(), "Failed to start discovery", exception0);
        synchronized(ctsg0) {
            icck icck0 = ctsg0.d;
            if(icck0 != null) {
                iccl.i(icck0);
            }
            ctsg0.d = null;
        }
    }
}

