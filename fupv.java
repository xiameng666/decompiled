import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class fupv {
    private final Map a;

    public fupv(Map map0) {
        ibuq.f(map0, "data");
        super();
        this.a = map0;
    }

    public final fupv a(fupv fupv0) {
        return new fupv(ibpz.n(this.a, fupv0.a));
    }

    public final List b(List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            Integer integer0 = (Integer)this.a.get(((String)object0));
            if(integer0 != null) {
                list1.add(integer0);
            }
        }
        return list1.size() < list0.size() ? ibps.a : list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fupv) ? ibuq.m(this.a, ((fupv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "SwatchiePalette(data=" + this.a + ")";
    }
}

