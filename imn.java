public final class imn extends ibur implements ibtw {
    final ili a;
    final ino b;
    final ibtw c;

    public imn(ili ili0, ino ino0, ibtw ibtw0) {
        this.a = ili0;
        this.b = ino0;
        this.c = ibtw0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            ipa.d(this.a, this.b, this.c, ((goz)object0), 0);
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

