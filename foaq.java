public final class foaq {
    public final gged_interceptors a;
    public final Runnable b;

    public foaq() {
        throw null;
    }

    public foaq(gged_interceptors gged0, Runnable runnable0) {
        this.a = gged0;
        this.b = runnable0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foaq) && ggia.i(this.a, ((foaq)object0).a) && this.b.equals(((foaq)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CustomCancelableFeatureImpl{possibleCancelStringList=" + this.a + ", onCancel=" + this.b + "}";
    }
}

