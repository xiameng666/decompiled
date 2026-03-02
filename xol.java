import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class xol implements Application.ActivityLifecycleCallbacks {
    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        ibuq.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        ibuq.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        ibuq.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity0, Bundle bundle0) {
        ibuq.f(activity0, "activity");
        xok.a(activity0, lpe.ON_CREATE);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity0) {
        ibuq.f(activity0, "activity");
        xok.a(activity0, lpe.ON_RESUME);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity0) {
        ibuq.f(activity0, "activity");
        xok.a(activity0, lpe.ON_START);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity0) {
        ibuq.f(activity0, "activity");
        xok.a(activity0, lpe.ON_DESTROY);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity0) {
        ibuq.f(activity0, "activity");
        xok.a(activity0, lpe.ON_PAUSE);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPreStopped(Activity activity0) {
        ibuq.f(activity0, "activity");
        xok.a(activity0, lpe.ON_STOP);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        ibuq.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        ibuq.f(activity0, "activity");
        ibuq.f(bundle0, "bundle");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        ibuq.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        ibuq.f(activity0, "activity");
    }
}

