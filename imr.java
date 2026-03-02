import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map.Entry;

public final class imr implements ComponentCallbacks2 {
    final Configuration a;
    final isl b;

    public imr(Configuration configuration0, isl isl0) {
        this.a = configuration0;
        this.b = isl0;
        super();
    }

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
        Configuration configuration1 = this.a;
        int v = configuration1.updateFrom(configuration0);
        Iterator iterator0 = this.b.a.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            isj isj0 = (isj)((WeakReference)((Map.Entry)object0).getValue()).get();
            if(isj0 == null || Configuration.needNewResources(v, isj0.b)) {
                iterator0.remove();
            }
        }
        configuration1.setTo(configuration0);
    }

    @Override  // android.content.ComponentCallbacks
    @ibni
    public final void onLowMemory() {
        this.b.a();
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        this.b.a();
    }
}

