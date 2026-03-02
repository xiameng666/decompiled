final class iapq implements Runnable {
    final Runnable a;
    boolean b;
    boolean c;

    public iapq(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override
    public final void run() {
        if(!this.b) {
            this.c = true;
            this.a.run();
        }
    }
}

