public final class bgm implements Runnable {
    public final bgt a;
    public final bcn b;

    public bgm(bgt bgt0, bcn bcn0) {
        this.a = bgt0;
        this.b = bcn0;
    }

    @Override
    public final void run() {
        bcs.c("ProcessingRequest", "onFinalResult(ImageProxy): request ID = " + this.a.a);
        boj.b();
        bgw bgw0 = this.a.l;
        if(bgw0.e) {
            this.b.close();
            return;
        }
        bgw0.c();
        bgw0.d();
        throw null;
    }
}

