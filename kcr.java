public final class kcr implements Runnable {
    public final kct a;
    public final int b;
    public final djgk c;

    public kcr(kct kct0, djgk djgk0, int v) {
        this.a = kct0;
        this.c = djgk0;
        this.b = v;
    }

    @Override
    public final void run() {
        kdd kdd0 = this.a.a.p();
        this.c.b(kdd0, this.b);
    }
}

