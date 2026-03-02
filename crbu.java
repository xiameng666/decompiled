import j..util.Objects;
import java.util.Map;

public final class crbu implements Runnable {
    final String a;
    final long b;
    final crbw c;

    public crbu(crbw crbw0, String s, long v) {
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
        Map map0 = crbw0.b;
        Integer integer0 = (Integer)map0.get(s);
        if(integer0 != null) {
            crns crns0 = crbw0.j().s();
            int v = ((int)integer0) - 1;
            if(v == 0) {
                long v1 = this.b;
                map0.remove(s);
                Map map1 = crbw0.a;
                Long long0 = (Long)map1.get(s);
                if(long0 == null) {
                    crbw0.aJ().c.a("First ad unit exposure time was never set");
                }
                else {
                    map1.remove(s);
                    crbw0.b(s, v1 - ((long)long0), crns0);
                }
                if(map0.isEmpty()) {
                    long v2 = crbw0.c;
                    if(v2 == 0L) {
                        crbw0.aJ().c.a("First ad exposure time was never set");
                        return;
                    }
                    crbw0.a(v1 - v2, crns0);
                    crbw0.c = 0L;
                }
                return;
            }
            map0.put(s, Integer.valueOf(v));
            return;
        }
        crbw0.aJ().c.b("Call to endAdUnitExposure for unknown ad unit id", s);
    }
}

