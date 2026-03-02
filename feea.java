import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class feea extends feed {
    public final File a;
    public final String b;
    public final fdso c;
    public final AtomicReference d;
    public final AtomicReference e;
    private final gmcg f;
    private final byte[] g;
    private final AtomicInteger h;
    private PipedInputStream i;
    private final AtomicReference j;
    private final AtomicReference k;

    public feea(File file0, fdso fdso0, gmcg gmcg0, String s) {
        this.g = new byte[0x400];
        this.h = new AtomicInteger(0);
        this.j = new AtomicReference(null);
        this.k = new AtomicReference(null);
        this.d = new AtomicReference(null);
        this.e = new AtomicReference(null);
        if(!fdso.n(s)) {
            throw new AssertionError("Uploading plaintext file using EncryptingUploadProvider");
        }
        this.a = file0;
        this.b = s;
        this.c = fdso0;
        this.f = gmcg0;
        this.i = new PipedInputStream();
    }

    @Override  // clci
    public final long a() {
        return -1L;
    }

    @Override  // clci
    public final gfsx b() {
        return gfqx.a;
    }

    @Override  // clci
    public final void c(clch clch0, ByteBuffer byteBuffer0) {
        AtomicReference atomicReference0 = this.j;
        gmcd gmcd0 = (gmcd)atomicReference0.get();
        if(gmcd0 == null) {
            gmcd0 = this.f();
            atomicReference0.set(gmcd0);
        }
        byte[] arr_b = this.g;
        int v = this.i.read(arr_b);
        if(v > 0) {
            byteBuffer0.put(arr_b, 0, v);
        }
        switch(v) {
            case -1: {
                gmbu.t(gmcd0, new fedz(this, clch0), this.f);
                return;
            }
            case 0: {
                throw new IOException("Attempting to send zero bytes in a non-terminal buffer; aborting to avoid crash.");
            }
            default: {
                this.h.addAndGet(v);
                clch0.a(false);
            }
        }
    }

    @Override  // clci
    public final void close() {
        this.i.close();
    }

    @Override  // clci
    public final void d(clch clch0) {
        if(Log.isLoggable("CloudNode", 4)) {
            Log.i("CloudNode", "We\'re being asked to rewind...");
        }
        AtomicReference atomicReference0 = this.j;
        gmcd gmcd0 = (gmcd)atomicReference0.get();
        if(gmcd0 != null) {
            gmcd0.cancel(false);
        }
        FileInputStream fileInputStream0 = (FileInputStream)this.d.get();
        if(fileInputStream0 != null) {
            ghjp.a(fileInputStream0);
        }
        PipedOutputStream pipedOutputStream0 = (PipedOutputStream)this.k.get();
        if(pipedOutputStream0 != null) {
            ghjp.b(pipedOutputStream0);
        }
        OutputStream outputStream0 = (OutputStream)this.e.get();
        if(outputStream0 != null) {
            ghjp.b(outputStream0);
        }
        this.close();
        this.i = new PipedInputStream();
        atomicReference0.set(this.f());
        clch0.b();
        if(Log.isLoggable("CloudNode", 4)) {
            Log.i("CloudNode", "Rewind complete.");
        }
    }

    @Override  // feed
    public final int e() {
        return this.h.get();
    }

    private final gmcd f() {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream(this.i);
        this.k.set(pipedOutputStream0);
        fedy fedy0 = new fedy(this, pipedOutputStream0);
        return this.f.e(fedy0);
    }
}

