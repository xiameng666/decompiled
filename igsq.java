import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.RefCounted;

public final class igsq implements RefCounted {
    private final AtomicInteger a;
    private final Runnable b;

    public igsq(Runnable runnable0) {
        this.a = new AtomicInteger(1);
        this.b = runnable0;
    }

    @Override  // org.webrtc.RefCounted
    public final void release() {
        int v = this.a.decrementAndGet();
        if(v < 0) {
            throw new IllegalStateException("release() called on an object with refcount < 1");
        }
        if(v == 0) {
            Runnable runnable0 = this.b;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
    }

    @Override  // org.webrtc.RefCounted
    public final void retain() {
        if(this.a.incrementAndGet() >= 2) {
            return;
        }
        throw new IllegalStateException("retain() called on an object with refcount < 1");
    }
}

