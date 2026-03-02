public final class brm implements Runnable {
    public final bsb a;
    public final Runnable b;
    public final Runnable c;

    public brm(bsb bsb0, Runnable runnable0, Runnable runnable1) {
        this.a = bsb0;
        this.b = runnable0;
        this.c = runnable1;
    }

    @Override
    public final void run() {
        if(this.a.h) {
            this.b.run();
            return;
        }
        this.c.run();
    }
}

