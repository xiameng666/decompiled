import android.app.Application;
import android.content.Context;

@ibnh
public final class forb {
    public final fore a;

    public forb(Context context0, fore fore0) {
        this.a = fore0;
        Application application0 = (Application)context0;
        application0.registerActivityLifecycleCallbacks(fore0.a);
        application0.registerComponentCallbacks(fore0.a);
    }

    public final void a(fora fora0) {
        gftb.check(fora0);
        this.a.a.a.add(fora0);
    }

    public final void b(fora fora0) {
        this.a.a.a.remove(fora0);
    }
}

