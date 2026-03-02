import java.util.Collection;

final class dmwg extends ibuo implements ibts {
    public dmwg(Object object0) {
        super(1, object0, dmuy.class, "setGooglePaymentMethodIds", "setGooglePaymentMethodIds(Ljava/util/Collection;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Collection collection0 = (Collection)object0;
        ibuq.f(collection0, "p0");
        dmuy dmuy0 = (dmuy)this.e;
        ibuq.f(collection0, "googlePaymentMethodIds");
        dmuy0.n.clear();
        dmuy0.n.addAll(collection0);
        return ibom.a;
    }
}

