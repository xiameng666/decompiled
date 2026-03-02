public final class eicf implements evqf {
    public final eici a;
    public final ayuc b;

    public eicf(eici eici0, ayuc ayuc0) {
        this.a = eici0;
        this.b = ayuc0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z = ((azui)object0).q();
        ayuc ayuc0 = this.b;
        if(z) {
            ayuc0.d();
            this.a.a.set(true);
            return;
        }
        if(hrtd.a.I().bb()) {
            ayuc0.d();
        }
    }
}

