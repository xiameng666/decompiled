public final class crmm implements Runnable {
    public final crni a;

    public crmm(crni crni0) {
        this.a = crni0;
    }

    @Override
    public final void run() {
        crni crni0 = this.a;
        crni0.n();
        if(crni0.ap().s.b()) {
            crni0.aJ().j.a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long v = crni0.ap().t.a();
        crni0.ap().t.b(1L + v);
        if(v >= 5L) {
            crni0.aJ().f.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            crni0.ap().s.a(true);
            return;
        }
        if(crni0.i == null) {
            crni0.i = new crmx(crni0, crni0.y);
        }
        crni0.i.c(0L);
    }
}

