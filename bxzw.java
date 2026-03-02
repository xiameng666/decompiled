public final class bxzw {
    public final int a;
    public final String b;

    public bxzw(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bxzw)) {
            return false;
        }
        return this.a == ((bxzw)object0).a ? ibuq.m(this.b, ((bxzw)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a * 0x1F : this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "FailureResult(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }
}

