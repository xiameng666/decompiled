final class fvlw {
    public final fvns a;
    public final fvrw b;
    public int c;

    public fvlw(fvns fvns0, fvrw fvrw0, int v) {
        this.a = fvns0;
        this.b = fvrw0;
        this.c = v;
    }

    public final boolean a() {
        return this.c >= this.b.c;
    }
}

