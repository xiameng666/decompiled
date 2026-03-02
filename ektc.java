import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class ektc {
    public final Object a;
    public final bxd b;
    public final eksf c;
    public final Looper d;
    public final ScheduledExecutorService e;
    public final bbic f;

    public ektc(eksf eksf0, Looper looper0) {
        this.a = new Object();
        this.b = new bxd();
        this.e = new bbll(1, 10);
        this.c = eksf0;
        this.d = looper0;
        this.f = bbic.a();
    }

    public final void a(eksz eksz0) {
        synchronized(this.a) {
            Context context0 = this.c.a(0);
            if(context0 == null) {
                Log.e("NetworkScheduler.TED", "Unable to get context for " + eksz0.b.c.toString());
                return;
            }
            this.b.remove(eksz0.b);
            if(!eksz0.f) {
                eksz0.f = true;
                List list0 = eksz0.a;
                for(Object object1: list0) {
                    ektb ektb0 = (ektb)object1;
                    if(!ektb0.a.c(Integer.valueOf(0x800))) {
                        ektb0.b.l(1);
                    }
                }
                list0.clear();
                eksz0.i(context0);
            }
        }
    }
}

