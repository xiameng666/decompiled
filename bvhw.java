final class bvhw extends ibuo implements ibts {
    public bvhw(Object object0) {
        super(1, object0, bvkk.class, "onSelectedAccountChanged", "onSelectedAccountChanged(Ljava/lang/String;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        bvkk bvkk0 = (bvkk)this.e;
        icbb.b(lsc.a(bvkk0), null, null, new bvis(bvkk0, ((String)object0), null), 3);
        return ibom.a;
    }
}

