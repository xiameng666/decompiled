import j..util.Objects;

final class crpj implements Runnable {
    final long a;
    final crpq b;

    public crpj(crpq crpq0, long v) {
        this.a = v;
        Objects.requireNonNull(crpq0);
        this.b = crpq0;
        super();
    }

    @Override
    public final void run() {
        crpq crpq0 = this.b;
        crpq0.n();
        crpq0.q();
        crpq0.aJ().k.b("Activity paused, time", Long.valueOf(this.a));
        crpq0.e.a = new crpl(crpq0.e, System.currentTimeMillis(), this.a);
        crpq0.e.b.a.postDelayed(crpq0.e.a, 2000L);
        if(crpq0.am().w()) {
            crpq0.d.d();
        }
    }
}

