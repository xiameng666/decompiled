final class asmx extends ibsl implements ibty {
    Object a;
    Object b;
    Object c;

    public asmx(ibrl ibrl0) {
        super(4, ibrl0);
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        asmx asmx0 = new asmx(((ibrl)object3));
        asmx0.a = (aqqh)object0;
        asmx0.b = (aqqh)object1;
        asmx0.c = (aqqh)object2;
        return asmx0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return ((aqqh)this.a).a(new asmw(((aqqh)this.b), ((aqqh)this.c)));
    }
}

