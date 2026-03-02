final class aqb {
    public aqa a;
    final aqi b;

    public aqb(aqi aqi0) {
        this.b = aqi0;
        super();
        this.a = null;
    }

    public final void a() {
        aqa aqa0 = this.a;
        if(aqa0 != null) {
            aqa0.b.set(true);
            aqa0.a.cancel(true);
        }
        this.a = null;
    }

    public final boolean b() {
        return this.a != null && !this.a.b.get();
    }
}

