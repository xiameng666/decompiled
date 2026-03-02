public final class bgk implements Runnable {
    public final bgt a;
    public final bcf b;

    public bgk(bgt bgt0, bcf bcf0) {
        this.a = bgt0;
        this.b = bcf0;
    }

    @Override
    public final void run() {
        bcs.e("ProcessingRequest", "onProcessFailure: request ID = " + this.a.a, this.b);
        boj.b();
        bgw bgw0 = this.a.l;
        if(bgw0.e) {
            return;
        }
        bgw0.c();
        bgw0.d();
        bgw.f();
    }
}

