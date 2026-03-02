final class fmle extends fmlh {
    private final fmgu a;

    public fmle(fmgu fmgu0) {
        this.a = fmgu0;
    }

    @Override  // fmml
    public final fmmn a() {
        return fmmn.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmml)) {
            fmmn fmmn0 = ((fmml)object0).a();
            if(fmmn.d == fmmn0) {
                fmgu fmgu0 = ((fmml)object0).f();
                return this.a.equals(fmgu0);
            }
        }
        return false;
    }

    @Override  // fmlh
    public final fmgu f() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Element{richCardButtons=" + this.a.toString() + "}";
    }
}

