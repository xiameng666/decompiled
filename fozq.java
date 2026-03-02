import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

final class fozq extends OutputStream {
    public final AtomicLong a;
    private final OutputStream b;

    public fozq(OutputStream outputStream0) {
        this.a = new AtomicLong(0L);
        this.b = outputStream0;
    }

    @Override
    public final void close() {
        this.b.close();
    }

    @Override
    public final void flush() {
        this.b.flush();
    }

    @Override
    public final void write(int v) {
        this.b.write(v);
        this.a.addAndGet(1L);
    }

    @Override
    public final void write(byte[] arr_b) {
        this.b.write(arr_b);
        this.a.addAndGet(((long)arr_b.length));
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        this.b.write(arr_b, v, v1);
        this.a.addAndGet(((long)v1));
    }
}

