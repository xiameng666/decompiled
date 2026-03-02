import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

public final class ghjq implements Closeable {
    private final Deque a;
    private Throwable b;

    public ghjq() {
        this.a = new ArrayDeque(4);
    }

    public final RuntimeException a(Throwable throwable0) {
        this.b = throwable0;
        gfut.d(throwable0, IOException.class);
        gfut.e(throwable0);
        throw new RuntimeException(throwable0);
    }

    public final void b(Closeable closeable0) {
        if(closeable0 != null) {
            this.a.addFirst(closeable0);
        }
    }

    @Override
    public final void close() {
        Throwable throwable0 = this.b;
        while(true) {
            Deque deque0 = this.a;
            if(deque0.isEmpty()) {
                break;
            }
            Closeable closeable0 = (Closeable)deque0.removeFirst();
            try {
                closeable0.close();
            }
            catch(Throwable throwable1) {
                Throwable throwable2 = throwable1;
                if(throwable0 == null) {
                    throwable0 = throwable2;
                    continue;
                }
                if(throwable0 == throwable2) {
                    continue;
                }
                try {
                    throwable0.addSuppressed(throwable2);
                }
                catch(Throwable unused_ex) {
                    ghjp.a.logp(Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing " + closeable0, throwable2);
                }
            }
        }
        if(this.b == null && throwable0 != null) {
            gfut.d(throwable0, IOException.class);
            gfut.e(throwable0);
            throw new AssertionError(throwable0);
        }
    }
}

