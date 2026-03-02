import java.util.HashMap;
import java.util.Map;

public final class blbn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new HashMap();
        for(Object object2: ((hoia)object0).b) {
            hoic hoic0 = ((hoib)object2).c;
            if(hoic0 == null) {
                hoic0 = hoic.a;
            }
            hoid hoid0 = ((hoib)object2).d;
            if(hoid0 == null) {
                hoid0 = hoid.a;
            }
            ((Map)object1).put(hoic0, hoid0);
        }
        return object1;
    }
}

