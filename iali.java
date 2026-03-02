import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class iali {
    public static final iali a;
    public final ConcurrentMap b;

    static {
        iali.a = new iali(new ialh[]{new iale(), ialf.a});
    }

    public iali(ialh[] arr_ialh) {
        this.b = new ConcurrentHashMap();
        for(int v = 0; v < 2; ++v) {
            ialh ialh0 = arr_ialh[v];
            String s = ialh0.c();
            this.b.put(s, ialh0);
        }
    }
}

