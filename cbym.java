public final class cbym {
    public final String a;
    public final gqif b;

    public cbym() {
        throw null;
    }

    public cbym(String s, gqif gqif0) {
        this.a = s;
        if(gqif0 == null) {
            throw new NullPointerException("Null languageProfile");
        }
        this.b = gqif0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof cbym)) {
            String s = this.a;
            if(s == null) {
                return ((cbym)object0).a == null ? ((ProtoLiteMessage)this.b).equals(((cbym)object0).b) : false;
            }
            return s.equals(((cbym)object0).a) ? ((ProtoLiteMessage)this.b).equals(((cbym)object0).b) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a == null ? 0 : this.a.hashCode();
        gqif gqif0 = this.b;
        if(((ProtoLiteMessage)gqif0).isImmutable()) {
            return ((ProtoLiteMessage)gqif0).s() ^ (v ^ 1000003) * 1000003;
        }
        int v1 = gqif0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gqif0).s();
            gqif0.memoizedHashCode = v1;
        }
        return v1 ^ (v ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "AccountUlp{accountName=" + this.a + ", languageProfile=" + this.b.toString() + "}";
    }
}

