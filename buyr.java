public final class buyr implements buyt {
    public final String a;
    public final cmfb b;

    public buyr(String s, cmfb cmfb0) {
        ibuq.f(s, "sessionId");
        super();
        this.a = s;
        this.b = cmfb0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof buyr)) {
            return false;
        }
        return ibuq.m(this.a, ((buyr)object0).a) ? ibuq.m(this.b, ((buyr)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        cmfb cmfb0 = this.b;
        if(cmfb0 == null) {
            return v;
        }
        if(((ProtoLiteMessage)cmfb0).isImmutable()) {
            return v + ((ProtoLiteMessage)cmfb0).s();
        }
        int v1 = cmfb0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)cmfb0).s();
            cmfb0.memoizedHashCode = v1;
        }
        return v + v1;
    }

    @Override
    public final String toString() {
        return "Running(sessionId=" + this.a + ", utmParameters=" + this.b + ")";
    }
}

