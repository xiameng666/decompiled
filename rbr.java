public final class rbr implements Runnable {
    public final rcm a;
    public final rbo b;

    public rbr(rbo rbo0, rcm rcm0) {
        this.b = rbo0;
        this.a = rcm0;
    }

    @Override
    public final void run() {
        rbo rbo0 = this.b;
        if(rbo0.f.b != null) {
            rbo0.f.b.c(this.a);
            return;
        }
        rdk.h("BillingClient", "No valid listener is set in BroadcastManager");
    }
}

