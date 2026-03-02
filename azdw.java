public final class azdw {
    public final hlqv a;
    public final boolean b;
    public final String c;
    private final String d;

    public azdw() {
        throw null;
    }

    public azdw(String s, hlqv hlqv0, boolean z, String s1) {
        this.d = s;
        if(hlqv0 == null) {
            throw new NullPointerException("Null samplingRule");
        }
        this.a = hlqv0;
        this.b = z;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azdw) && this.d.equals(((azdw)object0).d) && ((ProtoLiteMessage)this.a).equals(((azdw)object0).a) && this.b == ((azdw)object0).b && this.c.equals(((azdw)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = this.d.hashCode() ^ 1000003;
        hlqv hlqv0 = this.a;
        if(((ProtoLiteMessage)hlqv0).isImmutable()) {
            int v1 = ((ProtoLiteMessage)hlqv0).s();
            return this.b ? this.c.hashCode() ^ ((v * 1000003 ^ v1) * 1000003 ^ 0x4CF) * 1000003 : this.c.hashCode() ^ ((v * 1000003 ^ v1) * 1000003 ^ 0x4D5) * 1000003;
        }
        int v2 = hlqv0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)hlqv0).s();
            hlqv0.memoizedHashCode = v2;
        }
        return this.b ? this.c.hashCode() ^ ((v * 1000003 ^ v2) * 1000003 ^ 0x4CF) * 1000003 : this.c.hashCode() ^ ((v * 1000003 ^ v2) * 1000003 ^ 0x4D5) * 1000003;
    }

    @Override
    public final String toString() {
        return "MatchingSamplingRule{logSource=" + this.d + ", samplingRule=" + this.a.toString() + ", includeSamplingRateOnLogEvent=" + this.b + ", key=" + this.c + "}";
    }
}

