public final class aamj {
    public final String a;
    public final grwb b;
    public final grwb c;

    public aamj() {
        throw null;
    }

    public aamj(String s, grwb grwb0, grwb grwb1) {
        this.a = s;
        if(grwb0 == null) {
            throw new NullPointerException("Null summaryPageConfig");
        }
        this.b = grwb0;
        if(grwb1 == null) {
            throw new NullPointerException("Null cardDeckConfig");
        }
        this.c = grwb1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aamj)) {
            String s = this.a;
            if(s == null) {
                return ((aamj)object0).a == null ? ((ProtoLiteMessage)this.b).equals(((aamj)object0).b) && ((ProtoLiteMessage)this.c).equals(((aamj)object0).c) : false;
            }
            return s.equals(((aamj)object0).a) ? ((ProtoLiteMessage)this.b).equals(((aamj)object0).b) && ((ProtoLiteMessage)this.c).equals(((aamj)object0).c) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a == null ? 0 : this.a.hashCode();
        grwb grwb0 = this.b;
        if(((ProtoLiteMessage)grwb0).isImmutable()) {
            v1 = ((ProtoLiteMessage)grwb0).s();
        }
        else {
            int v2 = grwb0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)grwb0).s();
                grwb0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        grwb grwb1 = this.c;
        if(((ProtoLiteMessage)grwb1).isImmutable()) {
            return ((ProtoLiteMessage)grwb1).s() ^ ((v ^ 1000003) * 1000003 ^ v1) * 1000003;
        }
        int v3 = grwb1.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)grwb1).s();
            grwb1.memoizedHashCode = v3;
        }
        return v3 ^ ((v ^ 1000003) * 1000003 ^ v1) * 1000003;
    }

    @Override
    public final String toString() {
        return "CardsScreenConfig{accountName=" + this.a + ", summaryPageConfig=" + this.b.toString() + ", cardDeckConfig=" + this.c.toString() + "}";
    }
}

