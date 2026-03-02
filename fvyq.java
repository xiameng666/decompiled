public final class fvyq implements evqc {
    public final fvyu a;

    public fvyq(fvyu fvyu0) {
        this.a = fvyu0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        synchronized(this.a.a) {
            this.a.d = null;
            this.a.k = false;
            this.a.l = null;
        }
    }
}

