public final class gplo implements Runnable {
    public final gplp a;

    public gplo(gplp gplp0) {
        this.a = gplp0;
    }

    @Override
    public final void run() {
        gplp gplp0 = this.a;
        if(!gplp0.b) {
            gplp0.a.d();
        }
    }
}

