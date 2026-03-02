public final class jdk {
    public final int a;

    public jdk(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jdk) ? this.a == ((jdk)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.a + ')';
    }
}

