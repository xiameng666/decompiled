import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public final class atxw {
    private final UUID a;
    private final AtomicInteger b;

    public atxw() {
        this.b = new AtomicInteger();
        this.a = UUID.randomUUID();
    }

    public final int a() {
        return this.b.incrementAndGet();
    }

    public final String b() {
        return this.a.toString();
    }
}

