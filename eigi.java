public final class eigi {
    public final int a;
    public final int b;
    public final int c;

    public eigi() {
        throw null;
    }

    public eigi(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eigi) && this.a == ((eigi)object0).a && this.b == ((eigi)object0).b && this.c == ((eigi)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ ((this.a ^ 1000003) * 1000003 ^ this.b) * 1000003;
    }

    @Override
    public final String toString() {
        return "ScanConfig{locationIntervalMillis=" + this.a + ", locationSmallestDisplacementMeters=" + this.b + ", bleIntervalMillis=" + this.c + "}";
    }
}

