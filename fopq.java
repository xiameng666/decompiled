public final class fopq {
    public final idch a;
    public final gged_interceptors b;

    public fopq() {
        throw null;
    }

    public fopq(idch idch0, gged_interceptors gged0) {
        if(idch0 == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = idch0;
        if(gged0 == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fopq) && ((ProtoLiteMessage)this.a).equals(((fopq)object0).a) && ggia.i(this.b, ((fopq)object0).b);
    }

    @Override
    public final int hashCode() {
        idch idch0 = this.a;
        if(((ProtoLiteMessage)idch0).isImmutable()) {
            int v = ((ProtoLiteMessage)idch0).s();
            return this.b.hashCode() ^ (v ^ 1000003) * 1000003;
        }
        int v1 = idch0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)idch0).s();
            idch0.memoizedHashCode = v1;
        }
        return this.b.hashCode() ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + this.b.toString() + "}";
    }
}

