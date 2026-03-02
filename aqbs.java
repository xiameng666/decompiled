final class aqbs implements evpz {
    private final gmcu a;

    public aqbs(gmcu gmcu0) {
        this.a = gmcu0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(((evqu)evql0).d) {
            this.a.cancel(false);
            return;
        }
        if(evql0.n()) {
            Object object0 = evql0.j();
            this.a.q(object0);
            return;
        }
        Exception exception0 = evql0.i();
        if(exception0 == null) {
            throw new IllegalStateException();
        }
        this.a.r(exception0);
    }
}

