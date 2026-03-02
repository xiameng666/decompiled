public final class aufk implements evqc {
    public final aufp a;
    public final String b;

    public aufk(aufp aufp0, String s) {
        this.a = aufp0;
        this.b = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.d.e(exception0, "Register State Callback for network ID %s failed.", new Object[]{this.b});
        synchronized(this.a.a) {
            this.a.b = null;
        }
        this.a.f(2);
    }
}

