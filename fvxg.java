public final class fvxg implements Runnable {
    public final fvxn_FusionEngine a;
    public final long b;
    public final gpvs c;

    public fvxg(fvxn_FusionEngine fvxn0, long v, gpvs gpvs0) {
        this.a = fvxn0;
        this.b = v;
        this.c = gpvs0;
    }

    @Override
    public final void run() {
        fvxn_FusionEngine fvxn0 = this.a;
        if(!fvxn0.l) {
            return;
        }
        fvxn0.n_deepblueHandler.h(this.b, this.c);
        fvxn0.m(this.b);
    }
}

