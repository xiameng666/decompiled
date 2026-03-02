public final class gbcc {
    public static final int a;
    public static final int b;
    public static final int c;

    static {
        gbcc.a = hdry.a.g;
        gbcc.b = hdry.c.g;
        gbcc.c = hdry.b.g;
    }

    public static boolean a(int v, int v1) {
        return (v & v1) == v1;
    }

    public static boolean b(int v, hdry hdry0) {
        return gbcc.a(v, hdry0.g);
    }
}

