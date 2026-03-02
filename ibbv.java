import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jeb.synthetic.FIN;

final class ibbv extends FilterInputStream implements InputStreamRetargetInterface {
    private final int a;
    private final ibfn b;
    private long c;
    private long d;
    private long e;

    public ibbv(InputStream inputStream0, int v, ibfn ibfn0) {
        super(inputStream0);
        this.e = -1L;
        this.a = v;
        this.b = ibfn0;
    }

    private final void a() {
        if(this.d > this.c) {
            this.c = this.d;
        }
    }

    private final void b() {
        int v = this.a;
        if(this.d <= ((long)v)) {
            return;
        }
        throw new iapn(iapk.k.f("Decompressed gRPC message exceeds maximum size " + v));
    }

    @Override
    public final void mark(int v) {
        synchronized(this) {
            this.in.mark(v);
            this.e = this.d;
        }
    }

    @Override
    public final int read() {
        int v = this.in.read();
        if(v != -1) {
            ++this.d;
        }
        this.b();
        this.a();
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = this.in.read(arr_b, v, v1);
        if(v2 != -1) {
            this.d += (long)v2;
        }
        this.b();
        this.a();
        return v2;
    }

    @Override
    public final void reset() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.in.markSupported()) {
            if(this.e != -1L) {
                this.in.reset();
                this.d = this.e;
                FIN.finallyCodeBegin$NT(v);
                return;
            }
            throw new IOException("Mark not set");
        }
        throw new IOException("Mark not supported");
    }

    @Override
    public final long skip(long v) {
        long v1 = this.in.skip(v);
        this.d += v1;
        this.b();
        this.a();
        return v1;
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

