public final class hfki {
    public final ggfp a;
    public final ggfp b;

    public hfki() {
        throw null;
    }

    public hfki(ggfp ggfp0, ggfp ggfp1) {
        this.a = ggfp0;
        this.b = ggfp1;
    }

    public static hfkh a() {
        return new hfkh();
    }

    public static hfki b(hfke hfke0) {
        hfkh hfkh0 = new hfkh();
        hfkh0.d(hfke0);
        return hfkh0.c();
    }

    public static hfki c() {
        return new hfkh().c();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof hfki) && this.a.equals(((hfki)object0).a) && this.b.equals(((hfki)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "UnboxableExpression{basis=" + this.a + ", orExpressions=" + this.b + "}";
    }
}

