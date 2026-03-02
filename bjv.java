public final class bjv implements jqv {
    public final bka a;

    public bjv(bka bka0) {
        this.a = bka0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        synchronized(this.a.e) {
            this.a.h = jqt0;
        }
        return a.i(this.a, "DeferrableSurface-termination(", ")");
    }
}

