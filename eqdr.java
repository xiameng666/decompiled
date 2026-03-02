public final class eqdr implements evpz {
    public final eqdz a;
    public final String b;

    public eqdr(eqdz eqdz0) {
        this.a = eqdz0;
        this.b = "target_nearby_api";
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        azyf azyf0 = eqdz.a.a(this.a, this.b);
        batl.t(azyf0, "ListenerHolder should not be null");
        azyd_linstner azyd0 = azyf0.listener_;
        batl.t(azyd0, "Key should not be null");
        eqdv eqdv0 = new eqdv(this.a, azyf0);
        eqdw eqdw0 = new eqdw(this.a, azyd0);
        eqdz.a.e(this.a, eqdv0, eqdw0);
    }
}

