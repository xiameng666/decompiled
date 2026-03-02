import java.util.List;

public final class gxwl implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((List)object0)) {
            cxkg cxkg0 = (cxkg)object1;
            if(cxkg0.b == 2) {
                int v = ((cxkf)cxkg0.c).b;
                if((v & 1) == 0 && (v & 4) != 0 && gxwp.v(((cxkf)cxkg0.c).e.toByteArray())) {
                    ggdy0.i((cxkg0.b == 2 ? ((cxkf)cxkg0.c) : cxkf.a));
                }
            }
        }
        return ggdy0.h();
    }
}

