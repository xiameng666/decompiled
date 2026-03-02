public final class fors {
    public final boolean a;
    private final gged_interceptors b;

    public fors() {
        throw null;
    }

    public fors(boolean z, gged_interceptors gged0) {
        this.a = z;
        if(gged0 == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = gged0;
    }

    public final gged_interceptors a() {
        if(this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fors) && this.a == ((fors)object0).a && ggia.i(this.b, ((fors)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() ^ 0x16638EA4 : this.b.hashCode() ^ 0x16FC2542;
    }

    @Override
    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }
}

