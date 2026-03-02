public final class bgn implements Runnable {
    public final bgt a;

    public bgn(bgt bgt0) {
        this.a = bgt0;
    }

    @Override
    public final void run() {
        bcs.c("ProcessingRequest", "onFinalResult(OutputFileResults): request ID = " + this.a.a);
        boj.b();
        bgw bgw0 = this.a.l;
        if(bgw0.e) {
            return;
        }
        bgw0.c();
        bgw0.d();
        throw null;
    }
}

