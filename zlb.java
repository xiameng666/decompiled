import java.util.Iterator;
import java.util.List;

public final class zlb implements evqf {
    public final zlg a;

    public zlb(zlg zlg0) {
        this.a = zlg0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        zlg zlg0;
        Iterator iterator0 = ((List)object0).iterator();
        while(true) {
            zlg0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            zlg0.a.f(((zjg)object1).a);
        }
        zlg0.a.b().l(Boolean.valueOf(true));
    }
}

