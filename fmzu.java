import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public final class fmzu implements Closeable {
    private static final fnaa a;
    private static final Map b;
    private static fmzu c;
    private final Context d;
    private final Map e;
    private final cbzh f;
    private int g;

    static {
        fmzu.a = fmzv.a("AndroidLearningContext");
        fmzu.b = new HashMap();
    }

    private fmzu(Context context0) {
        this.e = new HashMap();
        this.d = context0;
        ++this.g;
        cbzh cbzh0 = (cbzh)this.c(cbzh.class);
        this.f = cbzh0;
        cbzh0.b(804);
        cbzh0.b(802);
    }

    public final Context a() {
        synchronized(fmzu.class) {
            gftb.r(this.g > 0, "#getContext() called after #close()");
        }
        return this.d;
    }

    public static fmzu b(Context context0) {
        synchronized(fmzu.class) {
            gftb.check(context0);
            fmzu fmzu0 = fmzu.c;
            if(fmzu0 == null) {
                fmzu.c = new fmzu(context0.getApplicationContext());
            }
            else {
                fmzu0.d();
            }
        }
        return fmzu.c;
    }

    public final Object c(Class class0) {
        Object object0;
        synchronized(fmzu.class) {
            gftb.r(this.g > 0, "#getComponent() called after #close()");
            Map map0 = this.e;
            object0 = map0.get(class0);
            if(object0 == null) {
                gfsi gfsi0 = (gfsi)fmzu.b.get(class0);
                if(gfsi0 != null) {
                    object0 = gfsi0.apply(this);
                    map0.put(class0, object0);
                    return class0.cast(object0);
                }
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException(a.ab(class0, "requested component type not registered: "));
                fmzu.a.f(illegalArgumentException0, "cannot retrieve component");
                throw illegalArgumentException0;
            }
        }
        return class0.cast(object0);
    }

    @Override
    public final void close() {
        synchronized(fmzu.class) {
            if(this.g <= 0) {
                fmzu.a.e("close() called too many times!");
                this.f.c(901);
                return;
            }
            cbzh cbzh0 = this.f;
            cbzh0.b(803);
            try {
                if(this.g == 1) {
                    cbzh0.b(805);
                    try {
                        for(Object object0: this.e.values()) {
                            if((object0 instanceof AutoCloseable)) {
                                goto label_18;
                            }
                            continue;
                            try {
                            label_18:
                                if((((AutoCloseable)object0) instanceof AutoCloseable)) {
                                    ((AutoCloseable)object0).close();
                                }
                                else if((((AutoCloseable)object0) instanceof ExecutorService)) {
                                    ExecutorService executorService0 = (ExecutorService)(((AutoCloseable)object0));
                                    if(executorService0 == ForkJoinPool.commonPool() || executorService0.isTerminated()) {
                                        continue;
                                    }
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
                                    if(!z1) {
                                        continue;
                                    }
                                    Thread.currentThread().interrupt();
                                }
                                else if((((AutoCloseable)object0) instanceof TypedArray)) {
                                    ((TypedArray)(((AutoCloseable)object0))).recycle();
                                }
                                else if((((AutoCloseable)object0) instanceof MediaMetadataRetriever)) {
                                    ((MediaMetadataRetriever)(((AutoCloseable)object0))).release();
                                }
                                else if((((AutoCloseable)object0) instanceof MediaDrm)) {
                                    ((MediaDrm)(((AutoCloseable)object0))).release();
                                }
                                else if((((AutoCloseable)object0) instanceof DrmManagerClient)) {
                                    ((DrmManagerClient)(((AutoCloseable)object0))).release();
                                }
                                else {
                                    if(!(((AutoCloseable)object0) instanceof ContentProviderClient)) {
                                        throw new IllegalArgumentException();
                                    }
                                    ((ContentProviderClient)(((AutoCloseable)object0))).release();
                                }
                            }
                            catch(Exception exception0) {
                                fmzu.a.f(exception0, "Cannot close component instance, ignored.");
                            }
                        }
                    }
                    finally {
                        this.e.clear();
                        fmzu.c = null;
                    }
                }
            }
            finally {
                --this.g;
            }
        }
    }

    public final void d() {
        synchronized(fmzu.class) {
            ++this.g;
            ((cbzh)this.c(cbzh.class)).b(802);
        }
    }

    public static void e(Class class0, gfsi gfsi0) {
        synchronized(fmzu.class) {
            fmzu.b.put(class0, gfsi0);
        }
    }
}

