public final class gblf {
    public final String a;
    public final fbbt b;
    public final long c;

    public gblf() {
        ibuq.e(fbbt.a, "getDefaultInstance(...)");
        this("0", fbbt.a, 0L);
    }

    public gblf(String s, fbbt fbbt0, long v) {
        ibuq.f(s, "instantBuySessionId");
        ibuq.f(fbbt0, "state");
        super();
        this.a = s;
        this.b = fbbt0;
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gblf)) {
            return false;
        }
        if(!ibuq.m(this.a, ((gblf)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((gblf)object0).b) ? this.c == ((gblf)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        fbbt fbbt0 = this.b;
        if(((ProtoLiteMessage)fbbt0).isImmutable()) {
            return (v + ((ProtoLiteMessage)fbbt0).s()) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
        }
        int v1 = fbbt0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)fbbt0).s();
            fbbt0.memoizedHashCode = v1;
        }
        return (v + v1) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
    }

    @Override
    public final String toString() {
        return "InstantBuySessionEntity(instantBuySessionId=" + this.a + ", state=" + this.b + ", lastUpdatedTimeMillis=" + this.c + ")";
    }
}

