public final class dxwg implements ibts {
    public final hkiv a;

    public dxwg(hkiv hkiv0) {
        this.a = hkiv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ProtoLiteBuilder)object0), "$this$update");
        hkiv hkiv0 = this.a;
        fsvb fsvb0 = hkiv0.d == null ? fsvb.a : hkiv0.d;
        ibuq.e(fsvb0, "getWalletPageCacheKey(...)");
        String s = dxwm.g(fsvb0);
        s.getClass();
        hkiv0.getClass();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        dxwo dxwo0 = (dxwo)((ProtoLiteBuilder)object0).b_message;
        hfvh hfvh0 = dxwo0.c;
        if(!hfvh0.b) {
            dxwo0.c = hfvh0.a();
        }
        dxwo0.c.put(s, hkiv0);
        return ibom.a;
    }
}

