import java.util.ArrayList;
import java.util.List;

public final class blmk implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new ArrayList();
        for(Object object2: ((Iterable)object0)) {
            gfsx gfsx0 = (gfsx)object2;
            if(gfsx0.i()) {
                ((List)object1).add(((blpi)gfsx0.d()));
            }
        }
        return object1;
    }
}

