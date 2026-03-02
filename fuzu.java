import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fuzu implements fwxy {
    private final futh a;
    private final fwyd b;
    private List c;

    public fuzu(futh futh0, fwyd fwyd0) {
        this.a = futh0;
        this.b = fwyd0;
        this.c = new ArrayList();
    }

    @Override  // fwxy
    public final void a() {
        if(huoo.a.b().b() && huoo.c()) {
            this.d(4);
        }
    }

    @Override  // fwxy
    public final void b(fwxx fwxx0) {
        if(huoo.c() && fwxx0.e) {
            this.d(0);
        }
    }

    public final void c(List list0) {
        synchronized(this) {
            this.c = list0;
        }
    }

    private final void d(int v) {
        synchronized(this) {
            long v2 = this.b.c();
            ArrayList arrayList0 = new ArrayList();
            if(fuzu.e(this.c, 0)) {
                arrayList0.add(new ActivityTransitionEvent(22, 0, TimeUnit.MILLISECONDS.toNanos(v2)));
            }
            if(fuzu.e(this.c, 1)) {
                arrayList0.add(new ActivityTransitionEvent(22, 1, TimeUnit.MILLISECONDS.toNanos(v2)));
            }
            if(!arrayList0.isEmpty()) {
                this.a.mO(arrayList0, v);
            }
        }
    }

    private static boolean e(List list0, int v) {
        for(Object object0: list0) {
            ActivityTransition activityTransition0 = (ActivityTransition)object0;
            if(activityTransition0.a == 22 && activityTransition0.b == v) {
                return true;
            }
        }
        return false;
    }
}

