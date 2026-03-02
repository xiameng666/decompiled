public final class ipf extends ibur implements ibth {
    final boolean a;
    final orh b;
    final String c;

    public ipf(boolean z, orh orh0, String s) {
        this.a = z;
        this.b = orh0;
        this.c = s;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        if(this.a) {
            this.b.d(this.c);
        }
        return ibom.a;
    }
}

