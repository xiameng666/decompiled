abstract class futv extends futw {
    public futv(futd futd0) {
        super(futd0);
    }

    @Override  // futw
    protected final fusy g() {
        return this.d.j;
    }

    @Override  // futw
    protected final int h() {
        return 0;
    }

    protected abstract long i();

    @Override  // futw
    protected void j(String s) {
        if(this.b) {
            return;
        }
        futd futd0 = this.d;
        fuuw fuuw0 = futd0.m;
        if(fuuw0.a) {
            fuuw0.a();
        }
        futd0.B(false);
        super.j(s);
    }
}

