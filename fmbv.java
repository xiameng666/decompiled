final class fmbv extends fmbw {
    private final String a;

    public fmbv(String s) {
        this.a = s;
    }

    @Override  // fmaz
    public final fmba a() {
        return fmba.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmaz)) {
            fmba fmba0 = ((fmaz)object0).a();
            if(fmba.e == fmba0) {
                String s = ((fmaz)object0).k();
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
    public final String k() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "ActionPayload{webAction=" + this.a + "}";
    }
}

