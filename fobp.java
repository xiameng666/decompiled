public final class fobp implements Runnable {
    public final fobz a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;

    public fobp(fobz fobz0, String s, boolean z, boolean z1, boolean z2, int v, boolean z3) {
        this.a = fobz0;
        this.b = s;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = v;
        this.g = z3;
    }

    @Override
    public final void run() {
        ((frpe)((focq)this.a.a.mr()).k.mr()).b(new Object[]{this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), ((int)this.f), Boolean.valueOf(this.g)});
    }
}

