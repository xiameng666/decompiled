final class cbto extends ibuo implements ibts {
    public cbto(Object object0) {
        super(1, object0, cbuo.class, "onAccountAdded", "onAccountAdded(Lcom/google/common/collect/ImmutableList;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = this.e;
        if(hukf.d()) {
            ((ggtj)cbuo.a.h()).x("Accounts added.");
            icbb.b(lpt.a(((cbuo)object1)), null, null, new cbtw(((cbuo)object1), ((gged_interceptors)object0), null), 3);
        }
        return ibom.a;
    }
}

