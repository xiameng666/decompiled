public final class gplb implements Runnable {
    public final gplt a;

    public gplb(gplt gplt0) {
        this.a = gplt0;
    }

    @Override
    public final void run() {
        gplt gplt0 = this.a;
        if(!gplt0.i) {
            gplt0.g = true;
            gplt0.h();
        }
    }
}

