import java.util.List;

public final class gxwi implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((List)object0)) {
            cxkg cxkg0 = (cxkg)object1;
            if(cxkg0.b == 2 && !gxwp.v(((cxkf)cxkg0.c).e.toByteArray())) {
                int v = cxkg0.b;
                if(((v == 2 ? ((cxkf)cxkg0.c) : cxkf.a).b & 1) != 0) {
                    ggdy0.i((v == 2 ? ((cxkf)cxkg0.c) : cxkf.a));
                }
            }
        }
        return ggdy0.h();
    }
}

