final class fmla extends fmlh {
    private final fmln a;

    public fmla(fmln fmln0) {
        this.a = fmln0;
    }

    @Override  // fmml
    public final fmmn a() {
        return fmmn.f;
    }

    @Override  // fmlh
    public final fmln b() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmml)) {
            fmmn fmmn0 = ((fmml)object0).a();
            if(fmmn.f == fmmn0) {
                fmln fmln0 = ((fmml)object0).b();
                return this.a.equals(fmln0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Element{horizontalLayoutButtons=" + this.a.toString() + "}";
    }
}

