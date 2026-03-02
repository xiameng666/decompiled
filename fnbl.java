public final class fnbl {
    public final int a;
    public final String b;
    public final String c;
    public final Throwable d;
    public final int e;

    public fnbl(int v, int v1, String s, String s1, Throwable throwable0) {
        this.e = v;
        this.a = v1;
        this.b = s;
        this.c = s1;
        this.d = throwable0;
    }

    public static fnbl a(int v, Throwable throwable0) {
        return new fnbl(v, -1, throwable0.getMessage(), null, throwable0);
    }
}

