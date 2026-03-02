public final class bdjv {
    public final String a;
    private final String b;

    public bdjv() {
        this.b = "{}";
        this.a = "com.android.chrome";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdjv)) {
            return false;
        }
        return ibuq.m(this.b, ((bdjv)object0).b) ? ibuq.m(this.a, ((bdjv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ImportCredentialsRequest(requestJson=" + this.b + ", callingPackageName=" + this.a + ")";
    }
}

