import java.util.Map;

public final class bvxp {
    private final Map a;

    public bvxp(Map map0) {
        ibuq.f(map0, "elementBinderFactories");
        super();
        this.a = map0;
    }

    public final bvxo a(hgmq hgmq0) {
        ibuq.f(hgmq0, "element");
        bvxn bvxn0 = (bvxn)this.a.get(hgmp.a(hgmq0.e));
        return bvxn0 == null ? null : bvxn0.a(hgmq0);
    }
}

