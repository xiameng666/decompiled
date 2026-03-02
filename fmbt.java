final class fmbt extends fmbw {
    private final String a;

    public fmbt(String s) {
        this.a = s;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.i;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.i == fmba0) {
                String s = ((fmaz)object0).j();
                return this.a.equals(s);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // fmbw
    public final String j() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "ActionPayload{tombstoneAction=" + this.a + "}";
    }
}

