import java.io.Serializable;

public final class ifqp implements Serializable {
    public final int a;
    private final byte[] b;
    private static final long serialVersionUID = 1L;

    protected ifqp(int v, byte[] arr_b) {
        this.a = v;
        this.b = arr_b;
    }

    public final byte[] a() {
        return ifqy.g(this.b);
    }
}

