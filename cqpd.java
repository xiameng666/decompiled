import j..lang.Iterable.-EL;
import java.util.ArrayList;
import java.util.Iterator;

public final class cqpd implements evpz {
    public final cqph a;

    public cqpd(cqph cqph0) {
        this.a = cqph0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        Iterator iterator0 = this.a.a.iterator();
        ArrayList arrayList0 = new ArrayList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!((cqpg)object0).a.m()) {
                break;
            }
            iterator0.remove();
            arrayList0.add(((cqpg)object0));
        }
        Iterable.-EL.forEach(arrayList0, new cqpe());
    }
}

