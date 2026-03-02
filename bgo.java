public final class bgo implements Runnable {
    public final bgt a;

    public bgo(bgt bgt0) {
        this.a = bgt0;
    }

    @Override
    public final void run() {
        bcs.c("ProcessingRequest", "onPostviewBitmapAvailable: request ID = " + this.a.a);
        boj.b();
        if(this.a.l.e) {
            return;
        }
        throw null;
    }
}

