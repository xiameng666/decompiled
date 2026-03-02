public final class fwuv implements Runnable {
    public final fwux a;
    public final fwzf b;
    public final int c;

    public fwuv(fwux fwux0, fwzf fwzf0, int v) {
        this.a = fwux0;
        this.b = fwzf0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.f.b(this.b, this.c);
    }
}

