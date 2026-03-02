import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

final class fozp extends InputStream implements InputStreamRetargetInterface {
    public final AtomicLong a;
    private final InputStream b;
    private final AtomicLong c;
    private long d;
    private final Runnable e;

    public fozp(InputStream inputStream0, Runnable runnable0) {
        this.a = new AtomicLong(0L);
        this.c = new AtomicLong(0L);
        this.d = 0L;
        this.b = inputStream0;
        this.e = runnable0;
    }

    private final void a(int v) {
        if(v == -1) {
            return;
        }
        this.e.run();
        if(this.markSupported() && this.d != 0L) {
            synchronized(this.c) {
                this.c.addAndGet(((long)v));
                long v2 = Math.max(this.c.get() + this.d, this.a.get());
                this.a.set(v2);
            }
            return;
        }
        this.a.addAndGet(((long)v));
    }

    @Override
    public final int available() {
        return this.b.available();
    }

    @Override
    public final void close() {
        this.b.close();
    }

    @Override
    public final void mark(int v) {
        this.b.mark(v);
        if(this.markSupported()) {
            AtomicLong atomicLong0 = this.c;
            synchronized(atomicLong0) {
                long v2 = this.d;
                this.d = v2 == 0L ? this.a.get() : v2 + atomicLong0.get();
                atomicLong0.set(0L);
            }
        }
    }

    @Override
    public final boolean markSupported() {
        return this.b.markSupported();
    }

    @Override
    public final int read() {
        int v = this.b.read();
        if(v != -1) {
            this.a(1);
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b) {
        int v = this.b.read(arr_b);
        this.a(v);
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = this.b.read(arr_b, v, v1);
        this.a(v2);
        return v2;
    }

    @Override
    public final void reset() {
        this.b.reset();
        if(this.markSupported()) {
            synchronized(this.c) {
                this.c.set(0L);
            }
        }
    }

    @Override
    public final long skip(long v) {
        int v1 = (int)this.b.skip(v);
        this.a(v1);
        return (long)v1;
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

