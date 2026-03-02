import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class czjy extends InputStream implements InputStreamRetargetInterface {
    private final byte[] a;
    private final ArrayBlockingQueue b;
    private final AtomicBoolean c;
    private byte[] d;
    private boolean e;
    private Thread f;

    public czjy() {
        this.a = new byte[0];
        int v = (int)hvog.a.bk().G();
        this.b = new ArrayBlockingQueue(v);
        this.c = new AtomicBoolean(false);
        czkq.a.b().h("Create a BlockingQueueStream with size %d.", Integer.valueOf(v));
    }

    public final void a(byte[] arr_b) {
        if(this.e) {
            czkq.a.e().p("Failed to write BlockingQueueStream because it was closed.", new Object[0]);
            return;
        }
        try {
            this.c.set(true);
            this.f = Thread.currentThread();
            this.b.put(arr_b);
            this.c.set(false);
            czkq.a.d().h("BlockingQueueStream wrote %d bytes.", Integer.valueOf(arr_b.length));
        }
        catch(InterruptedException unused_ex) {
            throw new IOException("Failed to write BlockingQueueStream because the current thread has been interrupted.");
        }
    }

    @Override
    public final void close() {
        if(!this.e) {
            this.e = true;
            czkq.a.b().p("Closed BlockingQueueStream.", new Object[0]);
            if(!this.b.offer(this.a) && this.c.get() && (this.f != null && !this.f.isInterrupted())) {
                this.f.interrupt();
            }
        }
    }

    @Override
    public final int read() {
        if(this.e) {
            throw new IOException();
        }
        if(this.d == null) {
            try {
                byte[] arr_b = (byte[])this.b.take();
                if(arr_b == this.a) {
                    throw new InterruptedException();
                }
                this.d = arr_b;
            }
            catch(InterruptedException unused_ex) {
                czkq.a.d().p("Abort BlockingQueueStream reading.", new Object[0]);
                return -1;
            }
        }
        byte[] arr_b1 = this.d;
        int v = arr_b1[0];
        byte[] arr_b2 = null;
        if(arr_b1.length != 1) {
            arr_b2 = new byte[arr_b1.length - 1];
            System.arraycopy(arr_b1, 1, arr_b2, 0, arr_b1.length - 1);
        }
        this.d = arr_b2;
        return v;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(!this.e) {
            try {
                byte[] arr_b1 = this.d == null ? ((byte[])this.b.take()) : this.d;
                if(arr_b1 == this.a) {
                    throw new InterruptedException();
                }
                int v2 = glwy.g(new int[]{arr_b.length - v, arr_b1.length, v1});
                System.arraycopy(arr_b1, 0, arr_b, v, v2);
                if(v2 < arr_b1.length) {
                    byte[] arr_b2 = new byte[arr_b1.length - v2];
                    this.d = arr_b2;
                    System.arraycopy(arr_b1, v2, arr_b2, 0, arr_b2.length);
                }
                else {
                    this.d = null;
                }
                czkq.a.d().h("BlockingQueueStream read %d bytes.", Integer.valueOf(v2));
                return v2;
            }
            catch(InterruptedException unused_ex) {
                czkq.a.d().p("Abort BlockingQueueStream reading.", new Object[0]);
                return -1;
            }
        }
        throw new IOException();
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

