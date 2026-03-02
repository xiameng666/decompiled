import android.os.Build.VERSION;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ava {
    public static final bjr a;
    private static final Map b;
    private static final Map c;

    static {
        Class class0 = Long.TYPE;
        ibuq.c(class0);
        ava.a = new bjr("camera2.streamSpec.streamUseCase", class0, null);
        ibqu ibqu0 = new ibqu();
        Long long0 = (long)3L;
        Long long1 = (long)4L;
        if(Build.VERSION.SDK_INT >= 33) {
            ibqu0.put(long1, ibqg.c(new bne[]{bne.b, bne.f, bne.c}));
            ibqu0.put(Long.valueOf(1L), ibqg.c(new bne[]{bne.b, bne.f, bne.c}));
            ibqu0.put(Long.valueOf(2L), ibqg.b(bne.a));
            ibqu0.put(long0, ibqg.b(bne.d));
        }
        ava.b = ibpz.b(ibqu0);
        ibqu ibqu1 = new ibqu();
        if(Build.VERSION.SDK_INT >= 33) {
            ibqu1.put(long1, ibqg.c(new bne[]{bne.b, bne.a, bne.d}));
            ibqu1.put(long0, ibqg.c(new bne[]{bne.b, bne.d}));
        }
        ava.c = ibpz.b(ibqu1);
    }

    public static final bjt a(bjt bjt0, Long long0) {
        bjr bjr0 = ava.a;
        if(blq.g(((blr)bjt0), bjr0) && ibuq.m(blq.b(((blr)bjt0), bjr0), long0)) {
            return null;
        }
        blb blb0 = blb.b(bjt0);
        blb0.c(bjr0, long0);
        return new ant(blb0);
    }

    public static final boolean b(bne bne0, long v, List list0) {
        if(Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if(bne0 == bne.e) {
            Map map0 = ava.c;
            Long long0 = v;
            if(!map0.containsKey(long0)) {
                return false;
            }
            Object object0 = map0.get(long0);
            ibuq.c(object0);
            if(list0.size() != ((Set)object0).size()) {
                return false;
            }
            for(Object object1: list0) {
                if(!((Set)object0).contains(((bne)object1))) {
                    return false;
                }
            }
            return true;
        }
        Map map1 = ava.b;
        Long long1 = v;
        if(map1.containsKey(long1)) {
            Object object2 = map1.get(long1);
            ibuq.c(object2);
            return ((Set)object2).contains(bne0);
        }
        return false;
    }

    public static final boolean c(bjt bjt0, bne bne0) {
        Object object0 = bjt0.m(bnc.w, Boolean.valueOf(false));
        ibuq.c(object0);
        if(((Boolean)object0).booleanValue()) {
            return false;
        }
        bjr bjr0 = bkk.a;
        if(!bjt0.s(bjr0)) {
            return false;
        }
        Object object1 = bjt0.l(bjr0);
        ibuq.c(object1);
        return avv.a(bne0, ((Number)object1).intValue()) == 5;
    }

    public static final void d() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}

