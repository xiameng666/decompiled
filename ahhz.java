public final class ahhz implements glzn {
    public final ahia a;
    public final gged_interceptors b;
    public final gged_interceptors c;

    public ahhz(ahia ahia0, gged_interceptors gged0, gged_interceptors gged1) {
        this.a = ahia0;
        this.b = gged0;
        this.c = gged1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ahia ahia0 = this.a;
        gged_interceptors gged0 = this.b;
        if(gged0.size() > 1) {
            return ahia0.a(((Boolean)object0).booleanValue());
        }
        batl.s(agsw.e);
        batl.q(ahia0.c);
        synchronized(ahia0.g.a.c) {
            String s = aenh.b(ahia0.c);
            agsu agsu0 = new agsu(agsw.e);
            Object object2 = agsw.e.b;
            Object object3 = ahia0.g.a.b.c("SELECT value FROM credential_app_setting WHERE account=? AND app=? AND key=?", new String[]{"---", s, agsw.e.a}, agsu0, object2);
            if(object3 != null) {
                object2 = object3;
            }
        }
        if(!((Boolean)object2).booleanValue()) {
            return glzd.g(gmbu.i(Boolean.valueOf(false)), new ahhq(ahia0, ((Boolean)object0), gged0), gmap.a);
        }
        ahhu ahhu0 = new ahhu(ahia0);
        return glzd.g(bxkv.b(gged_interceptors.h(gggq.j(this.c, ahhu0)), new ahhv()), new ahhq(ahia0, ((Boolean)object0), gged0), gmap.a);
    }
}

