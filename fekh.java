import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class fekh implements ffmj {
    final Map a;
    private final AtomicInteger b;
    private final AtomicInteger c;
    private final AtomicInteger d;
    private final Lock e;

    public fekh() {
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
        this.d = new AtomicInteger(0);
        this.e = new ReentrantLock();
        this.a = new HashMap();
    }

    public final IOException a(IOException iOException0) {
        if((iOException0 instanceof fekg)) {
            return ((fekg)iOException0).a;
        }
        this.d(iOException0.getMessage());
        return iOException0;
    }

    public final void b() {
        this.c.incrementAndGet();
    }

    public final void c() {
        this.b.incrementAndGet();
    }

    public final void d(String s) {
        this.d.incrementAndGet();
        this.e.lock();
        try {
            int v1 = this.a.containsKey(s) ? ((int)(((Integer)this.a.get(s)))) : 0;
            this.a.put(s, Integer.valueOf(v1 + 1));
        }
        finally {
            this.e.unlock();
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("--- Logic driven events ----------");
        bbpd0.println("  Connection attempts: " + this.b.get());
        bbpd0.println("  Successfully connected: " + this.c.get());
        bbpd0.println("  Disconnects: " + this.d.get());
        bbpd0.println("--- Disconnects by reason --------");
        this.e.lock();
        try {
            for(Object object0: this.a.entrySet()) {
                bbpd0.println(String.format("      %s: %s", ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue()));
            }
        }
        finally {
            this.e.unlock();
        }
    }
}

