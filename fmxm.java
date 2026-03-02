final class fmxm {
    public uq a;
    public uq b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public fmxm(uq uq0, uq uq1, int v, int v1, int v2, int v3) {
        this.a = uq0;
        this.b = uq1;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
    }

    @Override
    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + "}";
    }
}

