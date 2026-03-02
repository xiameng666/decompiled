final class fmkr extends fmkt {
    private final fmmb b;

    public fmkr(fmmb fmmb0) {
        this.b = fmmb0;
    }

    @Override  // fmlz
    public final fmly b() {
        return fmly.a;
    }

    @Override  // fmkt
    public final fmmb c() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmlz)) {
            fmly fmly0 = ((fmlz)object0).b();
            if(fmly.a == fmly0) {
                fmmb fmmb0 = ((fmlz)object0).c();
                return this.b.equals(fmmb0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "RichCard{stackCard=" + this.b.toString() + "}";
    }
}

