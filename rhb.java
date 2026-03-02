public class rhb extends Exception {
    public final int a;
    public final int b;
    public final String c;

    public rhb(int v, int v1, String s, String s1) {
        super(s1);
        this.a = v;
        this.b = v1;
        this.c = s;
    }

    public rhb(int v, int v1, String s, String s1, Throwable throwable0) {
        super(s1, throwable0);
        this.a = v;
        this.b = v1;
        this.c = s;
    }

    public rhb(int v, String s) {
        this(v, 0, "", s);
    }

    public rhb(int v, String s, Throwable throwable0) {
        this(v, 0, "", s, throwable0);
    }
}

