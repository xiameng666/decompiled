final class fmbp extends fmbw {
    private final fmfe a;

    public fmbp(fmfe fmfe0) {
        this.a = fmfe0;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.l;
    }

    @Override  // fmbw
    public final fmfe e() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.l == fmba0) {
                fmfe fmfe0 = ((fmaz)object0).e();
                return this.a.equals(fmfe0);
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
        return "ActionPayload{decorationTransitionAction=" + this.a.toString() + "}";
    }
}

