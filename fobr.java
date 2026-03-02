public final class fobr implements Runnable {
    public final fobz a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;

    public fobr(fobz fobz0, String s, String s1, int v, String s2, boolean z) {
        this.a = fobz0;
        this.b = s;
        this.c = s1;
        this.d = v;
        this.e = s2;
        this.f = z;
    }

    @Override
    public final void run() {
        ((frpe)((focq)this.a.a.mr()).d.mr()).b(new Object[]{this.b, this.c, ((int)this.d), this.e, Boolean.valueOf(this.f)});
    }
}

