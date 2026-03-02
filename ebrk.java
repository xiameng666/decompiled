public final class ebrk implements ibts {
    public final ebsf a;

    public ebrk(ebsf ebsf0) {
        this.a = ebsf0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dyey)object0), "remainingCardId");
        dyfi dyfi0 = this.a.u;
        if(dyfi0 == null) {
            ibuq.j("responseBuilder");
            dyfi0 = null;
        }
        dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
        String s = ((dyey)object0).c;
        ibuq.e(s, "getCid(...)");
        dyfn0.b(s);
        dyna dyna0 = dyna.b(((dyey)object0).b);
        if(dyna0 == null) {
            dyna0 = dyna.k;
        }
        ibuq.e(dyna0, "getSecureElementServiceProvider(...)");
        dyfn0.c(dyna0);
        dyfn0.d(dyfj.e);
        dyfi0.a(dyfn0.a());
        return ibom.a;
    }
}

