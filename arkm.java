public final class arkm {
    public final String a;
    public final String b;
    public final String c;

    public arkm() {
        throw null;
    }

    public arkm(String s, String s1, String s2) {
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null splitName");
        }
        this.b = s1;
        if(s2 == null) {
            throw new NullPointerException("Null splitPath");
        }
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof arkm) && this.a.equals(((arkm)object0).a) && this.b.equals(((arkm)object0).b) && this.c.equals(((arkm)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "TransferredApkSplit{packageName=" + this.a + ", splitName=" + this.b + ", splitPath=" + this.c + "}";
    }
}

