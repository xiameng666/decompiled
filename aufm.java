public final class aufm implements evqc {
    public final aufp a;
    public final String b;

    public aufm(aufp aufp0, String s) {
        this.a = aufp0;
        this.b = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.d.e(exception0, "Unregister State Callback for network ID %s failed", new Object[]{this.b});
    }
}

