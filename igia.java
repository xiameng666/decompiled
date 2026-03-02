public final class igia extends igcw {
    private final String a;
    private final int f;
    private final int g;
    private static final long serialVersionUID = 0xCF3F4667C8ADC9FCL;

    public igia(String s, String s1, int v, int v1) {
        super(s);
        this.a = s1;
        this.f = v;
        this.g = v1;
    }

    @Override  // igcw
    public final int a(long v) {
        return this.f;
    }

    @Override  // igcw
    public final int b(long v) {
        return this.g;
    }

    @Override  // igcw
    public final long d(long v) {
        return v;
    }

    @Override  // igcw
    public final long e(long v) {
        return v;
    }

    @Override  // igcw
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof igia) && this.d.equals(((igia)object0).d) && this.g == ((igia)object0).g && this.f == ((igia)object0).f;
    }

    @Override  // igcw
    public final String g(long v) {
        return this.a;
    }

    @Override  // igcw
    public final boolean h() {
        return true;
    }

    @Override  // igcw
    public final int hashCode() {
        return this.d.hashCode() + this.g * 37 + this.f * 0x1F;
    }

    @Override  // igcw
    public final int i(long v) {
        return this.f;
    }
}

