public final class cynh implements kar {
    public final cynl a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;

    public cynh(cynl cynl0, boolean z, boolean z1, boolean z2, int v, boolean z3) {
        this.a = cynl0;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = v;
        this.f = z3;
    }

    @Override  // kar
    public final void accept(Object object0) {
        if(((cyql)object0).a == cyqm.a && this.b && !this.c && !this.d) {
            cynf cynf0 = new cynf(this.a, this.e, this.f);
            this.a.p(cynf0, false);
        }
    }
}

