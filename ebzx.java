public final class ebzx implements ibts {
    public final ecag a;

    public ebzx(ecag ecag0) {
        this.a = ecag0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((dyey)object0), "cardId");
        dyof dyof0 = this.a.p;
        if(dyof0 == null) {
            ibuq.j("responseBuilder");
            dyof0 = null;
        }
        dyok dyok0 = dyoj.a(((ProtoLiteMessage)dyoh.a).v_newBuilder());
        String s = ((dyey)object0).c;
        ibuq.e(s, "getCid(...)");
        dyok0.b(s);
        dyna dyna0 = dyna.b(((dyey)object0).b);
        if(dyna0 == null) {
            dyna0 = dyna.k;
        }
        ibuq.e(dyna0, "getSecureElementServiceProvider(...)");
        dyok0.c(dyna0);
        dyok0.d(dyog.e);
        dyof0.a(dyok0.a());
        return ibom.a;
    }
}

