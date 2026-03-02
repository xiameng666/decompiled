import j..util.Collection.-EL;
import j..util.Optional;
import java.util.List;

public final class aoni implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ggdy ggdy0 = new ggdy();
        for(Object object1: ((List)object0)) {
            gfsx gfsx0 = (gfsx)object1;
            if(gfsx0 != null && gfsx0.i()) {
                ggdy0.i(((aong)gfsx0.d()));
            }
        }
        gged_interceptors gged0 = ggdy0.h();
        if(gged0.isEmpty()) {
            return gfqx.a;
        }
        Optional optional0 = Collection.-EL.stream(gged0).filter(new aonj()).findFirst();
        return optional0.isPresent() ? gfsx.m(((aong)optional0.get())) : gfsx.m(((aong)gged0.get(0)));
    }
}

