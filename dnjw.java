import java.util.Collection;

public final class dnjw extends ibuo implements ibts {
    public dnjw(Object object0) {
        super(1, object0, dnjs.class, "setGooglePaymentMethodIds", "setGooglePaymentMethodIds(Ljava/util/Collection;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = this.e;
        Collection collection0 = (Collection)object0;
        ((dnjs)object1).x.clear();
        ibuq.c(collection0);
        ((dnjs)object1).x.addAll(collection0);
        return ibom.a;
    }
}

