import java.util.Map;

public final class eiyq implements lsk {
    public static final ltw a;
    private final Map b;
    private final lsk c;
    private final lsk d;

    static {
        eiyq.a = new eiyl();
    }

    public eiyq(Map map0, lsk lsk0, eiyf eiyf0) {
        this.b = map0;
        this.c = lsk0;
        this.d = new eiyn(this, eiyf0);
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        return this.b.containsKey(class0) ? lsi.b(class0) : this.c.a(class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        return this.b.containsKey(class0) ? this.d.b(class0, ltx0) : this.c.b(class0, ltx0);
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

