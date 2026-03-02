import java.util.concurrent.ArrayBlockingQueue;

public final class ehic {
    private final ArrayBlockingQueue a;
    private ggdy b;
    private int c;

    public ehic(int v) {
        this.c = 0;
        this.a = new ArrayBlockingQueue(v, true);
        this.b = new ggdy();
    }

    public final ehia a() {
        try {
            return (ehia)this.a.take();
        }
        catch(InterruptedException interruptedException0) {
            egig.c("FSA2_PaginatedQueue", "BlockingQueue.take interrupted, bailing out", interruptedException0);
            throw new ehfh(interruptedException0);
        }
    }

    public final void b(String s) {
        synchronized(this) {
            this.f(s, true);
        }
    }

    public final void c(String s) {
        synchronized(this) {
            this.f(s, false);
        }
    }

    public final void d(Object object0) {
        synchronized(this) {
            this.b.i(object0);
            ++this.c;
        }
    }

    public final void e() {
    }

    private final void f(String s, boolean z) {
        try {
            ehia ehia0 = new ehia(this.b.h(), s, z);
            this.a.put(ehia0);
            this.b = new ggdy();
        }
        catch(InterruptedException interruptedException0) {
            egig.c("FSA2_PaginatedQueue", "BlockingQueue.put interrupted, bailing out", interruptedException0);
            throw new ehfh(interruptedException0);
        }
    }
}

