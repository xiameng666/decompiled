public final class gpln implements Runnable {
    public final gplp a;
    public final Object b;

    public gpln(gplp gplp0, Object object0) {
        this.a = gplp0;
        this.b = object0;
    }

    @Override
    public final void run() {
        gplp gplp0 = this.a;
        if(!gplp0.b) {
            gplp0.a.c(this.b);
        }
    }
}

