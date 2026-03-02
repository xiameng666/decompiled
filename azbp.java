import j..util.Objects;

final class azbp {
    int a;
    int b;
    String c;
    int d;
    final azbq e;

    public azbp(azbq azbq0) {
        Objects.requireNonNull(azbq0);
        this.e = azbq0;
        super();
        this.a = 0;
        this.b = azbq0.b;
        String s = azbq0.c(azbq0.b);
        this.c = s;
        this.d = aywq.a(this.b + 1 + s.length());
    }

    public azbp(azbq azbq0, int v, int v1, int v2, String s) {
        Objects.requireNonNull(azbq0);
        this.e = azbq0;
        super();
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = v2;
    }
}

