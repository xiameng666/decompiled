public final class jki {
    public static final jki a;
    public final long b;
    public final long c;

    static {
        jki.a = new jki(jlq.e(0), jlq.e(0));
    }

    public jki(long v, long v1) {
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jki)) {
            return false;
        }
        return jlp.e(this.b, ((jki)object0).b) ? jlp.e(this.c, ((jki)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return jlo.a(this.b) * 0x1F + jlo.a(this.c);
    }

    @Override
    public final String toString() {
        return "TextIndent(firstLine=" + jlp.d(this.b) + ", restLine=" + jlp.d(this.c) + ')';
    }
}

