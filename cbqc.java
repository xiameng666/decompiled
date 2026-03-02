public final class cbqc {
    public final gvmq a;
    public final boolean b;

    public cbqc(gvmq gvmq0, boolean z) {
        ibuq.f(gvmq0, "familyMember");
        super();
        this.a = gvmq0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cbqc)) {
            return false;
        }
        return ibuq.m(this.a, ((cbqc)object0).a) ? this.b == ((cbqc)object0).b : false;
    }

    @Override
    public final int hashCode() {
        gvmq gvmq0 = this.a;
        if(((ProtoLiteMessage)gvmq0).isImmutable()) {
            int v = ((ProtoLiteMessage)gvmq0).s();
            return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
        }
        int v1 = gvmq0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gvmq0).s();
            gvmq0.memoizedHashCode = v1;
        }
        return this.b ? v1 * 0x1F + 0x4CF : v1 * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "SupervisedMember(familyMember=" + this.a + ", isSignedInOnTheDevice=" + this.b + ")";
    }
}

