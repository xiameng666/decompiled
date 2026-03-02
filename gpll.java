public final class gpll implements Runnable {
    public final gplp a;
    public final iaof_metadata b;

    public gpll(gplp gplp0, iaof_metadata iaof0) {
        this.a = gplp0;
        this.b = iaof0;
    }

    @Override
    public final void run() {
        gplp gplp0 = this.a;
        if(!gplp0.b) {
            gplp0.a.b(this.b);
        }
    }
}

