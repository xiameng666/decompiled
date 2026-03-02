import j..util.Objects;

public final class ghdz {
    int a;
    final ghea b;

    public ghdz(ghea ghea0) {
        Objects.requireNonNull(ghea0);
        this.b = ghea0;
        super();
        this.a = 0;
    }

    public final int a() {
        int[] arr_v = this.b.a;
        int v = this.a;
        this.a = v + 1;
        return arr_v[v];
    }

    public final boolean b() {
        return this.a < this.b.b;
    }
}

