public final class cll implements ibts {
    public final clj a;
    public final clj b;

    public cll(clj clj0, clj clj1) {
        this.a = clj0;
        this.b = clj1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gqb gqb0 = (gqb)object0;
        this.a.e.add(this.b);
        return new clt(this.a, this.b);
    }
}

