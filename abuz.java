import j..util.Objects;

final class abuz extends bwzp {
    final bwud a;
    final bwuw b;
    final abve c;

    public abuz(abve abve0, gltq gltq0, String s, bwud bwud0, bwuw bwuw0) {
        this.a = bwud0;
        this.b = bwuw0;
        Objects.requireNonNull(abve0);
        this.c = abve0;
        super(gltq0, 2, s);
    }

    @Override  // bwzp
    public final Object a() {
        try {
            this.c.a.H(this.a, this.b);
            return null;
        }
        catch(bwvo | bwvr | SecurityException object0) {
            return object0;
        }
    }
}

