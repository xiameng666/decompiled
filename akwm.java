import android.util.Base64;
import java.util.Iterator;
import java.util.List;

public final class akwm {
    public static final baun a;

    static {
        akwm.a = new baun("ProximityAuth", new String[]{"EidGenerator"});
    }

    public static final akwl a(List list0, long v) {
        alhc alhc0;
        aliu aliu0 = new aliu();
        long v1 = System.currentTimeMillis();
        batl.b(list0 != null);
        Iterator iterator0 = list0.iterator();
        while(true) {
            while(true) {
                alhc0 = null;
                if(!iterator0.hasNext()) {
                    goto label_17;
                }
                Object object0 = iterator0.next();
                alhc0 = (alhc)object0;
                if(!alhc0.h() || !alhc0.j() || !alhc0.i()) {
                    akwm.a.m("Seed is missing crucial data; skipping.", new Object[0]);
                }
                else if((alhc0.c() - alhc0.d()) % v != 0L) {
                    Object[] arr_object = {alhc0.g()};
                    akwm.a.m("Seed has period length which is not an multiple of the rotation length. Seed: %s", arr_object);
                }
                else if(alhc0.d() <= v1 && v1 < alhc0.c()) {
                    break;
                }
            }
            break;
        label_17:
            break;
        }
        if(alhc0 == null) {
            aliu0.y(1);
            return null;
        }
        for(long v2 = alhc0.d(); v2 <= alhc0.c(); v2 = v3) {
            long v3 = v2 + v;
            if(v2 <= v1 && v1 < v3) {
                hpyn.a.d().h();
                aliu0.y(0);
                return new akwl(v2, v3);
            }
        }
        aliu0.y(3);
        throw new RuntimeException(String.format("Could not find valid EID period. startOfPeriodMs: %s, endOfPeriodMs: %s", alhc0.d(), alhc0.c()));
    }

    public static final akwj b(List list0, long v, long v1, byte[] arr_b) {
        byte[] arr_b1 = null;
        aliu aliu0 = new aliu();
        for(Object object0: list0) {
            alhc alhc0 = (alhc)object0;
            if(alhc0.h() && alhc0.j() && alhc0.i() && alhc0.d() <= v && v < alhc0.c()) {
                String s = alhc0.g();
                try {
                    arr_b1 = Base64.decode(s, 8);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    akwm.a.n("Unable to parse beacon seed.", illegalArgumentException0, new Object[0]);
                }
                break;
            }
        }
        if(arr_b1 == null) {
            akwm.a.m("Unable to get EID seed for device. Timestamp: %s.", new Object[]{v});
            aliu0.w(1);
            return null;
        }
        byte[] arr_b2 = akwk.a(arr_b1, v, arr_b);
        if(arr_b2 == null) {
            akwm.a.m("Fatal error generating EID data. eidSeed: %s, startOfPeriodMs: %s, endOfPeriodMs: %s, extraEntropy: %s", new Object[]{arr_b1, v, v1, arr_b});
            aliu0.w(2);
            return null;
        }
        aliu0.w(0);
        return new akwj(arr_b2, v, v1);
    }

    public static final akwj c(List list0, long v, long v1) {
        return akwm.b(list0, v, v1, null);
    }
}

