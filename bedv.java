public final class bedv {
    public final bedu a;
    public final Object b;
    public final Exception c;

    public bedv() {
        throw null;
    }

    public bedv(bedu bedu0, Object object0, Exception exception0) {
        if(bedu0 == null) {
            throw new NullPointerException("Null status");
        }
        this.a = bedu0;
        this.b = object0;
        this.c = exception0;
    }

    public final bedv a(ibts ibts0) {
        if(this.c()) {
            Object object0 = ibts0.a(this.b);
            return new bedv(bedu.a, object0, null);
        }
        return this;
    }

    public final boolean b() {
        return this.a == bedu.c;
    }

    public final boolean c() {
        return this.a == bedu.a && this.b != null;
    }

    public static boolean d(bedv bedv0) {
        return bedv0 != null && bedv0.c();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bedv) && this.a.equals(((bedv)object0).a)) {
            Object object1 = this.b;
            if(object1 == null) {
                if(((bedv)object0).b == null) {
                    return this.c == null ? ((bedv)object0).c == null : this.c.equals(((bedv)object0).c);
                }
            }
            else if(object1.equals(((bedv)object0).b)) {
                return this.c == null ? ((bedv)object0).c == null : this.c.equals(((bedv)object0).c);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Exception exception0 = this.c;
        if(exception0 != null) {
            v1 = exception0.hashCode();
        }
        return (v * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "Resource{status=" + this.a.toString() + ", data=" + this.b + ", exception=" + this.c + "}";
    }
}

