public final class gplc implements Runnable {
    public final gplt a;
    public final int b;

    public gplc(gplt gplt0, int v) {
        this.a = gplt0;
        this.b = v;
    }

    @Override
    public final void run() {
        gplt gplt0 = this.a;
        if(!gplt0.i) {
            int v = this.b;
            if(gplt0.e.e == 4) {
                gplt0.j.c(v);
                return;
            }
            gplt0.d += v;
        }
    }
}

