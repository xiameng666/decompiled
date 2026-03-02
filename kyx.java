import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class kyx {
    public static final byte[] a(Object object0) {
        ibuq.f(object0, "data");
        if((object0 instanceof Number)) {
            if((object0 instanceof Double)) {
                throw new IllegalArgumentException("Don\'t support doubles yet");
            }
            long v = ((Number)object0).longValue();
            return v < 0L ? kyx.b(1, -1L - v) : kyx.b(0, v);
        }
        if((object0 instanceof byte[])) {
            return ibpg.k(kyx.b(2, ((long)((byte[])object0).length)), ((byte[])object0));
        }
        if((object0 instanceof String)) {
            byte[] arr_b = ibzk.o(((String)object0));
            return ibpg.k(kyx.b(3, ((long)((String)object0).length())), arr_b);
        }
        if((object0 instanceof List)) {
            byte[] arr_b1 = kyx.b(4, ((long)((List)object0).size()));
            for(Object object1: ((List)object0)) {
                ibuq.c(object1);
                arr_b1 = ibpg.k(arr_b1, kyx.a(object1));
            }
            return arr_b1;
        }
        if(!(object0 instanceof Map)) {
            throw new IllegalArgumentException("Bad type");
        }
        byte[] arr_b2 = kyx.b(5, ((long)((Map)object0).size()));
        ibvd ibvd0 = new ibvd();
        ibvd0.a = new LinkedHashMap();
        for(Object object2: ((Map)object0).entrySet()) {
            Map map0 = (Map)ibvd0.a;
            Object object3 = ((Map.Entry)object2).getKey();
            ibuq.c(object3);
            byte[] arr_b3 = kyx.a(object3);
            Object object4 = ((Map.Entry)object2).getValue();
            ibuq.c(object4);
            map0.put(arr_b3, kyx.a(object4));
        }
        ArrayList arrayList0 = new ArrayList(((Map)ibvd0.a).keySet());
        ibpo.ao(arrayList0, new kyw(ibvd0));
        Iterator iterator2 = arrayList0.iterator();
        ibuq.e(iterator2, "iterator(...)");
        while(iterator2.hasNext()) {
            Object object5 = iterator2.next();
            ibuq.e(object5, "next(...)");
            byte[] arr_b4 = ibpg.k(arr_b2, ((byte[])object5));
            Object object6 = ((Map)ibvd0.a).get(((byte[])object5));
            ibuq.c(object6);
            arr_b2 = ibpg.k(arr_b4, ((byte[])object6));
        }
        return arr_b2;
    }

    private static final byte[] b(int v, long v1) {
        if(Long.compare(v1, 24L) < 0) {
            return new byte[]{((byte)((v << 5 | ((int)v1)) & 0xFF))};
        }
        if(Long.compare(v1, 0xFFL) <= 0) {
            return new byte[]{((byte)((v << 5 | 24) & 0xFF)), ((byte)(((int)v1) & 0xFF))};
        }
        if(Long.compare(v1, 0xFFFFL) <= 0) {
            return new byte[]{((byte)((v << 5 | 25) & 0xFF)), ((byte)(((int)v1) >> 8 & 0xFF)), ((byte)(((int)v1) & 0xFF))};
        }
        if(v1 <= 0xFFFFFFFFL) {
            return new byte[]{((byte)((v << 5 | 26) & 0xFF)), ((byte)(((int)v1) >> 24 & 0xFF)), ((byte)(((int)v1) >> 16 & 0xFF)), ((byte)(((int)v1) >> 8 & 0xFF)), ((byte)(((int)v1) & 0xFF))};
        }
        throw new IllegalArgumentException("bad Arg");
    }
}

