import java.util.HashMap;
import java.util.Map;

public final class ubq {
    private static final ubm a;
    private final Map b;

    static {
        ubq.a = new ubo();
    }

    public ubq() {
        this.b = new HashMap();
    }

    public final ubn a(Object object0) {
        ubn ubn0;
        synchronized(this) {
            uqo.f(object0);
            Map map0 = this.b;
            ubm ubm0 = (ubm)map0.get(object0.getClass());
            if(ubm0 == null) {
                for(Object object1: map0.values()) {
                    ubm ubm1 = (ubm)object1;
                    if(ubm1.b().isAssignableFrom(object0.getClass())) {
                        ubm0 = ubm1;
                        break;
                    }
                }
            }
            if(ubm0 == null) {
                ubm0 = ubq.a;
            }
            ubn0 = ubm0.a(object0);
        }
        return ubn0;
    }

    public final void b(ubm ubm0) {
        synchronized(this) {
            Class class0 = ubm0.b();
            this.b.put(class0, ubm0);
        }
    }
}

