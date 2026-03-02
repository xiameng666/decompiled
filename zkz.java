import java.util.Iterator;
import java.util.List;

public final class zkz implements evqf {
    public final zlg a;

    public zkz(zlg zlg0) {
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
            fhrt fhrt0 = fhrt.a(((zkx)object1).e);
            zjv zjv0 = new zjv(aaua.a(((zkx)object1).a), ((zkx)object1).c, ((zkx)object1).b, fhrt0, ((zkx)object1).f);
            zho zho0 = new zho(zif.a(((zkx)object1).g.a), ((zkx)object1).g.b);
            zlg0.a.c(zjv0).l(zho0);
        }
        zlg0.a.a().l(Boolean.valueOf(true));
    }
}

