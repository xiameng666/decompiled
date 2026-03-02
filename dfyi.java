public final class dfyi implements Runnable {
    public final dfzz a;
    public final long b;
    public final dfum c;

    public dfyi(dfzz dfzz0, long v, dfum dfum0) {
        this.a = dfzz0;
        this.b = v;
        this.c = dfum0;
    }

    @Override
    public final void run() {
        dcvz.a.b().h("Timing out reading from NearbyConnection after %d ms. Closing connection.", Long.valueOf(this.b));
        this.a.Y.set(true);
        this.c.a();
    }
}

