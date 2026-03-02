import j..util.DesugarCollections;
import j..util.Map.-EL;
import java.util.Map;

public final class dxwf implements ibts {
    public final hkiv a;

    public dxwf(hkiv hkiv0) {
        this.a = hkiv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$update");
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((dxwo)((ProtoLiteBuilder)object0).b_message).c));
        fsvb fsvb0 = this.a.d == null ? fsvb.a : this.a.d;
        ibuq.e(fsvb0, "getWalletPageCacheKey(...)");
        Map.-EL.remove(map0, dxwm.g(fsvb0), this.a);
        return ibom.a;
    }
}

