final class zws implements ibtx {
    final znd a;

    public zws(znd znd0) {
        this.a = znd0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$Button");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        zwx.i(((znb)this.a).a, ((goz)object1));
        return ibom.a;
    }
}

