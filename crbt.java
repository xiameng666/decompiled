import j..util.Objects;
import java.util.Map;

public final class crbt implements Runnable {
    final String a;
    final long b;
    final crbw c;

    public crbt(crbw crbw0, String s, long v) {
        this.a = s;
        this.b = v;
        Objects.requireNonNull(crbw0);
        this.c = crbw0;
        super();
    }

    @Override
    public final void run() {
        crbw crbw0 = this.c;
        crbw0.m();
        crbw0.n();
        String s = this.a;
        batl.q(s);
        long v = this.b;
        Map map0 = crbw0.b;
        if(map0.isEmpty()) {
            crbw0.c = v;
        }
        Integer integer0 = (Integer)map0.get(s);
        if(integer0 != null) {
            map0.put(s, Integer.valueOf(((int)integer0) + 1));
            return;
        }
        if(((bzs)map0).d_num >= 100) {
            crbw0.aJ().f.a("Too many ads visible");
            return;
        }
        map0.put(s, Integer.valueOf(1));
        crbw0.a.put(s, Long.valueOf(v));
    }
}

