public final class gxwo {
    public final cxqw a;
    public final ByteString b;
    public final ByteString c;
    public final String d;
    public final cxkh e;

    public gxwo() {
        throw null;
    }

    public gxwo(cxqw cxqw0, ByteString hfsf0, ByteString hfsf1, String s, cxkh cxkh0) {
        this.a = cxqw0;
        this.b = hfsf0;
        this.c = hfsf1;
        this.d = s;
        this.e = cxkh0;
    }

    public static gxwn a() {
        gxwn gxwn0 = new gxwn();
        gxwn0.d(cxkh.a);
        return gxwn0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gxwo) && ((ProtoLiteMessage)this.a).equals(((gxwo)object0).a) && this.b.equals(((gxwo)object0).b) && this.c.equals(((gxwo)object0).c) && this.d.equals(((gxwo)object0).d) && ((ProtoLiteMessage)this.e).equals(((gxwo)object0).e);
    }

    @Override
    public final int hashCode() {
        int v;
        cxqw cxqw0 = this.a;
        if(((ProtoLiteMessage)cxqw0).isImmutable()) {
            v = ((ProtoLiteMessage)cxqw0).s();
        }
        else {
            int v1 = cxqw0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)cxqw0).s();
                cxqw0.memoizedHashCode = v1;
            }
            v = v1;
        }
        int v2 = (((v ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
        cxkh cxkh0 = this.e;
        if(((ProtoLiteMessage)cxkh0).isImmutable()) {
            return ((ProtoLiteMessage)cxkh0).s() ^ v2 * 1000003;
        }
        int v3 = cxkh0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)cxkh0).s();
            cxkh0.memoizedHashCode = v3;
        }
        return v3 ^ v2 * 1000003;
    }

    @Override
    public final String toString() {
        return "FastPairUploadInfo{storedDiscoveryItem=" + this.a + ", accountKey=" + this.b + ", sha256AccountKeyPublicAddress=" + this.c + ", bleAddress=" + this.d + ", footprintsGroupInfo=" + this.e + "}";
    }
}

