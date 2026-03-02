final class eiak implements ibtx {
    final clj a;

    public eiak(clj clj0) {
        this.a = clj0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        float f = ((dih)object0).c();
        ((goz)object1).M(464906328);
        float f1 = ((jks)((goz)object1).h(ipa.d)).ea(eial.a.j.g());
        ((goz)object1).A();
        if(jkv.a(f, eial.c + (f1 + f1)) > 0) {
            eial.b(((ehwv)this.a.g()), ((goz)object1), 0);
        }
        return ibom.a;
    }
}

