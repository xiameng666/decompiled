import j..util.Collection.-EL;
import j..util.DesugarCollections;
import java.util.Map.Entry;

public final class endx implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggek ggek0 = new ggek();
        for(Object object1: DesugarCollections.unmodifiableMap(((enxq)object0).b).entrySet()) {
            ggek0.i(((String)((Map.Entry)object1).getKey()), ((gged_interceptors)Collection.-EL.stream(((enxs)((Map.Entry)object1).getValue()).b).map(new enek()).collect(ggaf.a)));
        }
        return ggek0.b();
    }
}

