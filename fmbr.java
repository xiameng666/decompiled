final class fmbr extends fmbw {
    private final fmbh a;

    public fmbr(fmbh fmbh0) {
        this.a = fmbh0;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.c;
    }

    @Override  // fmbw
    public final fmbh c() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.c == fmba0) {
                fmbh fmbh0 = ((fmaz)object0).c();
                return this.a.equals(fmbh0);
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
        return "ActionPayload{prefillMessage=" + this.a.toString() + "}";
    }
}

