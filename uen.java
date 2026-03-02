import java.util.List;

final class uen {
    final Object a;
    public List b;
    uen c;
    uen d;

    uen() {
        this(null);
    }

    public uen(Object object0) {
        this.d = this;
        this.c = this;
        this.a = object0;
    }

    public final int a() {
        return this.b == null ? 0 : this.b.size();
    }

    public final Object b() {
        int v = this.a();
        return v <= 0 ? null : this.b.remove(v - 1);
    }
}

