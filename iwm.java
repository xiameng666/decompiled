import java.util.ArrayList;
import java.util.List;

public final class iwm {
    public static final iwj a;

    static {
        iwm.a = new iwj("");
    }

    public static final List a(iwj iwj0, int v, int v1, ibts ibts0) {
        if(v != v1) {
            int v2 = 0;
            List list0 = iwj0.a;
            if(list0 == null) {
                return null;
            }
            if(v == 0) {
                if(v1 >= iwj0.b.length()) {
                    if(ibts0 == null) {
                        return list0;
                    }
                    List list1 = new ArrayList(list0.size());
                    int v3 = list0.size();
                    while(v2 < v3) {
                        Object object0 = list0.get(v2);
                        if(((Boolean)ibts0.a(((iwh)object0).a)).booleanValue()) {
                            list1.add(object0);
                        }
                        ++v2;
                    }
                    return list1;
                }
                v = 0;
            }
            List list2 = new ArrayList(list0.size());
            int v4 = list0.size();
            while(v2 < v4) {
                iwh iwh0 = (iwh)list0.get(v2);
                if(ibts0 == null || ((Boolean)ibts0.a(iwh0.a)).booleanValue()) {
                    int v5 = iwh0.b;
                    int v6 = iwh0.c;
                    if(iwm.b(v, v1, v5, v6)) {
                        int v7 = ibwt.j(v5, v, v1) - v;
                        int v8 = ibwt.j(v6, v, v1) - v;
                        list2.add(new iwh(((iwd)iwh0.a), v7, v8, iwh0.d));
                    }
                }
                ++v2;
            }
            return list2;
        }
        return null;
    }

    public static final boolean b(int v, int v1, int v2, int v3) {
        return (v >= v3 ? 0 : 1) & (v2 < v1 ? 1 : 0) | ((v == v1 ? 1 : 0) | (v2 == v3 ? 1 : 0)) & (v == v2 ? 1 : 0);
    }
}

