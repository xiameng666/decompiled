final class fmbn extends fmbw {
    private final fmbf a;

    public fmbn(fmbf fmbf0) {
        this.a = fmbf0;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.j;
    }

    @Override  // fmbw
    public final fmbf b() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.j == fmba0) {
                fmbf fmbf0 = ((fmaz)object0).b();
                return this.a.equals(fmbf0);
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
        return "ActionPayload{composedOverlayAction=" + this.a.toString() + "}";
    }
}

