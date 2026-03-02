public final class fckc implements evqc {
    public final String a;

    public fckc(String s) {
        this.a = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        fckl.a.n("Failed operation: %s, not retrying.", exception0, new Object[]{this.a});
    }
}

