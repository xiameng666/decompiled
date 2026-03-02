import android.os.Handler.Callback;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import j..util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class gylp implements Handler.Callback {
    final gylu a;

    public gylp(gylu gylu0) {
        Objects.requireNonNull(gylu0);
        this.a = gylu0;
        super();
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        gylu gylu0 = this.a;
        if(gylu0.i()) {
            return false;
        }
        switch(message0.what) {
            case 1: {
                AtomicBoolean atomicBoolean0 = gylu0.h;
                if(atomicBoolean0 != null) {
                    atomicBoolean0.set(true);
                }
                gylu0.g = SystemClock.elapsedRealtime();
                SparseArray sparseArray0 = gylu0.a;
                synchronized(sparseArray0) {
                    int v2 = sparseArray0.size();
                    for(int v = 0; v < v2; ++v) {
                        sparseArray0.keyAt(v);
                        ((gykk)sparseArray0.valueAt(v)).b();
                    }
                    ExecutorService executorService0 = gylu0.d;
                    if(executorService0 != null) {
                        executorService0.shutdownNow();
                    }
                    if(executorService0 != null) {
                        try {
                            executorService0.awaitTermination(5L, TimeUnit.SECONDS);
                        }
                        catch(InterruptedException unused_ex) {
                        }
                    }
                    gylu gylu1 = this.a;
                    gxuf gxuf0 = gylu1.c;
                    if(gxuf0 != null) {
                        gxum gxum0 = gylu1.j;
                        if(gxum0 != null) {
                            gxuf0.f(gxum0);
                        }
                    }
                }
                return true;
            }
            case 2: {
                gykk gykk0 = (gykk)message0.obj;
                if(gylu0.h != null && !gylu0.h.get()) {
                    gykk0.c();
                    return true;
                }
                gylu0.f(Integer.valueOf(gykk0.k));
                return true;
            }
            case 3: {
                ((gykk)message0.obj).b();
                return true;
            }
            case 4: 
            case 5: {
                ((gykm)message0.obj).a();
                return true;
            }
            default: {
                throw new RuntimeException(a.aG(message0, "NearbyDirectService Unknown message type: "));
            }
        }
    }
}

