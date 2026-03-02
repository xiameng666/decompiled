public final class aapa extends aalp {
    public final grxw a;
    public final grxw b;

    public aapa() {
        throw null;
    }

    public aapa(grxw grxw0, grxw grxw1) {
        if(grxw0 == null) {
            throw new NullPointerException("Null topNavKey");
        }
        this.a = grxw0;
        if(grxw1 == null) {
            throw new NullPointerException("Null leftNavKey");
        }
        this.b = grxw1;
    }

    public static aapa a(grxw grxw0, grxw grxw1) {
        if(grxw1 == null) {
            grxw1 = zhp.a;
        }
        return new aapa(grxw0, grxw1);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aapa) && ((ProtoLiteMessage)this.a).equals(((aapa)object0).a) && ((ProtoLiteMessage)this.b).equals(((aapa)object0).b);
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
        grxw grxw1 = this.b;
        if(((ProtoLiteMessage)grxw1).isImmutable()) {
            return ((ProtoLiteMessage)grxw1).s() ^ (v ^ 1000003) * 1000003;
        }
        int v2 = grxw1.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)grxw1).s();
            grxw1.memoizedHashCode = v2;
        }
        return v2 ^ (v ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "PagerFrameBlueprint{topNavKey=" + this.a.toString() + ", leftNavKey=" + this.b.toString() + "}";
    }
}

