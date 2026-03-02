import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class sqh extends FilterInputStream implements InputStreamRetargetInterface {
    private final long a;
    private long b;

    public sqh(InputStream inputStream0, long v) {
        super(inputStream0);
        this.a = v;
    }

    public final long a() {
        return this.a - this.b;
    }

    @Override
    public final int read() {
        int v = super.read();
        if(v != -1) {
            ++this.b;
        }
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = super.read(arr_b, v, v1);
        if(v2 != -1) {
            this.b += (long)v2;
        }
        return v2;
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

