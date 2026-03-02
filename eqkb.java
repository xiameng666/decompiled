public final class eqkb implements evpz {
    public final String a;
    public final epzz b;

    public eqkb(epzz epzz0, String s) {
        this.b = epzz0;
        this.a = s;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        azyf azyf0 = this.b.a.a(this.b, this.a);
        azyd_linstner azyd0 = azyf0.listener_;
        batl.t(azyd0, "Key must not be null");
        eqkj eqkj0 = new eqkj(this.b, azyf0);
        eqkk eqkk0 = new eqkk(this.b, azyd0);
        this.b.a.e(this.b, eqkj0, eqkk0);
    }
}

