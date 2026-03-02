final class gasb {
    public final hcsi a;
    public final long b;

    public gasb() {
        throw null;
    }

    public gasb(hcsi hcsi0, long v) {
        if(hcsi0 == null) {
            throw new NullPointerException("Null trigger");
        }
        this.a = hcsi0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gasb) && ((ProtoLiteMessage)this.a).equals(((gasb)object0).a) && this.b == ((gasb)object0).b;
    }

    @Override
    public final int hashCode() {
        hcsi hcsi0 = this.a;
        if(((ProtoLiteMessage)hcsi0).isImmutable()) {
            int v = ((ProtoLiteMessage)hcsi0).s();
            return ((int)(this.b ^ this.b >>> 0x20)) ^ (v ^ 1000003) * 1000003;
        }
        int v1 = hcsi0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hcsi0).s();
            hcsi0.memoizedHashCode = v1;
        }
        return ((int)(this.b ^ this.b >>> 0x20)) ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ScopeTrigger{trigger=" + this.a.toString() + ", scope=" + this.b + "}";
    }
}

