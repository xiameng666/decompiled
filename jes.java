import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public final class jes {
    public final List a;

    public jes(jep[] arr_jep) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(int v1 = 0; v1 < arr_jep.length; ++v1) {
            jep jep0 = arr_jep[v1];
            String s = jep0.a();
            Object object0 = linkedHashMap0.get(s);
            if(object0 == null) {
                object0 = new ArrayList();
                linkedHashMap0.put(s, object0);
            }
            ((List)object0).add(jep0);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: linkedHashMap0.entrySet()) {
            String s1 = (String)((Map.Entry)object1).getKey();
            List list0 = (List)((Map.Entry)object1).getValue();
            if(list0.size() != 1) {
                throw new IllegalArgumentException("\'" + s1 + "\' must be unique. Actual [ [" + ibpo.aK(list0, null, null, null, null, 0x3F) + ']');
            }
            ibpo.D(arrayList0, list0);
            continue;
        }
        ArrayList arrayList1 = new ArrayList(arrayList0);
        this.a = arrayList1;
        int v2 = arrayList1.size();
        for(int v = 0; v < v2; ++v) {
            ((jep)arrayList1.get(v)).c();
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof jes) ? ibuq.m(this.a, ((jes)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

