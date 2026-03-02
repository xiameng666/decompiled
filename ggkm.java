import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class ggkm {
    static int a(int v) {
        if(v < 3) {
            ggag.c(v, "expectedSize");
            return v + 1;
        }
        return v >= 0x40000000 ? 0x7FFFFFFF : ((int)Math.ceil(((double)v) / 0.75));
    }

    static gfsi b(ggkc ggkc0) {
        gftb.check(ggkc0);
        return new ggjn(ggkc0);
    }

    public static ggeo c(Map map0) {
        if((map0 instanceof ggdu)) {
            return (ggdu)map0;
        }
        Iterator iterator0 = map0.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return ggnf.a;
        }
        Object object0 = iterator0.next();
        Enum enum0 = (Enum)((Map.Entry)object0).getKey();
        Object object1 = ((Map.Entry)object0).getValue();
        ggag.a(enum0, object1);
        EnumMap enumMap0 = new EnumMap(Collections.singletonMap(enum0, object1));
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            Enum enum1 = (Enum)((Map.Entry)object2).getKey();
            Object object3 = ((Map.Entry)object2).getValue();
            ggag.a(enum1, object3);
            enumMap0.put(enum1, object3);
        }
        switch(enumMap0.size()) {
            case 0: {
                return ggnf.a;
            }
            case 1: {
                Map.Entry map$Entry0 = (Map.Entry)gggq.r(enumMap0.entrySet());
                return ggeo.l(((Enum)map$Entry0.getKey()), map$Entry0.getValue());
            }
            default: {
                return new ggdu(enumMap0);
            }
        }
    }

    public static ggeo d(Collection collection0) {
        ggek ggek0 = new ggek(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            ggek0.i(object0, Integer.valueOf(v));
            ++v;
        }
        return ggek0.b();
    }

    public static ggeo e(Iterable iterable0, gfsi gfsi0) {
        Iterator iterator0 = iterable0.iterator();
        ggek ggek0 = new ggek();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ggek0.i(object0, gfsi0.apply(object0));
        }
        return ggek0.g();
    }

    public static ggeo f(Iterable iterable0, gfsi gfsi0) {
        return (iterable0 instanceof Collection) ? ggkm.q(iterable0.iterator(), gfsi0, ggeo.i(((Collection)iterable0).size())) : ggkm.q(iterable0.iterator(), gfsi0, new ggek());
    }

    static Object g(Map.Entry map$Entry0) {
        return map$Entry0 == null ? null : map$Entry0.getKey();
    }

    static Object h(Map map0, Object object0) {
        gftb.check(map0);
        try {
            return map0.get(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            return null;
        }
    }

    static Object i(Map map0, Object object0) {
        gftb.check(map0);
        try {
            return map0.remove(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            return null;
        }
    }

    public static String j(Map map0) {
        int v = map0.size();
        ggag.c(v, "size");
        StringBuilder stringBuilder0 = new StringBuilder(((int)Math.min(((long)v) * 8L, 0x40000000L)));
        stringBuilder0.append('{');
        boolean z = true;
        for(Object object0: map0.entrySet()) {
            if(!z) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((Map.Entry)object0).getKey());
            stringBuilder0.append('=');
            stringBuilder0.append(((Map.Entry)object0).getValue());
            z = false;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public static HashMap k(int v) {
        return new HashMap(ggkm.a(v));
    }

    static Iterator l(Set set0, gfsi gfsi0) {
        return new ggjr(set0.iterator(), gfsi0);
    }

    public static LinkedHashMap m(int v) {
        return new LinkedHashMap(ggkm.a(v));
    }

    public static Map n(Map map0, gfsi gfsi0) {
        return new ggki(map0, new ggjo(gfsi0));
    }

    public static boolean o(Map map0, Object object0) {
        if(map0 == object0) {
            return true;
        }
        return (object0 instanceof Map) ? map0.entrySet().equals(((Map)object0).entrySet()) : false;
    }

    static boolean p(Map map0, Object object0) {
        gftb.check(map0);
        try {
            return map0.containsKey(object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
            return false;
        }
    }

    private static ggeo q(Iterator iterator0, gfsi gfsi0, ggek ggek0) {
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ggek0.i(gfsi0.apply(object0), object0);
        }
        try {
            return ggek0.b();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException(illegalArgumentException0.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }
}

