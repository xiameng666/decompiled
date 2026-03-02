final class ighs {
    public final long a;
    public final igcw b;
    ighs c;
    private String d;
    private int e;
    private int f;

    public ighs(igcw igcw0, long v) {
        this.e = 0x80000000;
        this.f = 0x80000000;
        this.a = v;
        this.b = igcw0;
    }

    public final int a(long v) {
        ighs ighs0 = this.c;
        if(ighs0 != null && v >= ighs0.a) {
            return ighs0.a(v);
        }
        int v1 = this.e;
        if(v1 == 0x80000000) {
            v1 = this.b.a(this.a);
            this.e = v1;
        }
        return v1;
    }

    public final int b(long v) {
        ighs ighs0 = this.c;
        if(ighs0 != null && v >= ighs0.a) {
            return ighs0.b(v);
        }
        int v1 = this.f;
        if(v1 == 0x80000000) {
            v1 = this.b.b(this.a);
            this.f = v1;
        }
        return v1;
    }

    public final String c(long v) {
        ighs ighs0 = this.c;
        if(ighs0 != null && v >= ighs0.a) {
            return ighs0.c(v);
        }
        if(this.d == null) {
            this.d = this.b.g(this.a);
        }
        return this.d;
    }
}

