import android.os.SystemClock;
import android.util.Log;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class fdsg {
    public final PriorityBlockingQueue a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    public final AtomicInteger d;
    final fdsh e;
    private final ayux f;
    private final ayux g;
    private final ayux h;

    public fdsg(fdsh fdsh0) {
        Objects.requireNonNull(fdsh0);
        this.e = fdsh0;
        super();
        this.a = new PriorityBlockingQueue(1, new fdsf());
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
        this.d = new AtomicInteger(0);
        fdob fdob0 = fdob.b();
        this.f = fdob0.a(fdno.d);
        this.g = fdob0.a(fdno.c);
        this.h = fdob0.a(fdno.e);
    }

    public final int a() {
        return this.a.size();
    }

    public final boolean b(esaa esaa0) {
        String s;
        boolean z = false;
        fdsd fdsd0;
        while((fdsd0 = (fdsd)this.a.poll()) != null) {
            fdsh.i(esaa0);
            try {
                long v = SystemClock.elapsedRealtime() - fdsd0.b;
                if(!fdsd0.c && v > hzuz.a.h().h()) {
                    hkzw hkzw0 = fdsd0.a;
                    switch((hkzu.a(hkzw0.l) == 0 ? 1 : hkzu.a(hkzw0.l)) - 2) {
                        case 1: {
                            s = "lo";
                            break;
                        }
                        case 2: {
                            s = "hi";
                            break;
                        }
                        default: {
                            s = "un";
                        }
                    }
                    Log.w("CloudNode", String.format("Dropping RPC (%s:%d:%d) due to timeout: waited %d ms", s, ((int)hkzw0.k), ((int)hkzw0.j), v));
                    this.g.a(0L, 1L, ayvf.b);
                    this.c.incrementAndGet();
                    continue;
                }
                fdtx fdtx0 = this.e.H;
                String s1 = this.e.b();
                hkzw hkzw1 = fdsd0.a;
                fdwc fdwc0 = fdtx0.b;
                fdwc0.a(":sendRpc");
                try {
                    fdvw fdvw0 = new fdvw((hkzw1.c == 12 ? ffaw.i : ffaw.h), hkzw1.h, "SendRpc");
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlbd.a).v_newBuilder();
                    long v1 = Long.parseLong(s1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hlbd)hftp0.b_message).d = v1;
                    String s2 = fdtx0.f();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    s2.getClass();
                    ((hlbd)hftv0).e = s2;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hlbd hlbd0 = (hlbd)hftp0.b_message;
                    hkzw1.getClass();
                    hlbd0.f = hkzw1;
                    hlbd0.b |= 2;
                    hlbd hlbd1 = (hlbd)hftp0.N_build();
                    fdtd fdtd0 = new fdtd();
                    fdte fdte0 = new fdte();
                    Objects.requireNonNull(fdtx0.a);
                    fdtx0.b(fdvw0, ((MessageLite)hlbd1), fdtd0, fdte0, new fdtf(fdtx0.a));
                }
                catch(Throwable throwable0) {
                    fdtx0.b.b(":sendRpc");
                    throw throwable0;
                }
                fdwc0.b(":sendRpc");
                this.f.a(0L, 1L, ayvf.b);
                this.b.incrementAndGet();
                z = true;
            }
            catch(fdsp | IOException exception0) {
                fdsd0.c = false;
                this.a.offer(fdsd0);
                this.h.a(0L, 1L, ayvf.b);
                this.d.incrementAndGet();
                throw exception0;
            }
        }
        return z;
    }
}

