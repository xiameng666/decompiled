final class fmbm extends fmbw {
    private final String a;

    public fmbm(String s) {
        this.a = s;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.h;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.h == fmba0) {
                String s = ((fmaz)object0).h();
                return this.a.equals(s);
            }
        }
        return false;
    }

    @Override  // fmbw
    public final String h() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ActionPayload{callAction=" + this.a + "}";
    }
}

