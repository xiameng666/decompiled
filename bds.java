public final class bds implements Runnable {
    public final bek a;
    public final bej b;

    public bds(bek bek0, bej bej0) {
        this.a = bek0;
        this.b = bej0;
    }

    @Override
    public final void run() {
        this.a.a(this.b);
    }
}

