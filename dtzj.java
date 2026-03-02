import java.util.HashSet;
import java.util.Set;

public final class dtzj {
    public static Set a() {
        HashSet hashSet0 = new HashSet();
        dtzi dtzi0 = dtzi.a;
        hashSet0.add(dtzi0);
        dtzi dtzi1 = dtzi.b;
        hashSet0.add(dtzi1);
        hwrn.e();
        if(hwrn.d()) {
            hashSet0.add(dtzi.c);
        }
        Set set0 = new HashSet();
        if(hashSet0.contains(dtzi0) && hwly.m()) {
            ((HashSet)set0).add(dtzi0);
        }
        if(hashSet0.contains(dtzi1)) {
            hwpi.h();
            if(hwpi.g()) {
                ((HashSet)set0).add(dtzi1);
            }
        }
        dtzi dtzi2 = dtzi.c;
        if(hashSet0.contains(dtzi2)) {
            hwrn.e();
            if(hwrn.c()) {
                ((HashSet)set0).add(dtzi2);
            }
        }
        hashSet0.contains(dtzi.d);
        return set0;
    }
}

