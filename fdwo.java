import j..util.Objects;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

public final class fdwo implements Closeable {
    public final Object a;
    public final ReentrantLock b;
    public int c;
    final fdwp d;

    public fdwo(fdwp fdwp0, Object object0) {
        Objects.requireNonNull(fdwp0);
        this.d = fdwp0;
        super();
        this.b = new ReentrantLock(fdwp0.a);
        this.a = object0;
    }

    @Override
    public final void close() {
        this.b.unlock();
        fdwp fdwp0 = this.d;
        synchronized(fdwp0) {
            int v1 = this.c - 1;
            this.c = v1;
            if(v1 == 0) {
                fdwp0.b.remove(this.a);
            }
        }
    }
}

