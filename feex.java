public class feex extends Exception {
    public final int a;

    public feex(String s) {
        this(s, -1);
    }

    public feex(String s, int v) {
        super(s);
        this.a = v;
    }

    public feex(Throwable throwable0) {
        super("Got interrupted when acquiring lock", throwable0);
        this.a = -1;
    }
}

