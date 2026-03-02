package j$.time.format;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class z {
    public final Map a;
    public final HashMap b;

    public z(Map map0) {
        this.a = map0;
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            HashMap hashMap1 = new HashMap();
            for(Object object1: ((Map)((Map.Entry)object0).getValue()).entrySet()) {
                hashMap1.put(((String)((Map.Entry)object1).getValue()), new AbstractMap.SimpleImmutableEntry(((String)((Map.Entry)object1).getValue()), ((Long)((Map.Entry)object1).getKey())));
            }
            ArrayList arrayList1 = new ArrayList(hashMap1.values());
            Collections.sort(arrayList1, a0.b);
            hashMap0.put(((TextStyle)((Map.Entry)object0).getKey()), arrayList1);
            arrayList0.addAll(arrayList1);
            hashMap0.put(null, arrayList0);
        }
        Collections.sort(arrayList0, a0.b);
        this.b = hashMap0;
    }

    public final String a(long v, TextStyle textStyle0) {
        Map map0 = (Map)this.a.get(textStyle0);
        return map0 == null ? null : ((String)map0.get(Long.valueOf(v)));
    }
}

