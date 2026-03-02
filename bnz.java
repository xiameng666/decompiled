final class bnz {
    public final int a;
    public final String b;
    public final int c;
    public final int d;

    public bnz(String s, int v, int v1) {
        this.b = s;
        this.a = v;
        this.c = v1;
        this.d = -1;
    }

    public bnz(String s, int v, int v1, int v2) {
        this.b = s;
        this.a = v;
        this.c = v1;
        this.d = v2;
    }
}

