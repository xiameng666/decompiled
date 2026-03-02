public final class eigm {
    public final int a;

    public eigm() {
        throw null;
    }

    public eigm(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eigm) && this.a == ((eigm)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a ^ 1000003;
    }

    @Override
    public final String toString() {
        return "Config{scanIntervalMillis=" + this.a + "}";
    }
}

