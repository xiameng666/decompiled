import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class cjdr {
    public final Object a;
    public final CopyOnWriteArrayList b;

    public cjdr() {
        Object object0 = new Object();
        super();
        this.a = object0;
        this.b = new CopyOnWriteArrayList();
    }

    protected final void a(ibts ibts0) {
        Iterator iterator0;
        synchronized(this.a) {
            iterator0 = this.b.iterator();
        }
        ibuq.e(iterator0, "synchronized(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ibuq.e(object0, "next(...)");
            ibts0.a(object0);
        }
    }
}

