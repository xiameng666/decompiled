import j..util.DesugarCollections;
import java.util.Map.Entry;

public final class aiyv implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = Boolean.valueOf(false);
        if(((ajbz)object0) == null) {
            ((ggtj)aizo.a.i()).x("No block data on device!");
            return object1;
        }
        if(aizo.p(((ajbz)object0))) {
            ((ggtj)aizo.a.h()).x("The device has none-empty cloud backup, thus forcing a Cloud backup.");
            return Boolean.valueOf(true);
        }
        for(Object object2: DesugarCollections.unmodifiableMap(((ajbz)object0).g).entrySet()) {
            ajbo ajbo0 = ((ajbp)((Map.Entry)object2).getValue()).e;
            if(ajbo0 == null) {
                ajbo0 = ajbo.a;
            }
            if(ajbo0.c) {
                return Boolean.valueOf(true);
            }
        }
        for(Object object3: DesugarCollections.unmodifiableMap(((ajbz)object0).e).values()) {
            for(Object object4: DesugarCollections.unmodifiableMap(((ajbw)object3).c).values()) {
                ajbp ajbp0 = ((ajbr)object4).d;
                if(ajbp0 == null) {
                    ajbp0 = ajbp.a;
                }
                if((ajbp0.e == null ? ajbo.a : ajbp0.e).c) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return object1;
    }
}

