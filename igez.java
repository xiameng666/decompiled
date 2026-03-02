import j..util.Objects;

final class igez extends igga {
    final igfb a;
    private static final long serialVersionUID = 0x6FB4D99C50A123CCL;

    public igez(igfb igfb0, igcy igcy0) {
        Objects.requireNonNull(igfb0);
        this.a = igfb0;
        super(igcy0, igcy0.e());
    }

    @Override  // igga
    public final long a(long v, int v1) {
        this.a.R(v, null);
        long v2 = this.b.a(v, v1);
        this.a.R(v2, "resulting");
        return v2;
    }

    @Override  // igga
    public final long b(long v, long v1) {
        this.a.R(v, null);
        long v2 = this.b.b(v, v1);
        this.a.R(v2, "resulting");
        return v2;
    }
}

