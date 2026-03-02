import android.os.SystemClock;
import com.android.volley.VolleyLog;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.FIN;

public final class spw {
    public static final boolean a;
    private final List b;
    private boolean c;

    static {
        spw.a = VolleyLog.DEBUG;
    }

    public spw() {
        this.b = new ArrayList();
        this.c = false;
    }

    public final void a(String s, long v) {
        __monitor_enter(this);
        int v1 = FIN.finallyOpen$NT();
        if(!this.c) {
            spv spv0 = new spv(s, v, SystemClock.elapsedRealtime());
            this.b.add(spv0);
            FIN.finallyCodeBegin$NT(v1);
            return;
        }
        throw new IllegalStateException("Marker added to finished log");
    }

    public final void b(String s) {
        long v1;
        synchronized(this) {
            this.c = true;
            List list0 = this.b;
            if(list0.size() == 0) {
                v1 = 0L;
            }
            else {
                long v2 = ((spv)list0.get(0)).c;
                v1 = ((spv)list0.get(list0.size() - 1)).c - v2;
            }
            if(v1 > 0L) {
                long v3 = ((spv)list0.get(0)).c;
                VolleyLog.d("(%-4d ms) %s", new Object[]{v1, s});
                for(Object object0: list0) {
                    VolleyLog.d("(+%-4d) [%2d] %s", new Object[]{((long)(((spv)object0).c - v3)), ((long)((spv)object0).b), ((spv)object0).a});
                    v3 = ((spv)object0).c;
                }
            }
        }
    }

    @Override
    protected final void finalize() {
        if(!this.c) {
            this.b("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}

