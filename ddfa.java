public final class ddfa implements ibts {
    public final cmhw a;
    public final gra b;

    public ddfa(cmhw cmhw0, gra gra0) {
        this.a = cmhw0;
        this.b = gra0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((jhk)object0), "it");
        byte[] arr_b = ((jhk)object0).a().getBytes(ibyo.a);
        ibuq.e(arr_b, "getBytes(...)");
        if(arr_b.length <= 0x20) {
            ddfh.c(this.b, ((jhk)object0));
            this.a.a(gltz.p);
        }
        return ibom.a;
    }
}

