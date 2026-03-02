public final class zii {
    private final aatb a;
    private final String b;

    public zii() {
        throw null;
    }

    public zii(aatb aatb0, String s) {
        if(aatb0 == null) {
            throw new NullPointerException("Null activeUser");
        }
        this.a = aatb0;
        if(s == null) {
            throw new NullPointerException("Null capabilityName");
        }
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof zii) && ((ProtoLiteMessage)this.a).equals(((zii)object0).a) && this.b.equals(((zii)object0).b);
    }

    @Override
    public final int hashCode() {
        aatb aatb0 = this.a;
        if(((ProtoLiteMessage)aatb0).isImmutable()) {
            int v = ((ProtoLiteMessage)aatb0).s();
            return this.b.hashCode() ^ (v ^ 1000003) * 1000003;
        }
        int v1 = aatb0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)aatb0).s();
            aatb0.memoizedHashCode = v1;
        }
        return this.b.hashCode() ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CapabilityCacheKey{activeUser=" + this.a.toString() + ", capabilityName=" + this.b + "}";
    }
}

