public final class aufj implements evqf {
    public final aufp a;
    public final String b;

    public aufj(aufp aufp0, String s) {
        this.a = aufp0;
        this.b = s;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        aufp aufp0 = this.a;
        aufp0.d.c("Register State Callback for network ID %s succeeded", new Object[]{this.b});
        int v = aufp0.e();
        if(v == 3) {
            if(aufp0.i) {
                aufp0.f(4);
            }
        }
        else if(v == 1) {
            aufp0.c();
        }
    }
}

