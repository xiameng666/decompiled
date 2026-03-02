import android.os.Message;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public final class fdyb {
    public final Map a;
    public final ConcurrentMap b;
    public final fdya c;
    public final ayux d;
    private static final long e;

    static {
        fdyb.e = TimeUnit.SECONDS.toMillis(60L);
    }

    public fdyb() {
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        this.a = concurrentHashMap0;
        ConcurrentHashMap concurrentHashMap1 = new ConcurrentHashMap();
        this.b = concurrentHashMap1;
        this.d = fdob.b().a(fdnv.f);
        this.c = new fdya(concurrentHashMap0, concurrentHashMap1);
    }

    public final void a(int v, ffeq ffeq0) {
        this.a.put(Integer.valueOf(v), ffeq0);
        Message message0 = this.c.obtainMessage(v);
        this.c.sendMessageDelayed(message0, fdyb.e);
    }
}

