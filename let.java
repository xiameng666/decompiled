import java.util.concurrent.atomic.AtomicBoolean;

public final class let {
    public final AtomicBoolean a;

    public let(boolean z) {
        this.a = new AtomicBoolean(z);
    }
}

