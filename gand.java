public final class gand implements Runnable {
    public final gani a;
    public final int b;

    public gand(gani gani0, int v) {
        this.a = gani0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.am = this.b;
    }
}

