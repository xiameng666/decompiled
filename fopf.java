import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fopf {
    public static gged_interceptors a(List list0, long v, long v1) {
        int v2 = Long.compare(v, 0L);
        if(v2 < 0 && v1 < 0L) {
            return (gged_interceptors)Collection.-EL.stream(list0).map(new fooz()).collect(ggaf.a);
        }
        long v3 = 0L;
        for(Object object0: list0) {
            v3 += ((fope)object0).a();
        }
        if(((long)list0.size()) <= v && v3 <= v1) {
            return (gged_interceptors)Collection.-EL.stream(list0).map(new fooz()).collect(ggaf.a);
        }
        ArrayList arrayList0 = new ArrayList(list0);
        Collections.sort(arrayList0);
        ggdy ggdy0 = new ggdy();
        int v4 = arrayList0.size();
        long v6 = 0L;
        int v7 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            fope fope0 = (fope)arrayList0.get(v5);
            ++v7;
            v6 += fope0.a();
            if(v2 >= 0 && ((long)v7) > v || v1 >= 0L && v6 > v1) {
                break;
            }
            ggdy0.i(fope0.c());
        }
        return ggdy0.h();
    }
}

