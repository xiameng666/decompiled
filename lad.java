import java.util.concurrent.atomic.AtomicInteger;

public final class lad {
    public final AtomicInteger a;

    public lad() {
        this.a = new AtomicInteger(0);
    }

    public final int a() {
        return this.a.get();
    }
}

