import java.util.Arrays;
import java.util.List;

public final class qqy implements qql {
    public final String a;
    public final List b;
    public final boolean c;

    public qqy(String s, List list0, boolean z) {
        this.a = s;
        this.b = list0;
        this.c = z;
    }

    @Override  // qql
    public final qlt a(qkz qkz0, qkb qkb0, qrf qrf0) {
        return new qlu(qkz0, qrf0, this, qkb0);
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.b.toArray());
        return "ShapeGroup{name=\'" + this.a + "\' Shapes: " + s + "}";
    }
}

