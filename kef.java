public final class kef {
    private int a;
    private int b;

    public final int a() {
        return this.b | this.a;
    }

    public final void b(int v, int v1) {
        if(v1 == 1) {
            this.b = v;
            return;
        }
        this.a = v;
    }

    public final void c(int v) {
        if(v == 1) {
            this.b = 0;
            return;
        }
        this.a = 0;
    }

    public final void d(int v) {
        this.b(v, 0);
    }

    public final void e() {
        this.c(0);
    }
}

