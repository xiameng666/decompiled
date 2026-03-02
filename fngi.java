import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class fngi implements ComponentCallbacks2 {
    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        fngs.a.clear();
        fngs.b.clear();
    }
}

