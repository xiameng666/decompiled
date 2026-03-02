public final class auic implements Runnable {
    public final auie a;
    public final auah b;
    public final gkfz c;
    public final boolean d;
    public final String e;

    public auic(auie auie0, auah auah0, gkfz gkfz0, boolean z, String s) {
        this.a = auie0;
        this.b = auah0;
        this.c = gkfz0;
        this.d = z;
        this.e = s;
    }

    @Override
    public final void run() {
        this.a.c.a(new auhy(this.b, this.c, this.d, System.currentTimeMillis(), this.e));
    }
}

