import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class azvb implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final azvb a;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public final ArrayList d;
    public boolean e;

    static {
        azvb.a = new azvb();
    }

    private azvb() {
        this.b = new AtomicBoolean();
        this.c = new AtomicBoolean();
        this.d = new ArrayList();
        this.e = false;
    }

    private final void a(boolean z) {
        synchronized(azvb.a) {
            for(Object object0: this.d) {
                ((azxd)object0).a.n.sendMessage(((azxd)object0).a.n.obtainMessage(1, Boolean.valueOf(z)));
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        boolean z = this.b.compareAndSet(true, false);
        this.c.set(true);
        if(z) {
            this.a(false);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        boolean z = this.b.compareAndSet(true, false);
        this.c.set(true);
        if(z) {
            this.a(false);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        if(v == 20 && this.b.compareAndSet(false, true)) {
            this.c.set(true);
            this.a(true);
        }
    }
}

