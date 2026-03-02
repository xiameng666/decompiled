public final class zjn implements fhrs {
    public static final zjn a;
    public final zjo b;
    public final int c;

    static {
        zjn.a = new zjn(null, 3);
    }

    public zjn() {
        throw null;
    }

    public zjn(zjo zjo0, int v) {
        this.b = zjo0;
        this.c = v;
    }

    public static zjn a(zjo zjo0, int v) {
        gftb.check(zjo0);
        return new zjn(zjo0, v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof zjn)) {
            zjo zjo0 = this.b;
            if(zjo0 == null) {
                return ((zjn)object0).b == null ? this.c == ((zjn)object0).c : false;
            }
            return zjo0.equals(((zjn)object0).b) ? this.c == ((zjn)object0).c : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.c ^ 0xD5009D89 : this.c ^ (this.b.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "PromptCardManagerStatus{action=" + this.b + ", type=" + zjm.a(this.c) + "}";
    }
}

