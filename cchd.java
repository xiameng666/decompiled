import java.io.Closeable;
import jeb.synthetic.FIN;

public abstract class cchd implements Closeable {
    private int a;
    public volatile long c;

    public cchd(long v) {
        this.c = 0L;
        this.a = 0;
        if(v == 0L) {
            throw new OutOfMemoryError();
        }
        this.c = v;
        ++this.a;
    }

    public void assertOpen() {
        if(this.c != 0L) {
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        synchronized(this) {
            this.unref();
        }
    }

    protected abstract void closeNativeObject();

    @Override
    protected void finalize() {
        if(this.c != 0L) {
            this.closeNativeObject();
            this.c = 0L;
        }
        super.finalize();
    }

    public void ref() {
        synchronized(this) {
            ++this.a;
        }
    }

    public void unref() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        int v1 = this.a - 1;
        this.a = v1;
        if(v1 == 0) {
            this.closeNativeObject();
            this.c = 0L;
            FIN.finallyExec$NT(v);
            return;
        }
        if(v1 >= 0) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException();
    }
}

