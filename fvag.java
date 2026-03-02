public final class fvag implements gfsi {
    public final fvao a;
    public final String b;

    public fvag(fvao fvao0, String s) {
        this.a = fvao0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        iapn iapn0 = (iapn)object0;
        String s = iapk.d(iapn0).t.name();
        this.a.b.b(s, "voilatile", this.b);
        throw iapn0;
    }
}

