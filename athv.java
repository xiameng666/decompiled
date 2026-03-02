import j..util.Optional;
import java.util.Map;

public final class athv {
    private final ggeo a;

    private athv(Map map0) {
        this.a = ggeo.k(map0);
    }

    public static athv a(arad arad0) {
        ggek ggek0 = new ggek();
        long v = 0L;
        for(Object object0: arad0.c) {
            arao arao0 = (arao)object0;
            ggek0.i(new athu(arao0.c.toByteArray()), ((arao0.b & 4) == 0 ? atlc.c(v, arao0.d) : new atlc(v, arao0.d, Optional.of(Integer.valueOf(arao0.e)))));
            v += (long)arao0.d;
        }
        return new athv(ggek0.b());
    }

    public final atlc b(athu athu0) {
        return (atlc)this.a.get(athu0);
    }

    public final boolean c(athu athu0) {
        return this.a.containsKey(athu0);
    }
}

