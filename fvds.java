import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public final class fvds {
    public ggeo a;
    public fvgr b;
    public boolean c;
    private final fvjc d;

    public fvds(fvjc fvjc0) {
        this.c = true;
        this.d = fvjc0;
    }

    public final boolean a() {
        if(!this.c) {
            return true;
        }
        ggeo ggeo0 = this.a;
        if(ggeo0 == null) {
            return false;
        }
        HashMap hashMap0 = new HashMap();
        ggqj ggqj0 = ggeo0.w().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            fveo fveo0 = (fveo)object0;
            fvgb fvgb0 = (fvgb)ggeo0.get(fveo0);
            gftb.z(fvgb0, "The values in this map should never be populated with null.");
            if(!Double.isNaN(fvgb0.c) && (fvgb0.a.b != null && fvgb0.a.e != null && (fvgb0.b != null && fvgb0.b.a != null) && (!Double.isNaN(fvgb0.e.d) && !Double.isNaN(fvgb0.e.e) && !Double.isNaN(fvgb0.e.c) && !Float.isNaN(fvgb0.a.j)))) {
                hashMap0.put(fveo0, fvgb0);
            }
        }
        if(hashMap0.isEmpty()) {
            return false;
        }
        fvjc fvjc0 = this.d;
        Iterator iterator0 = fvjc0.b().iterator();
        while(true) {
            double f = 0.0;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            fveo fveo1 = (fveo)object1;
            fvgb fvgb1 = (fvgb)hashMap0.get(fveo1);
            if(fvgb1 == null) {
                f = 149.896225;
            }
            fvjc0.f(fveo1, f);
            fvjc0.h(fveo1, fvgb1 != null && fvgb1.a.a());
            if(fvgb1 != null) {
                fvgk fvgk0 = fvgb1.b;
                if(fvgk0 != null) {
                    fvjc0.g(fveo1, fvds.b(fvgk0.a, this.b, fveo1.b()));
                    fvjc0.e(fveo1, fvgb1.a());
                    continue;
                }
            }
            fvjc0.i(fveo1);
        }
        for(Object object2: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object2;
            fveo fveo2 = (fveo)map$Entry0.getKey();
            if(((fvix)fvjc0.a.get(fveo2)) == null) {
                fvgb fvgb2 = (fvgb)map$Entry0.getValue();
                fvjc0.c(new fvix(fveo2.b(), fveo2.b, ((float)fveo2.a())));
                fvjc0.f(fveo2, 0.0);
                fvjc0.h(fveo2, fvgb2.a.a());
                fvjc0.g(fveo2, fvds.b(fvgb2.b.a, this.b, fveo2.b()));
                fvjc0.e(fveo2, fvgb2.a());
            }
        }
        this.c = false;
        return true;
    }

    private static fvgr b(fvgr fvgr0, fvgr fvgr1, int v) {
        return fvih.b(fvgr0, fvih.a(fvgr0, fvgr1, v), v);
    }
}

