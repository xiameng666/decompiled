import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class czjx {
    public static final gycf a;
    public static final czjw b;
    public final ArrayBlockingQueue c;
    public final ArrayBlockingQueue d;
    public final AtomicBoolean e;
    public boolean f;
    public Thread g;
    public final boolean h;

    static {
        czjx.a = gycf.a;
        czjx.b = new czjw(new byte[0], false, -1, 0);
    }

    public czjx(boolean z) {
        this.h = z;
        int v = (int)hvog.a.bk().ca();
        this.c = new ArrayBlockingQueue(v);
        this.d = new ArrayBlockingQueue(v);
        this.e = new AtomicBoolean(false);
        czkq.a.b().h("Create a BlockingPayloadChunkQueue with size %d.", Integer.valueOf(v));
    }

    public final void a() {
        if(!this.f) {
            this.f = true;
            czkq.a.d().p("Closed BlockingPayloadChunkQueue.", new Object[0]);
            if(this.h) {
                if(!this.d.offer(czjx.b)) {
                    this.b();
                }
            }
            else if(!this.c.offer(czjx.a)) {
                this.b();
            }
        }
    }

    private final void b() {
        if(this.e.get() && (this.g != null && !this.g.isInterrupted())) {
            this.g.interrupt();
        }
    }
}

