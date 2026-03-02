public final class bynv {
    private final String a;

    public bynv(String s) {
        ibuq.f(s, "appName");
        super();
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bynv) ? ibuq.m(this.a, ((bynv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "CreateRequestDisplayInfo(appName=" + this.a + ")";
    }
}

