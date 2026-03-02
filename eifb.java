final class eifb {
    public final String a;
    public final gged_interceptors b;
    public final gwha c;

    public eifb() {
        throw null;
    }

    public eifb(String s, gged_interceptors gged0, gwha gwha0) {
        if(s == null) {
            throw new NullPointerException("Null macAddress");
        }
        this.a = s;
        if(gged0 == null) {
            throw new NullPointerException("Null tagScans");
        }
        this.b = gged0;
        this.c = gwha0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof eifb) && this.a.equals(((eifb)object0).a) && ggia.i(this.b, ((eifb)object0).b)) {
            return this.c == null ? ((eifb)object0).c == null : ((ProtoLiteMessage)this.c).equals(((eifb)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        gwha gwha0 = this.c;
        if(gwha0 == null) {
            return v * 1000003;
        }
        if(((ProtoLiteMessage)gwha0).isImmutable()) {
            return ((ProtoLiteMessage)gwha0).s() ^ v * 1000003;
        }
        int v1 = gwha0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gwha0).s();
            gwha0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "TagInfo{macAddress=" + this.a + ", tagScans=" + this.b.toString() + ", deviceData=" + this.c + "}";
    }
}

