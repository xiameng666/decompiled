import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class gpse {
    public final int a;
    public final List b;
    public final gprk c;
    private final Collection d;

    public gpse(int v, List list0, gprk gprk0, Collection collection0) {
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.d = arrayList1;
        this.a = v;
        arrayList0.addAll(list0);
        this.c = gprk0;
        arrayList1.addAll(collection0);
    }

    public static gpse a(gprk gprk0) {
        return new gpse(-1, new ArrayList(), gprk0, Collections.EMPTY_LIST);
    }
}

