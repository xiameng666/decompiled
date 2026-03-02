final class asko extends ibsl implements ibty {
    boolean a;
    Object b;
    Object c;

    public asko(ibrl ibrl0) {
        super(4, ibrl0);
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        asko asko0 = new asko(((ibrl)object3));
        asko0.a = ((Boolean)object0).booleanValue();
        asko0.b = (aqqh)object1;
        asko0.c = (aqqh)object2;
        return asko0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.b;
        Object object2 = this.c;
        return this.a && (object1 instanceof aqqf) ? new aqqf(new askk(((Boolean)((aqqf)object1).a).booleanValue(), ((aqqh)object2))) : aqqe.a;
    }
}

