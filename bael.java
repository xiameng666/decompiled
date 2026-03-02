import android.content.Context;
import com.google.android.gms.chimera.modules.container.core.AppContextProvider;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class bael implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Context context0 = AppContextProvider.a();
        ibuq.f(context0, "context");
        ibuq.f(((abzl)object0), "storage");
        hfuo hfuo0 = ((abzl)object0).b;
        ibuq.e(hfuo0, "getFixProposalList(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
        for(Object object1: hfuo0) {
            abzf abzf0 = ((abzk)object1).d;
            if(abzf0 == null) {
                abzf0 = abzf.a;
            }
            linkedHashMap0.put(abzf0.e, object1);
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        for(Object object2: linkedHashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object2;
            abzk abzk0 = (abzk)map$Entry0.getValue();
            ibuq.c(abzk0);
            if(!baey.a(abzk0)) {
                linkedHashMap1.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for(Object object3: houk.a.b().a().c) {
            ibuq.c(((abze)object3));
            baey.b(((abze)object3), null, context0, linkedHashMap1, linkedHashMap2, linkedHashMap3);
        }
        return baey.c(linkedHashMap1, linkedHashMap3);
    }
}

