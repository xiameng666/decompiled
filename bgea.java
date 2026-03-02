import java.util.List;

final class bgea extends ibsl implements ibtz {
    Object a;
    boolean b;
    boolean c;
    Object d;

    public bgea(ibrl ibrl0) {
        super(5, ibrl0);
    }

    @Override  // ibtz
    public final Object a(Object object0, Object object1, Object object2, Object object3, Object object4) {
        bgea bgea0 = new bgea(((ibrl)object4));
        bgea0.a = (List)object0;
        bgea0.b = ((Boolean)object1).booleanValue();
        bgea0.c = ((Boolean)object2).booleanValue();
        bgea0.d = (bgax)object3;
        return bgea0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        boolean z = this.b;
        boolean z1 = this.c;
        Object object2 = this.d;
        if(object1 != null && object2 != null) {
            return ((List)object1).isEmpty() ? new bgdu(z) : new bgds(z, ((bgax)object2), z1, ((List)object1));
        }
        return bgdt.a;
    }
}

