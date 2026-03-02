import java.io.DataOutputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

final class czvo {
    public final DataOutputStream a;
    final ArrayBlockingQueue b;
    final AtomicBoolean c;
    public final AtomicBoolean d;
    private gmcg e;

    public czvo(DataOutputStream dataOutputStream0) {
        this.b = new ArrayBlockingQueue(((int)hvog.a.bk().bL()));
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.a = dataOutputStream0;
    }

    final void a() {
        this.d.set(true);
        if(this.e != null) {
            synchronized(this.c) {
                this.c.notifyAll();
            }
            cuui.h(this.e, "MultiplexWriter.writerThread");
        }
    }

    final void b(gmcu gmcu0, byte[] arr_b, String s) {
        synchronized(this.c) {
            try {
                czvm czvm0 = new czvm(gmcu0, arr_b);
                this.b.put(czvm0);
            }
            catch(InterruptedException unused_ex) {
                czkq.a.e().i("[%s] Interrupted while enqueue %s frame.", "MultiplexOutputStream", s);
                Thread.currentThread().interrupt();
            }
        }
        AtomicBoolean atomicBoolean1 = this.c;
        if(atomicBoolean1.get()) {
            return;
        }
        atomicBoolean1.set(true);
        atomicBoolean1.notifyAll();
        if(this.e == null) {
            gmcg gmcg0 = cuui.d();
            this.e = gmcg0;
            gmcg0.execute(new czvn(this));
        }
    }
}

