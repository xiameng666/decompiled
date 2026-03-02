import java.io.Serializable;

public final class ghci implements Serializable {
    public final int a;
    public final double b;
    private static final long serialVersionUID = 1L;

    public ghci() {
        this.a = 10;
        this.b = 0.2;
    }
}

