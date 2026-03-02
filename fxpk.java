import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class fxpk {
    public final fxpd a;
    public final ScheduledExecutorService b;
    public final Map c;
    public fxpp d;
    public final boolean e;
    private fxpd f;
    private fxpd g;

    public fxpk(String s) {
        bbll bbll0 = new bbll(1, 9);
        super();
        fxpl fxpl0 = new fxpl();
        this.a = fxpl0;
        this.f = fxpl0;
        this.c = new HashMap();
        this.e = hsbu.c();
        this.b = bbll0;
        bboh.c(s, bbcu.g, "StSt");
    }

    public final void a(fxpd fxpd0, fxpi fxpi0) {
        while(true) {
            fxpd fxpd1 = this.g;
            if(fxpd1 == fxpd0 || fxpd1 == this.a) {
                break;
            }
            fxpd1.b(fxpi0);
            this.g = this.g.g;
        }
    }

    public final void b(PrintWriter printWriter0) {
        printWriter0.println("##Stack Start");
        printWriter0.println("current=" + (this.g == null ? "" : this.g.e));
        for(fxpd fxpd0 = this.a; fxpd0 != null; fxpd0 = fxpd0.f) {
            fxpd0.d(printWriter0);
        }
        fxpp fxpp0 = this.d;
        if(fxpp0 != null) {
            fxpp0.c.c(printWriter0);
        }
        printWriter0.println("##Stack End");
    }

    // Detected as a lambda impl.
    public final void c(fxpj fxpj0) {
        fxpd fxpd0 = this.g;
        boolean z = false;
        while(fxpd0 != null && !z) {
            z = fxpd0.c(fxpj0);
            fxpd0 = fxpd0.g;
        }
    }

    public final void d(int v) {
        try {
            fxpg fxpg0 = new fxpg(this, v);
            this.b.execute(fxpg0);
        }
        catch(RejectedExecutionException unused_ex) {
        }
    }

    public final void e(int v, fxnv fxnv0) {
        fxpj fxpj0 = new fxpj(v, fxnv0);
        try {
            fxpe fxpe0 = () -> {
                fxpd fxpd0 = this.g;
                boolean z = false;
                while(fxpd0 != null && !z) {
                    z = fxpd0.c(fxpj0);
                    fxpd0 = fxpd0.g;
                }
            };
            this.b.execute(fxpe0);
        }
        catch(RejectedExecutionException unused_ex) {
        }
    }

    public final void f(int v, fxnv fxnv0, long v1) {
        this.g(v, fxnv0, v1, false);
    }

    public final void g(int v, fxnv fxnv0, long v1, boolean z) {
        Integer integer0 = v;
        if(z) {
            Map map0 = this.c;
            synchronized(map0) {
                if(!map0.containsKey(integer0)) {
                    map0.put(integer0, new AtomicInteger(0));
                }
                if(!((AtomicInteger)map0.get(integer0)).compareAndSet(0, 1)) {
                    return;
                }
            }
        }
        try {
            fxpf fxpf0 = new fxpf(this, z, v, fxnv0);
            ((bbll)this.b).g(fxpf0, v1, TimeUnit.MILLISECONDS);
        }
        catch(RejectedExecutionException unused_ex) {
        }
    }

    public final void h() {
        this.g.a();
    }

    public final void i() {
        batl.s(this.g.f);
        fxpd fxpd0 = this.g.f;
        this.g = fxpd0;
        fxpd0.a();
    }

    public final boolean j(fxpd fxpd0) {
        return this.g == fxpd0;
    }

    public final void k(fxpd fxpd0) {
        if(this.g == null) {
            this.g = fxpd0;
        }
        fxpd fxpd1 = this.f;
        fxpd1.f = fxpd0;
        fxpd0.g = fxpd1;
        this.f = fxpd0;
        fxpd0.h = this;
    }

    public final void l(int v, long v1) {
        this.g(v, null, v1, true);
    }
}

