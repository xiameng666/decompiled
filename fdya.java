import android.os.Looper;
import android.os.Message;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

final class fdya extends clht {
    private final Map a;
    private final ConcurrentMap c;

    public fdya(Map map0, ConcurrentMap concurrentMap0) {
        super(Looper.getMainLooper());
        this.a = map0;
        this.c = concurrentMap0;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        int v = message0.what;
        Integer integer0 = v;
        ffeq ffeq0 = (ffeq)this.a.remove(integer0);
        if(ffeq0 != null) {
            ffeq0.b(v);
        }
        this.c.remove(integer0);
    }
}

