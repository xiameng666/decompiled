public final class fobq implements Runnable {
    public final fobz a;
    public final String b;
    public final String c;
    public final String d;

    public fobq(fobz fobz0, String s, String s1, String s2) {
        this.a = fobz0;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    @Override
    public final void run() {
        ((frpe)((focq)this.a.a.mr()).e.mr()).b(new Object[]{this.b, this.c, this.d});
    }
}

