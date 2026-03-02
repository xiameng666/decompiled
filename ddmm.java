public final class ddmm implements evpz {
    @Override  // evpz
    public final void hF(evql evql0) {
        if(!evql0.n()) {
            if(((evqu)evql0).d) {
                dcvz.a.e().p("Cancelled re-enabling service on critical flag change.", new Object[0]);
                return;
            }
            dcvz.a.c().f(evql0.i()).p("Failed to re-enable service after flag update.", new Object[0]);
            return;
        }
        dcvz.a.b().p("Re-enabled service on critical flag change.", new Object[0]);
    }
}

