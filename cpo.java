import java.util.List;
import java.util.ListIterator;

final class cpo implements cnd {
    private final List a;

    public cpo(List list0) {
        this.a = list0;
    }

    @Override  // cmx
    public final long a(cht cht0, cht cht1, cht cht2) {
        ibns ibns0 = (ibns)ibpo.W(this.a);
        return ((Number)ibns0.a).longValue() + ((cnd)ibns0.b).a(cht0, cht1, cht2);
    }

    @Override  // cmx
    public final cht b(cht cht0, cht cht1, cht cht2) {
        return cmw.a(this, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final cht c(long v, cht cht0, cht cht1, cht cht2) {
        ibns ibns0 = this.f(v);
        long v1 = ((Number)ibns0.a).longValue();
        return ((cnd)ibns0.b).c(v - v1, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final cht d(long v, cht cht0, cht cht1, cht cht2) {
        ibns ibns0 = this.f(v);
        long v1 = ((Number)ibns0.a).longValue();
        return ((cnd)ibns0.b).d(v - v1, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final boolean e() {
        return false;
    }

    private final ibns f(long v) {
        List list0 = this.a;
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object0 = listIterator0.previous();
            if(((Number)((ibns)object0).a).longValue() <= v) {
                return ((ibns)object0) == null ? ((ibns)ibpo.R(list0)) : ((ibns)object0);
            }
        }
        return (ibns)ibpo.R(list0);
    }
}

