import java.util.Map.Entry;
import java.util.Map;

final class idq extends ibur implements ibts {
    final idr a;

    public idq(idr idr0) {
        this.a = idr0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((ids)object0).n()) {
            if(((ids)object0).g().b) {
                ((ids)object0).k();
            }
            Map map0 = ((ids)object0).g().h;
            idr idr0 = this.a;
            for(Object object1: map0.entrySet()) {
                idr0.d(((hxw)((Map.Entry)object1).getKey()), ((Number)((Map.Entry)object1).getValue()).intValue(), ((ids)object0).i());
            }
            ihy ihy0 = ((ids)object0).i().x;
            ibuq.c(ihy0);
            while(!ibuq.m(ihy0, idr0.a.i())) {
                for(Object object2: idr0.c(ihy0).keySet()) {
                    idr0.d(((hxw)object2), idr0.a(ihy0, ((hxw)object2)), ihy0);
                }
                ihy0 = ihy0.x;
                ibuq.c(ihy0);
            }
        }
        return ibom.a;
    }
}

