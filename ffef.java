import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import j..util.Objects;
import java.util.ArrayDeque;
import jeb.synthetic.FIN;

final class ffef implements Runnable {
    public final ArrayDeque a;
    final ffeg b;
    private final Object c;

    public ffef(ffeg ffeg0, Object object0) {
        Objects.requireNonNull(ffeg0);
        this.b = ffeg0;
        super();
        this.a = new ArrayDeque();
        this.c = object0;
    }

    @Override
    public final void run() {
        ffee ffee0;
        ArrayDeque arrayDeque0;
        int v;
        Thread thread0 = Thread.currentThread();
        String s = thread0.getName();
        thread0.setName(s + "-" + this.c.toString());
        if(Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", this.toString() + " is starting");
        }
        while(true) {
            synchronized(this.b.a) {
                v = FIN.finallyOpen$NT();
                arrayDeque0 = this.a;
                if(arrayDeque0.isEmpty()) {
                    break;
                }
                ffee0 = (ffee)arrayDeque0.removeFirst();
                FIN.finallyCodeBegin$NT(v);
            }
            FIN.finallyCodeEnd$NT(v);
            try {
                long v1 = SystemClock.elapsedRealtime();
                ffee0.a();
                long v2 = SystemClock.elapsedRealtime();
                if(!Log.isLoggable("WearableService", 2)) {
                    continue;
                }
                long v3 = v1 - ffee0.a;
                long v4 = v2 - v1;
                Log.v("WearableService", String.format("dispatched: %3d ms (%3d + %3d), %2d remaining, %40s, %s", ((long)(v3 + v4)), v3, v4, arrayDeque0.size(), this.c, ffee0.b));
                continue;
            }
            catch(RemoteException unused_ex) {
                continue;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
            Log.w("WearableService", "Failure while dispatching " + ffee0, exception0);
            continue;
        label_26:
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", "Failure on unexpected exception. ", throwable0);
            }
            thread0.getThreadGroup().uncaughtException(thread0, throwable0);
        }
        if(Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", this.toString() + " has no more tasks, removing");
        }
        this.b.b.remove(this.c);
        thread0.setName(s);
        FIN.finallyExec$NT(v);
    }

    @Override
    public final String toString() {
        return "WorkQueueRunnable[" + this.hashCode() + ", " + this.c.toString() + "]";
    }
}

