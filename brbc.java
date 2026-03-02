import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class brbc {
    public static List a(List list0) {
        List list1 = new ArrayList();
        brbc.c(list0, list1);
        return list1;
    }

    public static Set b(List list0) {
        Set set0 = new bxf();
        brbc.c(list0, set0);
        return set0;
    }

    private static void c(List list0, Collection collection0) {
        for(Object object0: list0) {
            collection0.add(Long.valueOf(((hler)object0).g));
        }
    }
}

