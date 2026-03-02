import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class nrj {
    public static final List a(Map map0, ibts ibts0) {
        ibuq.f(map0, "<this>");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            nrh nrh0 = (nrh)map$Entry0.getValue();
            Boolean boolean0 = nrh0 == null ? null : Boolean.valueOf(nrh0.b);
            ibuq.c(boolean0);
            if(!boolean0.booleanValue() && !nrh0.c) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        Set set0 = linkedHashMap0.keySet();
        List list0 = new ArrayList();
        for(Object object1: set0) {
            if(((Boolean)ibts0.a(((String)object1))).booleanValue()) {
                list0.add(object1);
            }
        }
        return list0;
    }
}

