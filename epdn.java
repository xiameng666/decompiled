public final class epdn implements evpo {
    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.i() != null) {
            Exception exception0 = evql0.i();
            epdq.a.n("Error loading text", exception0, new Object[0]);
            return null;
        }
        return (epdr)evql0.j();
    }
}

