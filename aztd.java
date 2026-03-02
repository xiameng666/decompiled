public final class aztd {
    public final boolean a;
    public final boolean b;

    public aztd() {
        throw null;
    }

    public aztd(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aztd) && this.a == ((aztd)object0).a && this.b == ((aztd)object0).b;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.a ? 0x4CF : 0x4D5;
        if(this.b) {
            v = 0x4CF;
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "ApiInfo{publiclyAccessibleApi=" + this.a + ", binderCallbackPropagationExpected=" + this.b + "}";
    }
}

