public final class btq {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public btq() {
        throw null;
    }

    public btq(String s, String s1, String s2, String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof btq) && this.a.equals(((btq)object0).a) && this.b.equals(((btq)object0).b) && this.c.equals(((btq)object0).c) && this.d.equals(((btq)object0).d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.a + ", eglVersion=" + this.b + ", glExtensions=" + this.c + ", eglExtensions=" + this.d + "}";
    }
}

