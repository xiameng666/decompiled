import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ffeg implements ffmj {
    public final Object a;
    public final HashMap b;
    public final ExecutorService c;

    public ffeg() {
        this.a = new Object();
        this.b = new HashMap();
        this.c = new ThreadPoolExecutor(4, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new bbrg("wear", -2));
    }

    public final void a(Object object0, ffee ffee0) {
        synchronized(this.a) {
            HashMap hashMap0 = this.b;
            ffef ffef0 = (ffef)hashMap0.get(object0);
            if(ffef0 == null) {
                ffef0 = new ffef(this, object0);
                hashMap0.put(object0, ffef0);
                this.c.submit(ffef0);
            }
            ArrayDeque arrayDeque0 = ffef0.a;
            arrayDeque0.addLast(ffee0);
            if(Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", ffef0.toString() + " adding a new task, " + arrayDeque0.size() + " total");
            }
        }
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        synchronized(this.a) {
            bbpd0.println("Executor Status:");
            bbpd0.b();
            bbpd0.println("isShutdown: " + this.c.isShutdown());
            bbpd0.println("isTerminated: " + this.c.isTerminated());
            bbpd0.a();
            bbpd0.println("Queued Tasks:");
            bbpd0.b();
            bbpd0.println("numTaskQueues: " + this.b.size());
            bbpd0.b();
            for(Object object1: this.b.entrySet()) {
                ffef ffef0 = (ffef)((Map.Entry)object1).getValue();
                bbpd0.println(((Map.Entry)object1).getKey() + ": " + ffef0.a.size() + " tasks");
            }
            bbpd0.a();
            bbpd0.a();
        }
    }
}

