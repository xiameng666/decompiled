import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public abstract class aaw {
    private final List a;
    public boolean b;
    public final CopyOnWriteArrayList c;

    public aaw(boolean z) {
        this.a = new ArrayList();
        this.b = z;
        this.c = new CopyOnWriteArrayList();
    }

    public void a() {
    }

    public abstract void b();

    public void c(zu zu0) {
    }

    public void d(zu zu0) {
    }

    public final nzb e() {
        nzb nzb0 = new aav(this);
        this.a.add(nzb0);
        return nzb0;
    }

    public final void f() {
        Iterator iterator0 = this.c.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            AutoCloseable autoCloseable0 = (AutoCloseable)object0;
            if((autoCloseable0 instanceof AutoCloseable)) {
                autoCloseable0.close();
            }
            else {
                if(!(autoCloseable0 instanceof ExecutorService)) {
                    if((autoCloseable0 instanceof TypedArray)) {
                        ((TypedArray)autoCloseable0).recycle();
                    }
                    else if((autoCloseable0 instanceof MediaMetadataRetriever)) {
                        ((MediaMetadataRetriever)autoCloseable0).release();
                    }
                    else if((autoCloseable0 instanceof MediaDrm)) {
                        ((MediaDrm)autoCloseable0).release();
                    }
                    else if((autoCloseable0 instanceof DrmManagerClient)) {
                        ((DrmManagerClient)autoCloseable0).release();
                    }
                    else {
                        if(!(autoCloseable0 instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient)autoCloseable0).release();
                    }
                    continue;
                }
                ExecutorService executorService0 = (ExecutorService)autoCloseable0;
                if(executorService0 != ForkJoinPool.commonPool() && !executorService0.isTerminated()) {
                    executorService0.shutdown();
                    boolean z1 = false;
                    for(boolean z = false; !z; z = executorService0.awaitTermination(1L, TimeUnit.DAYS)) {
                        try {
                        }
                        catch(InterruptedException unused_ex) {
                            if(!z1) {
                                executorService0.shutdownNow();
                            }
                            z1 = true;
                        }
                    }
                    if(z1) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        this.c.clear();
        List list0 = this.a;
        for(Object object1: list0) {
            ((nzb)object1).e();
        }
        list0.clear();
    }

    public final void g(boolean z) {
        this.b = z;
        for(Object object0: this.a) {
            nzb nzb0 = (nzb)object0;
            if(nzb0.a != z) {
                nzb0.a = z;
                nzc nzc0 = nzb0.b;
                if(nzc0 != null) {
                    nzc0.b.b();
                }
            }
        }
    }
}

