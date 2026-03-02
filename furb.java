import java.io.OutputStream;

final class furb extends OutputStream {
    public long a;
    private final OutputStream b;

    public furb(OutputStream outputStream0) {
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
        ++this.a;
        this.b.write(v);
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        ibuq.f(arr_b, "b");
        this.a += (long)v1;
        this.b.write(arr_b, v, v1);
    }
}

