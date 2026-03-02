public final class kcn implements Runnable {
    public final kct a;
    public final kdd b;
    public final int c;
    public final djgk d;

    public kcn(kct kct0, djgk djgk0, kdd kdd0, int v) {
        this.a = kct0;
        this.d = djgk0;
        this.b = kdd0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.a.h.set(false);
        this.d.b(this.b, this.c);
    }
}

