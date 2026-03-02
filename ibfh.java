import j..util.DesugarCollections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ibfh {
    public static Set a(Map map0, String s) {
        iaph iaph0;
        List list0 = iazm.f(map0, s);
        if(list0 == null) {
            return null;
        }
        EnumSet enumSet0 = EnumSet.noneOf(iaph.class);
        for(Object object0: list0) {
            if((object0 instanceof Double)) {
                int v = ((Double)object0).intValue();
                boolean z = true;
                gfuy.b(Double.compare(v, ((Double)object0).doubleValue()) == 0, "Status code %s is not integral", object0);
                iaph0 = iapk.c(v).t;
                if(iaph0.r != ((Double)object0).intValue()) {
                    z = false;
                }
                gfuy.b(z, "Status code %s is not valid", object0);
                enumSet0.add(iaph0);
                continue;
            }
            if(!(object0 instanceof String)) {
                throw new gfuz("Can not convert status code " + object0 + " to Status.Code, because its type is " + object0.getClass());
            }
            try {
                iaph0 = (iaph)Enum.valueOf(iaph.class, ((String)object0));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new gfuz(a.O(object0, "Status code ", " is not valid"), illegalArgumentException0);
            }
            enumSet0.add(iaph0);
            continue;
        }
        return DesugarCollections.unmodifiableSet(enumSet0);
    }
}

