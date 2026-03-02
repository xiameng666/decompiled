public final class bnql {
    public final gszo a;
    public final fqwq b;
    public final fqwq c;
    public final gged_interceptors d;

    public bnql() {
        throw null;
    }

    public bnql(gszo gszo0, fqwq fqwq0, fqwq fqwq1, gged_interceptors gged0) {
        if(gszo0 == null) {
            throw new NullPointerException("Null device");
        }
        this.a = gszo0;
        this.b = fqwq0;
        this.c = fqwq1;
        if(gged0 == null) {
            throw new NullPointerException("Null lastSightings");
        }
        this.d = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bnql) && ((ProtoLiteMessage)this.a).equals(((bnql)object0).a) && this.b.equals(((bnql)object0).b) && this.c.equals(((bnql)object0).c) && ggia.i(this.d, ((bnql)object0).d);
    }

    @Override
    public final int hashCode() {
        gszo gszo0 = this.a;
        if(((ProtoLiteMessage)gszo0).isImmutable()) {
            int v = ((ProtoLiteMessage)gszo0).s();
            return this.d.hashCode() ^ (((v ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
        }
        int v1 = gszo0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gszo0).s();
            gszo0.memoizedHashCode = v1;
        }
        return this.d.hashCode() ^ (((v1 ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "DeviceKeyRotationContext{device=" + this.a.toString() + ", oldUserSecrets=" + this.b.toString() + ", newUserSecrets=" + this.c + ", lastSightings=" + this.d.toString() + "}";
    }
}

