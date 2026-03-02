import java.util.ArrayList;

public final class cyvt implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new ArrayList();
        for(Object object2: ((cyxt)object0).c) {
            cyxs cyxs0 = (cyxs)object2;
            cyxq cyxq0 = cyxs0.g == null ? cyxq.a : cyxs0.g;
            if(cyfo.e((cyfr.b(cyxq0.c) == null ? cyfr.a : cyfr.b(cyxq0.c)))) {
                for(Object object3: cyxs0.h) {
                    cyxd cyxd0 = (cyxd)object3;
                    if(!cyxd0.f.isEmpty()) {
                        ((ArrayList)object1).add(cyxd0);
                    }
                }
                return object1;
            }
        }
        return object1;
    }
}

