public final class ddml implements evpo {
    public final ddmp a;

    public ddml(ddmp ddmp0) {
        this.a = ddmp0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(((evqu)evql0).d) {
            return evrg.b();
        }
        if(!evql0.n()) {
            dcvz.a.c().f(evql0.i()).p("Failed to disable service for flag update.", new Object[0]);
        }
        return ((dcmf)this.a.a.get()).B(true);
    }
}

