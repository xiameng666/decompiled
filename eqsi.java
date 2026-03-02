import android.os.SystemClock;
import j..util.Objects;
import java.util.concurrent.Executor;

final class eqsi implements Runnable {
    final eqsl a;

    public eqsi(eqsl eqsl0) {
        Objects.requireNonNull(eqsl0);
        this.a = eqsl0;
        super();
    }

    @Override
    public final void run() {
        try {
            Thread.sleep(500L);
        }
        catch(InterruptedException unused_ex) {
        }
        eqsl eqsl0 = this.a;
        synchronized(eqsl0) {
            if(eqsl0.d) {
                return;
            }
            if(SystemClock.elapsedRealtime() - eqsl0.c > eqsl0.e) {
                Executor executor0 = eqsl0.a;
                if(executor0 == null) {
                    eqsl0.b.a();
                }
                else {
                    executor0.execute(new eqsj(eqsl0));
                }
            }
            else {
                eqsl0.c();
            }
        }
    }
}

