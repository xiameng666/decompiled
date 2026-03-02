import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class atjc extends FilterInputStream implements InputStreamRetargetInterface {
    public volatile IOException a;

    public atjc(InputStream inputStream0) {
        super(inputStream0);
    }

    private final void a() {
        if(this.a == null) {
            return;
        }
        throw new IOException(this.a);
    }

    @Override
    public final int available() {
        this.a();
        return super.available();
    }

    @Override
    public final void close() {
        this.a();
        super.close();
    }

    @Override
    public final int read() {
        this.a();
        int v = super.read();
        if(hqkg.c()) {
            this.a();
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b) {
        this.a();
        int v = super.read(arr_b);
        if(hqkg.c()) {
            this.a();
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        this.a();
        int v2 = super.read(arr_b, v, v1);
        if(hqkg.c()) {
            this.a();
        }
        return v2;
    }

    @Override
    public final void reset() {
        synchronized(this) {
            this.a();
            super.reset();
        }
    }

    @Override
    public final long skip(long v) {
        this.a();
        return super.skip(v);
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

