final class fmbo extends fmbw {
    private final String a;

    public fmbo(String s) {
        this.a = s;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.d == fmba0) {
                String s = ((fmaz)object0).i();
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
    public final String i() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "ActionPayload{customAction=" + this.a + "}";
    }
}

