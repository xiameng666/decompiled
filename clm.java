public final class clm implements ibts {
    public final clj a;
    public final clb b;

    public clm(clj clj0, clb clb0) {
        this.a = clj0;
        this.b = clb0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gqb gqb0 = (gqb)object0;
        return new clu(this.a, this.b);
    }
}

