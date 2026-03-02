final class cbui extends ibuo implements ibts {
    public cbui(Object object0) {
        super(1, object0, cbuo.class, "showAccountPicker", "showAccountPicker(Ljava/lang/String;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s = (String)object0;
        ibuq.f(s, "p0");
        ((cbuo)this.e).av(s);
        return ibom.a;
    }
}

