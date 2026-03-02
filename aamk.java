public final class aamk {
    public final grxw a;
    public final grvx b;

    public aamk() {
        throw null;
    }

    public aamk(grxw grxw0, grvx grvx0) {
        if(grxw0 == null) {
            throw new NullPointerException("Null resourceKey");
        }
        this.a = grxw0;
        if(grvx0 == null) {
            throw new NullPointerException("Null footer");
        }
        this.b = grvx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aamk) && ((ProtoLiteMessage)this.a).equals(((aamk)object0).a) && ((ProtoLiteMessage)this.b).equals(((aamk)object0).b);
    }

    @Override
    public final int hashCode() {
        int v;
        grxw grxw0 = this.a;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            v = ((ProtoLiteMessage)grxw0).s();
        }
        else {
            int v1 = grxw0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)grxw0).s();
                grxw0.memoizedHashCode = v1;
            }
            v = v1;
        }
        grvx grvx0 = this.b;
        if(((ProtoLiteMessage)grvx0).isImmutable()) {
            return ((ProtoLiteMessage)grvx0).s() ^ (v ^ 1000003) * 1000003;
        }
        int v2 = grvx0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)grvx0).s();
            grvx0.memoizedHashCode = v2;
        }
        return v2 ^ (v ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "FooterItem{resourceKey=" + this.a.toString() + ", footer=" + this.b.toString() + "}";
    }
}

