import java.util.ArrayDeque;

public final class brf {
    public final ArrayDeque a;
    public final Object b;

    public brf() {
        this.b = new Object();
        this.a = new ArrayDeque(3);
    }

    public final Object a() {
        synchronized(this.b) {
        }
        return this.a.removeLast();
    }
}

