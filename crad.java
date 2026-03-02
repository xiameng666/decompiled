final class crad extends crac {
    private final gfsi a;

    public crad(evqp evqp0, gfsi gfsi0) {
        super(evqp0);
        this.a = gfsi0;
    }

    @Override  // cqxw
    public final void a(byte[] arr_b) {
        gfsx gfsx0 = (gfsx)this.a.apply(arr_b);
        if(gfsx0.i()) {
            this.b.c(gfsx0.d());
            return;
        }
        this.b.a(new crao(5, "An internal error occurred."));
    }
}

