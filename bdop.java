public final class bdop implements ibtw {
    public final String a;
    public final int b;

    public bdop(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        bdor.b(this.a, ((goz)object0), gsc.a(this.b | 1));
        return ibom.a;
    }
}

