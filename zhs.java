public final class zhs {
    public final String a;

    public zhs(String s) {
        ibuq.f(s, "anchor");
        super();
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof zhs) ? ibuq.m(this.a, ((zhs)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ASAnchorNavigationParams(anchor=" + this.a + ")";
    }
}

