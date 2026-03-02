import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class cltl implements Factory {
    public static Map a(Set set0, Map map0) {
        Map map1;
        ibuq.f(set0, "settingsPages");
        if(!map0.isEmpty() && !set0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList(ibpo.q(set0, 10));
            for(Object object0: set0) {
                arrayList0.add(((clsp)object0).b.name());
            }
            throw new IllegalArgumentException("Pages have been provided via both @SettingsPage and @SettingsPageRepository. Prefer using @SettingsPageRepository for all pages.\nThe following pages are not mapped to a repository: " + arrayList0.toString());
        }
        if(map0.isEmpty() && set0.isEmpty()) {
            throw new IllegalArgumentException("No pages provided. At least one page is required.");
        }
        if(map0.isEmpty()) {
            ibnn ibnn0 = cltj.a(set0);
            map1 = ibpz.c(new ibns(clne.b, ibnn0));
        }
        else {
            ggfp ggfp0 = ((ggeo)map0).w();
            ArrayList arrayList1 = new ArrayList(ibpo.q(ggfp0, 10));
            for(Object object1: ggfp0) {
                arrayList1.add(((clne)object1).name());
            }
            ggfp ggfp1 = ((ggeo)map0).v();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(ggfp1, 10)), 16));
            for(Object object2: ggfp1) {
                ibns ibns0 = new ibns(((clne)((Map.Entry)object2).getKey()), cltj.a(((Set)((Map.Entry)object2).getValue())));
                linkedHashMap0.put(ibns0.a, ibns0.b);
            }
            map1 = linkedHashMap0;
        }
        Preconditions.f(map1);
        return map1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        throw null;
    }
}

