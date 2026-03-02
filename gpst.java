public final class gpst {
    final boolean a;
    final int b;
    final int c;

    public gpst(int v, int v1) {
        this.c = v;
        this.b = v1;
        this.a = v == 2 && gprl.d(v1, 2) || v1 == 0;
    }

    public final gpst a(int v) {
        return new gpst(v, this.b + 1);
    }
}

