public final class aamh {
    public final grxw a;
    public final grvb b;
    public final gged_interceptors c;

    public aamh() {
        throw null;
    }

    public aamh(grxw grxw0, grvb grvb0, gged_interceptors gged0) {
        if(grxw0 == null) {
            throw new NullPointerException("Null resourceKey");
        }
        this.a = grxw0;
        if(grvb0 == null) {
            throw new NullPointerException("Null card");
        }
        this.b = grvb0;
        if(gged0 == null) {
            throw new NullPointerException("Null referencedResources");
        }
        this.c = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aamh) && ((ProtoLiteMessage)this.a).equals(((aamh)object0).a) && ((ProtoLiteMessage)this.b).equals(((aamh)object0).b) && ggia.i(this.c, ((aamh)object0).c);
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
        grvb grvb0 = this.b;
        if(((ProtoLiteMessage)grvb0).isImmutable()) {
            int v2 = ((ProtoLiteMessage)grvb0).s();
            return this.c.hashCode() ^ ((v ^ 1000003) * 1000003 ^ v2) * 1000003;
        }
        int v3 = grvb0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)grvb0).s();
            grvb0.memoizedHashCode = v3;
        }
        return this.c.hashCode() ^ ((v ^ 1000003) * 1000003 ^ v3) * 1000003;
    }

    @Override
    public final String toString() {
        return "CardItem{resourceKey=" + this.a.toString() + ", card=" + this.b.toString() + ", referencedResources=" + this.c.toString() + "}";
    }
}

