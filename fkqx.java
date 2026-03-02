public final class fkqx implements gfsi {
    public final fkre a;
    public final flad b;
    public final Exception c;
    public final int d;

    public fkqx(fkre fkre0, flad flad0, Exception exception0, int v) {
        this.a = fkre0;
        this.b = flad0;
        this.c = exception0;
        this.d = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v;
        Void void0 = (Void)object0;
        flag flag0 = this.b.a();
        Exception exception0 = this.c;
        if((exception0 instanceof fktt)) {
            v = 3;
        }
        else {
            v = (exception0 instanceof fktq) ? 4 : 5;
        }
        fkrg fkrg0 = cmcd.b(exception0);
        this.a.c.a(flag0, v, this.d, this.a.a, fkrg0, false);
        return null;
    }
}

