public final class dcma implements evpo {
    public final evql a;

    public dcma(evql evql0) {
        this.a = evql0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(!evql0.n()) {
            dcvz.a.c().p("Error retrieve FPR status, cannot open Nearby Share from quick settings", new Object[0]);
            return evrg.b();
        }
        Object object0 = this.a;
        if(((Boolean)evql0.j()).booleanValue()) {
            dcvz.a.b().p("FRP on, ignoring quick settings click", new Object[0]);
            return evrg.b();
        }
        return object0;
    }
}

