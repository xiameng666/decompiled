public final class gamm {
    public final String a;
    private final String b;

    public gamm(String s, String s1) {
        this.b = s;
        this.a = s1;
    }

    public final String a() {
        return this.b.startsWith("oauth2:") ? "Bearer " + this.a : "GoogleLogin auth=" + this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? gcvh.a(this.b, ((gamm)object0).b) && gcvh.a(this.a, ((gamm)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.b == null ? 0 : this.b.hashCode();
        String s = this.a;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 + 0x1F) * 0x1F + v;
    }
}

