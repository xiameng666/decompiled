import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class hfln implements gfsi {
    public final List a;
    public final ArrayList b;

    public hfln(List list0, ArrayList arrayList0) {
        this.a = list0;
        this.b = arrayList0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        Iterator iterator0 = this.a.iterator();
        while(true) {
            object1 = this.b;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object2 = iterator0.next();
            Integer integer0 = (Integer)object2;
            Integer integer1 = (Integer)((Map)object0).get(integer0);
            if(integer1 != null) {
                ((ArrayList)object1).add(integer1);
                continue;
            }
            Objects.toString(integer0);
            throw new gfuz("Missing CPS Id for product id: " + integer0);
        }
        return object1;
    }
}

