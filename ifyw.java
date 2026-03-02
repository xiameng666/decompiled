import android.os.Trace;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

public final class ifyw extends UploadDataSink {
    public final AtomicInteger a;
    public final Executor b;
    public final igar c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    public final HttpURLConnection h;
    public WritableByteChannel i;
    public OutputStream j;
    final igac k;
    private final Executor l;
    private final AtomicBoolean m;

    public ifyw(igac igac0, Executor executor0, Executor executor1, HttpURLConnection httpURLConnection0, igar igar0) {
        this.k = igac0;
        super();
        this.a = new AtomicInteger(3);
        this.l = new ifyv(this, executor0);
        this.b = executor1;
        this.c = new igar(igar0);
        this.m = new AtomicBoolean(false);
        this.h = httpURLConnection0;
    }

    public final void a(igad igad0, String s) {
        try {
            new ifvp("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + s);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            goto label_13;
        }
        try {
            ifyq ifyq0 = new ifyq(this, s, igad0);
            this.l.execute(ifyq0);
            goto label_10;
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
                throw throwable0;
            }
            catch(Throwable throwable1) {
                try {
                    throwable0.addSuppressed(throwable1);
                    throw throwable0;
                label_10:
                    Trace.endSection();
                    return;
                }
                catch(RejectedExecutionException rejectedExecutionException0) {
                }
            }
        }
    label_13:
        this.g(rejectedExecutionException0);
    }

    public final void b() {
        this.a(new ifyr(this), "readFromProvider");
    }

    public final void c() {
        this.h(this.d(new ifys(this)), "startRead");
    }

    protected final Runnable d(igad igad0) {
        return new ifza(this.k, igad0);
    }

    public final void e() {
        if(this.i != null && this.m.compareAndSet(false, true)) {
            this.i.close();
        }
    }

    protected final void f() {
        this.e();
        this.k.g();
    }

    protected final void g(Throwable throwable0) {
        this.k.c(throwable0);
    }

    private final void h(Runnable runnable0, String s) {
        new ifvp("JavaUploadDataSinkBase#executeOnExecutor " + s);
        try {
            ifyt ifyt0 = new ifyt(s, runnable0);
            this.b.execute(ifyt0);
        }
        catch(Throwable throwable0) {
            try {
                Trace.endSection();
            }
            catch(Throwable throwable1) {
                throwable0.addSuppressed(throwable1);
            }
            throw throwable0;
        }
        Trace.endSection();
    }

    @Override  // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exception0) {
        this.g(exception0);
    }

    @Override  // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger0 = this.a;
        if(!atomicInteger0.compareAndSet(0, 2)) {
            throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + atomicInteger0.get());
        }
        this.h(this.d(new ifyu(this, z)), "onReadSucceeded");
    }

    @Override  // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exception0) {
        this.g(exception0);
    }

    @Override  // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger0 = this.a;
        if(!atomicInteger0.compareAndSet(1, 2)) {
            throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger0.get());
        }
        this.c();
    }
}

