public final class aqvd {
    public final grkh a;
    public final int b;

    public aqvd() {
        throw null;
    }

    public aqvd(int v, grkh grkh0) {
        this.b = v;
        this.a = grkh0;
    }

    public static aqvc a() {
        aqvc aqvc0 = new aqvc();
        aqvc0.b(grkh.a);
        return aqvc0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aqvd)) {
            int v = this.b;
            int v1 = ((aqvd)object0).b;
            if(v != 0) {
                return v == v1 && ((ProtoLiteMessage)this.a).equals(((aqvd)object0).a);
            }
            throw null;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.b;
        if(v == 0) {
            throw null;
        }
        grkh grkh0 = this.a;
        if(((ProtoLiteMessage)grkh0).isImmutable()) {
            return ((ProtoLiteMessage)grkh0).s() ^ (v ^ 1000003) * 1000003;
        }
        int v1 = grkh0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)grkh0).s();
            grkh0.memoizedHashCode = v1;
        }
        return v1 ^ (v ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return this.b == 0 ? "PhotosApiLoggingInfo{callSite=null, auditToken=" + this.a + "}" : "PhotosApiLoggingInfo{callSite=" + Integer.toString(this.b - 1) + ", auditToken=" + this.a + "}";
    }
}

