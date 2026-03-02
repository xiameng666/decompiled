public final class algl implements Runnable {
    public final algs a;
    public final Runnable b;

    public algl(algs algs0, Runnable runnable0) {
        this.a = algs0;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        Runnable runnable0 = this.b;
        algs algs0 = this.a;
        if(algs0.d) {
            runnable0.run();
            return;
        }
        algs0.c.add(runnable0);
    }
}

