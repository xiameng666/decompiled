public final class dvgf implements dpug {
    public final dvgh a;
    public final int b;
    public final jqt c;

    public dvgf(dvgh dvgh0, int v, jqt jqt0) {
        this.a = dvgh0;
        this.b = v;
        this.c = jqt0;
    }

    @Override  // dpug
    public final void b(Object object0) {
        jqt jqt0 = this.c;
        int v = this.a.c.get();
        if(this.b != v) {
            jqt0.d();
            return;
        }
        jqt0.b(((guzp)object0));
    }
}

