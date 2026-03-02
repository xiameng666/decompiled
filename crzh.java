final class crzh {
    public final String a;
    public final gizd b;

    public crzh() {
        throw null;
    }

    public crzh(String s, gizd gizd0) {
        this.a = s;
        if(gizd0 == null) {
            throw new NullPointerException("Null errorResponseLog");
        }
        this.b = gizd0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof crzh)) {
            String s = this.a;
            if(s == null) {
                return ((crzh)object0).a == null ? ((ProtoLiteMessage)this.b).equals(((crzh)object0).b) : false;
            }
            return s.equals(((crzh)object0).a) ? ((ProtoLiteMessage)this.b).equals(((crzh)object0).b) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a == null ? 0 : this.a.hashCode();
        gizd gizd0 = this.b;
        if(((ProtoLiteMessage)gizd0).isImmutable()) {
            return ((ProtoLiteMessage)gizd0).s() ^ (v ^ 1000003) * 1000003;
        }
        int v1 = gizd0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gizd0).s();
            gizd0.memoizedHashCode = v1;
        }
        return v1 ^ (v ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CpidErrorResponse{errorMessage=" + this.a + ", errorResponseLog=" + this.b.toString() + "}";
    }
}

