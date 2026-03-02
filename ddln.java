import android.util.ArrayMap;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public final class ddln {
    public final bbng a;
    public final ScheduledExecutorService b;
    public final Map c;
    public final Map d;
    public int e;
    public int f;
    public dbzq g;
    public dccr h;

    public ddln() {
        this.a = bbnk.a;
        this.b = cuui.f();
        this.c = new ArrayMap();
        this.d = new ArrayMap();
        this.e = 100;
        this.f = (int)hvqs.aj();
    }

    public final ddll a(ShareTarget shareTarget0) {
        Map map0 = this.c;
        ddll ddll0 = (ddll)map0.get(shareTarget0);
        if(ddll0 == null) {
            ddll0 = new ddll();
            map0.put(shareTarget0, ddll0);
        }
        return ddll0;
    }

    public final void b(ShareTarget shareTarget0) {
        cumn cumn0 = (cumn)this.d.remove(shareTarget0);
        if(cumn0 != null) {
            cumn0.b();
        }
    }
}

