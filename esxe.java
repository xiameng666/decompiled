import java.util.LinkedHashMap;
import java.util.Map;

public final class esxe {
    public static final bboh a;
    public ibtw b;
    public Object c;
    public final Map d;

    static {
        esxe.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public esxe(Object object0) {
        ibuq.f(object0, "initialState");
        super();
        this.c = object0;
        this.d = new LinkedHashMap();
    }

    public final void a(Object object0, Object object1, Object object2) {
        ibuq.f(object0, "fromState");
        ibuq.f(object1, "event");
        ibuq.f(object2, "toState");
        Map map0 = this.d;
        Object object3 = map0.get(object0);
        if(object3 == null) {
            object3 = new LinkedHashMap();
            map0.put(object0, object3);
        }
        ((Map)object3).put(object1, object2);
    }
}

