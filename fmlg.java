final class fmlg extends fmlh {
    private final fmmf a;

    public fmlg(fmmf fmmf0) {
        this.a = fmmf0;
    }

    @Override  // fmml
    public final fmmn a() {
        return fmmn.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmml)) {
            fmmn fmmn0 = ((fmml)object0).a();
            if(fmmn.c == fmmn0) {
                fmmf fmmf0 = ((fmml)object0).h();
                return this.a.equals(fmmf0);
            }
        }
        return false;
    }

    @Override  // fmlh
    public final fmmf h() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Element{statusBadge=" + this.a.toString() + "}";
    }
}

