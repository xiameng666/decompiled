public final class fcnp implements glzn {
    public final fcns a;

    public fcnp(fcns fcns0) {
        this.a = fcns0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        fcnq fcnq0;
        boolean z1;
        fcns fcns0 = this.a;
        hfrr hfrr0 = (hfrr)object0;
        synchronized(fcns0) {
            boolean z = hfrr0.b;
            z1 = hqna.c();
            if(z != z1) {
                fcns.a.h("rollback state change: old state %b new state %b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1)});
                fcnq0 = new fcnq(z1);
                return glzd.g(fcns0.g.b(fcnq0, fcns0.e), new fcnr(fcns0, z1), fcns0.e);
            }
            return gmbx.a;
        }
        return glzd.g(fcns0.g.b(fcnq0, fcns0.e), new fcnr(fcns0, z1), fcns0.e);
    }
}

