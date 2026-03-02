public final class bcqf {
    public final String a;
    public final String b;

    public bcqf() {
        throw null;
    }

    public bcqf(String s, String s1) {
        if(s == null) {
            throw new NullPointerException("Null fid");
        }
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null iidToken");
        }
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bcqf) && this.a.equals(((bcqf)object0).a) && this.b.equals(((bcqf)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "IidTokenResult{fid=" + this.a + ", iidToken=" + this.b + "}";
    }
}

