public final class absm implements Runnable {
    public final absp a;
    public final int b;
    public final absf c;

    public absm(absp absp0, int v, absf absf0) {
        this.a = absp0;
        this.b = v;
        this.c = absf0;
    }

    @Override
    public final void run() {
        if(((abso)this.a.b).gf(this.b)) {
            this.c.y("Local AnalyticsService processed last dispatch request");
        }
    }
}

