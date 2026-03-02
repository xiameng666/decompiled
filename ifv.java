import java.util.List;

public abstract class ifv implements iau {
    private final String a;

    public ifv(String s) {
        this.a = s;
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        throw new IllegalStateException(this.a.toString());
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        throw new IllegalStateException(this.a.toString());
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        throw new IllegalStateException(this.a.toString());
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        throw new IllegalStateException(this.a.toString());
    }
}

