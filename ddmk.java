public final class ddmk implements evpo {
    public final ddmp a;

    public ddmk(ddmp ddmp0) {
        this.a = ddmp0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(!evql0.n()) {
            dcvz.a.c().f(evql0.i()).p("Failed to get service state for critical flag reset.", new Object[0]);
            return evrg.b();
        }
        return ((Boolean)evql0.j()).booleanValue() ? ((dcmf)this.a.a.get()).B(false) : evrg.b();
    }
}

