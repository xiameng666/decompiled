public final class eiat implements ibts {
    public final jks a;
    public final gra b;

    public eiat(jks jks0, gra gra0) {
        this.a = jks0;
        this.b = gra0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hzk hzk0 = (hzk)object0;
        ibuq.f(hzk0, "coordinates");
        long v = hzk0.g() & 0xFFFFFFFFL;
        jkv jkv0 = new jkv(this.a.ec(((int)v)));
        this.b.b(jkv0);
        return ibom.a;
    }
}

