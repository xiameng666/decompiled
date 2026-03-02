public final class ehcr {
    public final String a;
    public final String b;

    public ehcr() {
        throw null;
    }

    public ehcr(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ehcr)) {
            String s = this.a;
            if(s == null) {
                if(((ehcr)object0).a == null) {
                    return this.b == null ? ((ehcr)object0).b == null : this.b.equals(((ehcr)object0).b);
                }
            }
            else if(s.equals(((ehcr)object0).a)) {
                return this.b == null ? ((ehcr)object0).b == null : this.b.equals(((ehcr)object0).b);
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
        return "PhotoTokenAndUrl{token=" + this.a + ", url=" + this.b + "}";
    }
}

