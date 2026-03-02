import j..util.Objects;

public final class kdf {
    public final int a;
    public final int b;
    public final int c;

    public kdf(int v, int v1, int v2) {
        gftb.b(kcz.b.contains(Integer.valueOf(v)), "Invalid/Unsupported Range Data Ntf config");
        gftb.b(v1 <= v2, "Ntf proximity near cannot be greater than Ntf proximity far");
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kdf) ? this.a == ((kdf)object0).a && this.b == ((kdf)object0).b && this.c == ((kdf)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b), ((int)this.c)});
    }

    @Override
    public final String toString() {
        return "UwbRangeDataNtfConfig{mRangeDataNtfConfigType=" + this.a + ", mNtfProximityNear=" + this.b + ", mNtfProximityFar=" + this.c + "}";
    }
}

