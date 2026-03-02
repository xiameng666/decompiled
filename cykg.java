public final class cykg implements kar {
    public final cylw a;
    public final String b;
    public final String c;
    public final float d;

    public cykg(cylw cylw0, String s, String s1, float f) {
        this.a = cylw0;
        this.b = s;
        this.c = s1;
        this.d = f;
    }

    @Override  // kar
    public final void accept(Object object0) {
        this.a.i.c(this.b, this.c, ((cusm)object0).name(), ((double)this.d));
    }
}

