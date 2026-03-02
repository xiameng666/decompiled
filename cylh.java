public final class cylh implements kar {
    public final cylw a;
    public final String b;
    public final String c;
    public final float d;
    public final fgta e;
    public final boolean f;

    public cylh(cylw cylw0, String s, String s1, float f, fgta fgta0, boolean z) {
        this.a = cylw0;
        this.b = s;
        this.c = s1;
        this.d = f;
        this.e = fgta0;
        this.f = z;
    }

    @Override  // kar
    public final void accept(Object object0) {
        cust cust0 = this.a.n;
        cykg cykg0 = new cykg(this.a, this.b, this.c, this.d);
        ((cyna)object0).o = cust0;
        ((cyna)object0).n = cykg0;
        long v = this.a.b.c.a();
        ((cyna)object0).r(this.e, v, this.d, this.f);
        Runnable runnable0 = this.a.j;
        if(runnable0 != null) {
            runnable0.run();
        }
    }
}

