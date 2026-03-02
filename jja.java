final class jja {
    public final Object a;
    private final gui b;
    private final jja c;

    public jja(gui gui0, jja jja0) {
        this.b = gui0;
        this.c = jja0;
        this.a = gui0.a();
    }

    public final boolean a() {
        return this.b.a() == this.a ? this.c != null && this.c.a() : true;
    }
}

