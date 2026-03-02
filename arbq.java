import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import java.util.concurrent.atomic.AtomicLong;

public final class arbq implements glzm {
    public final D2dEarlySourceChimeraService a;

    public arbq(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0) {
        this.a = d2dEarlySourceChimeraService0;
    }

    @Override  // glzm
    public final gmcd a() {
        AtomicLong atomicLong0 = this.a.c;
        synchronized(atomicLong0) {
            while(atomicLong0.get() != 0L) {
                try {
                    D2dEarlySourceChimeraService.a.d("The processing is currently in progress. Waiting for it to finish.", new Object[0]);
                    atomicLong0.wait();
                }
                catch(InterruptedException interruptedException0) {
                    D2dEarlySourceChimeraService.a.f("Interrupted while waiting for processing to finish.", new Object[0]);
                    Thread.currentThread().interrupt();
                    return gmbu.h(interruptedException0);
                }
            }
        }
        return gmbx.a;
    }
}

