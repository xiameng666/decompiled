final class fmbu extends fmbw {
    private final fmhv a;

    public fmbu(fmhv fmhv0) {
        this.a = fmhv0;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.k;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.k == fmba0) {
                fmhv fmhv0 = ((fmaz)object0).g();
                return this.a.equals(fmhv0);
            }
        }
        return false;
    }

    @Override  // fmbw
    public final fmhv g() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ActionPayload{urlAction=" + this.a.toString() + "}";
    }
}

