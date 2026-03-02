public final class aztj {
    public final String a;
    public final String b;

    public aztj() {
        throw null;
    }

    public aztj(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aztj)) {
            String s = this.a;
            if(s == null) {
                if(((aztj)object0).a == null) {
                    return this.b == null ? ((aztj)object0).b == null : this.b.equals(((aztj)object0).b);
                }
            }
            else if(s.equals(((aztj)object0).a)) {
                return this.b == null ? ((aztj)object0).b == null : this.b.equals(((aztj)object0).b);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "CallerInfo{callingPackage=" + this.a + ", callingAttributionTag=" + this.b + "}";
    }
}

