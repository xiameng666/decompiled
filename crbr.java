import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class crbr implements Application.ActivityLifecycleCallbacks {
    final crbs a;

    public crbr(crbs crbs0) {
        Objects.requireNonNull(crbs0);
        this.a = crbs0;
        super();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        crbk crbk0 = new crbk(this, bundle0, activity0);
        this.a.b(crbk0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        crbq crbq0 = new crbq(this, activity0);
        this.a.b(crbq0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        crbn crbn0 = new crbn(this, activity0);
        this.a.b(crbn0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        crbm crbm0 = new crbm(this, activity0);
        this.a.b(crbm0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        Bundle bundle1 = null;
        crbb crbb0 = new crbb(null);
        crbp crbp0 = new crbp(this, activity0, crbb0);
        this.a.b(crbp0);
        AtomicReference atomicReference0 = crbb0.a;
        synchronized(atomicReference0) {
            if(!crbb0.b) {
                try {
                    atomicReference0.wait(50L);
                }
                catch(InterruptedException unused_ex) {
                    goto label_16;
                }
            }
            bundle1 = (Bundle)crbb0.a.get();
        }
    label_16:
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        crbl crbl0 = new crbl(this, activity0);
        this.a.b(crbl0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        crbo crbo0 = new crbo(this, activity0);
        this.a.b(crbo0);
    }
}

