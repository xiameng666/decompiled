import java.util.Collection;
import java.util.List;

final class bdxh extends ibsl implements ibtx {
    Object a;
    Object b;

    public bdxh(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        bdxh bdxh0 = new bdxh(((ibrl)object2));
        bdxh0.a = (List)object0;
        bdxh0.b = (List)object1;
        return bdxh0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return Boolean.valueOf(!((Collection)this.a).isEmpty() || !((Collection)this.b).isEmpty());
    }
}

