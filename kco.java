public final class kco implements Runnable {
    public final kct a;
    public final kdd b;
    public final djgk c;

    public kco(kct kct0, djgk djgk0, kdd kdd0) {
        this.a = kct0;
        this.c = djgk0;
        this.b = kdd0;
    }

    @Override
    public final void run() {
        if(this.a.a.h.compareAndSet(true, false)) {
            this.c.b(this.b, 6);
        }
    }
}

