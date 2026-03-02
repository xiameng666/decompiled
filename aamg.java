import java.util.List;

public final class aamg implements ibts {
    public final aamn a;

    public aamg(aamn aamn0) {
        this.a = aamn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((List)object0)) {
            grxr grxr0 = (grxr)object1;
            if((grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a).b == 2) {
                grvb grvb0 = grxr0.c == 8 ? ((grvb)grxr0.d) : grvb.a;
                ggdy0.k((grvb0.b == 2 ? ((grxm)grvb0.c) : grxm.a).c);
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        return new zhm(this.a.d(gged0));
    }
}

