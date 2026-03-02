final class dunh implements ibtw {
    final duoa a;
    final duob b;

    public dunh(duoa duoa0, duob duob0) {
        this.a = duoa0;
        this.b = duob0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        this.a.y(this.b.c, ((goz)object0), 0);
        return ibom.a;
    }
}

