public class aqxy extends aqyc {
    public final int a;

    public aqxy(int v) {
        super("status:" + v);
        this.a = v;
    }

    public aqxy(String s, int v) {
        super(a.g(v, s, " - status:"));
        this.a = v;
    }

    @Override  // aqyc
    public int a() {
        return -6;
    }

    @Override  // aqxw
    public final int b() {
        return 2;
    }
}

