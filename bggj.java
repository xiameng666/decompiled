public final class bggj implements evpo {
    public final String a;

    public bggj(String s) {
        this.a = s;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        Exception exception0 = evql0.i();
        return exception0 == null || (exception0 instanceof bebz) ? evql0 : evrg.c(new bebz(8, this.a, null, exception0));
    }
}

