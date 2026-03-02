public final class cyns implements Runnable {
    public final cyoi a;
    public final int b;

    public cyns(cyoi cyoi0, int v) {
        this.a = cyoi0;
        this.b = v;
    }

    @Override
    public final void run() {
        cyoi cyoi0 = this.a;
        if(cyoi0.q()) {
            return;
        }
        gmbu.t(cyoi0.i(this.b, true, false), new cyoe(cyoi0), cyoi0.m);
    }
}

