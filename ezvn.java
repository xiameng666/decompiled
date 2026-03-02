import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.BlockingQueue;

final class ezvn extends clil {
    public ezvn() {
        super("ota");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ezum ezum0;
        ((ggtj)ezvo.a.h()).x("Connected to ChimeraSystemUpdateService.");
        Object object0 = ezvo.d;
        synchronized(object0) {
            if(iBinder0 == null) {
                ezum0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.update.ISystemUpdateService");
                ezum0 = (iInterface0 instanceof ezum) ? ((ezum)iInterface0) : new ezuk(iBinder0);
            }
            ezvo.b = ezum0;
            if(ezvo.b == null) {
                ((ggtj)ezvo.a.i()).x("Failed to connect to SystemUpdateService");
                return;
            }
            ezvo.c = true;
            object0.notifyAll();
            while(true) {
                BlockingQueue blockingQueue0 = ezvo.e;
                if(blockingQueue0.isEmpty()) {
                    break;
                }
                try {
                    ((Runnable)blockingQueue0.take()).run();
                }
                catch(InterruptedException unused_ex) {
                    ((ggtj)ezvo.a.i()).x("bindService post connection run is interrupted!");
                    Thread.currentThread().interrupt();
                    break;
                }
                catch(Exception exception0) {
                    a.ae(ezvo.a.i(), "bindService post connection run has exception.", exception0);
                }
            }
        }
        ezxd.a();
        throw null;
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ((ggtj)ezvo.a.h()).x("Unexpectedly disconnected from ChimeraSystemUpdateService.");
        synchronized(ezvo.d) {
            ezvo.b = null;
            ezvo.c = false;
            ezvo.e.clear();
        }
    }
}

