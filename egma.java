public final class egma {
    public final int a;
    public final int b;

    public egma() {
        throw null;
    }

    public egma(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof egma) && this.a == ((egma)object0).a && this.b == ((egma)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "FeatureClientInfo{appId=" + this.a + ", scenarioId=" + this.b + "}";
    }
}

