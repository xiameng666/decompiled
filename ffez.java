import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public final class ffez implements cjuo {
    public final ffgm a;

    public ffez(ffgm ffgm0) {
        this.a = ffgm0;
    }

    @Override  // cjuo
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ffgm ffgm0 = this.a;
        fflv fflv0 = null;
        if(ffgm0.n != null) {
            ffgm0.k.lock();
            while(!ffgm0.m) {
                try {
                    try {
                        Log.d("WearableService", "onGetService: waiting for onCreate to be completed.");
                        long v = hzzu.a.b().a();
                        if(!ffgm0.l.await(v, TimeUnit.SECONDS)) {
                            Log.e("WearableService", a.D(v, "onGetService: Wearable service onCreate timed out after ", " seconds."));
                            cjtn0.a(8, null);
                            new clht(ffgm0.getApplicationContext().getMainLooper()).post(new fffk());
                            goto label_21;
                        }
                        continue;
                    }
                    catch(InterruptedException interruptedException0) {
                    }
                    Thread.currentThread().interrupt();
                    Log.w("WearableService", "onGetService: interrupted while waiting for onCreate to be completed.", interruptedException0);
                    cjtn0.a(8, null);
                }
                catch(Throwable throwable0) {
                    ffgm0.k.unlock();
                    throw throwable0;
                }
                ffgm0.k.unlock();
                return;
            label_21:
                ffgm0.k.unlock();
                return;
            }
            ffgm0.k.unlock();
        }
        if(ffgm0.e.get()) {
            ffft ffft0 = ffgm0.c(getServiceRequest0.f);
            if(ffft0 == null) {
                cjtn0.a(8, null);
                return;
            }
            ConcurrentHashMap concurrentHashMap0 = ffgm0.j;
            fdpl fdpl0 = ffft0.c;
            WeakReference weakReference0 = (WeakReference)concurrentHashMap0.get(fdpl0);
            fflv fflv1 = weakReference0 == null ? null : ((fflv)weakReference0.get());
            if(fflv1 == null) {
                synchronized(fdpl0) {
                    WeakReference weakReference1 = (WeakReference)concurrentHashMap0.get(fdpl0);
                    if(weakReference1 != null) {
                        fflv0 = (fflv)weakReference1.get();
                    }
                    if(fflv0 == null) {
                        fflv fflv2 = ffgm0.d(ffft0, fdpl0, weakReference1);
                        concurrentHashMap0.put(fdpl0, new WeakReference(fflv2));
                        fflv1 = fflv2;
                    }
                    else {
                        fflv1 = fflv0;
                    }
                }
            }
            cjtn0.c(fflv1);
            return;
        }
        Log.w("WearableService", "onGetService: Wear is not available on this device.");
        cjtn0.a(16, null);
        ffgm0.m();
    }
}

