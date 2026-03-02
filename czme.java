public final class czme {
    public dafz a;
    public String b;
    private int c;
    private byte d;

    public final czmf a() {
        if(this.d == 1) {
            return new czmf(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: connectionMode");
    }

    public final void b(int v) {
        this.c = v;
        this.d = 1;
    }
}

