public final class fclj implements evqc {
    public final fcln a;
    public final String b;
    public final int c;

    public fclj(fcln fcln0, String s, int v) {
        this.a = fcln0;
        this.b = s;
        this.c = v;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        String s = this.b;
        if(s != null) {
            fcln.a.g(s, exception0, new Object[0]);
        }
        this.a.e(this.c, exception0);
    }
}

