public final class bbp implements Runnable {
    public final bbr a;

    public bbp(bbr bbr0) {
        this.a = bbr0;
    }

    @Override
    public final void run() {
        bbr bbr0 = this.a;
        synchronized(bbr0.o) {
            bbr0.q = null;
            bcn bcn0 = bbr0.p;
            if(bcn0 != null) {
                bbr0.p = null;
                bbr0.e(bcn0);
            }
        }
    }
}

