import j..util.Collection.-EL;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class azgn implements azgf {
    public final ggfp a;
    private final azgf b;

    private azgn(azgf azgf0, ggfp ggfp0) {
        this.b = azgf0;
        this.a = ggfp0;
    }

    public static azgf a(azgf azgf0, Set set0) {
        return new azgn(azgf0, ggfp.G(set0));
    }

    @Override  // azgf
    public final azfx f(long v, azgl azgl0) {
        return this.b.f(v, azgl0);
    }

    @Override  // azgf
    public final Map n(gged_interceptors gged0) {
        ggek ggek0 = new ggek();
        for(Object object0: this.b.n(gged0).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            gged_interceptors gged1 = (gged_interceptors)Collection.-EL.stream(((Collection)map$Entry0.getValue())).filter(new azgm(this)).collect(ggaf.a);
            if(!gged1.isEmpty()) {
                ggek0.i(((hlsi)map$Entry0.getKey()), gged1);
            }
        }
        return ggek0.b();
    }

    @Override  // azgf
    public final void p(Collection collection0) {
        this.b.p(collection0);
    }
}

