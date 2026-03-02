final class fmlf extends fmlh {
    private final fmhm a;

    public fmlf(fmhm fmhm0) {
        this.a = fmhm0;
    }

    @Override  // fmml
    public final fmmn a() {
        return fmmn.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmml)) {
            fmmn fmmn0 = ((fmml)object0).a();
            if(fmmn.a == fmmn0) {
                fmhm fmhm0 = ((fmml)object0).g();
                return this.a.equals(fmhm0);
            }
        }
        return false;
    }

    @Override  // fmlh
    public final fmhm g() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Element{richText=" + this.a.toString() + "}";
    }
}

