import android.os.RemoteException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

final class fcra implements gmbg {
    final giay a;
    final AtomicLong b;
    final fcok c;

    public fcra(giay giay0, AtomicLong atomicLong0, fcok fcok0) {
        this.a = giay0;
        this.b = atomicLong0;
        this.c = fcok0;
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        long v = this.b.get();
        long v1 = v == 0L ? 0L : System.currentTimeMillis() - v;
        if((throwable0 instanceof TimeoutException)) {
            this.c.c(this.a, 5, v1);
        }
        else if((throwable0 instanceof RemoteException)) {
            this.c.c(this.a, 2, v1);
        }
        else if((throwable0 instanceof InterruptedException)) {
            this.c.c(this.a, 3, v1);
        }
        else {
            this.c.c(this.a, 4, v1);
        }
        fcrb.a.n("Restore job error: jobType=%s, timeElapsedMs=%d", throwable0, new Object[]{this.a, v1});
    }

    @Override  // gmbg
    public final void b(Object object0) {
        long v = this.b.get();
        long v1 = v == 0L ? 0L : System.currentTimeMillis() - v;
        giay giay0 = this.a;
        String s = giay0.name();
        if(((Boolean)object0).booleanValue()) {
            fcrb.a.h("Restore job succeeded: jobType=%s, timeElapsedMs=%d", new Object[]{s, v1});
            this.c.c(giay0, 0, v1);
            return;
        }
        this.c.c(giay0, 4, v1);
        fcrb.a.m("Restore job failed: jobType=%s, timeElapsedMs=%d", new Object[]{s, v1});
    }
}

