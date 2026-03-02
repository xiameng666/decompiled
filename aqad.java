import java.util.function.Consumer;

public final class aqad extends apzx {
    private final Consumer a;
    private boolean b;

    public aqad(boolean z, Consumer consumer0) {
        this.b = z;
        this.a = consumer0;
    }

    public final Boolean a() {
        return Boolean.valueOf(this.b);
    }

    public final void b(boolean z) {
        if(this.b == z) {
            return;
        }
        this.b = z;
        this.a.accept(Boolean.valueOf(z));
    }
}

