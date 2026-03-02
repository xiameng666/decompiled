import java.util.Collection;

public final class aohf implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Collection collection0 = (Collection)object0;
        if(collection0.isEmpty()) {
            return gfqx.a;
        }
        try {
            Object object1 = collection0.iterator().next();
            aogb aogb0 = ((aogc)((fksc)object1).a()).b;
            if(aogb0 == null) {
                aogb0 = aogb.a;
            }
            return gfsx.m(aogb0);
        }
        catch(fkru fkru0) {
            a.ae(aohg.a.i(), "MoonLander data is missing.", fkru0);
            return gfqx.a;
        }
    }
}

