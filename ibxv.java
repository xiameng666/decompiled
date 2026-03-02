import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ibxv {
    public static final Iterator a(ibtw ibtw0) {
        Iterator iterator0 = new ibxs();
        iterator0.a = ibsc.b(ibtw0, iterator0, ((ibrl)iterator0));
        return iterator0;
    }

    public static ibxr b(Iterator iterator0) {
        ibuq.f(iterator0, "<this>");
        return ibxv.c(new ibyb(iterator0));
    }

    public static ibxr c(ibxr ibxr0) {
        return (ibxr0 instanceof ibxe) ? ibxr0 : new ibxe(ibxr0);
    }

    public static ibxr d(ibxr ibxr0, ibts ibts0) {
        return (ibxr0 instanceof ibym) ? new ibxo(((ibym)ibxr0).a, ((ibym)ibxr0).b, ibts0) : new ibxo(ibxr0, new ibya(), ibts0);
    }

    public static ibxr e(ibth ibth0) {
        return ibxv.c(new ibxq(ibth0, new ibxx(ibth0)));
    }

    public static ibxr f(Object object0, ibts ibts0) {
        return object0 == null ? ibxk.a : new ibxq(new ibxw(object0), ibts0);
    }

    public static int g(ibxr ibxr0) {
        int v = 0;
        ibyl ibyl0 = new ibyl(((ibym)ibxr0));
        while(ibyl0.hasNext()) {
            Object object0 = ibyl0.next();
            v += ((Number)object0).intValue();
        }
        return v;
    }

    public static Comparable h(ibxr ibxr0) {
        Iterator iterator0 = ibxr0.a();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        Comparable comparable0 = (Comparable)object0;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Comparable comparable1 = (Comparable)object1;
            if(comparable0.compareTo(comparable1) < 0) {
                comparable0 = comparable1;
            }
        }
        return comparable0;
    }

    public static Object i(ibxr ibxr0) {
        Iterator iterator0 = ibxr0.a();
        return !iterator0.hasNext() ? null : iterator0.next();
    }

    public static List j(ibxr ibxr0) {
        Iterator iterator0 = ibxr0.a();
        if(!iterator0.hasNext()) {
            return ibps.a;
        }
        Object object0 = iterator0.next();
        if(!iterator0.hasNext()) {
            return ibpo.b(object0);
        }
        List list0 = new ArrayList();
        ((ArrayList)list0).add(object0);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            ((ArrayList)list0).add(object1);
        }
        return list0;
    }

    public static ibxr k(ibxr ibxr0) {
        return new ibxm(ibxr0, false, new ibyc());
    }

    public static ibxr l(ibxr ibxr0, ibts ibts0) {
        return ibxv.k(new ibym(ibxr0, ibts0));
    }

    public static String m(ibxr ibxr0, CharSequence charSequence0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("");
        int v = 0;
        Iterator iterator0 = ibxr0.a();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ++v;
            if(v > 1) {
                stringBuilder0.append(charSequence0);
            }
            ibzk.a(stringBuilder0, object0, null);
        }
        stringBuilder0.append("");
        return stringBuilder0.toString();
    }
}

