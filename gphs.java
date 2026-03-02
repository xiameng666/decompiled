public final class gphs {
    public static final iakp a;
    public final String b;
    public final String c;

    static {
        gphs.a = new iakp("com.google.frameworks.client.data.android.auth.AuthContext", null);
    }

    public gphs() {
        throw null;
    }

    public gphs(String s, String s1) {
        this.b = s;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof gphs)) {
            String s = this.b;
            if(s == null) {
                return ((gphs)object0).b == null ? this.c.equals(((gphs)object0).c) : false;
            }
            return s.equals(((gphs)object0).b) ? this.c.equals(((gphs)object0).c) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.c.hashCode() ^ 0xD5009D89 : this.c.hashCode() ^ (this.b.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "AuthContext{identifier=" + this.b + ", type=" + this.c + "}";
    }
}

